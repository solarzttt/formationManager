package com.lo54_project.entity;

/**
 * @author tzhang
 * @date 2019/4/14 {1:37}
 */
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "courseSession")
public class CourseSession implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int sid;
    @Column
    @Temporal(TemporalType.DATE)
    private Date startDate;
    @Column
    @Temporal(TemporalType.DATE)
    private Date endDate;
    @Column
    private int max;
    @ManyToOne
    @JoinColumn(name="code")
    private Course course;
    @ManyToOne
    @JoinColumn(name = "lid")
    private Location location;
    @ManyToMany
    @JoinTable(name="client_courseSession",joinColumns = {@JoinColumn(name = "sid",referencedColumnName = "sid")},inverseJoinColumns = {@JoinColumn(name = "cid",referencedColumnName = "cid")})
    @OrderColumn
    private Set<Client> clients;

    public Set<Client> getClients() {
        return clients;
    }

    public void setClients(Set<Client> clients) {
        this.clients = clients;
    }

    public CourseSession(int sid, Date startDate, Date endDate, int max, Course course, Location location) {
        this.sid = sid;
        this.startDate = startDate;
        this.endDate = endDate;
        this.max = max;
        this.course = course;
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public CourseSession() {
    }

    public CourseSession(int sid, Date startDate, Date endDate, int max, Course course) {
        this.sid = sid;
        this.startDate = startDate;
        this.endDate = endDate;
        this.max = max;
        this.course = course;
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

    public Course getCourse() {
        return course;
    }

    public Date getEndDate() {
        return endDate;
    }

    public int getId() {
        return sid;
    }

    public int getMax() {
        return max;
    }

    public Date getStartDate() {
        return startDate;
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public void setId(int sid) {
        this.sid = sid;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

}

