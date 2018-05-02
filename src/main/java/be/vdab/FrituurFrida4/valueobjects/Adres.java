package be.vdab.FrituurFrida4.valueobjects;

public class Adres {
private String straat;
private String huisNr;
private Gemeente gemeente;
public String getStraat() {
	return straat;
}
public void setStraat(String straat) {
	this.straat = straat;
}
public String getHuisNr() {
	return huisNr;
}
public void setHuisNr(String huisNr) {
	this.huisNr = huisNr;
}
public Gemeente getGemeente() {
	return gemeente;
}
public void setGemeente(Gemeente gemeente) {
	this.gemeente = gemeente;
}
public Adres(String straat, String huisNr, Gemeente gemeente) {
	super();
	this.straat = straat;
	this.huisNr = huisNr;
	this.gemeente = gemeente;
}
public Adres() {
	super();
}


}
