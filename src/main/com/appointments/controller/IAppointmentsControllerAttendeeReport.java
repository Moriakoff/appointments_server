package com.appointments.controller;

import java.util.UUID;

import com.appointments.application.dto.AppointmentCreate;
import com.appointments.application.dto.AppointmentDelete;
import com.appointments.application.dto.AppointmentRead;
import com.appointments.application.dto.AppointmentUpdate;

/**
 * Service for appointments attendee; 
 * this are the endpoints attendee will reach when; 
 * 
 *
 */
public interface IAppointmentsControllerAttendeeReport {
	
	public AppointmentCreate createEvent(String organiserName, UUID eventUUID);  // get
	
	public AppointmentRead readEvent(String organiserName, UUID eventUUID); // get
	
	public AppointmentUpdate updateEvent(String organiserName, UUID eventUUID);// get
	
	public AppointmentDelete deleteEvent(String organiserName, UUID eventUUID); 	// get
	
}
