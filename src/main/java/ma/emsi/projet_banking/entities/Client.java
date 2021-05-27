package ma.emsi.projet_banking.entities;

import com.sun.istack.NotNull;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.util.Date;
@Entity
@Table
@Data
@NoArgsConstructor @AllArgsConstructor @ToString
public class Client {
   @Id
    private String cin;
    @NotNull
    private String nom;
    @NotNull
    private String prenom;
    @NotNull
    private String telephone;
    @Email
    private String email;
}
