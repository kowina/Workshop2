package pl.coderslab.pl.entity;

import java.sql.Connection;
import java.sql.SQLException;

public class MainDao {
    public static void main(String[] args) {
     //User user = new User("Mateusz", "kowina@gazeta.pl", "paswword1");
     //User user1 = new User("Tomasz", "codso@wp.pl", "pass2");
      //  User user = new User("Witold", "f@gjjjh","pass2");
       // User user = new User();
       // user.setUserName("Kuba");
      // user.setEmail("sdsdh@hgj");
      //  user.setPassword("asdfg");
       // System.out.println(user.toString());
        UserDao userDao = new UserDao();
        User user = userDao.read(24);
        System.out.println(user);
        user.setUserName("Leon");
        user.setEmail("jhgfd");
        user.setPassword("kjhgfd");
        userDao.update(user);

        //userDao.read(22);
        //User user = userDao.read(2);
        //System.out.println(userDao.read(4).toString());
        System.out.println(userDao.read(24));
    }
}
