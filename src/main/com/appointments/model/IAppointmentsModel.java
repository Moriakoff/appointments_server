package com.appointments.model;

import com.appointments.application.dto.AppointmentDTO;

import java.util.UUID;

public interface IAppointmentsModel {

    Boolean register(AppointmentDTO appointment); // post

    AppointmentDTO answer(String organizerName, UUID uid); // get


    AppointmentDTO pendingTo(String organizerName);  // get


    public Boolean report(AppointmentDTO appointment); //post



}
