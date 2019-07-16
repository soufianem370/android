package com.app.demopfe;

import android.os.Parcel;
import android.os.Parcelable;

class Recommmendation implements Parcelable {

    private String place;
    public String getPlace() {
        return place;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.place);
    }

    public Recommmendation() {
    }

    protected Recommmendation(Parcel in) {
        this.place = in.readString();
    }

    public static final Parcelable.Creator<Recommmendation> CREATOR = new Parcelable.Creator<Recommmendation>() {
        @Override
        public Recommmendation createFromParcel(Parcel source) {
            return new Recommmendation(source);
        }

        @Override
        public Recommmendation[] newArray(int size) {
            return new Recommmendation[size];
        }
    };
}
