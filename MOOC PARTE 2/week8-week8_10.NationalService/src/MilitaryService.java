
public class MilitaryService implements NationalService{
    private int daysLeft;
    
    public MilitaryService(int dayLeft){
      this.daysLeft=dayLeft;  
    }
    
    @Override
    public int getDaysLeft(){
        return this.daysLeft;
    }
    
    @Override
    public void work() {
        if (this.daysLeft>0)
        this.daysLeft--;
    }
}
