package PartTwo.service;

import PartTwo.model.User;

public interface UserService {
    void addUser(String name, String surname, long id);
    void removeUser(long id);
    String getUser(long id);
}
