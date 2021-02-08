//to do list: check credits option ; make login work ; make credits work ; add more games ; file handling

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
        //check credits

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
//            if (logInUsername && logInPassword == Login.get) {
//
//            }

        }
        chooseGame();

    }

    public static void addUser() {

        System.out.println("Please enter a username");
        String username = input.next();
        System.out.println("Please enter a password");
        String password = input.next();
        int credit = 50;

        user myUser = new user(username, password, credit);
        System.out.println(" ");
        System.out.println("These are your account details: " + myUser.toString());
        userList.add(myUser);

        login myLogin = new login(username, password);
        System.out.println(" ");
        System.out.println("These are you login details: " + myLogin.toString());
        loginList.add(myLogin);

        logIn();

    }

    public static void chooseGame() {

        System.out.println(" ");
        System.out.println("Please select which game you would like to play: ");
        System.out.println("1 - Guess the Number");
        System.out.println("2 - Blackjack");
        System.out.println("0 - Log Out");
        int userChoice = input.nextInt();

        switch (userChoice) {
            case 1:
                game1();
                break;

            case 2:
                game2();
                break;

            case 3:
                game3();
                break;

            case 0:
                System.exit(0);
                break;

        }
    }

    public static void game1() {
        //higher lower version 1 (guess the number)
        int number = (int) (1 + Math.random() * 100);

        System.out.println(" ");
        System.out.println("I'm thinking of a whole number between 1 and 100. Guess what it is");
        System.out.println("Please type a whole number and press enter.");
        System.out.println(" ");

        int guesses = 0;
        boolean done = false;
        while (!done) {

            int playerGuess = input.nextInt();
            guesses++;

            if (number < playerGuess) {
                System.out.println("");
                System.out.println("The number I'm thinking of is lower than " + playerGuess + ".");
                System.out.println("Guess again! (Please type a whole number and press enter.)");
                System.out.println(" ");

            } else if (number > playerGuess) {
                System.out.println(" ");
                System.out.println("The number I'm thinking of is greater than " + playerGuess + ".");
                System.out.println("Guess again! (Please type a whole number and press enter.)");
                System.out.println(" ");
            } else {
                System.out.println("");
                System.out.println("That's correct. I was thinking of " + number + ".");
                System.out.println("It took you " + guesses + " guesses to find the number. Thanks for playing!");
                done = true;
//                credit = credit + (50 - guesses*3);
            }
        }

        System.out.println(" ");
        System.out.println("1 - Play Again");
        System.out.println("2 - Choose Game");
        System.out.println("0 - Log Out");
        int playAgain = input.nextInt();

        switch (playAgain) {

            case 1:
                game1();
                break;
            case 2:
                chooseGame();
                break;
            case 0:
                System.exit(0);
                break;
        }

    }

    public static void game2() {
        //blackjack
        boolean done = false;
        Random rand = new Random();

        int rounds = 0;

        //users card
        int card1 = rand.nextInt(11) + 1;
        int card2 = rand.nextInt(11) + 1;
        int cardTotal = card1 + card2;

        //computers card
        int compCardTotal = rand.nextInt(22) + 1;

        System.out.println(" ");
        System.out.println("Here are you starting cards: " + card1 + " " + card2);

        while (!done) {
            rounds++;

            System.out.println(" ");
            System.out.println("Your cards total : " + cardTotal + ". Would you like to hit or stand?");

            System.out.println(" ");
            System.out.println("1 - hit");
            System.out.println("2 - stand");
            int userChoice = input.nextInt();

            switch (userChoice) {

                case 1:

                    int hitCard = rand.nextInt(11) + 1;

                    System.out.println(" ");
                    System.out.println("Hit!");
                    System.out.println(" ");

                    cardTotal = cardTotal + hitCard;

                    System.out.println("You got " + hitCard + ".");

                    if (cardTotal > 22) {
                        System.out.println("Oh no, you've gone bust!");
                        System.out.println("You finished the game on " + cardTotal);
                        System.out.println("The dealer had " + compCardTotal);
                        //deduct credits
                        done = true;
                    }

                    break;

                case 2:

                    System.out.println(" ");
                    System.out.println("Stand!");
                    System.out.println(" ");

                    if (cardTotal > compCardTotal) {
                        System.out.println("You Win!");
                        System.out.println("You had " + cardTotal + " and the dealer had " + compCardTotal);
                        //add credits
                    } else if (cardTotal == compCardTotal) {
                        System.out.println("Draw");
                        //keep credits
                    } else {
                        System.out.println("You lose.");
                        //deduct credits
                    }
                    done = true;

                    break;

            }

        }

        System.out.println(" ");
        System.out.println("1 - Play Again");
        System.out.println("2 - Choose Game");
        System.out.println("0 - Log Out");
        int playAgain = input.nextInt();

        switch (playAgain) {

            case 1:
                game2();
                break;
            case 2:
                chooseGame();
                break;
            case 0:
                System.exit(0);
                break;
        }

    }

    public static void game3() {
        //

    }

}
