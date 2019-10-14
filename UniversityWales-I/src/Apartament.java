
public class Apartament {


    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartament(int rooms, int squareMeters, int pricePerSquareMeter) {
    	
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger(Apartament otherApartment) {
        if (this.squareMeters > otherApartment.squareMeters) {
            return true;
        }
        return false;

    }

    public int getRooms() {
		return rooms;
	}

	public void setRooms(int rooms) {
		this.rooms = rooms;
	}

	public int getSquareMeters() {
		return squareMeters;
	}

	public void setSquareMeters(int squareMeters) {
		this.squareMeters = squareMeters;
	}

	public int getPricePerSquareMeter() {
		return pricePerSquareMeter;
	}

	public void setPricePerSquareMeter(int pricePerSquareMeter) {
		this.pricePerSquareMeter = pricePerSquareMeter;
	}

	public int priceDifference(Apartament otherApartment) {

        int apartamentA = this.squareMeters * this.pricePerSquareMeter;
        int apartamentB = otherApartment.squareMeters * otherApartment.pricePerSquareMeter;
        return Math.abs(apartamentA - apartamentB);
    }

    public boolean moreExpensiveThan(Apartament otherApartment) {

        if (this.squareMeters * this.pricePerSquareMeter > otherApartment.squareMeters * otherApartment.pricePerSquareMeter) {
            return true;
        }
        return false;
    }
    
    public int precioTotal() {
    	return pricePerSquareMeter*squareMeters;
    }


    public String toString() {
    	   String cadena=String.format("%-5d| %-3d|%-7d|%-6d %-6s", this.rooms,this.squareMeters,this.pricePerSquareMeter,precioTotal(),"€");	
    	return cadena;
    }

}



