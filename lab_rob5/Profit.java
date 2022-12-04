package lab_rob1;

public class Profit extends AutoSalon{
    public Profit(double length, double width, int numberOfCars) {
        super(length, width, numberOfCars);
    }
    void profit(int p){
        System.out.println("Середній прибуток за місяць "+ p);
    }
    void test(){
      Costs c = new Costs();
      c.costs(1500000);
    }
    class Costs{
        void costs(int s){
            System.out.println("Середні витрати "+ s);
            profit(3000000);// Вкладений клас
        }
    }
}
