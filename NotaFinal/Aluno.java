

public class Aluno implements Comparable <Aluno>{

	private int n_usp;
    private float notas[];
    private float media_final;
    private int flag;


public Aluno(int n_usp, float notas[])  {
		setNusp(n_usp);
		setNotas(notas);
		setMedia(Media(notas));

}

private void setNusp(int n_usp){
	this.n_usp = n_usp;
}

private void setNotas(float notas[] ){
	this.notas = notas;

}

public Integer getNusp(){
	return this.n_usp;
}

public float[ ] getNotas(){
	return this.notas;

}

public Float getMedia(){
	return this.media_final;

}

public void setFlag(int flag){
    this.flag = flag;
}


private float Media(float notas[]){
	//considerando que o vetor venham sempre com 3 notas
	return (notas[0]+notas[1]+notas[2])/3;
}
private void setMedia(float media){

	this.media_final = media;
}


@Override
    public int compareTo(Aluno aluno){
        if(flag == 1){
            return this.getNusp().compareTo(aluno.getNusp());
        }
        else if(flag == 0){
            return this.getMedia().compareTo(aluno.getMedia());
        }
        return 0;
    }

}
