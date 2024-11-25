package Level_1_Exercise_3;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrance {
    private static Scanner scanner = new Scanner(System.in);
    public Entrance(){
    }

    public static byte readByte(String missatge){
        byte result=0;
        boolean formatError=true;
        while (formatError){
            try {
                System.out.println(missatge);
                result=scanner.nextByte();
                formatError=false;
            } catch (InputMismatchException e) {
                System.out.println("Format error");
                scanner.nextLine();
            }
        }
        scanner.nextLine();
        return result;
    }

    public static int readInt(String missatge){
        int result=0;
        boolean formatError=true;
        while (formatError){
            try {
                System.out.println(missatge);
                result=scanner.nextInt();
                formatError=false;
            } catch (InputMismatchException e) {
                System.out.println("Format error");
                scanner.nextLine();
            }
        }
        scanner.nextLine();
        return result;
    }

    public static float readFloat(String missatge){
        float result=0f;
        boolean formatError=true;
        while (formatError){
            try {
                System.out.println(missatge);
                result=scanner.nextFloat();
                formatError=false;
            } catch (InputMismatchException e) {
                System.out.println("Format error");
                scanner.nextLine();
            }
        }
        scanner.nextLine();
        return result;
    }

    public static double readDouble(String missatge){
        double result=0d;
        boolean formatError=true;
        while (formatError){
            try {
                System.out.println(missatge);
                result=scanner.nextDouble();
                formatError=false;
            } catch (InputMismatchException e) {
                System.out.println("Format error");
                scanner.nextLine();
            }
        }
        scanner.nextLine();
        return result;
    }

    public static char readChar(String missatge) {
        char result=' ';
        boolean formatError=true;
        while (formatError){
            try {
                System.out.println(missatge);
                String entrada=scanner.nextLine();
                if (entrada.length() != 1) {
                    throw new MessageReadException("Exception: Format error");
                }else{
                    result=entrada.charAt(0);
                    formatError=false;
                }
            } catch (MessageReadException e) {
                System.out.println(e.getMessage());
            }
        }
        return result;
    }

    public static String readString(String missatge){
        String result="";
        boolean formatError=true;
        while (formatError){
            try {
                System.out.println(missatge);
                result=scanner.nextLine();
                if (result.length() < 1) {
                    throw new MessageReadException("Exception: Format error");
                }else{
                    formatError=false;
                }
            } catch (MessageReadException e) {
                System.out.println(e.getMessage());
            }
        }
        return result;
    }

    public static boolean readSiNo(String missatge){
        boolean result=false;
        boolean formatError=true;
        while (formatError){
            try {
                System.out.println(missatge);
                String readScanner=scanner.nextLine();
                if ((readScanner.length() != 1)||!(readScanner.equalsIgnoreCase("y")
                        ||readScanner.equalsIgnoreCase("n"))) {
                    throw new MessageReadException("Exception: Format error");
                }else{
                    if(readScanner.equalsIgnoreCase("y")){
                        result=true;
                    }
                    formatError=false;
                }
            } catch (MessageReadException e) {
                System.out.println(e.getMessage());
            }
        }
        return result;
    }
}
