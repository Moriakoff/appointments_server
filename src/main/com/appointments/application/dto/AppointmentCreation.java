package com.appointments.application.dto;

import java.time.LocalDateTime;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonFormat;

import biweekly.Biweekly;
import biweekly.property.Uid;
import lombok.Data;

/**
 * dto for appointment creation; appointment is event with Organizer and Attendee; 
 *
 */
@Data
public class AppointmentCreation {
	
	UUID uid;	
	String organizer;
	String attendee;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm")
	LocalDateTime start; 

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm")
	LocalDateTime end; 
	
    String EventID;
	
	boolean created;
	boolean approved;
	
}
