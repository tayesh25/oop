public class Main {
    public static void main(String[] args){
        Dish dish1 = new Dish("calimari",19, 12,"entree","fried and battered squid" );
        Dish dish2 = new Dish("char sui bao", 12, 4, "appetizer", "braised pork buns");
        restaurantOrder order1 = new restaurantOrder(dish1, dish1.getPrice(), dish1.getCookTime());
        order1.takingOrders();
        dish1.Description();
        dish2.Description();
        order1.response(dish1.getCookTime(), dish1.getName());
        System.out.println("and"); order1.response(dish2.getCookTime(), dish2.getName());
        order1.Pricedelaration(dish1.getPrice()+ dish2.getPrice());
        order1.serving(dish1.getName());
        order1.serving(dish2.getName());

    }

    }