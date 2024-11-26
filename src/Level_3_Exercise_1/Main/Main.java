package Level_3_Exercise_1.Main;

import Level_3_Exercise_1.Modules.Entrance;
import Level_3_Exercise_1.Modules.Person;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<Person>();
        readcsv(persons);
        boolean goOut = false;
        do{
            switch(menu()){
                case 0:
                    System.out.println("Thank you for using the program");
                    goOut = true;
                    break;
                case 1:
                    enterPerson(persons);
                    break;
                case 2:
                    persons.stream().sorted(showOrderedPeople("name", true)).forEach(System.out::println);
                    break;
                case 3:
                    persons.stream().sorted(showOrderedPeople("name", false)).forEach(System.out::println);
                    break;
                case 4:
                    persons.stream().sorted(showOrderedPeople("lastNames", true)).forEach(System.out::println);
                    break;
                case 5:
                    persons.stream().sorted(showOrderedPeople("lastNames", false)).forEach(System.out::println);
                    break;
                case 6:
                    persons.stream().sorted(showOrderedPeople("DNI", true)).forEach(System.out::println);
                    break;
                case 7:
                    persons.stream().sorted(showOrderedPeople("DNI", false)).forEach(System.out::println);
                    break;
            }
        }while(!goOut);
    }

    public static void enterPerson(ArrayList<Person> persons){
        String name= Entrance.readString("write the name");
        String lastNames=Entrance.readString("write the lastNames");
        String DNI=Entrance.readString("write the DNI");
        persons.add(new Person(name,lastNames,DNI));
    }

    public static Comparator showOrderedPeople(String name, boolean ascending){
        Comparator<Person> comparator = switch (name) {
            case "name" -> Comparator.comparing(Person::getName);
            case "lastNames" -> Comparator.comparing(Person::getLastNames);
            case "DNI" -> Comparator.comparing(Person::getDNI);
            default -> throw new IllegalArgumentException("Invalid ascendant");
        };

        if (!ascending) {
            comparator = comparator.reversed();
        }
        return comparator;
    }

    public static void readcsv(ArrayList<Person> persons){
        try (FileReader fr = new FileReader("src/Level_3_Exercise_1/Files/People.csv")) {
            BufferedReader br = new BufferedReader(fr);
            String linea;
            String[] split = null;
            while((linea=br.readLine())!=null) {
                if(linea.length()>0){
                    if(!linea.equalsIgnoreCase("Nom;Cognoms;NIF;;;")){
                        split=linea.split(";");
                        persons.add(new Person(split[0],split[1],split[2]));
                    }
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public static byte menu(){
        Scanner entradaTeclat = new Scanner(System.in);
        byte opcio;
        final byte MINIMO = 0;
        final byte MAXIMO =7;
        do{
            System.out.println("\nMenu");
            System.out.println("1.- Enter person.");
            System.out.println("2.- Show people sorted by name (A-Z).");
            System.out.println("3.- Show people sorted by name (Z-A).");
            System.out.println("4.- Show people sorted by last name (A-Z).");
            System.out.println("5.- Show people sorted by last name (Z-A).");
            System.out.println("6.- Show people sorted by DNI (1-9).");
            System.out.println("7.- Show people sorted by DNI (9-1).");
            System.out.println("0.- Go out.\n");
            opcio = entradaTeclat.nextByte();
            if(opcio < MINIMO || opcio > MAXIMO){
                System.out.println("Escull una opció vàlida");
            }
        }while(opcio < MINIMO || opcio > MAXIMO);
        return opcio;
    }
}
