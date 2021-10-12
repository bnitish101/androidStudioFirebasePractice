package com.example.firebasepractice;

public class dataholder {
    // String roll;
    String name, course, duration;

    public dataholder(String name, String course, String duration) {
        // this.roll = roll;
        this.name = name;
        this.course = course;
        this.duration = duration;
    }

    /*
    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }
    */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
