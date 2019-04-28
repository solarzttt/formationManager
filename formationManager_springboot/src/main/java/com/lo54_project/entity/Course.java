package com.lo54_project.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

/**
 * @author tzhang
 * @date 2019/4/14 {1:37}
 */
@Entity
@Table
public class Course implements Serializable {
    @Id
    @GenericGenerator(name="code",strategy = "assigned")
    @Column
    private String code;
    @Column
    private String title;
    @OneToMany
    @JoinColumn(name = "code")
    @OrderColumn
    private Set<CourseSession> courseSessions;
    public Set<CourseSession> getCourseSessions() {
        return courseSessions;
    }
    public void setCourseSessions(Set<CourseSession> courseSessions) {
        this.courseSessions = courseSessions;
    }

    public Course() {
    }

    public Course(String code, String title) {
        this.code = code;
        this.title = title;
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

    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

}

