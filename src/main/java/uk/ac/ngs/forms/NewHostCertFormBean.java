/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uk.ac.ngs.forms;

import java.io.Serializable;
import javax.validation.constraints.Pattern;

/**
 *
 * @author David Meredith 
 */
public class NewHostCertFormBean implements Serializable{
    
    @Pattern(message="Invalid chars \" ' ; `", regexp="^[^\"';`]*$")
    private String ra;
  
    @Pattern(message="Invalid host (DNS) name ", regexp="^\\w{2,30}( \\w{2,30})+$") 
    private String hostname; 
    
    @Pattern(message="Invalid email", regexp="^(([0-9a-zA-Z]+[-._])*[0-9a-zA-Z]+@([-0-9a-zA-Z]+[.])+[a-zA-Z]{2,6}[,;]?)+$")
    private String emailAddress; 

    @Pattern(message="Invalid PIN (10 chars min)", regexp="^[0-9]{10,20}$")
    private String pin; 

    @Pattern(message="Invalid PIN (10 chars min, invalid chars \"';)", regexp="^['\";]{10,50}$")
    private String password; 
    

    /**
     * @return the ra
     */
    public String getRa() {
        return ra;
    }

    /**
     * @param ra the ra to set
     */
    public void setRa(String ra) {
        this.ra = ra;
    }

    /**
     * @return the name
     */
    public String getHostname() {
        return this.hostname;
    }

    /**
     * @param hostName the name to set
     */
    public void setHostName(String hostName) {
         this.hostname = hostName;
    }

    /**
     * @return the emailAddress
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * @param emailAddress the emailAddress to set
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * @return the pin
     */
    public String getPin() {
        return pin;
    }

    /**
     * @param pin the pin to set
     */
    public void setPin(String pin) {
        this.pin = pin;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the pw to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
