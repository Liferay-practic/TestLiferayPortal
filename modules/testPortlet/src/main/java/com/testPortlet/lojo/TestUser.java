package com.testPortlet.lojo;

public class TestUser {
    private long customUserId;
    private String name;
    private String mail;
    private String message;

    public TestUser(String name, String mail, String message) {
        this.name = name;
        this.mail = mail;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getCustomUserId() {
        return customUserId;
    }

    public void setCustomUserId(long customUserId) {
        this.customUserId = customUserId;
    }


    public TestUser() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "CustomUser{" +
                "customUserId=" + customUserId +
                ", name='" + name + '\'' +
                ", mail='" + mail + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
