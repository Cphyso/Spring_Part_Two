package PartTwo.service;

import PartTwo.model.User;
import PartTwo.repository.FakeRepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    public UserServiceImpl(){}

    @Autowired
    FakeRepoInterface repo;

    @Override
    public void addUser(String name, String surname, long id) {
        System.out.println(repo.insertUser(id,name,surname));
    }

    @Override
    public void removeUser(long id) {
        System.out.println(repo.deleteUser(id));
    }

    @Override
    @Cacheable("user")
    public String getUser(long id) {
        try{
            System.out.println("Going to sleep for 5 Secs.. to simulate backend call.");
            Thread.sleep(1000*5);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        return repo.findUserById(id);
        }

    public int countUsers() {
       return repo.countUsersInRepo();
    }
}
