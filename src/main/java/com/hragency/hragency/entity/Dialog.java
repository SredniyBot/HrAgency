package com.hragency.hragency.entity;

import javax.persistence.*;

@Entity
@Table(schema = "dialogs")
public class Dialog {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_login")
    private String userLogin;

    @Column(name = "dialog")
    private String dialog;

    @Column(name = "client_id")
    private Integer clientId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_login")
    private User user;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "client_id")
    private Client client;

    public Dialog() {
    }

    public Dialog(String userLogin, String dialog, Integer clientId, User user, Client client) {
        this.userLogin = userLogin;
        this.dialog = dialog;
        this.clientId = clientId;
        this.user = user;
        this.client = client;
    }

    @Override
    public String toString() {
        return "Dialog{" +
                "id=" + id +
                ", userLogin='" + userLogin + '\'' +
                ", dialog='" + dialog + '\'' +
                ", clientId=" + clientId +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public String getDialog() {
        return dialog;
    }

    public void setDialog(String dialog) {
        this.dialog = dialog;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

}
