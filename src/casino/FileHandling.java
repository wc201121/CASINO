package casino;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandling {

    public static String folderDirectory = System.getProperty("user.dir") + "\\userList.txt";

    public static void writeFile(ArrayList<user> userList) {

        try {
            FileWriter writeToFile = new FileWriter(folderDirectory, true);
            PrintWriter printToFile = new PrintWriter(writeToFile);
            for (int i = 0; i < userList.size(); i++) {
                printToFile.println(userList.get(i).toString());
            }
            printToFile.close();
            writeToFile.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public static ArrayList<user> readFile() {
        ArrayList<user> userList = new ArrayList<>();
        String lineFromFile;
        try {
            BufferedReader read = new BufferedReader(new FileReader(folderDirectory));
            while ((lineFromFile = read.readLine()) != null) {
                String[] userDetails = lineFromFile.split(", ");
                user a = new user(userDetails[0], userDetails[1], Integer.parseInt(userDetails[2]));
                userList.add(a);
            }
            read.close();

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        return userList;
    }

    public static void printItems(ArrayList<user> userList) {
        for (int i = 0; i < userList.size(); i++) {
            System.out.println(userList.get(i).toString());
        }
    }

}
