package casino;

import java.util.*;

public class CASINO {

    private static Scanner input = new Scanner(System.in);
    private static ArrayList<user> userList = new ArrayList<>();

    public static void main(String[] args) {
        //username, password, credit
        //add user
        //log in 

        System.out.println("Welcome to The Casino.");
        System.out.println("What would you like to do?");
        System.out.println("1 - Log In");
        System.out.println("2 - Create Account");
        System.out.println("0 - Exit");
        int userChoice = input.nextInt();

        switch (userChoice) {
            case 1:
                logIn();
                break;

            case 2:
                addUser();
                break;

            case 0:
                System.out.println("Thank You for using The Casino");
                System.exit(0);
                break;
        }

    }
    
    public static void logIn(){
        
        boolean logInComplete = false;
        
        if (logInComplete = false){
            System.out.println("Enter your username");
            String logInUsername = input.next();
            System.out.println("Enter your password");
            String logInPassword = input.next();
           
        }
        
        
        
    }
    
    public static void addUser(){
        
        System.out.println("Please enter a username");
        String username = input.next();
        System.out.println("Please enter a password");
        String password = input.next();
        int credit = 50;
        
        user myUser = new user (username, password, credit);
        System.out.println(myUser.toString());
        userList.add(myUser);
        
    }
    
    public static void game1(){
        
    }
    
    public static void game2(){
    
    }
    
    public static void game3(){
        
    }
    

}
