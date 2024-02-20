package pl.coderslab.pl.entity;

public class User {
    private int id;
    private String username;
    private String email;
    private String password;
    public User(){
    }
    public User(int id){
        this.id = id;

    }
    public User(String username, String email, String password){
        int id = 0;
        this.username = username;
        this.email = email;
        this.password = password;
    }
    public int getId(){
        return this.id;
    }
    public String getUserName(){
        return this.username;
    }
    public String getEmail(){
        return this.email;
    }
    public String getPassword(){
        return this.password;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setUserName(String username){
        this.username = username;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPassword(String password){
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
