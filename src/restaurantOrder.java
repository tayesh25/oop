 class restaurantOrder {
   private Dish dish;
   private int price;
   private int prepTime;

     public restaurantOrder(Dish dish, int price, int prepTime) {
         this.dish = dish;
         this.price = price;
         this.prepTime = prepTime;
     }

     public Dish getDish() {
         return dish;
     }

     public void setDish(Dish dish) {
         this.dish = dish;
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
    void Pricedelaration(){
        System.out.println("that will be $" + price);
    }
    void serving() {
        System.out.println("here is your "+ dish.getName());
    }
}

