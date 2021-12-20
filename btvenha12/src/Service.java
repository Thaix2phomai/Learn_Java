import model.Kitchen;
import model.Waiter;

public class Service {
    PersonModel<Waiter> listWaiter;
    PersonModel<Kitchen> listKitchen;

    public void addWaiter() {
        listWaiter = new PersonModel<>();
        listWaiter.add(new Waiter( "Thái", 21, 10000, 4000));
        listWaiter.add(new Waiter( "Cường", 29, 9000, 3000));
        listWaiter.add(new Waiter( "Ngọc", 27, 7000, 2000));
    }

    public void printWaiter() {
        System.out.println("Danh sách nhân viên chạy bàn: ");
        listWaiter.display();
    }

    public void addKitchen() {
        listKitchen = new PersonModel<>();
        listKitchen.add(new Kitchen( "Khải", 23, 7500, 2000));
        listKitchen.add(new Kitchen( "Tuấn", 20, 6300, 1500));
        listKitchen.add(new Kitchen( "Dũng", 26, 4900, 2300));
    }

    public void printKitchen() {
        System.out.println("Danh sách nhân viên làm bếp: ");
        listKitchen.display();
    }

}
