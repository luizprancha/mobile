package com.example.mainactivity;

import java.util.ArrayList;

public class PlanetaDAO {
    public ArrayList<Planeta> listaPlanetas;
    public PlanetaDAO() {
        listaPlanetas=new ArrayList<>();
        listaPlanetas.add(new Planeta("Mercurio", "\\(3,30 \\times 10^{23}\\) kg",R.drawable.mercury));
        listaPlanetas.add(new Planeta("Venus", " \\(4,867 \\times 10^{24}\\) kg",R.drawable.venus));
        listaPlanetas.add(new Planeta("Terra", "\\(5,972 \\times 10^{24}\\) kg",R.drawable.earth));
        listaPlanetas.add(new Planeta("Marte", " \\(6,39 \\times 10^{23}\\) kg",R.drawable.mars));
        listaPlanetas.add(new Planeta("Jupiter", "\\(1,898 \\times 10^{27}\\) kg",R.drawable.jupter));
        listaPlanetas.add(new Planeta("Saturno", "\\(5,683 \\times 10^{26}\\) kg",R.drawable.saturn));
        listaPlanetas.add(new Planeta("Netuno", "\\(8,681 \\times 10^{25}\\) kg",R.drawable.uranus));
        listaPlanetas.add(new Planeta("Venus", "\\(1,024 \\times 10^{26}\\) kg",R.drawable.neptune));
    }

    public ArrayList<Planeta> listaPlanetas(){
        return listaPlanetas;
    }

    public static class PlanetaController {
        PlanetaDAO planetaDAO;
        public PlanetaController(){
            planetaDAO=new PlanetaDAO();
        }
        public ArrayList<Planeta> listaPlanetas() {

            return planetaDAO.listaPlanetas();
        }

    }
}
