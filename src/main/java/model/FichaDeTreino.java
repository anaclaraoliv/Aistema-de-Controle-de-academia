package model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import jakarta.persistence.*;

@Table(name = "tb_ficha_de_treino")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class FichaDeTreino {
		
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private UUID idFichaDeTreino;
	
	@Column
	private Long idAluno;
	
	@Column
	private Date dataInicial;
	
	@Column
	private String objetivo;
	
	@Column
	private Double peso;
	
	@Column
	private Integer idade;
	
	@Column
	private String cref5;


}
