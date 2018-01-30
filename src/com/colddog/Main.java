package com.colddog;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static boolean quit = false;
    public ArrayList<Album> albums;

    public static void main(String[] args) {
        int choice;
        printMenuOptions();
	    while(!quit) {
            System.out.print("Enter your choice: ");
	        choice = scanner.nextInt();

	        switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
	            case 0:
                    quit = true;
	                break;
	            default:
	                System.out.println("Please enter a valid choice.");
	                printMenuOptions();
	                break;
            }

        }
    }

    public static void printMenuOptions() {
        System.out.println("Choose one of the following options:\n" +
                "1 - Manage Albums.\n" +
                "2 - Manage Playlists.\n" +
                "3 - Show menu options.\n" +
                "0 - Exit Program.");
    }
}
