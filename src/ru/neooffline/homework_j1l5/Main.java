package ru.neooffline.homework_j1l5;

import static ru.neooffline.homework_j1l5.Persona.printData;

public class Main {
    static String[] names = {"Антон", "Максим", "Константин", "Алексий", "Цукер", "Мондельштамм"};
    static String[] families = {"Иванов", "Петров", "Сидоров", "Цуканов", "Мальдон"};
    static String[] logins = {"anon", "gevor", "anan", "kisss", "4op_12", "username"};
    static String[] domens = {"ya.ru", "bk.ru", "gmail.com"};
    static String[] professions = {"инженер", "программист", "начальник", "завхоз"};

    public static void main(String[] args) {
        int personsCount = 25;
        int personsMinAge = 40;
        int numberOfInterestedPersons =0;
        Persona[] persons = new Persona[personsCount];//Создание массива элементов класса Persona
                for (int i = 0; i < personsCount; i++) { //Инициализация массива
                    persons[i] = new Persona(names,families,professions,logins,domens,89232464728L);
                   }
        for (Persona element:persons) {
            if (element.getAge() >= personsMinAge) {
                numberOfInterestedPersons++;
                printData(element);
            }
        }
        System.out.println("-------------------------------------");
        System.out.printf("Всего %d сотрудников из %d в возрасте старше %d лет.",
                numberOfInterestedPersons,persons.length,personsMinAge);
    }

}