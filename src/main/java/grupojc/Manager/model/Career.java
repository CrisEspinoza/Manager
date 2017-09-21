package grupojc.Manager.model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@Table(name = "career")
public class Career {

    //region Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_career")
    private long id_career;
    @NotNull
    private String name;
    @OneToMany(mappedBy = "career", orphanRemoval = true)
    private Set<Student> students;
    //endregion
    //region Constructor
    public Career(String name, Set<Student> students) {
        this.name = name;
        this.students = students;
    }
    //endregion
    //region Getters and Setters
    public long getId_career() {
        return id_career;
    }

    public void setId_career(long id_career) {
        this.id_career = id_career;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
    //endregion
}
