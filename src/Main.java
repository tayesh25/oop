public class Main {
    public static void main(String[] args){
        Dish dish1 = new Dish("calimari",19, 12,"entree","fried and battered squid" );

        restaurantOrder order1 = new restaurantOrder(dish1, dish1.getPrice(), dish1.getCookTime());
        order1.takingOrders();
        dish1.Description();
        order1.Pricedelaration();
        order1.serving();

    }

    }