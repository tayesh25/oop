//Keith
import java.util.ArrayList;

class restaurantOrder {
    private ArrayList<Dish> Dish;
   private int price;
   private int prepTime;

     public restaurantOrder(int price, int prepTime) {
         this.Dish = new ArrayList <Dish>();
         this.price = price;
         this.prepTime = prepTime;
     }

     public Dish getDishNumber(int number) {
         return this.Dish.get(number);
     }

     public void addDish(Dish newDish) {
         this.Dish.add(newDish);
     }

     public int getPrice() {
         return price;
     }

     public void setPrice(int price) {
         this.price = price;
     }

     public int getPrepTime() {
         return prepTime;
     }

     public void setPrepTime(int prepTime) {
         this.prepTime = prepTime;
     }

     void takingOrders(){
        System.out.println("hello ladies and gentlemen what can i do for you today");

    }
     void response() {
         Dish.forEach((Dish) -> System.out.println(" i will bring that "+ Dish.getName() + " out for you in " + Dish.getCookTime() + " minutes"));
     }
     void Pricedelaration(int x){
        System.out.println("that will be $" + x);
    }
    void serving(String x) {
        System.out.println("here is your "+ x);
    }

    public String toString() {
        return (null);
    }

}

