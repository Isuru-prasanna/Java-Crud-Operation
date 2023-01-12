/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author Tyche
 */
public class AccessUserData {
    
    private final int id;
    private final String name;
    private final String telephone;
    private final String email;
    private final String password;

    public AccessUserData(int id, String name, String telephone, String email, String password) {
        this.id = id;
        this.name = name;
        this.telephone = telephone;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
    
}
