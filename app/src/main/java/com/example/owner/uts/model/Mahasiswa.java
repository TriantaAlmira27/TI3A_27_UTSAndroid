package com.example.owner.uts.model;

public class Mahasiswa {
    private int id;
    private String nama;

    public Mahasiswa(String nama) {
        this.nama = nama;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

}
