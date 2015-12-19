package com.example.sprihabiswas.share_draft1.model;

/**
 * Created by Spriha Biswas on 11/2/2015.
 */
public class NgoData {
    String NgoName;
    String NgoField;
    String NgoVol;
    int NgoPhotoId;

    public NgoData(String ngoName, String ngoField, String ngoVol,int ngoPhotoId) {
        this.NgoName = ngoName;
        this.NgoField = ngoField;
        this.NgoVol = ngoVol;
        this.NgoPhotoId = ngoPhotoId;
    }

    public String getNgoName() {
        return NgoName;
    }

    public String getNgoField() {
        return NgoField;    }
    public String getNgoVol() {
        return NgoVol;
    }


    public int getNgoPhotoId() {
        return NgoPhotoId;
    }
}
