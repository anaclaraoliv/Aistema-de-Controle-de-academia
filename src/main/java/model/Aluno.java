package model;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

import jakarta.persistence.*;

@Table(name = "tb_aluno")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Aluno {
	
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	 private Long idAluno;

	 @Column
	 private String name;
	 
	 @Column
	 private String tipoPlano;
	 
	 @Column
	 private String tipoAssinatura;

}
