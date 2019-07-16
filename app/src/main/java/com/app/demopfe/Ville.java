package com.app.demopfe;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

public class Ville implements Parcelable {
    private int id;
    private String nom;
    private String principalPic;
    private String picture1;
    private String picture2;
    private String picture3;
    private String description;
    private List <Recommmendation> recommendation;


    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrincipalPic() {
        return principalPic;
    }

    public void setPrincipalPic(String principalPic) {
        this.principalPic = principalPic;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPicture1() {
        return picture1;
    }

    public void setPicture1(String picture1) {
        this.picture1 = picture1;
    }

    public String getPicture2() {
        return picture2;
    }

    public void setPicture2(String picture2) {
        this.picture2 = picture2;
    }

    public String getPicture3() {
        return picture3;
    }

    public void setPicture3(String picture3) {
        this.picture3 = picture3;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List <Recommmendation> getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(List <Recommmendation> recommendation) {
        this.recommendation = recommendation;
    }

    public Ville(int id, String nom, String principale_pic) {
        this.id = id;
        this.nom = nom;
        this.principalPic = principale_pic;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.nom);
        dest.writeString(this.principalPic);
        dest.writeString(this.picture1);
        dest.writeString(this.picture2);
        dest.writeString(this.picture3);
        dest.writeString(this.description);
        dest.writeTypedList(this.recommendation);
    }

    protected Ville(Parcel in) {
        this.id = in.readInt();
        this.nom = in.readString();
        this.principalPic = in.readString();
        this.picture1 = in.readString();
        this.picture2 = in.readString();
        this.picture3 = in.readString();
        this.description = in.readString();
        this.recommendation = in.createTypedArrayList(Recommmendation.CREATOR);
    }

    public static final Creator<Ville> CREATOR = new Creator<Ville>() {
        @Override
        public Ville createFromParcel(Parcel source) {
            return new Ville(source);
        }

        @Override
        public Ville[] newArray(int size) {
            return new Ville[size];
        }
    };
}
