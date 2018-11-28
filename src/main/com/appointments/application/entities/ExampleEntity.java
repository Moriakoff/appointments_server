package com.appointments.application.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name = "authors")
public class ExampleEntity {
    @Id
    int id_author;
    String first_name;
}
