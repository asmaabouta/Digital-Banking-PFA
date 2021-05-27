package ma.emsi.projet_banking.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Size;
import java.util.Date;
@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public abstract class  Compte {
    @Id @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long numCompte;
    private Date dateCreation;
    private Double solde;
    private String typeCompte;


    
}
