/*
    metodos
*/
import java.io.*;
import javax.swing.JOptionPane;
public class Métodos{
    public void FMenuIndicadores(Votação[] votação, int quantidade){
        Indicadores i = new Indicadores();
        int opc = 0;
        while (opc!=9){
            opc = Integer.parseInt(JOptionPane.showInputDialog("Mostrar Indicadores\nEstatísticas de Votação em 2021\n1 - Quantidade de Eleitores por Seção\n2 - Seção com Maior e Menor números de eleitores\n3 - Quantidade de votos por candidato\n4 - 10 primeiros colocados (número do candidato e quantidade de votos)\n9 - Finaliza Consulta"));
            switch (opc){
                case 1:i.PQuantidadeEleitoresPorSeção(votação, quantidade);break;
                case 2:i.MaiorEMenor(votação, quantidade);break;
                case 3:i.VotosPorCandidato(votação, quantidade);break;
                //case 4:i.CandidatosMaisVotados(votação, quantidade);break; n consegui fazer funcionar :(
                case 9:JOptionPane.showMessageDialog(null, "Fim da consulta dos indicadores.");break;
                default:JOptionPane.showMessageDialog(null, "Opção Inválida. Digite novamente."); break;
            }
        }
    }
    
    public Votação[] FCadastraVotação(Votação[] votação, int quantidade){
        int i, candidato, secao;
        for (i=0; i<quantidade; i++){
            votação[i] = new Votação();
        }
        for (i=0; i<quantidade; i++){
            secao = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da seção: "));
            while (secao<0 || secao>300){
                secao = Integer.parseInt(JOptionPane.showInputDialog("Digite novamente o número da seção: "));
            }
            candidato = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do candidato: "));
            while (candidato<0 || candidato>10){
                candidato = Integer.parseInt(JOptionPane.showInputDialog("Digite novamente o número do candidato: "));
            }
            votação[i].numSeção = secao;
            votação[i].numCandidato = candidato;
        }
        return votação;
    }
    
    public String FGravaVotação(Votação[] votação, int quantidade) throws IOException{
        int i; String filename = "Votação2021.txt";
        BufferedWriter gravar = new BufferedWriter(new FileWriter(filename));
        for (i=0; i<quantidade; i++){
            gravar.write(Integer.toString(votação[i].numCandidato));
            gravar.newLine();
            gravar.write(Integer.toString(votação[i].numSeção));
            gravar.newLine();
        }
        gravar.close();
        return "Gravação concluída. Arquivo gerado.";
    }
    
    
    public Votação[] FClassificaSeção (Votação[] votação, int quantidade) throws IOException {
        Votação[] temp = new Votação[1];
        int i, j;
        for (i=0; i<quantidade-1; i++){
            for (j=i+1; j<quantidade; j++){
                if (votação[i].numSeção>votação[j].numSeção){
                    temp[0] = votação[j];
                    votação[j] = votação[i];
                    votação[i] = temp[0];
                }
            }
        }
        JOptionPane.showMessageDialog(null, "Entradas classificadas pelo número da seção.");
        return votação;
    }

}