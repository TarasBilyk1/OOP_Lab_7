class Car {
    private final String brand;
    private int enginePower;
    private Driver driver;
    private double price;
    private final int year;
    public Car(String brand, int enginePower, Driver driver, double price, int year) {
        this.brand = brand;
        this.enginePower = enginePower;
        this.driver = driver;
        this.price = price;
        this.year = year;
    }
    public String getBrand() {
        return brand;
    }
    public int getEnginePower() {
        return enginePower;
    }
    public Driver getDriver() {
        return driver;
    }
    public double getPrice() {
        return price;
    }
    public int getYear() {
        return year;
    }
    public void increaseEnginePower (double percentage)
    {
        this.enginePower = (int) (this.enginePower * ( 1 + percentage ));
    }
    public void changeDriver (Driver newDriver )
    {
        this.driver = newDriver;
    }
    public void increasePrice(double percentage) {
        this.price = this.price * (1 + percentage / 100);
    }
}