package com.mycompany.projectuts;

public class User {
    
    private int id;
    private String email;
    private String password;

    public User(int id, String email, String password) {
        this.id       = id;
        this.email    = email;
        this.password = password;
    }

    public void index() {
        System.out.println("SELECT * FROM user;");
    }

    public void create() {
        System.out.println("-- Form untuk menambah data user baru --");
    }

    public void store() {
        System.out.println("INSERT INTO user (id, email, password) VALUES ("
                + id + ", '" + email + "', '" + password + "');");
    }

    public void edit() {
        System.out.println("-- Form untuk mengedit data user dengan id = " + id + " --");
    }

    public void update() {
        System.out.println("UPDATE user SET email='" + email
                + "', password='" + password
                + "' WHERE id=" + id + ";");
    }

    public void destroy() {
        System.out.println("DELETE FROM user WHERE id=" + id + ";");
    }
}
