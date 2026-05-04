package com.mycompany.projectuts;

public class Buku {

    private int id;
    private String judul;
    private String penulis;
    private int tahun;
    private Penerbit penerbit;  

    public Buku(int id, String judul, String penulis, int tahun, Penerbit penerbit) {
        this.id       = id;
        this.judul    = judul;
        this.penulis  = penulis;
        this.tahun    = tahun;
        this.penerbit = penerbit;
    }

    public void index() {
        System.out.println("SELECT * FROM buku;");
    }

    public void create() {
        System.out.println("-- Form untuk menambah data buku baru --");
    }

    public void store() {
        System.out.println("INSERT INTO buku (id, judul, penulis, tahun, penerbit_id) VALUES ("
                + id + ", '" + judul + "', '" + penulis
                + "', " + tahun + ", " + penerbit + ");");
    }

    public void edit() {
        System.out.println("-- Form untuk mengedit data buku dengan id = " + id + " --");
    }

    public void update() {
        System.out.println("UPDATE buku SET judul='" + judul
                + "', penulis='" + penulis
                + "', tahun=" + tahun
                + " WHERE id=" + id + ";");
    }

    public void destroy() {
        System.out.println("DELETE FROM buku WHERE id=" + id + ";");
    }
}
