package com.appointments.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appointments.application.dto.AppointmentCreate;
import com.appointments.application.dto.AppointmentDelete;
import com.appointments.application.dto.AppointmentRead;
import com.appointments.application.dto.AppointmentUpdate;
import com.appointments.model.IAppointmentsModel;


@RestController  
@RequestMapping(value="/organizer/report")
public class AppointmentsControllerOrganizerReport implements IAppointmentsControllerOrganizerReport {

	@Autowired 
	private IAppointmentsModel model;  //https://stackoverflow.com/a/52526618

	@Override
	@PostMapping(value="/create", produces = "application/json")
	public Boolean reportCreate(@RequestBody AppointmentCreate appCreate) {
		// TODO Auto-generated method stub
		return model.reportCreate(appCreate);
	}

	@Override
	@PostMapping(value="/read", produces = "application/json")
	public Boolean reportRead(@RequestBody AppointmentRead appRead) {
		// TODO Auto-generated method stub
		return model.reportRead(appRead);
	}

	@Override
	@PostMapping(value="/update", produces = "application/json")
	public Boolean reportUpdate(@RequestBody AppointmentUpdate appUpdate) {
		// TODO Auto-generated method stub
		return model.reportUpdate(appUpdate);
	}

	@Override
	@PostMapping(value="/delete", produces = "application/json")
	public Boolean reportDelete(@RequestBody AppointmentDelete appDelete) {
		// TODO Auto-generated method stub
		return model.reportDelete(appDelete);
	}

}
