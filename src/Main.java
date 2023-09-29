public class Main {
    public static void main(String[] args){

        //Keith


        Dish dish1 = new Dish("calimari",19, 12,"entree","fried and battered squid" );
        Dish dish2 = new Dish("char sui bao", 12, 4, "appetizer", "braised pork buns");
        restaurantOrder order1 = new restaurantOrder( dish1.getPrice()+dish2.getPrice(), dish1.getCookTime()+ dish2.getCookTime());
        order1.takingOrders();
        order1.addDish(dish1);
        order1.addDish(dish2);
        dish1.Description();
        dish2.Description();
        order1.response();
        order1.Pricedelaration(order1.getPrice());
        order1.serving();
        dish1.toString();

        CustomerService customerService = new CustomerService();
        customerService.customer = "Abdi";
        customerService.agent = "Keith";
        customerService.discountCode = 123456789;
        customerService.GiveApology();

            }
        }




