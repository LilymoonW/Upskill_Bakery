
/**
 * Represents a single baked good in our inventory
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BakedGood
{
    // instance variables
    private String name;
    private String recipe;
    private int quantity;
    private double price;

    /**
     * Constructor for objects of class BakedGood
     */
    public BakedGood(String name, String recipe, int quantitiy, double price)
    {
        this.name = name;
        this.recipe = recipe;
        this.quantity = quantity;
        this.price = price;
    }

    /** increases the quantity of baked goods by count
     * 
     * @param count
     */
    public void increaseQuantity(int count){
        quantity +=count;
    }

    /**
     * returns string representation of Baked good
     */
    public String toString(){
        return "baked good: " + this.name + " (" + this.quantity + "): $" + this.price;
    }

    public static void main(String[] args){
        BakedGood croissant = new BakedGood("croissant", "butter, flour, laminate, yum", 0, 20.0);
        croissant.increaseQuantity(12);
        System.out.println(croissant);
        croissant.increaseQuantity(3);
        System.out.println(croissant);

    }
}
