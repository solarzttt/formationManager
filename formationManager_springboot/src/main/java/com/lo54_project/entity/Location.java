package com.lo54_project.entity;

/**
 * @author tzhang
 * @date 2019/4/14 {1:37}
 */

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Embeddable
@Table(name="location")
public class Location implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int lid;
    @Column
    private String city;
    @OneToMany
    @OrderColumn
    @JoinColumn(name="lid")
    private Set<CourseSession> courseSessions;

    public Set<CourseSession> getCourseSessions() {
        return courseSessions;
    }

    public void setCourseSessions(Set<CourseSession> courseSessions) {
        this.courseSessions = courseSessions;
    }

    public Location() {
    }
    public Location(int lid, String city) {
        this.lid = lid;
        this.city = city;
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

    public String getCity() {
        return city;
    }

    public int getId() {
        return lid;
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setId(int lid) {
        this.lid = lid;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

}
