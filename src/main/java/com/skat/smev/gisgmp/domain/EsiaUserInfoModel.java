package com.skat.smev.gisgmp.domain;

public class EsiaUserInfoModel {
    private String userId;
    private String sessionIndex;
    private String sessionDate;
    // person
    private String personSnils;
    private String personInn;
    private String personDocCode;
    private String personDocSeries;
    private String personDocNumber;
    // individual business
    private String individualBusinessPersonINN;

    public String getUserId(){
        return userId;
    }

    public String getSessionIndex(){
        return sessionIndex;
    }

    public String getSessionDate(){
        return sessionDate;
    }

    public String getPersonSnils(){
        return personSnils;
    }

    public String getPersonInn(){
        return personInn;
    }

    public String getPersonDocCode(){
        return personDocCode;
    }

    public String getPersonDocSeries(){
        return personDocSeries;
    }

    public String getPersonDocNumber(){
        return personDocNumber;
    }

    public String getIndividualBusinessPersonINN(){
        return individualBusinessPersonINN;
    }
}