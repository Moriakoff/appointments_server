package com.appointments.application.dto;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.UUID;

@Data
public class AppointmentDTO {

    //todo Need to think about adding record of LocalDate

    private RequestType requestType;

    private UUID requestId;
    private String eventId;
    private String organizer;
    private String attendee;


    private boolean registered;
    private boolean responded;
    private boolean complete;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate start;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate end;

    public AppointmentDTO() {
    }

    public AppointmentDTO(RequestType requestType, UUID requestId) {
        this.requestType = requestType;
        this.requestId = requestId;
    }
}
