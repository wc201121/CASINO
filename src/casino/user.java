package casino;
//username password credit

public class user {

    private String userName;
    private String password;
    private int credit;

    public user(String userName, String password, int credit) {
        this.userName = userName;
        this.password = password;
        this.credit = credit;
    }

    public String toString() {
        return userName + " " + password + " " + credit;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

}
