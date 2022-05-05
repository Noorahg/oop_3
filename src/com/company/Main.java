package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Когда кормили кошку:");
        int a= sc.nextInt();
        System.out.print("Когда кормили собаку:");
        int b= sc.nextInt();
        System.out.print("Когда кормили попугая:");
        int c=sc.nextInt();
        System.out.print("Когда кормили рыбу:");
        int d= sc.nextInt();

        Cat cat=new Cat();
        cat.setName("Персик");
        cat.setSpecies("Кинкалоу");
        cat.setColour("Черно-белый");
        cat.setVoice("Мяу-Мяу");
        cat.setFood("Мясо");
        cat.setAge(5);
        cat.setDateoflastfeeding(a);

        Dog dog=new Dog();
        dog.setName("Купер");
        dog.setSpecies("Американский фоксхаунд");
        dog.setColour("Рыжий");
        dog.setVoice("Гав-Гав");
        dog.setFood("Косточку");
        dog.setAge(7);
        dog.setDateoflastfeeding(b);

        Parrot parrot=new Parrot();
        parrot.setName("Аркаша");
        parrot.setSpecies("Какаду");
        parrot.setColour("Голубой");
        parrot.setVoice("Гулнур учись давай");
        parrot.setFood("Зерновая смесь");
        parrot.setAge(6);
        parrot.setDateoflastfeeding(c);


        Fish fish=new Fish();
        fish.setName("Йодо");
        fish.setSpecies("Золотая рыбка");
        fish.setColour("Золотистая");
        fish.setFood("Гранулы");
        fish.setAge(3);
        fish.setDateoflastfeeding(d);



        System.out.println("~~Животные~~");
        System.out.println("\n"+"Cat:"+cat.getName()+"\n"+"Species:"+cat.getSpecies()+"\n"+"Colour:"+cat.getColour()+"\n"+"Voice:"+cat.getVoice()+"\n"+"Food:"+cat.getFood()+"\n"+"Age:"+cat.getAge());
        cat.checkfeed(a);
        System.out.println("\n"+"Dog:"+dog.getName()+"\n"+"Species:"+dog.getSpecies()+"\n"+"Colour:"+dog.getColour()+"\n"+"Voice:"+dog.getVoice()+"\n"+"Food:"+dog.getFood()+"\n"+"Age:"+dog.getAge());
        dog.checkfeed(b);
        System.out.println("\n"+"Parrot:"+parrot.getName()+"\n"+"Species:"+parrot.getSpecies()+"\n"+"Colour:"+parrot.getColour()+"\n"+"Voice:"+parrot.getVoice()+"\n"+"Food:"+parrot.getFood()+"\n"+"Age:"+parrot.getAge());
        parrot.checkfeed(c);
        System.out.println("\n"+"Fish:"+fish.getName()+"\n"+"Species:"+fish.getSpecies()+"\n"+"Color:"+fish.getColour()+"\n"+"Food:"+fish.getFood()+"\n"+"Age:"+fish.getAge());
        fish.checkfeed(d);

    }
}
