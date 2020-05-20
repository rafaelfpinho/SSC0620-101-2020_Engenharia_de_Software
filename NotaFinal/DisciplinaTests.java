import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;

public class DisciplinaTests {

    //variáveis globais da classe de teste
    Disciplina identifier;
    boolean valido = true;
    boolean invalido = false;
    boolean result = true;

    //Metodo que é sempre executado antes de executar cada teste
    @Before
    public void init(){
        identifier = new Disciplina("SSC0620");
    }

    /* Implementação do caso de teste < a52589, ID válido > [limite inferior] */
    @Test
    public void casoTeste1 (){
        result = identifier.setCodigo("SSC0620");
        assertEquals(valido, result);
    }

    @Test
    public void casoTeste2 (){
        result = identifier.setCodigo("SSCC000");
        assertEquals(invalido, result);
    }

    @Test
    public void casoTeste3 (){
        result = identifier.setCodigo("SSC620");
        assertEquals(invalido, result);
    }

    @Test
    public void casoTeste4 (){
        result = identifier.setCodigo("SSS0620");
        assertEquals(invalido, result);
    }

    @Test
    public void casoTeste5 (){
        result = identifier.setCodigo("SSC00620");
        assertEquals(invalido, result);
    }

    @Test
    public void casoTeste6 (){

        float notas[] = new float[3];
        notas[0] = 8;
        notas[1] = 5;
        notas[2] = 6;
        Aluno aluno = new Aluno(10276974, notas);

        result = identifier.adicionarEstudantes(aluno);
        assertEquals(valido, result);
    }

}
  
