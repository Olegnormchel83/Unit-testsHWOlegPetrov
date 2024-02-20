package seminars.fourth.hotel;

/**
 * Вам необходимо написать тест с использованием моков для сервиса бронирования отелей.
 * Условие: У вас есть класс HotelService с методом public boolean isRoomAvailable(int roomId),
 * который обычно проверяет, доступен ли номер в отеле.
 * Вам необходимо проверить правильность работы класса BookingService, который
 * использует HotelService для бронирования номера, если он доступен.
 */

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BookingServiceTest {
    @Test
    void bookingTest() {
        HotelService mockHotelService = mock(HotelService.class);
        BookingService bookingService = new BookingService(mockHotelService);
        when(mockHotelService.isRoomAvailable(12)).thenReturn(true);

        boolean ans = bookingService.bookRoom(12);

        assertThat(ans).isEqualTo(true);
    }
}