package PartTwo.repository;

public interface FakeRepoInterface {
    String insertUser(long id, String name, String surname);
    String findUserById(long Id);
    String deleteUser(long id);
    int countUsersInRepo();
}
