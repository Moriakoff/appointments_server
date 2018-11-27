package com.appointments.controller;

import java.util.UUID;

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
@RequestMapping(value="/attendee/report")
public class AppointmentsControllerAttendeeReport implements IAppointmentsControllerAttendeeReport {


	@Autowired 
	private IAppointmentsModel model;  	//https://stackoverflow.com/a/52526618
	
	@Override
	@GetMapping(value="/create", produces = "application/json")
	public AppointmentCreate  createEvent(@RequestParam(value="orgname") String organizerName, @RequestParam(value="uid") UUID uid) {
		// TODO Auto-generated method stub	
		return model.answeredCreate(organizerName, uid);
		
	}

	@Override
	@GetMapping(value="/read", produces = "application/json")
	public AppointmentRead readEvent(@RequestParam(value="orgname") String organizerName, @RequestParam(value="uid") UUID uid) {
		// TODO Auto-generated method stub
		return model.answeredRead(organizerName, uid);
	}

	@Override
	@GetMapping(value="/update", produces = "application/json")
	public AppointmentUpdate updateEvent(@RequestParam(value="orgname") String organizerName, @RequestParam(value="uid") UUID uid) {
		// TODO Auto-generated method stub
		return model.answeredUpdate(organizerName, uid);
	}

	@Override
	@GetMapping(value="/delete", produces = "application/json")
	public AppointmentDelete deleteEvent(@RequestParam(value="orgname") String organizerName, @RequestParam(value="uid") UUID uid) {
		// TODO Auto-generated method stub
		return model.answeredDelete(organizerName, uid);
	}


}
