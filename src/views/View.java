package views;

import java.util.Scanner;

import models.Person;

public class View {
    private Scanner scanner;

    public View(){
        scanner = new Scanner(System.in);
    }

    public int showMenu(){
        
        System.out.println("Menu");
        System.out.println("1. Ingresar Personas");

        System.out.println("100. Salir");
        return scanner.nextInt();
    }

    public int inputInt(String message){
        System.out.print(message + ": ");
        return scanner.nextInt();
    }

    public Person inputPerson(){
        String name = inputName();
        int age = inputAge();
        return new Person(name, age);
    }

    public String inputName(){
        System.out.print("Ingrese el nombre: ");
        return scanner.next();
    }

    public int inputAge(){
        return inputInt("Ingrese la edad: ");
    }
    
}