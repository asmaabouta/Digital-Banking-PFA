package ma.emsi.projet_banking.entities;
@Entity
@Table
@Data
@NoArgsConstructor @AllArgsConstructor @ToString
public class CompteCourant extends Compte{
    private double decouvertAutorise;
}
