package com.company;

public class User {
    private String fullname;
    private String position;
    private String email;
    private String telephone;
    private int salary;
    private int age;

    public User(String fullname, String position, String email, String telephone, int salary, int age){
        this.fullname = fullname;
        this.position = position;
        this.email = email;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
    }

    public void info(){
        System.out.print("ФИО-" + fullname + "; Должность-" + position + "; email-" + email + "; Телефон-" + telephone + "; Зарплата-" + salary + "; годы жизни-" + age );
    }

    public void CHposition(String position){
        this.position = position;
        System.out.println("Сотрудник" + fullname + " получил новую должность:" + position);
    }

    public void CHemail(String email){
        this.email = email;
        System.out.println("Сотрудник" + fullname + " поменял email:" + email);
    }

    public void CHtelephone(String telephone){
        this.telephone = telephone;
        System.out.println("Сотрудник" + fullname + " поменял телефон:" + telephone);
    }

    public static void main(String[] args){
        User user1 = new User("Гречкин Иванов Александрович", "директор", "23gres@gmail.com", "89142333456", 100000, 45);
        User user2 = new User("Бабушкина Светлана Афанасьевна", "бухгалтер", "5748fnjfg@gmail.com", "89144567890", 50000, 23);
        User user3 = new User("Крушкин Вячеслав Авериевич", "сварщик", "65fgjng4@gmail.com", "89141234567", 30000, 67);
        User user4 = new User("Лампов Валентин Борисович", "электрик", "87b7bhv@gmail.com", "89146543243", 40000, 47);
        User user5 = new User("Крушкин Вадим Богданович", "водитель", "34ghgh@gmail.com", "89148765432", 25000, 34);
        user2.info();

    }
}
