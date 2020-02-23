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
    public int venoznakrovdoeat;

    @ColumnInfo(name = "venakrovposleeat_base")
    public int venoznakrovposleeat;

    @ColumnInfo(name = "venaplazmadoleeat_base")
    public int venoznaplazmadoleeat;

    @ColumnInfo(name = "venaplazmaposleeat_base")
    public int venoznaplazmaposleeat;

    @ColumnInfo(name = "kapilarplazmadoleeat_base")
    public int kapilarnaplazmadoleeat;

    @ColumnInfo(name = "kapilarplazmaposleeat_base")
    public int kapilarnaplazmaposleeat;

    @ColumnInfo(name = "diabetdetecttype_base")
    public int diabetdetectedtype;

    @Ignore
    public DatabaseDiabet(String surnamePatient, int venoznakrovdoeat, int venoznakrovposleeat, int venoznaplazmadoleeat, int venoznaplazmaposleeat, int kapilarnaplazmadoleeat, int kapilarnaplazmaposleeat, int diabetdetectedtype) {
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

    public int getVenoznakrovdoeat() {
        return venoznakrovdoeat;
    }

    public void setVenoznakrovdoeat(int venoznakrovdoeat) {
        this.venoznakrovdoeat = venoznakrovdoeat;
    }

    public int getVenoznakrovposleeat() {
        return venoznakrovposleeat;
    }

    public void setVenoznakrovposleeat(int venoznakrovposleeat) {
        this.venoznakrovposleeat = venoznakrovposleeat;
    }

    public int getVenoznaplazmadoleeat() {
        return venoznaplazmadoleeat;
    }

    public void setVenoznaplazmadoleeat(int venoznaplazmadoleeat) {
        this.venoznaplazmadoleeat = venoznaplazmadoleeat;
    }

    public int getVenoznaplazmaposleeat() {
        return venoznaplazmaposleeat;
    }

    public void setVenoznaplazmaposleeat(int venoznaplazmaposleeat) {
        this.venoznaplazmaposleeat = venoznaplazmaposleeat;
    }

    public int getKapilarnaplazmadoleeat() {
        return kapilarnaplazmadoleeat;
    }

    public void setKapilarnaplazmadoleeat(int kapilarnaplazmadoleeat) {
        this.kapilarnaplazmadoleeat = kapilarnaplazmadoleeat;
    }

    public int getKapilarnaplazmaposleeat() {
        return kapilarnaplazmaposleeat;
    }

    public void setKapilarnaplazmaposleeat(int kapilarnaplazmaposleeat) {
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
