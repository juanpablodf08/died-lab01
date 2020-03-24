package died.lab01.problema01;

public class Punto {
	//atributos
	float x;
	float y;


	public Punto(float x1 , float y1)//constructor. asignamos valores
	    {x=x1;
	     y=y1;
	    }


	public float getX() {
		return x;
	}


	public void setX(float x) {
		this.x = x;
	}


	public float getY() {
		return y;
	}


	public void setY(float y) {
		this.y = y;
	}


	public boolean equals(Object otroPunto) {
        
        
        if ((otroPunto == null) || (getClass() != otroPunto.getClass())) 
        	return false;
        
        else {if (getClass() == otroPunto.getClass()) {
	        	final Punto other = (Punto)otroPunto;
	        	
	        	if ((x != other.x) || (y != other.y)) return false;
	        	else return true;
        		}
        
        	return false;
        	}
	}
	
	
}





