package seminars.fourth.message;


import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class NotificationServiceTest {
    @Test
    void testNotificationService() {
        MessageService mockedMessageService = mock(MessageService.class);
        NotificationService notificationService = new NotificationService(mockedMessageService);

        notificationService.sendNotification("123", "Oleg");

        verify(mockedMessageService, times(1)).sendMessage("123", "Oleg");
    }
}