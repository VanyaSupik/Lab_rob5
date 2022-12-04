package lab_rob1;

public class AutoSalon extends Seller {
    private double length;
    private double width;
    private int numberOfCars;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public int getNumberOfCars() {
        return numberOfCars;
    }

    public void setNumberOfCars(int numberOfCars) {
        int n = numberOfCars*2;
        this.numberOfCars = n;
    }

    AutoSalon(double length, double width, int numberOfCars) {
        super();
        this.length = length;
        this.width = width;
        this.numberOfCars = numberOfCars;
    }
    AutoSalon(double length, double width){//Перевизначив конструктори
        this.length = length;
        this.width = width;
    }
    AutoSalon(){
    }
    AutoSalon(int numberOfCars){
        this.numberOfCars = numberOfCars;
    }

    void cars(){
        System.out.println("Кількість автомобілів у салоні: " + numberOfCars);
    }
    double square(){
        double s = length*width;
        return s;//Площа автосалону
    }
    int square(int length, int width){
        return length*width;//Перевизначив типізований метод

    }
    AutoSalon salon(double m,int n){
        AutoSalon autoSalon = new AutoSalon(length-m,width-m,numberOfCars-n);//Метод посилкового типу
        return autoSalon;
    }
    void about(int years,String brands){
        if(years<2019){
            System.out.println("Марка старого автомобіля: "+brands);
        }else {
            System.out.println("Немає старого автомобіля");
        }
    }

    void client(){
        System.out.println("Машину яку хоче клієнт "+super.getBrand() + " " + super.getModel());
    //Викликав змінні з інших класів за допомогою ключового слова супер
    }

    void printInfo(){
        System.out.println("Кількість автомобілів у салоні "+ numberOfCars);
        about1();
    }
    @Override
    void newLevel(boolean a){
        int s = 3;
        if (a = true){
            s++;
            System.out.println("Салон має "+ s + " зірки ");
        }else {
            System.out.println("Салон має "+ s + " зірки ");
        }
    }
    void newLevel(String v,int star){
        if(v == "Негативний"){
            star--;
            System.out.println("Відгук від клієнта "+v);//Перевизначений метод
        }
    }
}
