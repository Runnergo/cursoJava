
public class FlightPlan {
   
    private String departure;
    private String arrival;
    
    // Constructor con codigo aeropuerto de salida y de llegada
    public FlightPlan(String departure, String arrival){
        this.departure=departure;
        this.arrival=arrival;
    }
    @Override
    public String toString(){
        return "("+this.departure+"-"+this.arrival+")";
    }
}
