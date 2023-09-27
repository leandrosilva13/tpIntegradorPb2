package ar.unlam.pb2.test;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

import ar.unlam.pb2.Universidad.Alumno;
import ar.unlam.pb2.Universidad.Aula;
import ar.unlam.pb2.Universidad.CicloLectivo;
import ar.unlam.pb2.Universidad.Comision;
import ar.unlam.pb2.Universidad.Materia;
import ar.unlam.pb2.Universidad.Universidad;

public class UniversidadTest {
	
	@Test
	public void queSePuedaCrearUnaMateria() {
		Materia materia;
		final Integer codEsperado = 0001;
		
		final Integer codigoMateria = 0001;
		final String descripcionMateria = "Programacion Basica";
		final String nombreMateria = "Programacion Basica";
		
		materia = new Materia(nombreMateria,codigoMateria, descripcionMateria);
		
		assertEquals(codEsperado, materia.getCodigoMateria());
	}
	
	@Test
	public void queSePuedaCrearUnAlumno() {
		Alumno alumno;
		final String idEsperado = "40137523";
		
		final String idAlumno = "40137523";
		final String nombreAlumno = "Leandro";
		final String apellidoAlumno = "Silva";
		final LocalDate fechaDeNacimiento = LocalDate.of(1996, 11, 13);
		final LocalDate fechaDeIngreso = LocalDate.of(2021, 3, 1);
		
		alumno = new Alumno(idAlumno, nombreAlumno, apellidoAlumno, fechaDeNacimiento, fechaDeIngreso);
		
		assertEquals(idEsperado, alumno.getIdAlumno());
	}
	
	@Test
	public void queSePuedaCrearUnCicloLectivo() {
		CicloLectivo ciclo1;
		final Integer cicloId = 001;
		final LocalDate fechaInicioCicloLectivo = LocalDate.of(2023, 3, 1);
		final LocalDate fechaFinalizacionCicloLectivo = LocalDate.of(2023, 12, 1);
		final LocalDate fechaInicioInscripcion = LocalDate.of(2022, 6, 1);
		final LocalDate fechaFinalizacionInscripcion = LocalDate.of(2022, 8, 1);
		
		ciclo1 = new CicloLectivo(cicloId,fechaInicioCicloLectivo,fechaFinalizacionCicloLectivo,fechaInicioInscripcion,fechaFinalizacionInscripcion);
		
		Universidad unlam = new Universidad();
		unlam.crearCicloLectivo(ciclo1);
		
		assertEquals(true, unlam.getCiclosLectivos().contains(ciclo1));
	}	
	
	@Test
	public void queSePuedaCrearUnaComision() {
		Comision comisionEj;
		final Integer idEsperado = 001;
		
		final Integer comisionId = 001;
		final Materia materia = new Materia("Programacion Basica" ,0001, "Programacion Basica");
		final CicloLectivo ciclo = new CicloLectivo(001, LocalDate.of(2023, 3, 1),LocalDate.of(2023, 12, 1),LocalDate.of(2022, 6, 1),LocalDate.of(2022, 8, 1));
		final String turno = "M";
		
		comisionEj = new Comision(comisionId,materia,ciclo,turno);
		
		assertEquals(idEsperado, comisionEj.getComisionId());
	}
	
	@Test
	public void queSePuedaCrearUnAula() {
		Aula aula365;
		final Integer idEsperado = 365;
		
		final Integer aulaId = 365;
		final Integer cantidadAlumnos = 80;
		
		aula365 = new Aula(aulaId,cantidadAlumnos);
		
		assertEquals(idEsperado, aula365.getAulaId());
	}
	
	@Test
	public void queSePuedaAgregarUnaMateria() {
	
		final Materia materia = new Materia("Programacion Basica" ,0001, "Programacion Basica");
		
		Universidad unlam = new Universidad();
		
		unlam.agregarMaterias(materia);
		
		assertEquals(true, unlam.existeMateriaConCodigo(materia));
	}
	@Test
	public void queNoSePuedaAgregarUnaMateriaConElMismoCodigo() {
		final Materia materia = new Materia("Programacion Basica" ,0001, "Programacion Basica");
		final Materia materiaRepetida = new Materia("Programacion Basica 2" ,0001, "Programacion Basica 2");
		Universidad unlam = new Universidad();
		
		unlam.agregarMaterias(materia);
		unlam.agregarMaterias(materiaRepetida);
		
		assertEquals(false, unlam.getMaterias().contains(materiaRepetida));
	}
	
	@Test
	public void queSePuedaAgregarUnAlumno() {
		
		final Universidad unlam = new Universidad();
		
		final Alumno alumno = new Alumno("40137523", "Leandro", "Silva", LocalDate.of(1996, 11, 13), LocalDate.of(2021, 3, 1));
		
		unlam.agregarAlumnos(alumno);
		
		assertEquals(true, unlam.getAlumnos().contains(alumno));
		
	}
	
	
	@Test
	public void queNoSePuedanAgregarAlumnosConElMismoDni() {
		
		Universidad unlam = new Universidad();
		
		
		final Alumno alumno = new Alumno("40137523", "Leandro", "Silva", LocalDate.of(1996, 11, 13), LocalDate.of(2021, 3, 1));
		final Alumno alumno2 = new Alumno("40137523", "Osvaldo", "Hernandez", LocalDate.of(1990, 11, 3), LocalDate.of(2020, 3, 1));

		unlam.agregarAlumnos(alumno);
		unlam.agregarAlumnos(alumno2);
		
		
		assertEquals(false, unlam.getAlumnos().contains(alumno2));
		
	}
	@Test
	public void queNoSePuedaCrearUnNuevoCicloLectivoConElMismoId() {
		
		final Universidad unlam = new Universidad();
		
		final CicloLectivo primerCiclo = new CicloLectivo(001,LocalDate.of(2023, 3, 1), LocalDate.of(2023, 12, 1), LocalDate.of(2022, 6, 1), LocalDate.of(2022, 8, 1));
		final CicloLectivo segundoCiclo = new CicloLectivo(001,LocalDate.of(2024, 3, 1), LocalDate.of(2024, 12, 1), LocalDate.of(2023, 6, 1), LocalDate.of(2023, 8, 1));
		
		unlam.crearCicloLectivo(primerCiclo);
		unlam.crearCicloLectivo(segundoCiclo);
		assertEquals(false, unlam.getCiclosLectivos().contains(segundoCiclo));
	}
	
	
}
