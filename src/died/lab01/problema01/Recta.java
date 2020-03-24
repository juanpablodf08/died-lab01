package died.lab01.problema01;

public class Recta {
	Punto punto1;
	Punto punto2;
	
	public Recta(Punto p1 , Punto p2){	//constructor
	 	punto1 = p1;
     	punto2 = p2;
    }
	
	public Recta(){				//constructor identidad
			
	punto2.setX(punto1.getX()+1);
	punto2.setY(punto1.getY()+1);
	
	}
	
	public float pendiente(){
		float xaux;
		float yaux;
		xaux = punto2.getX() - punto1.getX();
		yaux = punto2.getY() - punto1.getY();
		return (yaux/xaux);
		
	}
	
	public boolean paralelas(Recta otraRecta){
		//2 rectas son paralelas si tienen la misma pendiente
		float pendi1 = this.pendiente();
		float pendi2 = otraRecta.pendiente();
		if(pendi1==pendi2) return true;
		else return false;	
	}
	
	
	public boolean equals(Object otraRecta){
		
	  if ((otraRecta == null) || (getClass() != otraRecta.getClass())) 
      	return false;
	  else{
		  	Recta otherRec = (Recta) otraRecta; //creo una recta con la recta q llego como parametro
			 
			Punto ptoaux1 = this.getPunto1(); //la nueva recta tendra el pto1 de la recta llamada
		  	Punto ptoaux2 = otherRec.getPunto2();//la nueva recta tendra el pto2 de la recta q llega como parametro
		  	
		  	Recta aux = new Recta(ptoaux1,ptoaux2);
		    
		    if((aux.pendiente() == this.pendiente()) && (aux.pendiente() == otherRec.pendiente()))
		    	return true;
		    
		    else return false;
			
	  }
	
	}
	
	
	
	public Punto getPunto1() {
		return punto1;
	}

	public void setPunto1(Punto punto1) {
		this.punto1 = punto1;
	}

	public Punto getPunto2() {
		return punto2;
	}

	public void setPunto2(Punto punto2) {
		this.punto2 = punto2;
	}
	
	
	
	
}
