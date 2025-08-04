package Library;

import java.util.Scanner;

public class Main {

    static Scanner sc;
    static Database database;

    public static void main(String[] args) {

        database = new Database();
        System.out.println("Welcome to Library Management System!");

        int num;
        do {
            System.out.println("""
                0. Exit
                1. Login
                2. New User""");

            sc = new Scanner(System.in);

            num = sc.nextInt();

            switch(num){
                case 1: login();
                case 2: newUser();
//                default:
//                    System.out.println("Error!");
            }
        } while(num != 0) ;
    }

    private static void login() {
        System.out.print("Enter phone number: ");
        String phoneNumber = sc.next();
        System.out.print("Enter email: ");
        String email = sc.next();

        int n = database.login(phoneNumber, email);
        if(n != -1){
            User user = database.getUser(n);
            user.menu();
        } else {
            System.out.println("User doesn't exist!");;
        }
    }

    private static void newUser() {
        System.out.print("Enter user name: ");
        String name = sc.nextLine();
        sc.next();
        System.out.print("Enter phone number: ");
        String phoneNumber = sc.next();
        System.out.print("Enter email: ");
        String email = sc.next();
        System.out.println("1. Admin\n2. Normal User");
        User user;
        int opt = sc.nextInt();
        if(opt == 1){
            user = new Admin(name, email, phoneNumber);
        } else {
            user = new NormalUser(name, email, phoneNumber);
        }
        database.AddUser(user);
        user.menu();
    }
}
