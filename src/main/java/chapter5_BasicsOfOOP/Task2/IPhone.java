package chapter5_BasicsOfOOP.Task2;

public class IPhone extends Product {
    public IPhone(String model, String color, int memory,  int price, int quantity){
        super(model, color, memory, price, quantity);
    }

    private IPhone characteristic;

    public void printContent() {
        System.out.println(
                characteristic.getModel()+ " " +
                characteristic.getColor()+
                characteristic.getMemory()+
                characteristic.getPrice()+
                characteristic.getQuantity()
        );
    }


}
