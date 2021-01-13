package com.pcshop.jpa.dto;

import com.pcshop.jpa.entity.Kupac;
import lombok.Data;

@Data
public class InputRequest {

    private Kupac kupac;

    public Kupac getKupac() {
        return kupac;
    }

    public void setKupac(Kupac kupac) {
        this.kupac = kupac;
    }

    @Override
    public String toString() {
        return "InputRequest{" +
                "kupac=" + kupac +
                '}';
    }
}
