package ma.emsi.projet_banking.entities;

import java.util.Date;
@Entity
@Table
@Data
@NoArgsConstructor @AllArgsConstructor @ToString
public abstract class Operation {
    private Long numOperation;
    private Date dateOperation;
    private Double montant;

}
