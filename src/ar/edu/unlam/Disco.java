package ar.edu.unlam;

public class Disco {
	
	private Double radioInterno;
	private Double radioExterno;
	private Double perimetroInterno;
	private Double perimetroExterno;
	private Double superficie;
	
	public Disco (Double radioInterno, Double radioExterno){
		this.radioInterno=radioInterno;
		this.radioExterno=radioExterno;	
		this.perimetroInterno=0.0;
		this.perimetroExterno=0.0;
		this.superficie=0.0;
	}
	
public Double calcularPerimetroInterno () {

	perimetroInterno= (2*Math.PI)*(this.radioInterno);

	return perimetroInterno;
}

public Double calcularPerimetroExterno () {

	perimetroExterno =(2*Math.PI)*(this.radioExterno);
	return perimetroExterno; 
}

public Double calcularSuperficie (){
	superficie= (Math.PI)*(Math.pow(radioExterno,2))-(Math.PI)*(Math.pow(radioInterno,2));
	
	return superficie; 
}

}
