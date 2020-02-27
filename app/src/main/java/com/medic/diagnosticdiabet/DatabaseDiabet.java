package com.medic.diagnosticdiabet;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import androidx.room.Relation;

@Entity(tableName="DiabetInfo")
public class DatabaseDiabet {
    @PrimaryKey(autoGenerate = true)
    @NonNull
    @ColumnInfo(name = "id_user")
    public long id;

    @ColumnInfo(name = "SurnamePatient_base")
    public String SurnamePatient;

    @ColumnInfo(name = "venakrovdoeat_base")
    public double venoznakrovdoeat;

    @ColumnInfo(name = "venakrovposleeat_base")
    public double venoznakrovposleeat;

    @ColumnInfo(name = "venaplazmadoleeat_base")
    public double venoznaplazmadoleeat;

    @ColumnInfo(name = "venaplazmaposleeat_base")
    public double venoznaplazmaposleeat;

    @ColumnInfo(name = "kapilarplazmadoleeat_base")
    public double kapilarnaplazmadoleeat;

    @ColumnInfo(name = "kapilarplazmaposleeat_base")
    public double kapilarnaplazmaposleeat;

    @ColumnInfo(name = "diabetdetecttype_base")
    public int diabetdetectedtype;

    @Ignore
    public DatabaseDiabet(String surnamePatient, double venoznakrovdoeat, double venoznakrovposleeat, double venoznaplazmadoleeat, double venoznaplazmaposleeat, double kapilarnaplazmadoleeat, double kapilarnaplazmaposleeat, int diabetdetectedtype) {
        SurnamePatient = surnamePatient;
        this.venoznakrovdoeat = venoznakrovdoeat;
        this.venoznakrovposleeat = venoznakrovposleeat;
        this.venoznaplazmadoleeat = venoznaplazmadoleeat;
        this.venoznaplazmaposleeat = venoznaplazmaposleeat;
        this.kapilarnaplazmadoleeat = kapilarnaplazmadoleeat;
        this.kapilarnaplazmaposleeat = kapilarnaplazmaposleeat;
        this.diabetdetectedtype = diabetdetectedtype;
    }

    public DatabaseDiabet() {
    }

    public String getSurnamePatient() {
        return SurnamePatient;
    }

    public void setSurnamePatient(String surnamePatient) {
        SurnamePatient = surnamePatient;
    }

    public double getVenoznakrovdoeat() {
        return venoznakrovdoeat;
    }

    public void setVenoznakrovdoeat(double venoznakrovdoeat) {
        this.venoznakrovdoeat = venoznakrovdoeat;
    }

    public double getVenoznakrovposleeat() {
        return venoznakrovposleeat;
    }

    public void setVenoznakrovposleeat(double venoznakrovposleeat) {
        this.venoznakrovposleeat = venoznakrovposleeat;
    }

    public double getVenoznaplazmadoleeat() {
        return venoznaplazmadoleeat;
    }

    public void setVenoznaplazmadoleeat(double venoznaplazmadoleeat) {
        this.venoznaplazmadoleeat = venoznaplazmadoleeat;
    }

    public double getVenoznaplazmaposleeat() {
        return venoznaplazmaposleeat;
    }

    public void setVenoznaplazmaposleeat(double venoznaplazmaposleeat) {
        this.venoznaplazmaposleeat = venoznaplazmaposleeat;
    }

    public double getKapilarnaplazmadoleeat() {
        return kapilarnaplazmadoleeat;
    }

    public void setKapilarnaplazmadoleeat(double kapilarnaplazmadoleeat) {
        this.kapilarnaplazmadoleeat = kapilarnaplazmadoleeat;
    }

    public double getKapilarnaplazmaposleeat() {
        return kapilarnaplazmaposleeat;
    }

    public void setKapilarnaplazmaposleeat(double kapilarnaplazmaposleeat) {
        this.kapilarnaplazmaposleeat = kapilarnaplazmaposleeat;
    }

    public int getDiabetdetectedtype() {
        return diabetdetectedtype;
    }

    public void setDiabetdetectedtype(int diabetdetectedtype) {
        this.diabetdetectedtype = diabetdetectedtype;
    }


    @Override
    public String toString() {
        return "DatabaseDiabet{" +
                "id=" + id +
                ", SurnamePatient=" + SurnamePatient +
                ", venoznakrovdoeat=" + venoznakrovdoeat +
                ", venoznakrovposleeat=" + venoznakrovposleeat +
                ", venoznaplazmadoleeat=" + venoznaplazmadoleeat +
                ", venoznaplazmaposleeat=" + venoznaplazmaposleeat +
                ", kapilarnaplazmadoleeat=" + kapilarnaplazmadoleeat +
                ", kapilarnaplazmaposleeat=" + kapilarnaplazmaposleeat +
                ", diabetdetectedtype=" + diabetdetectedtype +
                '}';
    }
}
