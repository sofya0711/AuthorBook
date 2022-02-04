package author.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Author implements Serializable {

    private String name;
    private String surname;
    private int age;
    private String email;
    private Gender gender;
    private Date dateOfBirth;


}
