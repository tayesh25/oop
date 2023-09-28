//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class CustomerService {
    String agent;
    String customer;
    int discountCode;

    public CustomerService() {
    }

    void GiveApology() {
        System.out.println(this.agent + this.customer + " ,I am so sorry that your steak was raw");
    }

    void GiveDiscount() {
        System.out.println("here's your discount code " + this.discountCode);
    }
}
