package com.example.cat304v3.ui.aaa;

public class AaaData {

    private String event1;
    private String name1;
    private String number1;
    private String email1;
    private String name2;
    private String number2;
    private String email2;

    public AaaData() {
        // Default constructor required for Firebase
    }

    public AaaData(String event1, String name1, String number1, String email1, String name2, String number2, String email2) {
        this.event1 = event1;
        this.name1 = name1;
        this.number1 = number1;
        this.email1 = email1;
        this.name2 = name2;
        this.number2 = number2;
        this.email2 = email2;
    }

    // Add getters and setters as needed
    public String getevent1() {
        return event1;
    }
    public void setevent1(String event1) {
        this.event1 = event1;
    }
    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getNumber1() {
        return number1;
    }

    public void setNumber1(String number1) {
        this.number1 = number1;
    }

    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getNumber2() {
        return number2;
    }

    public void setNumber2(String number2) {
        this.number2 = number2;
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2;
    }
}
