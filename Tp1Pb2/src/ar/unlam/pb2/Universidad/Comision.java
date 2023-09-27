package ar.unlam.pb2.Universidad;

public class Comision {
	private Integer comisionId;
	private Materia materia;
	private CicloLectivo ciclo;
	private String turno;
	
	public Comision(Integer comisionId, Materia materia, CicloLectivo ciclo, String turno) {
		super();
		this.comisionId = comisionId;
		this.materia = materia;
		this.ciclo = ciclo;
		this.turno = turno;
	}

	public Integer getComisionId() {
		return comisionId;
	}

	public void setComisionId(Integer comisionId) {
		this.comisionId = comisionId;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public CicloLectivo getCiclo() {
		return ciclo;
	}

	public void setCiclo(CicloLectivo ciclo) {
		this.ciclo = ciclo;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}
	
	
}
