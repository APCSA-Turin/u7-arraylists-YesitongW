import java.util.ArrayList;

public class UsedCarLot {
    private ArrayList<Car> inventory;

public UsedCarLot(){
    inventory = new ArrayList<Car>();
}

public ArrayList<Car> getInventory(){
    return inventory;
}

public void addCar(Car addedCar){
    inventory.add(addedCar);
}

public boolean swap(int num1, int num2){
    if (num1 >= 0 && num2 >=0 && num1<inventory.size() && num2<inventory.size()){
        Car car1 = inventory.get(num1);
        Car car2 = inventory.get(num2);
        inventory.set(num1, car2);
        inventory.set(num2, car1);
        return true;
    } else {
        return false;
    }
}
}
