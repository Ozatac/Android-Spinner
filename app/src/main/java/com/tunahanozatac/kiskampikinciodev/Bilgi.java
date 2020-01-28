package com.tunahanozatac.kiskampikinciodev;

import android.os.Parcel;
import android.os.Parcelable;

public class Bilgi implements Parcelable {


    String ad;
    int no;

    public Bilgi(String ad, int no) {
        this.ad = ad;
        this.no = no;
    }

    protected Bilgi(Parcel in) {
        ad = in.readString();
        no = in.readInt();
    }

    @Override
    public String toString() {
        return "Gül Seyehat " + '\n' +
                "Yolcu İsim: " + ad + '\n' +
                "Koltuk No: " + no;


    }

    public static final Creator<Bilgi> CREATOR = new Creator<Bilgi>() {
        @Override
        public Bilgi createFromParcel(Parcel in) {
            return new Bilgi(in);
        }

        @Override
        public Bilgi[] newArray(int size) {
            return new Bilgi[size];
        }
    };

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(ad);
        dest.writeInt(no);
    }
}
