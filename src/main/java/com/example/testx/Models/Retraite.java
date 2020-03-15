package com.example.testx.Models;

import java.util.Date;

public class Retraite {

    private Date date_Retraite;
    private String type_Retaite , remarques , reference ;
    private boolean validation , avantage_Nature ;

    public Date getDate_Retraite() {
        return date_Retraite;
    }

    public void setDate_Retraite(Date date_Retraite) {
        this.date_Retraite = date_Retraite;
    }

    public String getType_Retaite() {
        return type_Retaite;
    }

    public void setType_Retaite(String type_Retaite) {
        this.type_Retaite = type_Retaite;
    }

    public String getRemarques() {
        return remarques;
    }

    public void setRemarques(String remarques) {
        this.remarques = remarques;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public boolean isValidation() {
        return validation;
    }

    public void setValidation(boolean validation) {
        this.validation = validation;
    }

    public boolean isAvantage_Nature() {
        return avantage_Nature;
    }

    public void setAvantage_Nature(boolean avantage_Nature) {
        this.avantage_Nature = avantage_Nature;
    }

    @Override
    public String toString() {
        return "Retraiter{" +
                "date_Retraite=" + date_Retraite +
                ", type_Retaite='" + type_Retaite + '\'' +
                ", remarques='" + remarques + '\'' +
                ", reference='" + reference + '\'' +
                ", validation=" + validation +
                ", avantage_Nature=" + avantage_Nature +
                '}';
    }
}
