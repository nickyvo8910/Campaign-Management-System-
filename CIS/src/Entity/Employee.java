/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author NickyVo
 */
public class Employee {
    private String EmloyeeID;
    private boolean EmployeeType;
    private String Password;
    private String CofirmPassword;
    private String EmployeeName;
    private String Phone;
    private String Email;
    private int Age;
    
    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getCofirmPassword() {
        return CofirmPassword;
    }

    public void setCofirmPassword(String CofirmPassword) {
        this.CofirmPassword = CofirmPassword;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getEmloyeeID() {
        return EmloyeeID;
    }

    public void setEmloyeeID(String EmloyeeID) {
        this.EmloyeeID = EmloyeeID;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public void setEmployeeName(String EmployeeName) {
        this.EmployeeName = EmployeeName;
    }

    public boolean getEmployeeType() {
        return EmployeeType;
    }

    public void setEmployeeType(boolean EmployeeType) {
        this.EmployeeType = EmployeeType;
    }
}
