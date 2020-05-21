import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;



public class Disciplina{
	
	private String codigo;
    private ArrayList<Aluno>estudantes;
    String saidaval = "ID válido";
    String saidainval = "ID inválido";

	public Disciplina(String codigo){
        setCodigo(codigo);
        estudantes = new ArrayList<Aluno>();
    }

    // Conversar migos
    public boolean setCodigo (String codigo) {
        if(codigo.length() == 7 && codigo.substring(0, 3).matches("SSC") && codigo.substring(3, 7).matches("[0-9]*")){
            this.codigo = codigo;
            return true;
        }
        else 
            return false;        
    }

    public boolean adicionarEstudantes(Aluno aluno){
        if(estudantes.add(aluno)){
            return true;
        }
        return false;
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
            System.out.println(it.next().getMediaFinal());
        }
    }

    public void imprimirAprovados(){
        Iterator<Aluno> it = estudantes.iterator();
        while (it.hasNext()) {
            Aluno x = it.next();
            if(x.getMediaFinal() >= 5.0){
                System.out.print(x.getNusp()+" ");
                System.out.println(x.getMediaFinal());
                //System.out.print(it.next().getNotas());
            }
        }
    }

    public int aprovados(){
        int quantidade = 0;
        Iterator<Aluno> it = estudantes.iterator();
        while (it.hasNext()) {
            Aluno x = it.next();
            if(x.getMediaFinal() >= 5.0){
                quantidade++;
            }
        }
        return quantidade;
    }
    
    public void imprimirReprovados(){
        Iterator<Aluno> it = estudantes.iterator();
            while (it.hasNext()) {
                Aluno x = it.next();
                if(x.getMediaFinal() < 5.0){
                    System.out.print(x.getNusp()+" ");
                    System.out.println(x.getMediaFinal());
                    //System.out.print(it.next().getNotas());
                }
            }
        }

        public int reprovados(){
            int quantidade = 0;
            Iterator<Aluno> it = estudantes.iterator();
            while (it.hasNext()) {
                Aluno x = it.next();
                if(x.getMediaFinal() < 5.0){
                    quantidade++;
                }
            }
            return quantidade;
        }

}