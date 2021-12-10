import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    Mainmenu ma = new Mainmenu();
    Service se = new Service();
    ma.choiceMenu(se.addCustomer());
    }
}
