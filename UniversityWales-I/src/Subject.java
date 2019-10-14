
public class Subject {
private int notaMates;
private int notaIngles;
private int notaProgramacion;
private int notaNaturales;


public Subject(int notaMates, int notaIngles, int notaProgramacion, int notaNaturales) {
	
	this.notaMates = notaMates;
	this.notaIngles = notaIngles;
	this.notaProgramacion = notaProgramacion;
	this.notaNaturales = notaNaturales;
	
}

public int getNotaMates() {
	return notaMates;
}

public void setNotaMates(int notaMates) {
	this.notaMates = notaMates;
}

public int getNotaIngles() {
	return notaIngles;
}

public void setNotaIngles(int notaIngles) {
	this.notaIngles = notaIngles;
}

public int getNotaProgramacion() {
	return notaProgramacion;
}

public void setNotaProgramacion(int notaProgramacion) {
	this.notaProgramacion = notaProgramacion;
}

public int getNotaNaturales() {
	return notaNaturales;
}

public void setNotaNaturales(int notaNaturales) {
	this.notaNaturales = notaNaturales;
}
public String toString() {
	
	return "Las notas son las siguientes:\nMatematicas: "+notaMates+"\nIngles: "+notaIngles+"\nProgramacion: "+notaProgramacion+"\nNaturales: "+notaNaturales;
}

public String toString(Student estudiante) {
	
	return "Las notas de "+ estudiante.getNombre()+" son las siguientes:\nMatematicas: "+notaMates+"\nIngles: "+notaIngles+"\nProgramacion: "+notaProgramacion+"\nNaturales: "+notaNaturales;
}
}
