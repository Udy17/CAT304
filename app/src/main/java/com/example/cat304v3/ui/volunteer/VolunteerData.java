package com.example.cat304v3.ui.volunteer;

public class VolunteerData {
    private String v_name;
    private String v_number;
    private String v_email;

    public VolunteerData() {
        // Default constructor required for Firebase
    }

    public VolunteerData(String name, String number, String email) {
        this.v_name = name;
        this.v_number = number;
        this.v_email = email;
    }

    // Add getters and setters as needed
    public String getName() {
        return v_name;
    }

    public void setName(String name) {
        this.v_name = name;
    }

    public String getNumber() {
        return v_number;
    }

    public void setNumber(String number) {
        this.v_number = number;
    }

    public String getEmail() {
        return v_email;
    }

    public void setEmail(String email) {
        this.v_email = email;
    }
}