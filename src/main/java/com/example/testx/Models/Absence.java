package com.example.testx.Models;

import java.util.Date;

public class Absence {

    private Date date_Debut , date_Fin ;
    private String type_Abs , justification;

    public Date getDate_Debut() {
        return date_Debut;
    }

    public void setDate_Debut(Date date_Debut) {
        this.date_Debut = date_Debut;
    }

    public Date getDate_Fin() {
        return date_Fin;
    }

    public void setDate_Fin(Date date_Fin) {
        this.date_Fin = date_Fin;
    }

    public String getType_Abs() {
        return type_Abs;
    }

    public void setType_Abs(String type_Abs) {
        this.type_Abs = type_Abs;
    }

    public String getJustification() {
        return justification;
    }

    public void setJustification(String justification) {
        this.justification = justification;
    }

    @Override
    public String toString() {
        return "Absence{" +
                "date_Debut=" + date_Debut +
                ", date_Fin=" + date_Fin +
                ", type_Abs='" + type_Abs + '\'' +
                ", justification='" + justification + '\'' +
                '}';
    }
}
