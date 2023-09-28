//Keith
class Dish {
    private String name;
    private int price;
    private int cookTime;
    private String dishType;
    private String description;

     public Dish(String name,int price, int cookTime, String dishType, String description) {
         this.name = name;
         this.price = price;
         this.cookTime = cookTime;
         this.dishType = dishType;
         this.description = description;
     }

     public int getPrice() {
         return price;
     }

     public void setPrice(int price) {
         this.price = price;
     }

     public int getCookTime() {
         return cookTime;
     }

     public void setCookTime(int cookTime) {
         this.cookTime = cookTime;
     }

     public String getDishType() {
         return dishType;
     }

     public void setDishType(String dishType) {
         this.dishType = dishType;
     }

     public String getDescription() {
         return description;
     }

     public void setDescription(String description) {
         this.description = description;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     void Description(){
    System.out.println( name + " is " + description);
    }
    public String toString(){
         return name + " $" + price + " " + cookTime + " minute cooktime, "  + description;
    }
}

