
/*
design a class called stopwatch. the job of this class is to simulate a stopwatch. it should provide two methods: start and stop.
we call the start method first, and the stop method next. then we ask the stopwatch about the duration between start and stop.
duration should be a value in timespan. display the duration on the console. we should also be able to use a stopwatch multiple times.
so we may start and stop it and then start and stop it again. make sure the duration value each time is calculated properly.
we should not be able to start a stopwatch twice in a row (because that may overwrite the initial start time).
so the class should throw an error if its started twice
*/

import java.util.Calendar;

public class OOPIntroduction {
    
    private Calendar startTime;
    private Calendar endTime;
    private String duration;

    public OOPIntroduction() {
    }
    
    
    private void ResetTime() throws IllegalAccessError{
        if(this.startTime == null) this.startTime = Calendar.getInstance();
        else throw new  IllegalAccessError("Already reset");
    }
    
    public void start(){
           this.ResetTime();
    }
    
    public void end(){
        this.endTime = Calendar.getInstance();
        if(this.startTime != null) this.Calculate();
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
           
           try{
           o.start();
           o.start();
           }catch(IllegalAccessError error){
               System.out.println(error.getMessage());
           }
           Thread.sleep(5000);
           o.end();
           
           System.out.println("Duration : " + o.getDuration());
           
           }
    }

