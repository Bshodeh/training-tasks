package Example3;
interface Vehicle {
    void setPrice(double price);
    void setColor(String color);
    void start();
    void stop();
}
interface AircraftVehicle extends  Vehicle {
    void fly();
}
class Car implements Vehicle {
    double price;
    String color;
    @Override
    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public void setColor(String color) {
        this.color=color;
    }
    @Override
    public void start(){}
    @Override
    public void stop(){}
}
class plane implements  AircraftVehicle{
    double price;
    String color;
    @Override
    public void setPrice(double price) {
    }
    @Override
    public void setColor(String color) {
    }
    @Override
    public void start() {
    }
    @Override
    public void stop() {
    }
    @Override
    public void fly() {
    }
}