package com.bankapp.service;

import java.util.List;

import com.bankapp.domain.Appointment;

public interface AppointmentService {
	com.bankapp.domain.Appointment createAppointment(com.bankapp.domain.Appointment appointment);

    List<Appointment> findAll();

    Appointment findAppointment(Long id);

    void confirmAppointment(Long id);
}
