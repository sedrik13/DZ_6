package ru.netology.services;

public class Main {

    public static void main(String[] args) {
        CalculateService service = new CalculateService();

        int income = 10_000; //ежемесячный доход
        int expenses = 3_000; //ежемесячные траты
        int threshold = 20_000; // сумма при которой можно отдохнуть


        int count = service.calculateMonth(income, expenses, threshold);

        System.out.println("количество месяцев отдыха равно " + count);
    }
}
