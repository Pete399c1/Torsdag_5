package Task_2;

public class main2 {
    public static void main(String[] args){
        // creat instance of the cafe Class
        Cafe cafe = new Cafe();
        // make the instance do a method call
        cafe.loadMenuData();

        for(String Coffee : cafe.getCoffeeMenu()){
            System.out.println(Coffee);

        }

    }
}
