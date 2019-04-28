package com.lo54_project.entity;

/**
 * @author tzhang
 * @date 2019/4/14 {1:36}
 */

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="client")
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer cid;
    @Column
    private String lastName;
    @Column
    private String firstName;
    @Column
    private String address;
    @Column
    private String phone;
    @Column
    private String email;
    @ManyToMany
    @OrderColumn
    @JoinTable(name="client_courseSession",joinColumns = {@JoinColumn(name = "cid",referencedColumnName = "cid")},inverseJoinColumns = {@JoinColumn(name = "sid",referencedColumnName = "sid")})
    private Set<CourseSession> enrolledCourses;

    public Set<CourseSession> getEnrolledCourses() {
        return enrolledCourses;
    }

    public Client(Integer cid, String lastName, String firstName, String address, String phone, String email, Set<CourseSession> enrolledCourses) {
        this.cid = cid;
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.enrolledCourses = enrolledCourses;
    }

    public Client() {
    }

    public Client(Integer cid, String lastName, String firstName, String address, String phone, String email) {
        this.cid = cid;
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); //To change body of generated methods, choose Tools | Templates.
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public Integer getCid() {
        return cid;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setId(Integer cid) {
        this.cid = cid;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setEnrolledCourses(Set<CourseSession> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }
    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

}



