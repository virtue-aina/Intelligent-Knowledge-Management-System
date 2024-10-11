package com.knowledgemanagementtoolai.model.knowledgemgtai;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
@Getter
@Setter
public class User {
    private String id;
    private String username;
    private String email;
    private String hashedPassword;
    private List<String> roles;
    private Date lastLogin;

    public void addRole(String role) {
        if(!this.roles.contains(role)){
            this.roles.add(role);
        }
    }
    public void removeRole(String role) {
        this.roles.remove(role);
    }
    public void updatePassword(String newPassword) {
        this.hashedPassword = newPassword;
    }
    public void updateEmail(String newEmail) {
        this.email = newEmail;
    }
    public List<DocumentModel> getDocument() {
        return null;
    }
}
