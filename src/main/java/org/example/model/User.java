package org.example.model;

public class User {

    private String userName;
    private String displayName;
    public User(String userName) {
        this.userName = userName;
    }
   public void newmethod(){
        System.out.println("s");
   }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
