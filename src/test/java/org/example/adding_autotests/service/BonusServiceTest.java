package org.example.adding_autotests.service;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BonusServiceTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/bonus.csv")
   //         "30, 1000, true",
  //          "500, 1000000, true",
 //           "100, 10000, false",
  //          "500, 51500, false"
  //  })
    void shouldCalculateForRegisteredAndUnderLimit(int expected, int amount, boolean isRegistered) {
        BonusService service = new BonusService();

        // вызываем целевой метод:
        int actual = (int) service.calculate(amount, isRegistered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
    }

 //   @org.junit.jupiter.api.Test
//    void shouldCalculateForRegisteredAndOverLimit() {
//        BonusService service = new BonusService();

        // подготавливаем данные:
//        long amount = 1_000_000;
//        boolean registered = true;
//        long expected = 500;
//
        // вызываем целевой метод:
//        long actual = service.calculate(amount, registered);
//
        // производим проверку (сравниваем ожидаемый и фактический):
//        assertEquals(expected, actual);
//    }

   // @org.junit.jupiter.api.Test
//    void shouldCalculateForUnregisteredAndUnderLimit() {
//        BonusService service = new BonusService();

        // подготавливаем данные:
//        long amount = 10_000;
//        boolean registered = false;
//        long expected = 100;
//
        // вызываем целевой метод:
//        long actual = service.calculate(amount, registered);
//
        // производим проверку (сравниваем ожидаемый и фактический):
//        assertEquals(expected, actual);
//    }

   // @org.junit.jupiter.api.Test
//    void shouldCalculateForUnregisteredAndOverLimit() {
//        BonusService service = new BonusService();

        // подготавливаем данные:
//        long amount = 50_300;
//        boolean registered = false;
//        long expected = 500;

        // вызываем целевой метод:
//        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
//        assertEquals(expected, actual);
