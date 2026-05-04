package com.mycompany.projectuts;

public class Main {

    public static void main(String[] args) {

        User user1 = new User(1, "ridhojan@gmail.com", "dho123");

        System.out.println("========== CLASS USER ==========");
        user1.index();
        user1.store();
        user1.update();
        user1.destroy();

        System.out.println();

        Penerbit penerbit1 = new Penerbit(1, "Gramedia", "Jakarta");

        System.out.println("========== CLASS PENERBIT ==========");
        penerbit1.index();
        penerbit1.store();
        penerbit1.update();
        penerbit1.destroy();

        System.out.println();

        Buku buku1 = new Buku(1, "Laskar Pelangi", "Andrea Hirata", 2005, penerbit1);

        System.out.println("========== CLASS BUKU ==========");
        buku1.index();
        buku1.store();
        buku1.update();
        buku1.destroy();
    }
}
