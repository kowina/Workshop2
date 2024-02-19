package pl.coderslab.pl.entity;

import java.sql.Connection;
import java.sql.SQLException;

public class MainDao {
    public static void main(String[] args) {
     //User user = new User("Mateusz", "kowina@gazeta.pl", "paswword1");
     //User user1 = new User("Tomasz", "codso@wp.pl", "pass2");
        User user = new User("Witold", "dsff@jh","pass2");
        System.out.println(user.toString());
        UserDao userDao = new UserDao();
        userDao.create(user);
        System.out.println(user.toString());
    }
}
