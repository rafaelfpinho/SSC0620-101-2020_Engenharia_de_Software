public class Main{

public static void main(String[] args){
Disciplina disciplina = new Disciplina("scc1334");
float notas[] = new float[3];
notas[0] = 11;
notas[1] = 2;
notas[2] = 5;

float notas1[] = new float[3];
notas1[0] = 1;
notas1[1] = 5;
notas1[2] = 10;

float notas2[] = new float[3];
notas2[0] = 4;
notas2[1] = 7;
notas2[2] = 10;


try{

    disciplina.adicionarEstudantes(new Aluno(1000000,notas));

}
catch(IllegalArgumentException e){

    System.out.println(e.getMessage());

}
//Aluno aluno1= new Aluno(1000000,notas);
//Aluno aluno2 = new Aluno(15,notas1);
//Aluno aluno3 = new Aluno(5,notas2);

//disciplina.adicionarEstudantes(aluno2);
//disciplina.adicionarEstudantes(aluno3);

System.out.println(disciplina.alunosMatriculados());
//int num_alunos = disciplina.alunosMatriculados();

//disciplina.imprimirEstudantesDecrescente();
//disciplina.imprimirEstudantesMedias();
//disciplina.imprimirAprovados();

/*	while(true){
		if(adicionar_estudantes == 1){
			aluno = new Aluno(nome,nusp,notas);
			disciplina.adicionarEstudantes(nusp);	
        }
    else if(quantidade_alunos == 1){
	    disciplina.QuantidadeAlunos();
    }
    else if(aprovados == 1){
	    disciplina.QuantidadeAprovados();
    }
    else if(reprovados == 1){
	    disciplina.QuantidadeReprovados();
    }   
    else if(lista_alunos_nusp == 1){
	    disciplina.ListaAlunosNusp();
    }
    else if(lista_alunos_alfabetico == 1){
	    disciplina.ListaAlunosAlfa();
    }
    else if(lista_aprovados == 1){
	    disciplina.ListaAprovados();
    }
    else if(lista_reprovados == 1){
	    disciplina.ListaReprovados();
    }
    }*/
    
}
}
