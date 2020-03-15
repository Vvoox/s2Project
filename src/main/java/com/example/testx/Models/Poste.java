package com.example.testx.Models;

import java.util.List;

public class Poste {

    private int id_poste ;
    private String nom , direction , division , service ;
    private List<String> comp_requis ;

    public int getId_poste() {
        return id_poste;
    }

    public void setId_poste(int id_poste) {
        this.id_poste = id_poste;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }


    public List<String> getComp_requis() {
        return comp_requis;
    }

    public void setComp_requis(List<String> comp_requis) {
        this.comp_requis = comp_requis;
    }

    @Override
    public String toString() {
        return "Poste{" +
                "id_poste=" + id_poste +
                ", nom='" + nom + '\'' +
                ", direction='" + direction + '\'' +
                ", division='" + division + '\'' +
                ", service='" + service + '\'' +
                ", comp_requis='" + comp_requis + '\'' +
                '}';
    }
}
