package casino;

import java.util.*;

public class CASINO {

    private static Scanner input = new Scanner(System.in);
    private static ArrayList<user> userList = new ArrayList<>();
    private static ArrayList<login> loginList = new ArrayList<>();

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

    public static void logIn() {

        boolean logInComplete = false;

        if (logInComplete = false) {
            System.out.println("Enter your username");
            String logInUsername = input.next();
            System.out.println("Enter your password");
            String logInPassword = input.next();
            if (logInUsername && logInPassword == Login.get) {

            }

        }

    }

    public static void addUser() {

        System.out.println("Please enter a username");
        String username = input.next();
        System.out.println("Please enter a password");
        String password = input.next();
        int credit = 50;

        user myUser = new user(username, password, credit);
        System.out.println(myUser.toString());
        userList.add(myUser);

        login myLogin = new login(username, password);
        System.out.println(myLogin.toString());
        loginList.add(myLogin);

    }
    
    public static void chooseGame(){
        
        System.out.println("Please select which game you would like to play: ");
        System.out.println("1 - Guess the Number");
        int userChoice = input.nextInt();
        
        switch (userChoice) {
            case 1:
                game1();
                break;
            
        }
    }

    public static void game1() {
        //higher lower version 1 (guess the number)
        int number = (int) (1 + Math.random() * 100);

        System.out.println("I'm thinking of a whole number between 1 and 100. Guess what it is");
        System.out.println("Please type a wholel number and press enter.");

        int guesses = 0;
        boolean done = false;
        while (!done) {

            int playerGuess = input.nextInt();
            guesses++;

            if (number < playerGuess) {
                System.out.println("The number I'm thinking of is lower than " + playerGuess + ".");
                System.out.println("Guess again! (Please type a whole number and press enter.)");

            } else if (number > playerGuess) {
                System.out.println("The number I'm thinking of is greater than " + playerGuess + ".");
                System.out.println("Guess again! (Please type a whole number and press enter.)");
            } else {
                System.out.println("That's correct. I was thinking of " + number + ".");
                System.out.println("It took you " + guesses + " guesses to find the number. Thanks for playing!");
                done = true;
                credit = credit + (50 - guesses);
            }
        }
        chooseGame();

    }

    public static void game2() {
        //

    }

    public static void game3() {

    }

}
