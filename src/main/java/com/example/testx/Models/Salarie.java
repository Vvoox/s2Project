package com.example.testx.Models;

import java.util.Date;

public class Salarie {

    private int id_Salarie , num_Somme ;
    private String nom , prenom , telephone, adresse , lieu_Naissance;
    private Date date_Naissance , date_Affectation ;
    private String diplome_obt , direction , service , poste_Affectation , fonction;
    private String cin_urgent , nom_urgent , prenom_urgent , adresse_urgent , mail_urgent;

    //cinUrgent instead of cin_Urgent;

    public int getId_Salarie() {
        return id_Salarie;
    }

    public void setId_Salarie(int id_Salarie) {
        this.id_Salarie = id_Salarie;
    }

    public int getNum_Somme() {
        return num_Somme;
    }

    public void setNum_Somme(int num_Somme) {
        this.num_Somme = num_Somme;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getLieu_Naissance() {
        return lieu_Naissance;
    }

    public void setLieu_Naissance(String lieu_Naissance) {
        this.lieu_Naissance = lieu_Naissance;
    }

    public Date getDate_Naissance() {
        return date_Naissance;
    }

    public void setDate_Naissance(Date date_Naissance) {
        this.date_Naissance = date_Naissance;
    }

    public Date getDate_Affectation() {
        return date_Affectation;
    }

    public void setDate_Affectation(Date date_Affectation) {
        this.date_Affectation = date_Affectation;
    }

    public String getDiplome_obt() {
        return diplome_obt;
    }

    public void setDiplome_obt(String diplome_obt) {
        this.diplome_obt = diplome_obt;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getPoste_Affectation() {
        return poste_Affectation;
    }

    public void setPoste_Affectation(String poste_Affectation) {
        this.poste_Affectation = poste_Affectation;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public String getCin_urgent() {
        return cin_urgent;
    }

    public void setCin_urgent(String cin_urgent) {
        this.cin_urgent = cin_urgent;
    }

    public String getNom_urgent() {
        return nom_urgent;
    }

    public void setNom_urgent(String nom_urgent) {
        this.nom_urgent = nom_urgent;
    }

    public String getPrenom_urgent() {
        return prenom_urgent;
    }

    public void setPrenom_urgent(String prenom_urgent) {
        this.prenom_urgent = prenom_urgent;
    }

    public String getAdresse_urgent() {
        return adresse_urgent;
    }

    public void setAdresse_urgent(String adresse_urgent) {
        this.adresse_urgent = adresse_urgent;
    }

    public String getMail_urgent() {
        return mail_urgent;
    }

    public void setMail_urgent(String mail_urgent) {
        this.mail_urgent = mail_urgent;
    }

    @Override
    public String toString() {
        return "Salarie{" +
                "id_Salarie=" + id_Salarie +
                ", num_Somme=" + num_Somme +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", telephone='" + telephone + '\'' +
                ", adresse='" + adresse + '\'' +
                ", lieu_Naissance='" + lieu_Naissance + '\'' +
                ", date_Naissance=" + date_Naissance +
                ", date_Affectation=" + date_Affectation +
                ", diplome_obt='" + diplome_obt + '\'' +
                ", direction='" + direction + '\'' +
                ", service='" + service + '\'' +
                ", poste_Affectation='" + poste_Affectation + '\'' +
                ", fonction='" + fonction + '\'' +
                ", cin_urgent='" + cin_urgent + '\'' +
                ", nom_urgent='" + nom_urgent + '\'' +
                ", prenom_urgent='" + prenom_urgent + '\'' +
                ", adresse_urgent='" + adresse_urgent + '\'' +
                ", mail_urgent='" + mail_urgent + '\'' +
                '}';
    }
}
