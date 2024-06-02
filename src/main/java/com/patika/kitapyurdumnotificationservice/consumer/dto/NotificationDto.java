package com.patika.kitapyurdumnotificationservice.consumer.dto;

import com.patika.kitapyurdumnotificationservice.consumer.dto.enums.NotificationType;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class NotificationDto {

    private NotificationType notificationType;
    private List<ProductDto> productDtoList;
    private BigDecimal totalAmount;

}
