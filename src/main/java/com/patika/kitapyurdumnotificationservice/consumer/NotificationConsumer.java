package com.patika.kitapyurdumnotificationservice.consumer;

import com.patika.kitapyurdumnotificationservice.consumer.dto.NotificationDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class NotificationConsumer {

    @RabbitListener(queues = "${notification.queue}")
    public void sendNotification(NotificationDto notificationDto) {

        log.info("notification :{}", notificationDto.toString());

    }

}
