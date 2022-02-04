package author.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    private String name;
    private String surname;
    private String email;
    private String password;
    private UserType type;


}
