package exercise;

public class Motorrad_ChBradl {
	String marke;	//Honda RC213V (HRC)
	int version;		//2024"er-Version"
	double leistung_ps;	//290" PS"
	double leistung_kw;	//214" KW"		

public String getMarke() {
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

public double getLeistung_ps() {
    return leistung_ps;
    }

public void setLeistung_ps(double leistung_ps) {
    this.leistung_ps = leistung_ps;
    }    

public double getLeistung_kw() {
    return leistung_kw;
    }

public void setLeistung_kw(double leistung_kw) {
    this.leistung_kw = leistung_kw;
    }  

public Motorrad_ChBradl(String marke, int version, double leistung_ps, double leistung_kw) {
    this.marke = marke;
    this.version = version;
    this.leistung_ps = leistung_ps;
    this.leistung_kw = leistung_kw;
	}

public double PS_in_KW(double umrechnene_PS_KW) {
	double PS_in_KW_umrechnene = this.leistung_ps * 1,355141;
	return PS_in_KW_umrechnene;	
}

public double KW_in_PS(double umrechnene_KW_PS) {
	double KW_in_PS_umrechnene = this.leistung_kw * 1,355141;
	return KW_in_PS_umrechnene;	
}


public void  showBikeInformation () {
    System.out.println("Hersteller: " + marke);
    System.out.println("Version: " + version);
    System.out.println("Leistung in PS/KW: " + leistung_ps +" PS / "+ leistung_kw + " kW");
    }

}
