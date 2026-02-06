package main.java.com.airtribe.meditrack.service;

import main.java.com.airtribe.meditrack.Interface.Searchable;
import main.java.com.airtribe.meditrack.entity.Doctor;
import main.java.com.airtribe.meditrack.entity.Specialization;
import main.java.com.airtribe.meditrack.util.DataStore;

import java.util.List;
import java.util.stream.Collectors;

public class DoctorService implements Searchable<Doctor> {

    private final DataStore<Doctor> store = new DataStore<>();

    public void addDoctor(Doctor doctor){
        store.add(doctor);
    }

    public void viewDoctors() {
        store.getAll().forEach(d -> System.out.println(d.getSummary()));
    }

    @Override
    public Doctor searchById(String id) {
        for (Doctor d : store.getAll()) {
            if (d.getId().equals(id)) {
                return d;
            }
        }
        notFoundMessage();
        return null;
    }

    // STREAM: filter doctors by specialization
    public List<Doctor> filterBySpecialization(Specialization specialization) {
        return store.getAll()
                .stream()
                .filter(d -> d.getSpecialization() == specialization)
                .collect(Collectors.toList());
    }

    // STREAM: calculate average consultation fee
    public double averageConsultationFee() {
        return store.getAll()
                .stream()
                .mapToDouble(Doctor::getConsultationFee)
                .average()
                .orElse(0.0);
    }

}
