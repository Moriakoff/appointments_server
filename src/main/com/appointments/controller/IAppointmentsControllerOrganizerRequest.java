package com.appointments.controller;

import com.appointments.application.dto.AppointmentCreate;
import com.appointments.application.dto.AppointmentDelete;
import com.appointments.application.dto.AppointmentRead;
import com.appointments.application.dto.AppointmentUpdate;

/**
 * Services organizer will reach;
 *
 */
public interface IAppointmentsControllerOrganizerRequest {
	
	public AppointmentCreate IncomingNewEvent(String organizerName); // get

	public AppointmentRead IncomingReport(String organizerName); // get

	public AppointmentUpdate IncomingChangeEvent(String organizerName); // get

	public AppointmentDelete IncomingDeleteEvent(String organizerName); // get

	
}
