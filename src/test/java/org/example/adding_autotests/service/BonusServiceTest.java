package org.example.adding_autotests.service;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class BonusServiceTest {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/bonus.csv")
  
    void shouldCalculateForRegisteredAndUnderLimit(int expected, int amount, boolean isRegistered) {
        BonusService service = new BonusService();

        // вызываем целевой метод:
        int actual = (int) service.calculate(amount, isRegistered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
    }
