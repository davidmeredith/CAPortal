/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package uk.ac.ngs.forms;

import java.io.Serializable;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

/**
 * Form bean for searching revocation requests. 
 * @author David Meredith 
 */
public class SearchCrrFormBean implements Serializable {
    
   @Pattern(message="Invalid chars \" ' ; `", regexp="^[^\"';`]*$") 
   private String ra;

   @Pattern(message="Invalid chars \" ' ; `", regexp="^[^\"';`]*$") 
   private String status;

   @Pattern(message="Invalid chars \" ' ; `", regexp="^[^\"';`]*$")
   private String name; 

   @Pattern(message="Invalid chars \" ' ; `", regexp="^[^\"';`]*$")
   private String dn; 
   
   @Pattern(message="Invalid chars \" ' ; `", regexp="^[^\"';`]*$")
   private String data; 
  
   @Min(value=0, message="0 is minimum")
   private Integer crr_key; 
   
   @Min(value=0, message="0 is minimum")
   private Integer showRowCount = 10; 
   
   @Min(value=0, message="0 is minimum")
   private Integer startRow = 0; 
     

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
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the showRowCount
     */
    public Integer getShowRowCount() {
        return showRowCount;
    }

    /**
     * @param showRowCount the showRowCount to set
     */
    public void setShowRowCount(Integer showRowCount) {
        this.showRowCount = showRowCount;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the crr_key
     */
    public Integer getCrr_key() {
        return crr_key;
    }

    /**
     * @param crr_key the crr_key to set
     */
    public void setCrr_key(Integer crr_key) {
        this.crr_key = crr_key;
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the dn
     */
    public String getDn() {
        return dn;
    }

    /**
     * @param dn the dn to set
     */
    public void setDn(String dn) {
        this.dn = dn;
    }

    /**
     * @return the startRow
     */
    public Integer getStartRow() {
        return startRow;
    }

    /**
     * @param startRow the startRow to set
     */
    public void setStartRow(Integer startRow) {
        this.startRow = startRow;
    }
}
