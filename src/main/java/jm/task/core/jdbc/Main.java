package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserDao userDao = new UserDaoJDBCImpl();
        userDao.createUsersTable();
        userDao.saveUser("John", "Smith", (byte) 20);
        userDao.saveUser("Brad", "White", (byte) 48);
        userDao.saveUser("Sam", "Guff", (byte) 17);
        userDao.saveUser("Matt", "Adams", (byte) 36);
//        userDao.removeUserById(3L);
        System.out.println(userDao.getAllUsers());
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    }
}
