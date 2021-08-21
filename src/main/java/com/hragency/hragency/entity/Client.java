package com.hragency.hragency.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(schema = "clients")
public class Client {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "vk")
    private String vk;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "client")
    private List<Dialog> dialogs;


    public Client() {
    }

    public Client(String name, String phoneNumber, String email, String vk) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.vk = vk;
    }

    public void addDialog(Dialog dialog){
        if(dialogs==null){
            dialogs=new ArrayList<>();
        }
        dialogs.add(dialog);
        dialog.setClient(this);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVk() {
        return vk;
    }

    public void setVk(String vk) {
        this.vk = vk;
    }

    public List<Dialog> getDialogs() {
        return dialogs;
    }

    public void setDialogs(List<Dialog> dialogs) {
        this.dialogs = dialogs;
    }

}
