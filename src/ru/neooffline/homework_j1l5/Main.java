package ru.neooffline.homework_j1l5;

import static ru.neooffline.homework_j1l5.Persona.printData;

public class Main {
    static String[] names = {"Антон", "Максим", "Константин", "Алексий", "Цукер", "Мондельштамм"};
    static String[] families = {"Иванов", "Петров", "Сидоров", "Цуканов", "Мальдон"};
    static String[] logins = {"anon", "gevor", "anan", "kisss", "4op_12", "username"};
    static String[] domens = {"ya.ru", "bk.ru", "gmail.com"};
    static String[] professions = {"инженер", "программист", "начальник", "завхоз"};

    public static void main(String[] args) {
        int personsCount = 100;
        int personsMinAge = 78;
        int numberOfInterestedPerons =0;
        Persona[] persons = new Persona[personsCount];
                for (int i = 0; i < personsCount; i++) {
            persons[i] = new Persona(names,families,logins,domens,89232464728L,professions);
                   }
        for (Persona element:persons) {
            if (element.getAge() >= personsMinAge) {
                numberOfInterestedPerons++;
//                System.out.print(element.getPersonaCount() + ": ");
                printData(element);
            }
        }
        System.out.printf("Всего %d сотрудников из %d в возрасте больше %d лет.",numberOfInterestedPerons,persons.length,personsMinAge);
    }

}