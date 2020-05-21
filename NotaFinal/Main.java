import java.util.Scanner;

public class Main{

public static void main(String[] args){
float notas[] = new float[3];

    int caso;
    boolean var = true;
    Scanner entrada = new Scanner(System.in);
    System.out.println("Digite o código da disciplina para adicioná-la:");
    String codigo = entrada.next();
    Disciplina disciplina = new Disciplina(codigo);
    System.out.println("Disciplina criada"); 

	while(var){
        System.out.println("Escolha a opção do que deseja que seja feito:");
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
		try{
		    disciplina.adicionarEstudantes(new Aluno(nusp,notas));

		}catch(IllegalArgumentException e){
		    System.out.println(e.getMessage());
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

		
    }
    entrada.close();
    
}
}
