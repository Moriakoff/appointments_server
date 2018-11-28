package com.appointments.application.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class AppointmentCRUD implements IAppointmentDTO {


    @NonNull RequestType requestType;
    UUID requestId;
    String eventId;
    String organizer;
    String attendee;
    boolean registered;
    boolean responded;
    boolean complete;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    LocalDateTime start;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    LocalDateTime end;
}
