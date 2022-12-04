package lab_rob1;

public class Dispatch {

    Client c = new Client("Volkswagen", "Golf7", 25000, true, 2.0, "Дизель");
    AutoSalon autoSalon = new AutoSalon(25.0, 20.5, 17);
    Seller s = new Seller("Іван", "Cупик", 10, 15000);
    Client a;  // виконання динамічної диспетчеризації реалізовано за допомогою посилкової змінної a.
    void menu(String cl){
        if (cl == "Client") {
            a = c;
            a.newLevel(true);
        } else if(cl == "Seller"){
            a = s;
            a.newLevel(true);
        } else if(cl == "AutoSalon"){
            a = autoSalon;
            a.newLevel(true);
        }else {
            System.out.println("Нема такого класу");
        }
    }







}
