/*
    indicadores
*/
import javax.swing.JOptionPane;
public class Indicadores {
    public void PQuantidadeEleitoresPorSeção(Votação[] votação, int quantidade){
        int i, tamanhoVetor = 10;
        int[] seção = new int[tamanhoVetor];
        for (i=0; i<quantidade; i++){
            seção[(votação[i].numSeção)-1] += 1;
        }
        for (i=0; i<tamanhoVetor; i++){
            JOptionPane.showMessageDialog(null, "A quantidade de eleitores na seção " +(i+1) +" foi: " +seção[i]);
        }
    }
    
    public void MaiorEMenor(Votação[] votação, int quantidade){
        int i, tamanhoVetor = 10, menor, maior; int[] seção = new int[tamanhoVetor];
        for (i=0; i<quantidade; i++){
            seção[(votação[i].numSeção)-1] += 1;
        }
        menor = seção[0];
        maior = seção[0];
        for (i=1; i<tamanhoVetor-1; i++){
            if (menor>seção[i]){
                menor =  seção[i];
            }
            if (maior<seção[i]){
                maior = seção[i];
            }
        }
        JOptionPane.showMessageDialog(null, "A seção com o menor número de eleitores foi a seção: " +menor);
        JOptionPane.showMessageDialog(null, "A seção com o maior número de eleitores foi a seção: " +maior);
    }
    
    public void VotosPorCandidato(Votação[] votação, int quantidade){
        int i, tamanhoVetor = 300;
        int[] votosCandidato = new int[tamanhoVetor];
        for (i=0; i<quantidade; i++){
            votosCandidato[(votação[i].numCandidato)-1] += 1;
        }
        for (i=0; i<tamanhoVetor; i++){
            JOptionPane.showMessageDialog(null, "A quantidade de votos no candidato " +(i+1) +" foi: " +votosCandidato[i]);
        }
    }
    
    // Não consegui fazer essa parte funcionar durante as aulas
    /*
    public void CandidatosMaisVotados(Votação[] votação, int quantidade){
        Votação[] temp = new Votação[1];
        int i, j, ctd;
        for (i=0; i<quantidade-1; i++){
            for (j=i+1; j<quantidade; j++){
                if (votação[i].numCandidato>votação[j].numCandidato){
                    temp[0] = votação[j];
                    votação[j] = votação[i];
                    votação[i] = temp[0];
                }
            }
        }
        ctd = 0;
        for (i=1; i<quantidade; i++){
            while(ctd<=10){
                if (ctd==0){
                    JOptionPane.showMessageDialog(null, "O candidato " +votação[i].numCandidato +" teve " +votação[i].);
                }
                else if (votação[i].numCandidato != votação[i-1].numCandidato){
                    
                }
                ctd++;
            }
        }
    }
    */
}