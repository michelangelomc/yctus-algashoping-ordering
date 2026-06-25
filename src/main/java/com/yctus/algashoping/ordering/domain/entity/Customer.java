package com.yctus.algashoping.ordering.domain.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.UUID;


public class Customer implements Serializable {

    public Customer(UUID id,
                    String fullName,
                    LocalDate birthDate,
                    String email,
                    String phone,
                    String document,
                    Boolean promotionNotificationAllowed,
                    Boolean archived,
                    OffsetDateTime registeredAt,
                    OffsetDateTime archivedAt,
                    Integer loyaltyPoints) {
        this.id = id;
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.email = email;
        this.phone = phone;
        this.document = document;
        this.promotionNotificationAllowed = promotionNotificationAllowed;
        this.archived = archived;
        this.registeredAt = registeredAt;
        this.archivedAt = archivedAt;
        this.loyaltyPoints = loyaltyPoints;
    }

    public Customer(UUID id,
                    String fullName,
                    LocalDate birthDate,
                    String email,
                    String phone,
                    String document,
                    Boolean promotionNotificationAllowed,
                    OffsetDateTime registeredAt,
                    OffsetDateTime archivedAt) {
        this.id = id;
        this.fullName = fullName;
        this.birthDate = birthDate;
        this.email = email;
        this.phone = phone;
        this.document = document;
        this.promotionNotificationAllowed = promotionNotificationAllowed;
        this.registeredAt = registeredAt;
        this.archivedAt = archivedAt;
    }

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

    public void addLoayltyPoints(Integer points) {
    }

    public void archived() {

    }

    public void enablePromotionNotification() {
        this.setPromotionNotificationAllowed(true);
    }

    public void disablePromotionNotification() {
        this.setPromotionNotificationAllowed(false);
    }

    public void changeFullName(String fullName) {
        this.setFullName(fullName);
    }

    public void changePhone(String phone) {
        this.setPhone(phone);
    }

    public void changeEmail(String email) {
        this.setEmail(email);
    }

    private UUID getId() {
        return id;
    }

    private void setId(UUID id) {
        this.id = id;
    }

    private String getFullName() {
        return fullName;
    }

    private void setFullName(String fullName) {
        this.fullName = fullName;
    }

    private LocalDate getBirthDate() {
        return birthDate;
    }

    private void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    private String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    private String getPhone() {
        return phone;
    }

    private void setPhone(String phone) {
        this.phone = phone;
    }

    private String getDocument() {
        return document;
    }

    private void setDocument(String document) {
        this.document = document;
    }

    private Boolean getPromotionNotificationAllowed() {
        return promotionNotificationAllowed;
    }

    private void setPromotionNotificationAllowed(Boolean promotionNotificationAllowed) {
        this.promotionNotificationAllowed = promotionNotificationAllowed;
    }

    private Boolean getArchived() {
        return archived;
    }

    private void setArchived(Boolean archived) {
        this.archived = archived;
    }

    private OffsetDateTime getRegisteredAt() {
        return registeredAt;
    }

    private void setRegisteredAt(OffsetDateTime registeredAt) {
        this.registeredAt = registeredAt;
    }

    private OffsetDateTime getArchivedAt() {
        return archivedAt;
    }

    private void setArchivedAt(OffsetDateTime archivedAt) {
        this.archivedAt = archivedAt;
    }

    private Integer getLoyaltyPoints() {
        return loyaltyPoints;
    }

    private void setLoyaltyPoints(Integer loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", birthDate=" + birthDate +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", document='" + document + '\'' +
                ", promotionNotificationAllowed=" + promotionNotificationAllowed +
                ", archived=" + archived +
                ", registeredAt=" + registeredAt +
                ", archivedAt=" + archivedAt +
                ", loyaltyPoints=" + loyaltyPoints +
                '}';
    }
}