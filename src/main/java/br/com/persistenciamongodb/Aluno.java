package br.com.persistenciamongodb;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Aluno {

	@Id
	private String id;
	private String nome;
}
