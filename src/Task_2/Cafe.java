package Task_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
//private static ArrayList<String> CoffeeMenu;

private static ArrayList<String> CoffeeMenu = new ArrayList<>();

public ArrayList<String> getCoffeeMenu(){
    System.out.println(CoffeeMenu);
     return CoffeeMenu;
 }

public void loadMenuData(){
    System.out.println("Current working directory: " + System.getProperty("user.dir"));
    File file = new File("CoffeeMenu.txt");
    try {
        Scanner scan = new Scanner(file);
        // hasNextLine spørg hvis der er flere linjer
        while(scan.hasNextLine()){
            // instancen af objektet .nextLine(); gøre at næste linje bliver scannet
            String coffee = scan.nextLine();
            // add the lines to the coffees ArrayList In this class
            //coffeeMenu.add(scan.nextLine());
            CoffeeMenu.add(coffee);
        }
        scan.close();
    }
    catch(FileNotFoundException e){
        System.out.println(e.getMessage());

    }
}
}

