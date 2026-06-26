package com.yctus.algashoping.ordering.domain.entity;

import org.apache.commons.validator.routines.EmailValidator;

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
        this.setId(id);
        this.setFullName(fullName);
        this.setBirthDate(birthDate);
        this.setEmail(email);
        this.setPhone(phone);
        this.setDocument(document);
        this.setPromotionNotificationAllowed(promotionNotificationAllowed);
        this.setArchived(archived);
        this.setRegisteredAt(registeredAt);
        this.setArchivedAt(archivedAt);
        this.setLoyaltyPoints(loyaltyPoints);
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
        this.setId(id);
        this.setFullName(fullName);
        this.setBirthDate(birthDate);
        this.setEmail(email);
        this.setPhone(phone);
        this.setDocument(document);
        this.setPromotionNotificationAllowed(promotionNotificationAllowed);
        this.setRegisteredAt(registeredAt);
        this.setArchivedAt(archivedAt);
        this.setArchived(false);
        this.setLoyaltyPoints(0);
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

    public UUID id() {
        return id;
    }

    public String fullName() {
        return fullName;
    }

    public LocalDate birthDate() {
        return birthDate;
    }

    public String email() {
        return email;
    }

    public String phone() {
        return phone;
    }

    public String document() {
        return document;
    }

    public Boolean isPromotionNotificationAllowed() {
        return promotionNotificationAllowed;
    }

    public Boolean isArchived() {
        return archived;
    }

    public OffsetDateTime registeredAt() {
        return registeredAt;
    }

    public OffsetDateTime archivedAt() {
        return archivedAt;
    }

    public Integer loyaltyPoints() {
        return loyaltyPoints;
    }

    private void setId(UUID id) {
        Objects.requireNonNull(id);
        this.id = id;
    }

    private void setFullName(String fullName) {
        Objects.requireNonNull(fullName);

        if (fullName.isBlank()) {
            throw new IllegalArgumentException("Full name cannot be blank");
        }

        this.fullName = fullName;
    }

    private void setBirthDate(LocalDate birthDate) {
        if (birthDate == null) {
            this.birthDate = null;
            return;
        }

        if (birthDate.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("Birth date cannot be in the future");
        }

        this.birthDate = birthDate;
    }

    private void setEmail(String email) {
        Objects.requireNonNull(email);

        if (email.isBlank()) {
            throw new IllegalArgumentException("Email cannot be blank");
        }

        if (EmailValidator.getInstance().isValid(email)) {
            throw new IllegalArgumentException("Email is not valid");
        }

        this.email = email;
    }

    private void setPhone(String phone) {
        this.phone = phone;
    }


    private void setDocument(String document) {
        Objects.requireNonNull(document);
        this.document = document;
    }

    private void setPromotionNotificationAllowed(Boolean promotionNotificationAllowed) {
        this.promotionNotificationAllowed = promotionNotificationAllowed;
    }

    private void setArchived(Boolean archived) {
        Objects.requireNonNull(archived);
        this.archived = archived;
    }

    private void setRegisteredAt(OffsetDateTime registeredAt) {
        Objects.requireNonNull(registeredAt);
        this.registeredAt = registeredAt;
    }

    private void setArchivedAt(OffsetDateTime archivedAt) {
        this.archivedAt = archivedAt;
    }

    private void setLoyaltyPoints(Integer loyaltyPoints) {
        Objects.requireNonNull(loyaltyPoints);
        this.loyaltyPoints = loyaltyPoints;
    }

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