package main.java.com.airtribe.meditrack.service;

import main.java.com.airtribe.meditrack.entity.Appointment;
import main.java.com.airtribe.meditrack.entity.Doctor;
import main.java.com.airtribe.meditrack.entity.Patient;
import main.java.com.airtribe.meditrack.util.DataStore;

public class AppointmentService {
    private final DataStore<Appointment> store = new DataStore<>();

    // CREATE
    public void createAppointment(Patient patient, Doctor doctor) {
        store.add(new Appointment(patient, doctor));
    }

    // READ
    public void viewAppointments() {
        store.getAll().forEach(a -> System.out.println(a.summary()));
    }
}
