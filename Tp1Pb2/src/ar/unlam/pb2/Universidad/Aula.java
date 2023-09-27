package ar.unlam.pb2.Universidad;

public class Aula {
	private Integer aulaId;
	private Integer cantidadAlumnos;
	
	public Aula(Integer aulaId, Integer cantidadAlumnos) {
		super();
		this.aulaId = aulaId;
		this.cantidadAlumnos = cantidadAlumnos;
	}

	public Integer getAulaId() {
		return aulaId;
	}

	public void setAulaId(Integer aulaId) {
		this.aulaId = aulaId;
	}

	public Integer getCantidadAlumnos() {
		return cantidadAlumnos;
	}

	public void setCantidadAlumnos(Integer cantidadAlumnos) {
		this.cantidadAlumnos = cantidadAlumnos;
	}
	
	
}
