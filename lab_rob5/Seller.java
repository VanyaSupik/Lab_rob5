package lab_rob1;

public class Seller extends Client {
    private String name;
    private String surName;
    private int experience;
    private int salary;

    public Seller() {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        int g = salary*2;
        this.salary = g;
    }

    Seller(String name, String surName, int experience, int salary) {
        super();
        this.name = name;
        this.surName = surName;
        this.experience = experience;
        this.salary = salary;
    }
    String props(){
        return name + " " + surName;
    }
    void experienced() {
        if(experience > 6) {
            System.out.println("Досвідчений продавець");
        } else {
            System.out.println("Не досвідчений");
        }
    }
    void experienced(int experience){
        if(experience>10){
            System.out.println("Зарплату підняли в 2x. нова зарплата продавця: "+salary*2);
        }else {
            System.out.println("Зарплата не змінилася "+ salary);
        }
    }
    void about(int premium, int soldCars){
        if(soldCars >= 3){
            System.out.println("Продавцю нарахована премія "+premium);
        }else {
            System.out.println("Без премії");//Метод із статичним імям
        }
    }
    void salary(){
        System.out.println("Зарплата "+ salary);
    }

    void newLevel(boolean s){
        if(s == true){
            salary = salary+5000;
            System.out.println("Нова зарплата продавця "+salary);
        }else {
            System.out.println("Зарплата не змінилася ");//Перевантажений
        }
    }
}
