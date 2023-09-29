//Keith
import java.util.ArrayList;

class restaurantOrder {
    private ArrayList<Dish> dishes;
   private int price;
   private int prepTime;

     public restaurantOrder(int price, int prepTime) {
         this.dishes = new ArrayList <Dish>();
         this.price = price;
         this.prepTime = prepTime;
     }

     public Dish getDishNumber(int number) {
         return this.dishes.get(number);
     }

     public void addDish(Dish newDish) {
         this.dishes.add(newDish);
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
     public void response() {
         dishes.forEach((Dish) -> System.out.println(" i will bring that "+ Dish.getName() + " out for you in " + Dish.getCookTime() + " minutes"));
     }

    void Pricedelaration(int x){
        System.out.println("that will be $" + x);
    }
    public void serving() {
        dishes.forEach((Dish) -> System.out.println("here is your " + Dish.getName()+ "."));
    }

    public String toString() {
        return (null);
    }

}

