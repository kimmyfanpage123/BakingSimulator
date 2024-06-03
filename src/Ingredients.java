/**
 * a class to construct an object for any ingredient with methods for its amount, name, and units
 */
public class Ingredients implements Comparable{
    private final String name;
    private double amount;
    private final String units;


    /**
     * creates an object with a name and amount
     * @param name name of the ingredient
     * @param amount quantity of the ingredient
     */
    public Ingredients(String name, double amount){
        this.name = name;
        this.amount = amount;
        units = "";
    }

    /**
     * a second constructor for ingredients that have units
     * @param name name of the ingredient
     * @param amount quantity of the ingredient
     * @param units unit of the ingredient
     */
    public Ingredients(String name, double amount, String units){
        this.name = name;
        this.amount = amount;
        this.units = units;
    }

    /**
     * returns the name of the ingredient
     * @return name
     */
    public String getName(){
        return name;
    }

    /**
     * returns the amount of the ingredient left
     * @return amount
     */
    public double getAmount(){
        return amount;
    }

    /**
     * returns the unit of the ingredient
     * @return units
     */
    public String getUnits(){
        return units;
    }

    /**
     * Returns the amount of ingredient available
     * @param num quantity of ingredient
     * @return the amount of ingredient
     */
    public double getIngredient(double num){
        if (num <= amount){
            amount -= num;
            return num;
        }
        else{
            double temp = amount;
            amount = 0;
            return temp;
        }
    }

    /**
     * compares two ingredient objects by amounts
     * @param other the object to be compared.
     * @return a number to indicate its placement??
     */
    public int compareTo(Object other){
        Ingredients item = (Ingredients) other;
        if (amount < item.getAmount()){
            return -1;
        }
        else if (amount == item.getAmount()){
            return 0;
        }
        else{
            return 1;
        }
    }

    /**
     * returns a description of the ingredient
     * @return name of the ingredient and the amounts left
     */
    public String toString(){
        return name + ": " + amount + " " + units;
    }
}
