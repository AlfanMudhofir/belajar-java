package belajar.java.oop.data;

public class Data {
    private String username;
    private String password;

    public Data(String username, String password){
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
