package ar.unlam.pb2.Universidad;

import java.util.ArrayList;
import java.util.List;

public class Universidad {
	private List<Materia> materias = new ArrayList<>();
	private List<Alumno> alumnos = new ArrayList<>();
	private List<CicloLectivo> ciclosLectivos = new ArrayList<>();
	private List<Comision> comisiones = new ArrayList<>();
	private List<Aula> aulas = new ArrayList<>();
	
	
	public Universidad() {
		super();
	}


	public Universidad(List<Materia> materias, List<Alumno> alumnos, List<CicloLectivo> ciclosLectivos,
			List<Comision> comisiones, List<Aula> aulas) {
		super();
		this.materias = materias;
		this.alumnos = alumnos;
		this.ciclosLectivos = ciclosLectivos;
		this.comisiones = comisiones;
		this.aulas = aulas;
	}

	
	
	public List<Materia> getMaterias() {
		return materias;
	}


	public void setMaterias(List<Materia> materias) {
		this.materias = materias;
	}


	public List<Alumno> getAlumnos() {
		return alumnos;
	}


	public void setAlumnos(List<Alumno> alumnos) {
		this.alumnos = alumnos;
	}


	public List<CicloLectivo> getCiclosLectivos() {
		return ciclosLectivos;
	}


	public void setCiclosLectivos(List<CicloLectivo> ciclosLectivos) {
		this.ciclosLectivos = ciclosLectivos;
	}


	public List<Comision> getComisiones() {
		return comisiones;
	}


	public void setComisiones(List<Comision> comisiones) {
		this.comisiones = comisiones;
	}


	public List<Aula> getAulas() {
		return aulas;
	}


	public void setAulas(List<Aula> aulas) {
		this.aulas = aulas;
	}


	public void agregarMaterias(Materia nuevaMateria) {
		
		if(!existeMateriaConCodigo(nuevaMateria)) {
			materias.add(nuevaMateria);
		}
	}
	
	public boolean existeMateriaConCodigo(Materia unaMateria) {
		for(Materia m : materias) {
			if(m.getCodigoMateria().equals(unaMateria.getCodigoMateria())) {
				return true;
			}
			}
		return false;
	}
	
	public void agregarAlumnos(Alumno nAlumno) {
		if(!existeAlumnoConDni(nAlumno)) {
			alumnos.add(nAlumno);
		}
	}
	public boolean existeAlumnoConDni(Alumno unAlumno){
		for(Alumno a : alumnos) {
			
			if(a.getIdAlumno() == unAlumno.getIdAlumno()) {
				
				return true;
			}
			}
		return false;
	}
	public void crearCicloLectivo(CicloLectivo nuevoCiclo) {
		if(!existeCicloLectivoId(nuevoCiclo)) {
			ciclosLectivos.add(nuevoCiclo);
		}
	}
	public boolean existeCicloLectivoId(CicloLectivo unCiclo){
		for(CicloLectivo c : ciclosLectivos) {
			
			if(c.getCicloId().equals(unCiclo.getCicloId())) {
				return true;
			}
			}
		return false;
}
	public void agregarComision(Comision nuevaComision) {
		for(Comision com: comisiones) {
			
		}
	}
	
}