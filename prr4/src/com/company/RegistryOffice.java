package com.company;

import java.util.ArrayList;

public class RegistryOffice {
    private ArrayList<MarriageApplication> marriageApplicationList = new ArrayList<MarriageApplication>();
    private ArrayList<BirthApplication> birthApplicationList = new ArrayList<BirthApplication>();
    private ArrayList<DeathApplication> deathApplicationList = new ArrayList<DeathApplication>();

    public ArrayList getMarriageApplicationList(){ return marriageApplicationList; }
    public ArrayList getBirthApplicationList(){ return birthApplicationList; }
    public ArrayList getDeathApplicationList(){ return deathApplicationList; }



    public MarriageApplication getMarAppFromListById(int id){
        for(MarriageApplication app : marriageApplicationList) {
            if(app.getId() == id) {
                return app;
            }
        }
        return null;
    }
}
