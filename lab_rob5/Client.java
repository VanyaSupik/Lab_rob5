package lab_rob1;

public class Client extends ClientDemo {
    private String brand;//Бренд
    private String model;//Модель
    private int budget;//Бюджет
    private boolean car;
    private double volume;
    private String fuel;

    public Client() {

    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        int b = budget*2;
        this.budget = b;//Збільшить на 2
    }

    public boolean isCar() {
        return car;
    }

    public void setCar(boolean car) {
        this.car = car;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    Client(String brand, String model, int budget, boolean car, double volume, String fuel) {
        super();
        this.brand = brand;
        this.model = model;
        this.budget = budget;
        this.car = car;
        this.volume = volume;
        this.fuel = fuel;
    }
    private int money(){
        return budget;
    }
    private void favoriteCar(){
        System.out.println(brand + " " + model);//Улюблений автомобіль
    }
    private double money(double budget){
        return budget;//Сума клієнта
    }
    private void carInSalon(Client c){
        favoriteCar();//викликав будь який метод з класу
        if(c.car == true){
            System.out.println("Можна оформити купівлю");
        }else {
            System.out.println("Немає в наявності");
        }

    }
    private void about(double volumeDemo,String fuelDemo){
        if(volumeDemo==volume & fuelDemo.equals(fuel)){
            System.out.println("Бажаний автомобіль в наявності");
        }else {
            System.out.println("Немає такого автомобіля");//Метод із статичним імям
        }
    }
    public int money1(){
        return money();
    }
    public void favoriteCar1(){
        favoriteCar();
    }
    public double money2(){
        return money(20000.0);
    }
    public void carInSalon1(){
        carInSalon(new Client("Volkswagen", "Golf7",25000,true,2.0,"Дизель"));
    }
    public void about1(){
        about(2.0,"Дизель");
    }
    //@Override
    void newLevel(boolean s){
        if (s = true){
            System.out.println("Клієнт приїде знову ");
        }else {
            System.out.println("Клієнт більше не приїде");//Перевантажений метод
        }
    }
}
