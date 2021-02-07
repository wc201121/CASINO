package casino;

public class login {

    private String user;
    private String password;

    public login(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String toString() {
        return user + " " + password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return (user + password);
    }
}
