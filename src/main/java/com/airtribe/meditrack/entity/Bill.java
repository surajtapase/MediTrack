package main.java.com.airtribe.meditrack.entity;

import main.java.com.airtribe.meditrack.Interface.Payable;
import main.java.com.airtribe.meditrack.constants.Constans;

public class Bill implements Payable {
    private final Doctor doctor;

    public Bill(Doctor doctor) {
        this.doctor = doctor;
    }

    @Override
    public double calculateTotal() {
        double baseFee = doctor.getConsultationFee();
        return baseFee + (baseFee * Constans.TAX_RATE);
    }
}
