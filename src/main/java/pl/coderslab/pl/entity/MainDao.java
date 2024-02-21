package pl.coderslab.pl.entity;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Arrays;

public class MainDao {
    public static void main(String[] args) {
        //User user = new User("Mateusz", "er@ger.pl", "paswword1");
        //User user1 = new User("Tomasz", "codso@wp.pl", "pass2");
        //User user3 = new User("Witold", "fdfghj@gjjjh","passfg");
        UserDao userDao = new UserDao();
        //User user5 = new User();
        //user5.setUserName("Olo");
        //user5.setEmail("sdfhj@hgj");
        //user5.setPassword("asdfg");
        //userDao.create(user3);
        //User user = userDao.read(6);
        //System.out.println(user.toString());
        //user.setUserName("Leon");
        //user.setEmail("jhgfd");
        //user.setPassword("kjhgfd");
        //userDao.update(user);
        //userDao.read(22);
        //User user = userDao.read(2);
        //System.out.println(userDao.read(4).toString());
        // System.out.println(userDao.read(24));
        //userDao.delete(7);

        userDao.findAll();
        userDao.readArray(userDao.findAll());
    }

}