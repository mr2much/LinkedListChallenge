package com.colddog;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static boolean quit = false;
    private ArrayList<Album> albums;

    public static void main(String[] args) {
        int choice;

	    while(!quit) {
	        printMenuOptions();
            System.out.println();
            System.out.print("Enter your choice: ");
	        choice = scanner.nextInt();

	        switch (choice) {
                case 1:
                    manageAlbums();
                    break;
                case 2:
                    managePlaylists();
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
        System.out.printf("%1$32s\n", "Main Menu");
        System.out.print("Choose one of the following options:\n" +
                "1 - Manage Albums.\n" +
                "2 - Manage Playlists.\n" +
                "3 - Show menu options.\n" +
                "0 - Exit Program.\n");
    }

    public static void manageAlbums() {
        int choice = 1;

        printAlbumOptions();

        while(choice > 0) {
            System.out.println("Enter choice: ");
            choice = scanner.nextInt();
        }
    }

    public static void printAlbumOptions() {
        System.out.printf("%1$32s\n", "Album Management Menu");
        System.out.println("What do you wish to do:\n" +
                "1 - Create new Album.\n" +
                "2 - Edit existing Album name.\n" +
                "3 - Show all Albums.\n" +
                "4 - Show All Albums and All Songs.\n" +
                "5 - Select existing Album to manage Songs.\n" +
                "6 - Show Album management options.\n" +
                "0 - Exit Album Management Menu.\n");
    }

    public static void managePlaylists() {
        System.out.printf("%1$32s\n", "Playlist Management Menu");
    }
}
