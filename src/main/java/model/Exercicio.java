package model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.*;

@Table(name = "tb_exercicio")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Exercicio {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idTreino;
	
	@Column
	private String nomeExercicio;
	
	@Column
	private Integer series;
	
	@Column
	private Integer repeticoes;
	
	@Column
	private String obsevacoes;

}
