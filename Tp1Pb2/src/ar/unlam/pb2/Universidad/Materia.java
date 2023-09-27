package ar.unlam.pb2.Universidad;

public class Materia {
	private String nombreMateria;
	private Integer codigoMateria;
	private String descripcionMateria;
	
	
	
	public Materia(String nombreMateria, Integer codigoMateria, String descripcionMateria) {
		super();
		this.nombreMateria = nombreMateria;
		this.codigoMateria = codigoMateria;
		this.descripcionMateria = descripcionMateria;
	}
	
	public String getNombreMateria() {
		return nombreMateria;
	}
	public void setNombreMateria(String nombreMateria) {
		this.nombreMateria = nombreMateria;
	}
	public Integer getCodigoMateria() {
		return codigoMateria;
	}
	public void setCodigoMateria(Integer codigoMateria) {
		this.codigoMateria = codigoMateria;
	}
	public String getDescripcionMateria() {
		return descripcionMateria;
	}
	public void setDescripcionMateria(String descripcionMateria) {
		this.descripcionMateria = descripcionMateria;
	}
	
	
}
