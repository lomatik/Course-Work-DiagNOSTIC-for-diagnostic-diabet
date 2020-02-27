package com.medic.diagnosticdiabet;

import java.io.Serializable;

public class selectitem implements Serializable {
    String nameitem;

    public selectitem(String nameitem) {
        this.nameitem = nameitem;
    }

    @Override
    public String toString() {
        return "selectitem{" +
                "nameitem='" + nameitem + '\'' +
                '}';
    }
}
