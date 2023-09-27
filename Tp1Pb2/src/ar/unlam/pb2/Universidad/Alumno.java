package ar.unlam.pb2.Universidad;

import java.time.LocalDate;

public class Alumno {
	private String idAlumno; //refiere al DNI
	private String nombreAlumno;
	private String apellidoAlumno;
	private LocalDate fechaDeNacimiento;
	private LocalDate fechaDeIngreso;
	
	
	
	public Alumno(String idAlumno, String nombreAlumno, String apellidoAlumno, LocalDate fechaDeNacimiento,
			LocalDate fechaDeIngreso) {
		super();
		this.idAlumno = idAlumno;
		this.nombreAlumno = nombreAlumno;
		this.apellidoAlumno = apellidoAlumno;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.fechaDeIngreso = fechaDeIngreso;
	}
	
	public String getIdAlumno() {
		return idAlumno;
	}
	public void setIdAlumno(String idAlumno) {
		this.idAlumno = idAlumno;
	}
	public String getNombreAlumno() {
		return nombreAlumno;
	}
	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}
	public String getApellidoAlumno() {
		return apellidoAlumno;
	}
	public void setApellidoAlumno(String apellidoAlumno) {
		this.apellidoAlumno = apellidoAlumno;
	}
	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	public LocalDate getFechaDeIngreso() {
		return fechaDeIngreso;
	}
	public void setFechaDeIngreso(LocalDate fechaDeIngreso) {
		this.fechaDeIngreso = fechaDeIngreso;
	}
	
	
}
