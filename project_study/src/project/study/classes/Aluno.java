package project.study.classes;

public class Aluno {
	
		/*Atributos*/
		private String nomeAluno;
		private int idadeAluno;
		private String dataNascimentoAluno;
		private String cpfAluno;
		private String nomeMaeAluno;
		private String dataMatriculaAluno;
		private String nomeEscola;
		private String serieMatriculadoAluno;
		
		public Aluno(){ /*Cria dados na memória - Construtor*/									
		}

		public String getNomeAluno() {
			return nomeAluno;
		}

		public void setNomeAluno(String nomeAluno) {
			this.nomeAluno = nomeAluno;
		}

		public int getIdadeAluno() {
			return idadeAluno;
		}

		public void setIdadeAluno(int idadeAluno) {
			this.idadeAluno = idadeAluno;
		}

		public String getDataNascimentoAluno() {
			return dataNascimentoAluno;
		}

		public void setDataNascimentoAluno(String dataNascimentoAluno) {
			this.dataNascimentoAluno = dataNascimentoAluno;
		}

		public String getCpfAluno() {
			return cpfAluno;
		}

		public void setCpfAluno(String cpfAluno) {
			this.cpfAluno = cpfAluno;
		}

		public String getNomeMaeAluno() {
			return nomeMaeAluno;
		}

		public void setNomeMaeAluno(String nomeMaeAluno) {
			this.nomeMaeAluno = nomeMaeAluno;
		}

		public String getDataMatriculaAluno() {
			return dataMatriculaAluno;
		}

		public void setDataMatriculaAluno(String dataMatriculaAluno) {
			this.dataMatriculaAluno = dataMatriculaAluno;
		}

		public String getNomeEscola() {
			return nomeEscola;
		}

		public void setNomeEscola(String nomeEscola) {
			this.nomeEscola = nomeEscola;
		}

		public String getSerieMatriculadoAluno() {
			return serieMatriculadoAluno;
		}

		public void setSerieMatriculadoAluno(String serieMatriculadoAluno) {
			this.serieMatriculadoAluno = serieMatriculadoAluno;
		}
}
