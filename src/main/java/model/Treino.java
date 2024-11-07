package model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.UUID;

import jakarta.persistence.*;

@Table(name = "tb_treino")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Treino {
		
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private UUID idTreino;
	
	@Column
	private String idFicha;
	
	@Column
	private String nomeTreino;

}
