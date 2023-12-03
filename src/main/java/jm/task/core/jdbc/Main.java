package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    private static final String URL = "jdbc:mysql://localhost:3306/lesson1";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Lendondonovan1";
    public static void main(String[] args) {
        Util util = new Util();
        util.getConnection(URL, USERNAME, PASSWORD);
        UserDao userDao = new UserDaoJDBCImpl();

        userDao.createUsersTable();

        userDao.saveUser("A", "A", (byte) 1);
        userDao.saveUser("B", "B", (byte) 2);
        userDao.saveUser("C", "C", (byte) 3);
        userDao.saveUser("D", "D", (byte) 4);

        userDao.removeUserById(2);
        userDao.getAllUsers();
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    }
}
