

import java.util.Calendar;


public class OOPIntroduction {
    
    private Calendar startTime;
    private Calendar endTime;
    private String duration;

    public OOPIntroduction() {
    }
    
    
    private void ResetTime(){
        if(this.startTime == null) this.startTime = Calendar.getInstance();
        else System.out.println("Already reset");
    }
    
    public void start(){
           this.ResetTime();
    }
    
    public void end(){
        this.endTime = Calendar.getInstance();
        this.Calculate();
    }
    
    private void Calculate(){
           Long differMilliSeconds = this.endTime.getTimeInMillis() - this.startTime.getTimeInMillis();
           Long differSeconds = differMilliSeconds / (1000);
           Long differMin = differSeconds / 60;
           Long differHours = differMin / 60;
           
           this.duration = differHours.toString() + " : " + differMin.toString() + " : " + differSeconds.toString();
    }

    public String getDuration() {
        return duration;
    }
    
    

    public static void main(String[] args) throws InterruptedException {
           OOPIntroduction o = new OOPIntroduction();
           o.start();
           o.start();
           Thread.sleep(5000);
           o.end();
           System.out.println(o.getDuration());
    }

}
