package seminars.fourth.weather;

/**
 * Предположим, у вас есть класс WeatherService, который имеет метод getCurrentTemperature(),
 * обращающийся к внешнему API для получения информации о текущей температуре.
 * Вам нужно протестировать другой класс, WeatherReporter, который использует WeatherService.
 * Создайте мок-объект для WeatherService с использованием Mockito.
 */

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class WeatherReporterTest {
    @Test
    void generateReportTest() {
        WeatherService mockWeatherService = mock(WeatherService.class);
        WeatherReporter weatherReporter = new WeatherReporter(mockWeatherService);
        when(mockWeatherService.getCurrentTemperature()).thenReturn(15);

        String answer = weatherReporter.generateReport();

        assertThat(answer).isEqualTo("Текущая температура: " + 15 + " градусов.");
    }
}