import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;



public class Disciplina{
	
	private String codigo;
	private ArrayList<Aluno>estudantes;

	public Disciplina(String codigo){
        setCodigo(codigo);
        estudantes = new ArrayList<Aluno>();
}

public boolean setCodigo (String codigo) {
this.codigo = codigo;
return true;
}

    public boolean adicionarEstudantes(Aluno aluno){
	    estudantes.add(aluno);
	    return true;
    }
	
    public int alunosMatriculados( ) {
	    return estudantes.size( );
    }

public void imprimirEstudantesDecrescente( ){
    Iterator<Aluno> it1 = estudantes.iterator();
    while (it1.hasNext()) {
        it1.next().setFlag(1);    
    }
Collections.sort(estudantes, Collections.reverseOrder());

Iterator<Aluno> it = estudantes.iterator();
while (it.hasNext()) {
    System.out.println(it.next().getNusp());
}
}


    public void imprimirEstudantesMedias(){
    Iterator<Aluno> it1 = estudantes.iterator();
    while (it1.hasNext()) {
        it1.next().setFlag(0);    
    }
    Collections.sort(estudantes, Collections.reverseOrder());
    Iterator<Aluno> it = estudantes.iterator();
    while (it.hasNext()) {
        System.out.println(it.next().getMedia());
    }
    }

    public void imprimirAprovados(){
        Iterator<Aluno> it = estudantes.iterator();
        while (it.hasNext()) {
            Aluno x = it.next();
            if(x.getMedia() >= 5.0){
                System.out.print(x.getNusp()+" ");
                System.out.println(x.getMedia());
                //System.out.print(it.next().getNotas());
            }
        }

        }

    }

