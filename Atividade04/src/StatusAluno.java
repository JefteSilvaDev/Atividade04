import javax.swing.JOptionPane;

public class StatusAluno extends JOptionPane {


	public static void main(String[] args) {


		String nome;
		float nota;

		nome = JOptionPane.showInputDialog("Digite o nome do aluno");
		nota = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota final: "));
		
		if(nota > 7){
			JOptionPane.showMessageDialog(null, "O aluno,"+ "\n" +nome+",Está Aprovado! Com a nota:"+nota);
		}
		 
		else if
		(nota > 4 && nota < 7){
			JOptionPane.showMessageDialog(null,"O aluno,"+ "\n" +nome+",Está em Recuperação! Com a nota:"+nota);
		}
		 
		else if
		(nota < 4){
			JOptionPane.showMessageDialog(null,"O aluno,"+ "\n" +nome+ ",Está Reprovado! Com a nota:"+nota);
		  }
		 }
		}