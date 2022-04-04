package br.com.persistenciamongodb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlunoController {

	@Autowired
	AlunoService alunoService;
	
	@PostMapping("/alunos")
	public void inserir( @RequestBody Aluno aluno ) {
		
		alunoService.inserir(aluno); 
				
	}
	
	@GetMapping("alunos")
	public List<Aluno> lista(){
		
		return alunoService.lista();
	}
	
	
}
