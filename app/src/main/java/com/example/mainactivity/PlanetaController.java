package com.example.mainactivity;

import com.example.mainactivity.Planeta;
import com.example.mainactivity.PlanetaDAO;

import java.util.ArrayList;

public class PlanetaController {

    PlanetaDAO planetaDAO;

    public PlanetaController() {
        planetaDAO = new PlanetaDAO();
    }

    public ArrayList<Planeta> listaPlanetas(){
        return planetaDAO.listaPlanetas;
    }
}
