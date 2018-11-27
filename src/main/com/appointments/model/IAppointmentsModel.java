package com.appointments.model;

import java.util.UUID;

import com.appointments.application.dto.AppointmentCreate;
import com.appointments.application.dto.AppointmentDelete;
import com.appointments.application.dto.AppointmentRead;
import com.appointments.application.dto.AppointmentUpdate;

public interface IAppointmentsModel {
	
	public Boolean registerCreate(AppointmentCreate appCreate); // post
	public Boolean registerRead(AppointmentRead appRead); 		  // post
	public Boolean registerUpdate(AppointmentUpdate appUpdate); // post
	public Boolean registerDelete(AppointmentDelete appDelete); // post
	
	public AppointmentCreate answeredCreate(String organizerName, UUID uid); // get 
	public AppointmentRead answeredRead(String organizerName, UUID uid); // get 
	public AppointmentUpdate answeredUpdate(String organizerName, UUID uid); // get 
	public AppointmentDelete answeredDelete(String organizerName, UUID uid); // get 
	
	public AppointmentCreate pendingToCreate(String organizerName);  // get
	public AppointmentRead pendingToRead(String organizerName);	 // get
	public AppointmentUpdate pendingToUpdate(String organizerName);  // get
	public AppointmentDelete pendingToDelete(String organizerName);	 // get
	
	public Boolean reportCreate(AppointmentCreate appCreate); //post
	public Boolean reportRead(AppointmentRead appRead);	//post
	public Boolean reportUpdate(AppointmentUpdate appUpdate);	//post
	public Boolean reportDelete(AppointmentDelete appDelete);	//post

}
