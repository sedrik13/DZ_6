package ru.netology.servise;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.services.CalculateService;


public class CalculateServiceTest {
    @Test
    public void test() {
        CalculateService service = new CalculateService();

        int income = 10_000; //ежемесячный доход
        int expenses = 3_000; //ежемесячные траты
        int threshold = 20_000; // сумма при которой можно отдохнуть
        int count = service.calculate(income, expenses, threshold);
        //System.out.println("количество месяцев отдыха равно " + count);
        Assertions.assertEquals(3, count);

        //@Test
        //public void test() {
        //CalculateService service = new CalculateService();

        //int income = 100_000; //ежемесячный доход
        //int expenses = 60_000; //ежемесячные траты
        //int threshold = 150_000; // сумма при которой можно отдохнуть
        //int count = service.calculate(income, expenses, threshold);
        ////System.out.println("количество месяцев отдыха равно " + count);
        //Assertions.assertEquals(2, count);
    }
}
