import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Before;
import org.junit.Test;

public class AlunoTests{

    Aluno aluno ;
    float notas[] = new float[3];
    float result_notas[];
    float mediaFinal;
    int flag;




    @Before
    public void init(){

        notas[0] = 5;
        notas[1] = 6;
        notas[2] = 9;

        try {
            aluno = new Aluno(1027668, notas);
        } catch (IllegalArgumentException e) {
            e.getMessage();
        }
    }

    /******************Verificam os métodos dentro do objeto******************/
    @Test
    public void verificaNotas(){
        result_notas = aluno.getNotas();

        assertEquals(notas[0], result_notas[0]);
        assertEquals(notas[1], result_notas[1]);
        assertEquals(notas[2], result_notas[2]);

    }

    @Test
    public void calculoMediaFinal(){

       mediaFinal = aluno.getMediaFinal();
        
        float soma = 0;
        for (float f : notas) {
            soma+=f;
        }
        
        float media = soma/3;

        assertEquals(media, mediaFinal);

    }

    @Test
    public void verificaFlag(){
        
        aluno.setFlag(1);
        flag = aluno.getFlag();

        assertEquals(1, flag);

    }

    /******************Verificam a criação do objeto******************/
    ///Aluno criado com sucesso
    @Test
    public void casoTeste0(){
     
        IllegalArgumentException thown = assertThrows(
            IllegalArgumentException.class, () -> new Aluno(1027668, notas));
    
        assertEquals("", thown.getMessage());

    } 
    //Aluno com numero usp incorreto (Tam<7)
    @Test
    public void casoTeste1(){
     
        IllegalArgumentException thown = assertThrows(
            IllegalArgumentException.class, () -> new Aluno(10, notas));
    
        assertEquals("Erro: Tamanho do nº USP incorreto", thown.getMessage());
    }
    //Aluno com numero usp incorreto (Tam>7)    
    @Test
    public void casoTeste2(){
     
        IllegalArgumentException thown = assertThrows(
            IllegalArgumentException.class, () -> new Aluno(1027668299, notas));
    
        assertEquals("Erro: Tamanho do nº USP incorreto", thown.getMessage());

    }
    //Aluno com nota incorreta nota[2] = -1
    @Test
    public void casoTeste3(){

        notas[0] = 0;
        notas[1] = 10;
        notas[2] = -1;

        IllegalArgumentException thown = assertThrows(
            IllegalArgumentException.class, () -> new Aluno(1027668, notas));
    
        assertEquals("Erro: Notas inválidas", thown.getMessage());
    }

    //Aluno com nota incorreta nota[2] = 15
    @Test
    public void casoTeste4(){
        
        notas[0] = 5;
        notas[1] = 6;
        notas[2] = 15;
        
        IllegalArgumentException thown = assertThrows(
            IllegalArgumentException.class, () -> new Aluno(1027668, notas));
    
        assertEquals("Erro: Notas inválidas", thown.getMessage());
    }

}
 



