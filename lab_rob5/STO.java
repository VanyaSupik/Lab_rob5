package lab_rob1;

public class STO {
    static int personal = 3;
    static int price;
    static String models;
    static {
        price = 1000;
        models = "Volkswagen";//Статичний блок ініціалізації
    }
    static void numb(){
        System.out.println("Кількість людей, яякі обслуговують автомобіль " + personal);
        System.out.println("Вартість обслуговування " + price);
        System.out.println("Марки які обслуговують в салоні " + models);
    }
    static void service(String cars){
        System.out.println("Марка якій потрібне обслуговування- " + cars);
        numb();
    }
}
