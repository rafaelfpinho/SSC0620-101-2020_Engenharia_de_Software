import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class DisciplinaTests {

    //variáveis globais da classe de teste
    Disciplina identifier;
    boolean valido = true;
    boolean invalido = false;
    boolean result = true;
    int tamanho = 0;

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    //Metodo que é sempre executado antes de executar cada teste
    @Before
    public void init(){
        identifier = new Disciplina("SSC0620");
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
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

    @Test
    public void casoTeste7 (){

        float notas[] = new float[3];
        notas[0] = 8;
        notas[1] = 5;
        notas[2] = 6;
        Aluno aluno = new Aluno(10276974, notas);


        identifier.adicionarEstudantes(aluno);
        tamanho = identifier.alunosMatriculados();
        assertEquals(1, tamanho);
    }

    @Test
    public void casoTeste8() {
        float notas[] = new float[3];
        notas[0] = 8;
        notas[1] = 5;
        notas[2] = 6;

        Aluno aluno = new Aluno(100, notas);
        identifier.adicionarEstudantes(aluno);
        identifier.imprimirEstudantesDecrescente();
        assertEquals("100\n", outContent.toString( ));
    }

    @Test
    public void casoTeste9() {
        float notas[] = new float[3];
        notas[0] = 5;
        notas[1] = 5;
        notas[2] = 5;

        Aluno aluno = new Aluno(100, notas);
        identifier.adicionarEstudantes(aluno);
        identifier.imprimirEstudantesMedias( );
        assertEquals("5.0\n", outContent.toString( ));
    }

    @Test
    public void casoTeste10() {
        float notas[] = new float[3];
        notas[0] = 5;
        notas[1] = 5;
        notas[2] = 5;

        Aluno aluno = new Aluno(100, notas);
        identifier.adicionarEstudantes(aluno);
        identifier.imprimirAprovados( );
        assertEquals("100 5.0\n", outContent.toString( ));
    }

    @Test
    public void casoTeste11() {
        float notas[] = new float[3];
        notas[0] = 4;
        notas[1] = 4;
        notas[2] = 4;

        Aluno aluno = new Aluno(100, notas);
        identifier.adicionarEstudantes(aluno);
        identifier.imprimirReprovados( );
        assertEquals("100 4.0\n", outContent.toString( ));
    }

    @Test
    public void casoTeste12() {
        float notas[] = new float[3];
        notas[0] = 6;
        notas[1] = 6;
        notas[2] = 6;

        Aluno aluno = new Aluno(100, notas);
        identifier.adicionarEstudantes(aluno);
        tamanho = identifier.aprovados();
        assertEquals(1, tamanho);
    }

    @Test
    public void casoTeste13() {
        float notas[] = new float[3];
        notas[0] = 3;
        notas[1] = 3;
        notas[2] = 2;

        Aluno aluno = new Aluno(100, notas);
        identifier.adicionarEstudantes(aluno);
        tamanho = identifier.aprovados();
        assertEquals(0, tamanho);
    }

    @Test
    public void casoTeste14() {
        float notas[] = new float[3];
        notas[0] = 4;
        notas[1] = 4;
        notas[2] = 4;

        Aluno aluno = new Aluno(100, notas);
        identifier.adicionarEstudantes(aluno);
        tamanho = identifier.reprovados();
        assertEquals(1, tamanho);
    }

    @Test
    public void casoTeste15() {
        float notas[] = new float[3];
        notas[0] = 10;
        notas[1] = 9;
        notas[2] = 8;

        Aluno aluno = new Aluno(100, notas);
        identifier.adicionarEstudantes(aluno);
        tamanho = identifier.reprovados();
        assertEquals(0, tamanho);
    }


    

}
  
