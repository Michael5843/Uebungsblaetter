public class SodaMachine {
    private String drinkName;
    private int count;
    private double pricePerDrink;

    public SodaMachine(String drinkName, int count, double pricePerDrink) {
        this.drinkName = drinkName;
        this.count = count;
        this.pricePerDrink = pricePerDrink;
    }

    public String getDrinkName() {
        return this.drinkName;
    }
    public int getCount() {
        return this.count;
    }
    public void setCount(int newCount) {
        this.count = newCount;
    }
    public double getPricePerDrink() {
        return this.pricePerDrink;
    }
    public void sellDrink() {
        if (this.count > 0) {
            this.count--;
        } else {
            System.out.println("No more drinks :(");
        }
    }
    public double calculateTotalValue() {
        return this.count * this.pricePerDrink;
    }
}
