package com.appointments.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.appointments.application.dto.AppointmentCreate;
import com.appointments.application.dto.AppointmentDelete;
import com.appointments.application.dto.AppointmentRead;
import com.appointments.application.dto.AppointmentUpdate;
import com.appointments.model.IAppointmentsModel;



@RestController  
@RequestMapping(value="/attendee/request")
public class AppointmentsControllerAttendeeRequest implements IAppointmentsControllerAttendeeRequest {


	@Autowired 
	private IAppointmentsModel model;  	//https://stackoverflow.com/a/52526618
	
	@Override
	@PostMapping(value="/create", produces = "application/json")
	public Boolean  registerCreate(@RequestBody AppointmentCreate appCreate) {
		
		return model.registerCreate(appCreate);
	
	}

	@Override
	@PostMapping(value="/read", produces = "application/json")
	public Boolean registerRead(@RequestBody AppointmentRead appRead) {
		
		return model.registerRead(appRead);
		
	}

	@Override
	@PostMapping(value="/update", produces = "application/json")
	public Boolean registerUpdate(@RequestBody AppointmentUpdate appUpdate) {

		return model.registerUpdate(appUpdate);
	}

	@Override
	@PostMapping(value="/delete", produces = "application/json")
	public Boolean registerDelete(@RequestBody AppointmentDelete appDelete) {

		return model.registerDelete(appDelete);
	}

}
