package Questao2;

public class DistibuicaoAlimento extends Projeto {

		private String descAlimento;
		private float qtde;
		public DistibuicaoAlimento(String descAlimento, float qtde) {
			super();
			this.descAlimento = descAlimento;
			this.qtde = qtde;
		}
		public String getDescAlimento() {
			return descAlimento;
		}
		public void setDescAlimento(String descAlimento) {
			this.descAlimento = descAlimento;
		}
		public float getQtde() {
			return qtde;
		}
		public void setQtde(float qtde) {
			this.qtde = qtde;
		}
		
		public boolean validaProjeto("nomeProjeto : " String) {
			if (this.qtde <= this.datafim)
				return true;
			else
				return false;				
		}
		
		public String imprimeProjeto() {
			
			return "\n \nNomeProjeto:" + this.nomProjeto+ "\nDescricao:"
					+this.descricao+ "\nDataInicio " +this.dataInicio + "\nDataFim " + this.dataFim + "\nDescAlimento " +this.descAlimento+ "\nQtde " +this.qtde +
					"\n \n";

		}	
}

