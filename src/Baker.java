import java.util.Scanner;
import java.util.ArrayList;


public class Baker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] finishedBakingProjects = new String[10];
        int openSpot = 0;


        // filling the refrigerator
        ArrayList<Ingredients> refrigerator = new ArrayList<>();
        Ingredients eggs = new Ingredients("eggs", 12);
        refrigerator.add(eggs);
        Ingredients powderedSugar = new Ingredients("powdered sugar", 7.5, "cups");
        refrigerator.add(powderedSugar);
        Ingredients cocoaPowder = new Ingredients("cocoa powder", 1.5, "cups");
        refrigerator.add(cocoaPowder);
        Ingredients oil = new Ingredients("oil", 4.0, "cups");
        refrigerator.add(oil);
        Ingredients vanillaExtract = new Ingredients("vanilla extract", 2.0, "cups");
        refrigerator.add(vanillaExtract);
        Ingredients granulatedSugar = new Ingredients("granulated sugar", 2.0, "cups");
        refrigerator.add(granulatedSugar);
        Ingredients flour = new Ingredients("flour", 4.0, "cups");
        refrigerator.add(flour);
        Ingredients chocolateChips = new Ingredients("chocolate chips", 1.0, "cups");
        refrigerator.add(chocolateChips);
        Ingredients seaSalt = new Ingredients("sea salt", 2.0, "cups");
        refrigerator.add(seaSalt);


        // start of the baking experience!!
        System.out.println("idk welcome to baking");
        boolean done = false;
        while (!done) {
            System.out.println("Enter 1 to see the ingredients, 2 to add something, 3 to do something with the ingredients, or 4 to bake");
            int choice = input.nextInt();
            if (choice == 1){
                for (int i = 0; i < refrigerator.size(); i++){
                    System.out.println(refrigerator.get(i));
                }
            }
            else if (choice == 2){
                System.out.println("What do you want to add to your bowl?");
                String ingredient = input.next();
                for (int i = 0; i < refrigerator.size(); i++){
                    if (refrigerator.get(i).getName().equals(ingredient.toLowerCase())){
                        System.out.println("How many " + refrigerator.get(i).getUnits() + " do you need?");
                        int num = input.nextInt();
                        refrigerator.get(i).getIngredient(num);
                        if (refrigerator.get(i).getAmount() == 0){
                            System.out.println("you dont have enough you idiot");
                        }
                        System.out.println("Adding " + refrigerator.get(i).getName() + "...");
                    }
                }
            }
            else if (choice == 3){
                System.out.println("Do you want to mix, whisk, or fold your ingredients?");
                String action = input.next();
                action = action.toLowerCase();
                action = action.substring(0,1).toUpperCase();
                System.out.println(action + "ing...");
            }
            else if (choice == 4){
                done = true;
            }
            else{
                System.out.println("girl do not try to be different with ur numbers");
            }
        }


        System.out.println("Baking...");
        System.out.println("What do you want to name your project?");
        String name = input.next();
        finishedBakingProjects[openSpot] = name;
        System.out.println("Adding your project...");
        System.out.println("thanks for playing!");
    }
}
