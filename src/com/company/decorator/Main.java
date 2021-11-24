package com.company;

import com.company.decorator.DeliveryDecorator;
import com.company.decorator.TakeAwayDecorator;
import com.company.factory.IMedicine;
import com.company.factory.MedicineFactory;
import com.company.observer.News;
import com.company.strategy.Basket;
import com.company.strategy.SubscribeForNews;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to online pharmcenter 'Panacea'");

        System.out.println("First of all you need to register");
        System.out.println("Please write your username");
        String username = in.next();
        System.out.println("Please write your password");
        String password = in.next();
        System.out.println("Choose which service do you want to use");
        System.out.println("1) Subscribe for news\n2) Order medicines");
        int choice = in.nextInt();
        if (choice == 1) {
            News news = new News();
            User user1 = new User(username, password, news, new SubscribeForNews());

            int i = 1;
            while (i < 2) {
                System.out.println("Welcome again! Please sign-in");
                System.out.println("Enter your username");
                username = in.next();
                System.out.println("Enter your password");
                password = in.next();
                user1.login(username, password);
                if (user1.auth.username == username) System.out.println(user1.auth.username + " has logged in");
                else {
                    System.out.println("You has already logged in as " + user1.auth.username);
                }
                System.out.println("Choose which operations you want to use");
                System.out.println("1) Log in\n" + "2) Get news");
                i = in.nextInt();
            }
            System.out.println(user1.service(user1));
            news.setNews("'New medicines from Japan are available!'");
            news.setNews("'In these weekends platform will be closed for technical reason from 15:00pm till 18:00pm'");
        } else if (choice == 2) {
            Basket basket = new Basket();
            User user2 = new User(username, password, basket);
            int i = 1;
            while (i < 2) {
                System.out.println("Welcome again! Please sign-in");
                System.out.println("Enter your username");
                username = in.next();
                System.out.println("Enter your password");
                password = in.next();
                user2.login(username, password);
                if (user2.auth.username == username) System.out.println(user2.auth.username + " has logged in");
                else {
                    System.out.println("You has already logged in as " + user2.auth.username);
                }
                System.out.println("Choose which operations you want to use");
                System.out.println("1) Log in\n" + "2) Create order");
                i = in.nextInt();
            }

            MedicineFactory medicineFactory = new MedicineFactory();
            IMedicine IMedicine1 = medicineFactory.createMedicine("General", "Ascorbin", 100.0);
            IMedicine IMedicine2 = medicineFactory.createMedicine("General", "Fentanyl", 800.0);
            IMedicine IMedicine3 = medicineFactory.createMedicine("General", "Activated carboon", 30.0);
            IMedicine IMedicine4 = medicineFactory.createMedicine("General", "Loopustin", 450.0);
            IMedicine IMedicine5 = medicineFactory.createMedicine("PrescriptionOnly", "Omega-3", 1500.0);
            IMedicine IMedicine6 = medicineFactory.createMedicine("PrescriptionOnly", "Patty deLlosa", 1880.0);
            IMedicine IMedicine7 = medicineFactory.createMedicine("PrescriptionOnly", "Barker", 900.0);
            IMedicine IMedicine8 = medicineFactory.createMedicine("PrescriptionOnly", "Multo-Biome", 880.0);
            IMedicine IMedicine9 = medicineFactory.createMedicine("Pharmacy", "Chromatin", 560.0);
            IMedicine IMedicine10 = medicineFactory.createMedicine("Pharmacy", "Acere", 980.0);
            IMedicine IMedicine11 = medicineFactory.createMedicine("Pharmacy", "Lazelop", 1050.0);

            System.out.println("List of Medicines");

            System.out.println("General: ");
            System.out.println("1) " + IMedicine1.getDesc() + " with price " + IMedicine1.getPrice());
            System.out.println("2) " + IMedicine2.getDesc() + " with price " + IMedicine2.getPrice());
            System.out.println("3) " + IMedicine3.getDesc() + " with price " + IMedicine3.getPrice());
            System.out.println("4) " + IMedicine4.getDesc() + " with price " + IMedicine4.getPrice());
            System.out.println("Prescription only: ");
            System.out.println("5) " + IMedicine5.getDesc() + " with price " + IMedicine5.getPrice());
            System.out.println("6) " + IMedicine6.getDesc() + " with price " + IMedicine6.getPrice());
            System.out.println("7) " + IMedicine7.getDesc() + " with price " + IMedicine7.getPrice());
            System.out.println("8) " + IMedicine8.getDesc() + " with price " + IMedicine8.getPrice());
            System.out.println("Pharmacy: ");
            System.out.println("9) " + IMedicine9.getDesc() + " with price " + IMedicine9.getPrice());
            System.out.println("10) " + IMedicine10.getDesc() + " with price " + IMedicine10.getPrice());
            System.out.println("11) " + IMedicine11.getDesc() + " with price " + IMedicine11.getPrice());

            System.out.print("Enter the count of medicines you want to store: ");
            int n = in.nextInt();
            int[] array = new int[10];
            System.out.println("Enter the number of medicine: ");
            for(int j = 0; j<n; j++) {
                array[j]=in.nextInt();
                switch (array[j]) {
                    case 1: basket.addMedicine(IMedicine1.getPrice());break;
                    case 2: basket.addMedicine(IMedicine2.getPrice());break;
                    case 3: basket.addMedicine(IMedicine3.getPrice());break;
                    case 4: basket.addMedicine(IMedicine4.getPrice());break;
                    case 5: basket.addMedicine(IMedicine5.getPrice());break;
                    case 6: basket.addMedicine(IMedicine6.getPrice());break;
                    case 7: basket.addMedicine(IMedicine7.getPrice());break;
                    case 8: basket.addMedicine(IMedicine8.getPrice());break;
                    case 9: basket.addMedicine(IMedicine9.getPrice());break;
                    case 10: basket.addMedicine(IMedicine10.getPrice());break;
                    case 11: basket.addMedicine(IMedicine11.getPrice());break;
                }
            }
            System.out.println(user2.service(user2));
            System.out.println("1) Delivery\n2) Take away");
            int order = in.nextInt();
            if (order == 1) {
                DeliveryDecorator deliveryDecorator = new DeliveryDecorator(basket);
                System.out.print(deliveryDecorator.getDesc());
                System.out.println(" the price is " + deliveryDecorator.getPrice());
            }else if (order == 2) {
                TakeAwayDecorator takeAwayDecorator = new TakeAwayDecorator(basket);
                System.out.print(takeAwayDecorator.getDesc());
                System.out.println(" the price is " + takeAwayDecorator.getPrice());
            }
            System.out.println("Thanks for purchase, come again!");
        }
    }
}
