package Publicacao;

public class AcharPerdido{

	private String titulo;
	private String descricao;
	private String foto;
	private String local_achado;
	private String data_hora;
	private String status;
	public AcharPerdido(String titulo, String descricao, String foto, String local_achado, String data_hora,
			
			String status) {
	
		this.titulo = titulo;
		this.descricao = descricao;
		this.foto = foto;
		this.local_achado = local_achado;
		this.data_hora = data_hora;
		this.status = status;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getLocal_achado() {
		return local_achado;
	}
	public void setLocal_achado(String local_achado) {
		this.local_achado = local_achado;
	}
	public String getData_hora() {
		return data_hora;
	}
	public void setData_hora(String data_hora) {
		this.data_hora = data_hora;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
		
	public String buscarTitulo() {
		
		return "\n \nTitulo:" + this.titulo+ "\nFoto:"
				+this.foto+ "\nLocal_achado " +this.local_achado + "\nTipo " + this.titulo + "\nStatus " +this.status+ "\n \n";

	}	
	
	
}
	

