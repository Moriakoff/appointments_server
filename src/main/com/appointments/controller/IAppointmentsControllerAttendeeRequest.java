package com.appointments.controller;

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
public interface IAppointmentsControllerAttendeeRequest {
	
	public Boolean registerCreate(AppointmentCreate appCreate);  // post
	
	public Boolean registerRead (AppointmentRead appRead); // post
	
	public Boolean registerUpdate (AppointmentUpdate appUpdate); // post 
	
	public Boolean registerDelete (AppointmentDelete appDelete); 	// post
	
}
