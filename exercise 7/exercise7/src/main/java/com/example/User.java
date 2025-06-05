package com.example;

import javafx.beans.property.SimpleStringProperty;

public class User {
    private SimpleStringProperty username;
    private SimpleStringProperty password;
    private final SimpleStringProperty accountcreated;
    private final SimpleStringProperty accountstatus;

    public User(String username, String password, String dcreated, String astatus) {

        this.username = new SimpleStringProperty(username);
        this.password = new SimpleStringProperty(password);
        this.accountcreated = new SimpleStringProperty(dcreated);
        this.accountstatus = new SimpleStringProperty(astatus);
    }

    public String getUsername() {
        return username.get();
    }

    public String getPassword() {
        return password.get();
    }

    public String getAccountcreated() {
        return accountcreated.get();
    }

    public String getAccountstatus() {
        return accountstatus.get();
    }
}