package br.com.persistenciamongodb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AlunoService {

	@Autowired
	AlunoRepository alunoRepository;
	
	@Transactional
	public void inserir(Aluno aluno) {
		
		for (int i = 0; i < 1000; i++) {
			Aluno al = new Aluno();
			al.setNome("Tiago"+i);
			alunoRepository.save(al);
			System.out.println(i);
		}
	
	}
	
	public List<Aluno>lista(){
		
		return alunoRepository.findAll();
	}
	
}
