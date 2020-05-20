import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Before;
import org.junit.Test;

public class AlunoTests{

    Aluno aluno;
    float notas[] = new float[3];
    //n_usp possivel
    int n_usp1 = 10276682;
    //n_usp não possivel
    int n_usp2 = 102766820;
    int n_usp3 = 1027668;

    @Before
    public void init(){

        notas[0] = 5;
        notas[1] = 6;
        notas[2] = 9;

        try {
            aluno = new Aluno(n_usp1, notas);
        } catch (IllegalArgumentException e) {
            e.getMessage();
        }
    }

    /******************Verificam os métodos dentro do objeto******************/
    @Test
    public void verificaNotas(){
        float notas_a[] = aluno.getNotas();

        assertEquals(notas[0], notas_a[0]);
        assertEquals(notas[1], notas_a[1]);
        assertEquals(notas[2], notas_a[2]);

    }

    @Test
    public void calculoMediaFinal(){

        float mediaFinal = aluno.getMediaFinal();
        
        float soma = 0;
        for (float f : notas) {
            soma+=f;
        }
        float media = soma/3;

        assertEquals(media, mediaFinal);

    }

    @Test
    public void verificaFlag(){

        int flag = aluno.getFlag();

        assertEquals(0, flag);

    }

    /******************Verificam a criação do objeto******************/
    @Test
    public void casoTeste0(){
     
        IllegalArgumentException thown = assertThrows(
            IllegalArgumentException.class, () -> new Aluno(10276682, notas));
    
        assertEquals("", thown.getMessage());

    } 
    
    @Test
    public void casoTeste1(){
     
        IllegalArgumentException thown = assertThrows(
            IllegalArgumentException.class, () -> new Aluno(1027668, notas));
    
        assertEquals("Erro: Tamanho do nº USP incorreto", thown.getMessage());

    }    
    @Test
    public void casoTeste2(){
     
        IllegalArgumentException thown = assertThrows(
            IllegalArgumentException.class, () -> new Aluno(1027668299, notas));
    
        assertEquals("Erro: Tamanho do nº USP incorreto", thown.getMessage());

    }
    @Test
    public void casoTeste3(){

        notas[0] = 0;
        notas[1] = 10;
        notas[2] = 9;

        IllegalArgumentException thown = assertThrows(
            IllegalArgumentException.class, () -> new Aluno(n_usp1, notas));
    
        assertEquals("", thown.getMessage());
    }

    // Notas inválidas
    @Test
    public void casoTeste4(){
        
        notas[0] = 5;
        notas[1] = 6;
        notas[2] = -1;
        
        IllegalArgumentException thown = assertThrows(
            IllegalArgumentException.class, () -> new Aluno(n_usp1, notas));
    
        assertEquals("Erro: Notas inválidas", thown.getMessage());
    }
    // Notas invalidas
    @Test
    public void casoTeste5(){
 
        notas[0] = 5;
        notas[1] = 6;
        notas[2] = 11;
        
        IllegalArgumentException thown = assertThrows(
            IllegalArgumentException.class, () -> new Aluno(n_usp1, notas));
    
        assertEquals("Erro: Notas inválidas", thown.getMessage());
    }


}
 



