package com.appointments.controller;

import com.appointments.application.dto.AppointmentCreate;
import com.appointments.application.dto.AppointmentDelete;
import com.appointments.application.dto.AppointmentRead;
import com.appointments.application.dto.AppointmentUpdate;

/**
 * Services organiser will reach;
 *
 */
public interface IAppointmentsControllerOrganizerReport {
	
	public Boolean reportCreate(AppointmentCreate appCreate); // post

	public Boolean reportRead(AppointmentRead appRead); // post

	public Boolean reportUpdate(AppointmentUpdate appUpdate); // post

	public Boolean reportDelete(AppointmentDelete appDelete); // post

	
}
