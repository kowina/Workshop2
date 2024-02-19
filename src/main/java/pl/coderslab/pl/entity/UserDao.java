package pl.coderslab.pl.entity;

import org.mindrot.jbcrypt.BCrypt;

import java.sql.*;

public class UserDao {
    public static final String RED = "\033[0;31m";
    public static final String RESET = "\033[0m";

    private static final String CREATE_USER_QUERY = "INSERT INTO users(username, email, password) VALUES (?, ?, ?)";
    private static final String RETURN_GENERATED_KEY_QUERY = "SELECT id FROM users ORDER BY id DESC LIMIT 1 ";


    public String hashPassword(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }
    public User create(User user){
        try (Connection connection = DbUtil.getConnection()){
            try (PreparedStatement prSt = connection.prepareStatement(CREATE_USER_QUERY);) {
                prSt.setString(1, user.getUserName());
                prSt.setString(2, user.getEmail());
                prSt.setString(3, hashPassword(user.getPassword()));
                prSt.executeUpdate();
                Statement st = connection.createStatement();
                ResultSet resultSet = st.executeQuery(RETURN_GENERATED_KEY_QUERY);
                    if (resultSet.next()){
                        user.setId(resultSet.getInt("id"));
                    }
            }catch (SQLIntegrityConstraintViolationException e){
                System.out.println(RED + "Users email can't be duplicated!" + RESET);
                return null;
            }
            return user;
        }catch (SQLException e){
            e.printStackTrace();
            return null;
        }
    }





}
