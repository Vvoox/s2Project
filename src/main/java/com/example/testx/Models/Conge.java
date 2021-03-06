package com.example.testx.Models;

import java.util.Date;

public class Conge {

    private String type_Conge ;
    private Date date_Debut , date_Fin , retour ;
    private String duree ,motif ;
    private String etat ;
    private int solde ;

    public String getType_Conge() {
        return type_Conge;
    }

    public void setType_Conge(String type_Conge) {
        this.type_Conge = type_Conge;
    }

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

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public Date getRetour() {
        return retour;
    }

    public void setRetour(Date retour) {
        this.retour = retour;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }



    public int getSolde() {
        return solde;
    }
    public void setSolde(int solde) {
        this.solde = solde;
    }


    @Override
    public String toString() {
        return "Conge{" +
                "type_Conge='" + type_Conge + '\'' +
                ", date_Debut=" + date_Debut +
                ", date_Fin=" + date_Fin +
                ", retour=" + retour +
                ", duree='" + duree + '\'' +
                ", motif='" + motif + '\'' +
                ", etat='" + etat + '\'' +
                ", solde=" + solde +
                '}';
    }



}
