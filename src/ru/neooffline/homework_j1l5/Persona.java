package ru.neooffline.homework_j1l5;
import java.util.Random;

/* Класс с данными от сотруднике
 * @param name - Имя
 * @param secondName - Фамилия
 * @param fullName - Ф.И.
 * @param email
 * */
public class Persona {
    private Random random = new Random();
    private String name;
    private String secondName;
    private String profession;
    private String fullName;
    private String email;
    private long mobileNumber;
    private int minAge = 18;
    private int maxAge = 80;
    private int age;
    private int minWorkCost = 15000;
    private int maxWorkCost = 250000;
    private int workCost;
    private static int count = 0;
    private int personaCount;


    public int getWorkCost() {
        return workCost;
    }

    public void setWorkCost(int workCost) {
        this.workCost = workCost;
    }

    public int getPersonaCount() {
        return personaCount;
    }

    void splitFullName(){
        fullName = name + " " + secondName;
    }

    public String getFullName() { return fullName; }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String login, String domen) {
        this.email = login + "@" + domen ;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean chechEmail(String emale){ //Проверка корректности e-mail если будет нужно

        return emale.contains(".")&&emale.contains("@");
    }
    public boolean checkNumber(long mobileNumber){ //Проверка корректности номера если будет нужно
        return Long.toString(mobileNumber).length()==11;
    }
    Persona(String[] names, String[] families,  String[] professions, String[] logins, String[] domens, long number){
        count ++;
        setName(names[random.nextInt(names.length)]);
        setSecondName(families[random.nextInt(families.length)]);
        splitFullName();
        setEmail(logins[random.nextInt(logins.length)],domens[random.nextInt(domens.length)]);
        setMobileNumber(number);
        setProfession(professions[random.nextInt(professions.length)]);
        setAge(random.nextInt(maxAge-minAge) + minAge);
        setWorkCost(random.nextInt(maxWorkCost-minWorkCost) + minWorkCost);
        personaCount = count;
    }
    Persona(String name, String family, String profession, String login, String domen, long number, int workCost, int age){
        count++;
        setName(name);
        setSecondName(family);
        splitFullName();
        setEmail(login,domen);
        setMobileNumber(number);
        setProfession(profession);
        setWorkCost(workCost);
        setAge(age);
        personaCount = count;
    }
    Persona(){
        count++;
        setName("Тест");
        setSecondName("Тестов");
        splitFullName();
        setEmail("user","ya.ru");
        setMobileNumber(89262664528L);
        setProfession("инженер");
        setAge(22);
        setWorkCost(23000);
        personaCount = count;
    }
    static void printData(Persona persona) {
        System.out.printf("№: %d - %s; Должность: %s; Телефон: %d; e-mail: %s; Зарплата: %d руб.; Возраст: %d.",
                persona.personaCount, persona.getFullName(), persona.getProfession(), persona.getMobileNumber(),
                persona.getEmail(), persona.getWorkCost(), persona.getAge());
        System.out.println();
    }
}
