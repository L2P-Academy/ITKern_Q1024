package exercise;
public class Motorrad_ChBradl {
	String marke;	//Honda RC213V (HRC)
	int version;		//2024"er-Version"
	int leistung_ps;	//290" PS"
	int leistung_kw;	//214" KW"	
	
public Motorrad_ChBradl(String marke, int version, int leistung_ps, int leistung_kw) {
    this.marke = marke;
    this.version = version;
    this.leistung_ps = leistung_ps;
    this.leistung_kw = leistung_kw;
	}

public int getMarke() {
    return marke;
    }

public void setMarke(String marke) {
   	this.marke = marke;
    }    

public int getVersion() {
    return version;
    }

public void setVersion(int version) {
    this.version = version;
    }       

public int getLeistung_ps() {
    return leistung_ps;
    }

public void setLeistung_ps(int leistung_ps) {
    this.leistung_ps = leistung_ps;
    }    

public int getLeistung_kw() {
    return leistung_kw;
    }

public void setLeistung_kw(int leistung_kw) {
    this.leistung_kw = leistung_kw;
    }  

public void  Motorrad_ChBradl () {
    System.out.println("Hersteller: " + marke);
    System.out.println("Version: " + version);
    System.out.println("Leistung in PS/KW: " + leistung_ps +" PS / "+ leistung_kw + " kW");
    }

}
