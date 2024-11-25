package Level_1_Exercise_3.Main;

import Level_1_Exercise_3.Modules.Entrance;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        HashMap<String, String> countries = new HashMap<>();
        try (FileReader fr = new FileReader("src/Level_1_Exercise_3/Files/countries.txt")) {
            BufferedReader br = new BufferedReader(fr);
            String linea;
            String[] split = null;
            while((linea=br.readLine())!=null) {
                if(linea.length()>0){
                    split=linea.split(" ");
                    countries.put(split[0],split[1]);
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        Entrance entrance = new Entrance();
        String name=entrance.readString("Write your name");
        int numberCountries= countries.size();
        int score=0;
        int iBucleMain=0;
        while(iBucleMain<10){
            int randomNumber=(int)(Math.random() * (numberCountries - 0) + 0);
            int i=0;
            for (Map.Entry<String, String> entry : countries.entrySet())
            {
                if(i==randomNumber){
                    String capitalAnswer=entrance.readString("write the name of the capital of the country of "+entry.getKey());
                    if(capitalAnswer.equalsIgnoreCase(countries.get(entry.getKey()))){
                        score++;
                    }
                }
                i++;
            }
            iBucleMain++;
        }
        try (FileWriter fw = new FileWriter("src/Level_1_Exercise_3/Files/classification.txt"))
        {
            PrintWriter pw = new PrintWriter(fw);
            pw.println(name+" "+score);
            System.out.println("Has been written in classification.txt: "+name+" "+score);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
