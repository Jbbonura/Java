package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {
	  
    private ArrayList<String> patientNotes;
	
    // TO DO: Constructor that takes an ID
     public Physician(Integer id) {
		super(id);
		// TODO Auto-generated constructor stub
	}
     
    // TO DO: Implement HIPAACompliantUser!
    @Override
    public boolean assignPin(int pin) {
    	String stringPIN = String.valueOf(pin);
    	if (stringPIN.length() != 4) {
    		return false;
    	}
    	return true;
    }
    
   
    @Override
	public boolean accessAuthorized(Integer givenID) {
    	if(givenID != id) {
    		return false;
    	}
    	return true;
    }
    
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }

	public ArrayList<String> getPatientNotes() {
		return patientNotes;
	}

	public void setPatientNotes(ArrayList<String> patientNotes) {
		this.patientNotes = patientNotes;
	}
	
    // TO DO: Setters & Getters
    

}
