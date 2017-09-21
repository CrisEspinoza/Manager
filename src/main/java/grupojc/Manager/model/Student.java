package grupojc.Manager.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "student")
public class Student {

    // region Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_student")
    private long id_student;

    @NotNull
    private String name;

    @NotNull
    private int rut;

    @NotNull
    private String mail;

    @NotNull
    private int ingress;

    @ManyToOne
    @JoinColumn(name = "id_career")
    private Career career;

    public long getId_student() {
        return id_student;
    }
    //endregion
    //region Constructor
    public Student(String name, int rut, String mail, int ingress, Career career) {
        this.name = name;
        this.rut = rut;
        this.mail = mail;
        this.ingress = ingress;
        this.career = career;
    }
    //endregion
    //region Getters and Setters
    public void setId_student(long id_student) {
        this.id_student = id_student;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getIngress() {
        return ingress;
    }

    public void setIngress(int ingress) {
        this.ingress = ingress;
    }

    public Career getCareer() {
        return career;
    }

    public void setCareer(Career career) {
        this.career = career;
    }
    //endregion
}
