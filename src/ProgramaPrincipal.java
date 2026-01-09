/*
    principal
*/
import javax.swing.JOptionPane;
import java.io.*;
public class ProgramaPrincipal {
    public static void main(String[] args) throws IOException{
        int opc = 0, quantidadeRegistros = 3;
        Métodos m = new Métodos();
        Votação[] votação = new Votação[quantidadeRegistros];
        while (opc!=9){
            opc = Integer.parseInt(JOptionPane.showInputDialog("Sistema de votação\n1 - Carregar Seção/Número Eleitor\n2 - Classificar por seção\n3 - Gravar registros\n4 - Mostrar Indicadores\n9 - Finalizar\n"));
            switch (opc){
                case 1: votação = m.FCadastraVotação(votação, quantidadeRegistros); break;
                case 2: m.FClassificaSeção(votação, quantidadeRegistros); break;
                case 3: JOptionPane.showMessageDialog(null, m.FGravaVotação(votação, quantidadeRegistros)); break;
                case 4: m.FMenuIndicadores(votação, quantidadeRegistros); break;
                case 9: JOptionPane.showMessageDialog(null, "Fim.");break;
                default: JOptionPane.showMessageDialog(null, "Opção Inválida."); break;
            }
        }
    }
}
