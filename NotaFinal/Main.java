import java.util.Scanner;

public class Main{

public static void main(String[] args){
int i;
Disciplina disciplina = new Disciplina("ssc1234");
float notas[] = new float[3];



//disciplina.adicionarEstudantes(aluno1);
//disciplina.adicionarEstudantes(aluno2);
//disciplina.adicionarEstudantes(aluno3);

//int num_alunos = disciplina.alunosMatriculados();

//disciplina.imprimirEstudantesDecrescente();
//disciplina.imprimirEstudantesMedias();
//disciplina.imprimirAprovados();

    int caso;
    boolean var = true;
    Scanner entrada = new Scanner(System.in);
	while(var){
        System.out.println("Escolha a opção do que deseja que seja feito:");
        System.out.println("1 - Adicionar Disciplina");
        System.out.println("2 - Adicionar Aluno");
        System.out.println("3 - Consultar alunos matriculados");
        System.out.println("4 - Consultar alunos aprovados");
        System.out.println("5 - Consultar alunos reprovados");
        System.out.println("6 - Lista de alunos matriculados em ordem por número usp");
        System.out.println("7 - Lista de alunos matriculados em ordem por média");
        System.out.println("8 - Lista de alunos aprovados");
        System.out.println("9 - Lista de alunos reprovados");
        System.out.println("10 - Sair do programa");
        caso = Integer.parseInt(entrada.next());
        switch(caso){
            case 1:
                boolean ehNumero;
                System.out.println("Digite o código da disciplina:");
                String codigo = entrada.next();
                String numero = codigo.substring(2);
                try {
                    int valor = (Integer.parseInt(numero));
                        ehNumero = true;
                } catch (NumberFormatException e) {	  
                        ehNumero = false;
                }
                if(codigo.length()>7){
                    System.out.println("Código de disciplina inválido");
                }
                else if(!codigo.contains("SSC")){
                    System.out.println("Código de disciplina inválido");
                }
                else if(!ehNumero){
                    System.out.println("Código de disciplina inválido");
                }
                else{
                    disciplina = new Disciplina(codigo);
                    System.out.println("Disciplina criada"); 
                }
                break;
            case 2:
                System.out.println("Digite o numero usp do aluno:");
                int nusp = Integer.parseInt(entrada.next());
                System.out.println("Digite a nota da P1:");
                String linha = entrada.next();
                notas[0] = Float.parseFloat(linha);
                System.out.println("Digite a nota da P2:");
                linha = entrada.next();
                notas[1] = Float.parseFloat(linha);
                System.out.println("Digite a nota da P3:");
                linha = entrada.next();
                notas[2] = Float.parseFloat(linha);
                boolean valida = true;
                for(i=0;i<3;i++){
                    if(notas[i]<0 || notas[i]>10){
                        valida = false;
                    }
                }
                if(valida){
                    Aluno aluno = new Aluno(nusp,notas);
                    disciplina.adicionarEstudantes(aluno);
                }
                else{
                    System.out.println("Notas inválidas");
                }
                break;
            case 3:
                System.out.println(disciplina.alunosMatriculados());
                break;
            case 4:
                System.out.println(disciplina.aprovados());
                break;
            case 5:
                System.out.println(disciplina.reprovados());
                break;
            case 6:
                disciplina.imprimirEstudantesDecrescente();
                break;
            case 7:
                disciplina.imprimirEstudantesMedias();
                break;
            case 8:
                disciplina.imprimirAprovados();
                break;
            case 9:
                disciplina.imprimirReprovados();
                break;
            case 10:
                System.out.println("Saindo do programa");
                var = false;
                break;
            default:
                System.out.println("Comando inválido");
                break;
        }

		/*if(adicionar_estudantes == 1){
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
        }*/
    }
    entrada.close();
    
    }
}
