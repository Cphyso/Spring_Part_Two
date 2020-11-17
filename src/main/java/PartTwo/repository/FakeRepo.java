package PartTwo.repository;

import PartTwo.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class FakeRepo implements FakeRepoInterface{

    public FakeRepo(){
        this.repo = new ArrayList<>();
    }

    List<User> repo ;


    @Override
    public String insertUser(long id, String name, String surname) {

        User newUser = new User(id,name,surname);
        repo.add(newUser);
        return name;
    }

    @Override
    public String findUserById(long Id) {
        String user = null;
        for(int i = 0; i < repo.size(); i++){
            if(repo.get(i).getId() == Id){
                user=repo.get(i).getName();
            }
        }
            return user;
    }

    @Override
    public String deleteUser(long id) {
        String deletedUser = null;
        for(int i = 0; i < repo.size(); i++){
            if(repo.get(i).getId() == id){
                deletedUser = repo.get(i).getName();
                repo.remove(i);
            }
        }
        return deletedUser;
    }

    public int countUsersInRepo() {
        return repo.size();
    }
}
