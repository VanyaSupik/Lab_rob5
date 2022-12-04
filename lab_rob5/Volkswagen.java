package lab_rob1;

public class Volkswagen {
    final String brande = "Getta, Golf, Passat, Polo";
    final int numberCars = 7;//Скільки потрібно
    final  int is = 6;// Кількість в наявності

    void order(){
        System.out.println("Моделі які потрібні " + brande);
        System.out.println("Кількість потрібних автомобілів " + numberCars);
        System.out.println("кількість автомобілів в наявності " + is);
    }
    void theTotalCost(final int sum){
        System.out.println("Загальна вартість наявних автомобілів " + sum);
    }

}
