package com.company;

import java.math.BigDecimal;
import java.util.Date;

/*This class is responsible for keeping track of student hours, amount due,
 * checking if letter is received and date letter received*/

public class StudentMembership {
    private boolean letterReceived;
    private Date dateLetterReceived;
    private int studentHours;

    public StudentMembership(boolean letterReceived, Date dateLetterReceived, int studentHours) {
        this.letterReceived = letterReceived;
        this.dateLetterReceived = dateLetterReceived;
        this.studentHours = studentHours;
    }

    public int getStudentHours() {
        return studentHours;
    }

    public void setStudentHours(int studentHours) {
        this.studentHours = studentHours;
    }


    public boolean isLetterReceived() {
        return letterReceived;
    }

    public void setLetterReceived(boolean letterReceived) {
        this.letterReceived = letterReceived;
    }

    public Date getDateLetterReceived() {
        return dateLetterReceived;
    }

    public void setDateLetterReceived(Date dateLetterReceived) {
        this.dateLetterReceived = dateLetterReceived;
    }

    public String confirmIsAStudent() {
        return "Yes, is a student";

    }
}
