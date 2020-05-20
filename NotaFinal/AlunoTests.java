import org.junit.Before;
import org.junit.Test;

public class AlunoTests{

    Aluno aluno;
    //valores possiveis
    float notas1[] = new float[3];
    notas1[0] = 5;
    notas1[1] = 6;
    notas1[2] = 9;
    //valores extremos
    float notas2[] = new float[3];
    notas2[0] = 0;
    notas2[1] = 10;
    notas2[2] = 5;
    //valores invalidos
    float notas3[] = new float[3];
    notas3[0] = 11;
    notas3[1] = 4;
    notas3[2] = -1;
    //n_usp possivel
    int n_usp1 = 10276682;
    //n_usp não possivel
    int n_usp2 = 102766820;
    int n_usp3 = 1027668;

    @Before
    public void init(){
    }

    /* Verificam os métodos dentro do objeto*/
    public void verificaNotas(){}
    public void calculoMedia(){}
    public void verificaFlag(){}
    
    /* Verificam a criação do objeto */
    public void casoTeste1(){}
    public void casoTeste2(){}
    public void casoTeste3(){}
    public void casoTeste4(){}
    public void casoTeste5(){}
    public void casoTeste6(){}




}