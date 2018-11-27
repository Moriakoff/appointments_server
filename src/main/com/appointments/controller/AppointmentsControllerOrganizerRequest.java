package com.appointments.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.appointments.application.dto.AppointmentCreate;
import com.appointments.application.dto.AppointmentDelete;
import com.appointments.application.dto.AppointmentRead;
import com.appointments.application.dto.AppointmentUpdate;
import com.appointments.model.IAppointmentsModel;



@RestController  
@RequestMapping(value="/organizer/request")
public class AppointmentsControllerOrganizerRequest implements IAppointmentsControllerOrganizerRequest {

	@Autowired 
	private IAppointmentsModel model;  //https://stackoverflow.com/a/52526618
	
	@Override
	@GetMapping(value="/create/", produces = "application/json")
	public AppointmentCreate IncomingNewEvent(@RequestParam(value="orgname") String organizerName) {
				
		return model.pendingToCreate(organizerName);
		
	}

	@Override
	@GetMapping(value="/read", produces = "application/json")
	public AppointmentRead IncomingReport(@RequestParam(value="orgname") String organizerName) {
		
		// TODO Auto-generated method stub
		return model.pendingToRead(organizerName);
	
	}

	@Override
	@GetMapping(value="/update", produces = "application/json")
	public AppointmentUpdate IncomingChangeEvent(@RequestParam(value="orgname") String organizerName) {
		// TODO Auto-generated method stub
		return model.pendingToUpdate(organizerName);
	}

	@Override
	@GetMapping(value="/delete", produces = "application/json")
	public AppointmentDelete IncomingDeleteEvent(@RequestParam(value="orgname") String organizerName) {
		// TODO Auto-generated method stub
		return model.pendingToDelete(organizerName);
	}

}
