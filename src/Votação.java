/*
    construtor?
*/
public class Votação {
    int numSeção;
    int numCandidato;
    
    //construtor
    Votação(){
        this(0,0);
        }
    
    Votação(int secao, int candidato){
        numSeção = secao;
        numCandidato = candidato;
    }
}