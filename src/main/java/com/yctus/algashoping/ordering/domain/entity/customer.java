package com.yctus.algashoping.ordering.domain.entity;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;

public class customer {
    private UUID id;
    private String fullName;
    private LocalDate birthDate;
    private String email;
    private String phone;
    private String document;
    private Boolean promotionNotificationAllowed;
    private Boolean archived;
    private OffsetDateTime registeredAt;
    private OffsetDateTime archivedAt;
    private Integer loyaltyPoints;
}