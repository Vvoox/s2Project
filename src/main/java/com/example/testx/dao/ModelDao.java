package com.example.testx.dao;

import com.example.testx.Models.Salarie;

import java.util.List;

public interface ModelDao {

     Salarie rechercheSalarie(int id_salarie);
     boolean createPoste();
     Salarie rechercheAbs(int id_salarie);
     boolean createAbs();
     boolean createRetraite();
     Salarie visitProfile(int id_salarie);
     boolean affectationReaf(int id_salarie);
     List<Salarie> listDemandeCong();



}
