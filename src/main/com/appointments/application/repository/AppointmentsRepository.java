package com.appointments.application.repository;

import com.appointments.application.entities.ExampleEntity;
import org.springframework.data.repository.CrudRepository;

public interface AppointmentsRepository extends CrudRepository <ExampleEntity, Integer> {
}
