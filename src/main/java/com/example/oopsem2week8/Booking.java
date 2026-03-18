package com.example.oopsem2week8;

import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.time.LocalTime;

public class Booking {

    private Long bookingId;

    @NotBlank(message = "Room number is required")
    private String roomNumber;

    @NotBlank(message = "Student email is required")
    private String studentEmail;

    @NotNull(message = "Booking date is required")
    @Future(message = "Booking date must be in the future")
    private LocalDate bookingDate;

    @NotNull(message = "Start hour is required")
    private LocalTime startHour;

    @NotNull(message = "Duration is required")
    private Integer durationHours;

    public Booking() {}

    public Booking(Long bookingId, String roomNumber, String studentEmail,
                   LocalDate bookingDate, LocalTime startHour, Integer durationHours) {
        this.bookingId = bookingId;
        this.roomNumber = roomNumber;
        this.studentEmail = studentEmail;
        this.bookingDate = bookingDate;
        this.startHour = startHour;
        this.durationHours = durationHours;
    }

    public Long getBookingId() { return bookingId; }
    public void setBookingId(Long bookingId) { this.bookingId = bookingId; }

    public String getRoomNumber() { return roomNumber; }
    public void setRoomNumber(String roomNumber) { this.roomNumber = roomNumber; }

    public String getStudentEmail() { return studentEmail; }
    public void setStudentEmail(String studentEmail) { this.studentEmail = studentEmail; }

    public LocalDate getBookingDate() { return bookingDate; }
    public void setBookingDate(LocalDate bookingDate) { this.bookingDate = bookingDate; }

    public LocalTime getStartHour() { return startHour; }
    public void setStartHour(LocalTime startHour) { this.startHour = startHour; }

    public Integer getDurationHours() { return durationHours; }
    public void setDurationHours(Integer durationHours) { this.durationHours = durationHours; }
}