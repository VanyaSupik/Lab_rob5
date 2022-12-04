package lab_rob1;

public class Main {
    public static void main(String[] args) {
        AutoSalon autoSalon = new AutoSalon(25.0,20.5, 17);//Створив обєкт класу і ініціалізував через конструктор
        AutoSalon autoSalon1 = new AutoSalon();
        AutoSalon autoSalon2 = new AutoSalon(23);
        AutoSalon autoSalon3 = new AutoSalon(23.1, 24.8);
        autoSalon.cars();
        System.out.println("Площа автосалону: " + autoSalon.square());//Викликав методи
        System.out.println(autoSalon.square(30,25));
        autoSalon.salon(4.0,3);//Метод посилкового типу
        autoSalon.about(2020,"Reno");
        autoSalon.client();
        autoSalon.printInfo();
        autoSalon.newLevel(true);
        autoSalon.newLevel("Негативний",3);


        System.out.println();

        Client c = new Client("Volkswagen", "Golf7",25000,true,2.0,"Дизель");
        System.out.println("Бюджет клієнта: " + c.money1());
        c.favoriteCar1();
        System.out.println(c.money2());
        c.carInSalon1();
        c.about1();
        c.newLevel(true);


        System.out.println();

        Seller s = new Seller("Іван","Cупик",10,15000);
        s.experienced();
        System.out.println("Імя та Прізвище продавця: " + s.props());
        s.experienced(11);
        s.about(10000,4);//Метод із статичним імям
        s.salary();
        s.newLevel(true);

        System.out.println();

        STO.numb();
        STO.service("Volkswagen");

        System.out.println();

        Volkswagen v = new Volkswagen();
        v.order();
        v.theTotalCost(10000000);

        System.out.println();

        Profit p = new Profit(25.0,20.5, 17);
        p.test();

        System.out.println();

        Dispatch dispatch = new Dispatch();   //Динамічна диспетчеризація
        dispatch.menu("Client");
        dispatch.menu("Seller");
        dispatch.menu("AutoSalon");
    }

}
