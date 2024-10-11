package models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "students")
@Getter
@Setter
@ToString
@NamedQueries({

        @NamedQueries(name = "Student.findAll" , query = "SELECT s FROM Student s")

})

public class Student  extends BaseEntity{
    @Column (unique = true)
    private String cif;

}