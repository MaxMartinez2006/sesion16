package models;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

@Entity
@Getter
@Setter
@Table(name = "cities")
@ToString
@NamedQueries(
        {
                @NamedQuery(name = "City.findAll", query = "SELECT c FROM City c"")
                        }
                )

        public class City extends BaseEntity{
        @Column (nullable = false)
        @Length(min = 3, max = 60)
        private String name;

        @Column (nullable = false, columnDefinition = "boolean default true")
        private boolean state = true

        }

public class Student {
}