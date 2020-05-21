public class Aluno implements Comparable <Aluno>{
 
    /*classe que guarda as informações de um determinado aluno como seu 
    /numero USP, suas notas e sua media final. Além disso, ela é capaz 
    /de indentificar se o numero usp e as notas são validos*/ 


    private int n_usp;
    private float notas[];
    private float media_final;
    private int flag; //indica qual tipo de comparação será feita para a ordenação 
                      //0->media 1-> n_usp

    public Aluno(int n_usp, float notas[])  {

        //Verifica se o tamanho do numero usp esta adequado
        if(Integer.toString(n_usp).length() != 7){
            throw new IllegalArgumentException("Erro: Tamanho do nº USP incorreto");
        }
        else if(!verificarNotas(notas)){
            throw new IllegalArgumentException("Erro: Notas inválidas");
        }else{

            setNusp(n_usp);
		    setNotas(notas);
            setMedia(calcularMedia(notas));
            setFlag(0);

        }
    }
    //seta o numero usp do aluno
    private void setNusp(int n_usp){    
        this.n_usp = n_usp;    
    }
    //seta as notas do aluno
    private void setNotas(float notas[] ){
        this.notas = notas;
    }
    //seta a media do aluno
    private void setMedia(float media){
        this.media_final = media;
    }
    //seta o flag a respeto que qual ordenacao será feita por n_usp ou media
    public void setFlag(int flag){
        this.flag = flag;
    }

    //Integer devido ao compareTo e retorna o n_usp 
    public Integer getNusp(){
        return this.n_usp;
    }
    //retorna as notas
    public float[] getNotas(){
        return this.notas;
    }

    //Float devido ao compareTo e retorna a media
    public Float getMediaFinal(){
        return this.media_final;
    }

    public int getFlag(){
        return this.flag;
    }

    //calcula a media das notas
    private float calcularMedia(float notas[]){
        return (notas[0]+notas[1]+notas[2])/3;
    }

    //verifica se as notas são validas [0,10]
    private boolean verificarNotas(float notas[]){
        if(notas[0]<0 || notas[1]<0 || notas[2]<0)
            return false;
        else if(notas[0]>10 || notas[1]>10 || notas[2]>10){
            return false;
        } 
        return true;
    }

    @Override
    public int compareTo(Aluno aluno){
        if(flag == 0){
            return this.getMediaFinal().compareTo(aluno.getMediaFinal());
        }
        else if(flag == 1){
            return this.getNusp().compareTo(aluno.getNusp());
        }
        return 0;
    }

}
