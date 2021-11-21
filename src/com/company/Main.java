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
        News news = new News();
        Basket basket = new Basket();
        User user1 = new User("Pop", "1234", news, new SubscribeForNews());
        User user2 = new User("Up","1234",news, basket);
        User user3 = new User("Down", "1234", news, new SubscribeForNews());
        user1.login("aya");
        System.out.println(user1.auth.username);
        user1.login("mkdsmkm");
        System.out.println(user1.auth.username);

        System.out.println(user3.service(user3));
        System.out.println(user1.service(user1));
        news.setNews("hi everyone");

        MedicineFactory medicineFactory = new MedicineFactory();
        IMedicine IMedicine1 = medicineFactory.createMedicine("General", "Ascorbin", 100.0);
        IMedicine IMedicine2 = medicineFactory.createMedicine("PrescriptionOnly", "fentanyl", 800.0);
        IMedicine IMedicine3 = medicineFactory.createMedicine("Pharmacy", "activated carboon", 30.0);

        basket.addMedicine(IMedicine1.getPrice());
        basket.addMedicine(IMedicine2.getPrice());
        basket.addMedicine(IMedicine3.getPrice());

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

    }
}
