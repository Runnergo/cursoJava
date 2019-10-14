
public class MenuComidas {
 private String primerPlato;
 private String segundoPlato;
 private String postre;
 
public MenuComidas(String primerPlato, String segundoPlato, String postre) {

	this.primerPlato = primerPlato;
	this.segundoPlato = segundoPlato;
	this.postre = postre;
}

public String getPrimerPlato() {
	return primerPlato;
}

public void setPrimerPlato(String primerPlato) {
	this.primerPlato = primerPlato;
}

public String getSegundoPlato() {
	return segundoPlato;
}

public void setSegundoPlato(String segundoPlato) {
	this.segundoPlato = segundoPlato;
}

public String getPostre() {
	return postre;
}

public void setPostre(String postre) {
	this.postre = postre;
} 
 
public String toString() {
	return "El Menu consta de :\nPrimer Plato: "+primerPlato+ "\nSegundo Plato: "+segundoPlato+"\nPostre: "+postre;
}
}
