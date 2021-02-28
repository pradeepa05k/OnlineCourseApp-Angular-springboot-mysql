package tech.getarrays.employeemanager.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class AppUser implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    // private String password;
    private String phone;    
    private Long isInstructor;

    @Column(nullable = false, updatable = false)
    private String appuserCode;

    public AppUser() {}

    public AppUser(Long id, String firstName, String lastName, String email, String password, String phone, Long isInstructor, String appuserCode) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.phone = phone;
        this.isInstructor = isInstructor;
        this.appuserCode = appuserCode;
    }

    public Long getid() {
        return id;
    }

    public void setid(Long id) {
        this.id = id;
    }

    public String getfirstName() {
        return firstName;
    }

    public void setfirstName(String name) {
        this.firstName = name;
    }

    
    public String getlastName() {
        return lastName;
    }

    public void setlastName(String name) {
        this.lastName = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String pass) {
        this.password = pass;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public long getIsInstructor() {
        return isInstructor;
    }

    public void setIsInstructor(Long isInstructor) {
        this.isInstructor = isInstructor;
    }

    public String getAppUserCode() {
        return appuserCode;
    }

    public void setAppUserCode(String appuserCode) {
        this.appuserCode = appuserCode;
    }

    @Override
    public String toString() {
        return "AppUser{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phone='" + phone + '\'' +
                ", isInstructor='" + isInstructor + '\'' +
                '}';
    }
}
