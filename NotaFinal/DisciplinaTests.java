import org.junit.Test;
import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class DisciplinaTests {

    //variáveis globais da classe de teste
    Disciplina disciplina;
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
        disciplina = new Disciplina("SSC0620");
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
        result = disciplina.setCodigo("SSC0620");
        assertEquals(valido, result);
    }

    @Test
    public void casoTeste2 (){
        result = disciplina.setCodigo("SSCC000");
        assertEquals(invalido, result);
    }

    @Test
    public void casoTeste3 (){
        result = disciplina.setCodigo("SSC620");
        assertEquals(invalido, result);
    }

    @Test
    public void casoTeste4 (){
        result = disciplina.setCodigo("SSS0620");
        assertEquals(invalido, result);
    }

    @Test
    public void casoTeste5 (){
        result = disciplina.setCodigo("SSC00620");
        assertEquals(invalido, result);
    }

    @Test
    public void casoTeste6 (){

        float notas[] = new float[3];
        notas[0] = 8;
        notas[1] = 5;
        notas[2] = 6;
        Aluno aluno = new Aluno(10276974, notas);

        result = disciplina.adicionarEstudantes(aluno);
        assertEquals(valido, result);
    }

    @Test
    public void casoTeste7 (){

        float notas[] = new float[3];
        notas[0] = 8;
        notas[1] = 5;
        notas[2] = 6;
        Aluno aluno = new Aluno(10276974, notas);


        disciplina.adicionarEstudantes(aluno);
        tamanho = disciplina.alunosMatriculados();
        assertEquals(1, tamanho);
    }

    @Test
    public void casoTeste8() {
        float notas[] = new float[3];
        notas[0] = 8;
        notas[1] = 5;
        notas[2] = 6;

        Aluno aluno = new Aluno(100, notas);
        disciplina.adicionarEstudantes(aluno);
        disciplina.imprimirEstudantesDecrescente();
        assertEquals("100\n", outContent.toString( ));
    }

    @Test
    public void casoTeste9() {
        float notas[] = new float[3];
        notas[0] = 5;
        notas[1] = 5;
        notas[2] = 5;

        Aluno aluno = new Aluno(100, notas);
        disciplina.adicionarEstudantes(aluno);
        disciplina.imprimirEstudantesMedias( );
        assertEquals("5.0\n", outContent.toString( ));
    }

    @Test
    public void casoTeste10() {
        float notas[] = new float[3];
        notas[0] = 5;
        notas[1] = 5;
        notas[2] = 5;

        Aluno aluno = new Aluno(100, notas);
        disciplina.adicionarEstudantes(aluno);
        disciplina.imprimirAprovados( );
        assertEquals("100 5.0\n", outContent.toString( ));
    }

    @Test
    public void casoTeste11() {
        float notas[] = new float[3];
        notas[0] = 4;
        notas[1] = 4;
        notas[2] = 4;

        Aluno aluno = new Aluno(100, notas);
        disciplina.adicionarEstudantes(aluno);
        disciplina.imprimirReprovados( );
        assertEquals("100 4.0\n", outContent.toString( ));
    }

    @Test
    public void casoTeste12() {
        float notas[] = new float[3];
        notas[0] = 6;
        notas[1] = 6;
        notas[2] = 6;

        Aluno aluno = new Aluno(100, notas);
        disciplina.adicionarEstudantes(aluno);
        tamanho = disciplina.aprovados();
        assertEquals(1, tamanho);
    }

    @Test
    public void casoTeste13() {
        float notas[] = new float[3];
        notas[0] = 3;
        notas[1] = 3;
        notas[2] = 2;

        Aluno aluno = new Aluno(100, notas);
        disciplina.adicionarEstudantes(aluno);
        tamanho = disciplina.aprovados();
        assertEquals(0, tamanho);
    }

    @Test
    public void casoTeste14() {
        float notas[] = new float[3];
        notas[0] = 4;
        notas[1] = 4;
        notas[2] = 4;

        Aluno aluno = new Aluno(100, notas);
        disciplina.adicionarEstudantes(aluno);
        tamanho = disciplina.reprovados();
        assertEquals(1, tamanho);
    }

    @Test
    public void casoTeste15() {
        float notas[] = new float[3];
        notas[0] = 10;
        notas[1] = 9;
        notas[2] = 8;

        Aluno aluno = new Aluno(100, notas);
        disciplina.adicionarEstudantes(aluno);
        tamanho = disciplina.reprovados();
        assertEquals(0, tamanho);
    }

    @Test
    public void casoTeste16() {
        disciplina.imprimirReprovados( );
        assertEquals("", outContent.toString( ));
    }

    @Test
    public void casoTeste17() {
        float notas[] = new float[3];
        notas[0] = 10;
        notas[1] = 10;
        notas[2] = 9;

        Aluno aluno = new Aluno(100, notas);
        disciplina.adicionarEstudantes(aluno);
        disciplina.imprimirReprovados( );
        assertEquals("", outContent.toString( ));
    }

    @Test
    public void casoTeste18() {
        disciplina.imprimirEstudantesDecrescente();
        assertEquals("", outContent.toString( ));
    }

    @Test
    public void casoTeste19() {
        disciplina.imprimirEstudantesMedias( );
        assertEquals("", outContent.toString( ));
    }

    @Test
    public void casoTeste20() {
        disciplina.imprimirAprovados( );
        assertEquals("", outContent.toString( ));
    }


    

}
  
