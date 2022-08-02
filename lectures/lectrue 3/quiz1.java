
/*
design a class called stopwatch. the job of this class is to simulate a stopwatch. it should provide two methods: start and stop.
we call the start method first, and the stop method next. then we ask the stopwatch about the duration between start and stop.
duration should be a value in timespan. display the duration on the console. we should also be able to use a stopwatch multiple times.
so we may start and stop it and then start and stop it again. make sure the duration value each time is calculated properly.
we should not be able to start a stopwatch twice in a row (because that may overwrite the initial start time).
so the class should throw an error if its started twice
*/

import java.util.Calendar;

public class StopWatch {
    
    private Calendar startTime; // to store an instance from calender
    private Calendar endTime; // to store an instance from calender
    private boolean started; // to know the state of the stopwatch
    private String duration; // to store the duration between start time and end time.
    

    public StopWatch() { }
    
    /**
     * ResetTime method is used to reset the time with the current time
     * if the the stopwatch does not start <String>(started variable == false)</Strong>.
     * <br>
     * If you try to start it <Strong>and the started variable is true</Strong>, then the method will throw IllegalAccessError
     * @throws IllegalAccessError 
     * @return void
     * @since 2-8-2022
     */
    private void ResetTime() throws IllegalAccessError{
        if(!this.started) this.startTime = Calendar.getInstance();
        else throw new  IllegalAccessError("Already reset");
    }
    
    
    public void start(){
           this.ResetTime();
    }
    

    public void end(){
        // you can call the end method if only the stopwatch is already starting
         if(!this.started){
                      this.endTime = Calendar.getInstance();
                      this.Calculate();
         }
    }
    
    private void Calculate(){
           Long differMilliSeconds = this.endTime.getTimeInMillis() - this.startTime.getTimeInMillis();
           Long differSeconds = differMilliSeconds / (1000);
           Long differMin = differSeconds / 60;
           Long differHours = differMin / 60;
           this.duration = differHours.toString() + " : " + differMin.toString() + " : " + differSeconds.toString();
    }

    /**
     * @return the duration between start time and end time.
     */
    public String getDuration() {
        return duration;
    }
    
    

    public static void main(String[] args) {
           StopWatch sw = new StopWatch();
           
           try{
           sw.start();
           sw.start();
           Thread.sleep(5000);
           }catch(IllegalAccessError | InterruptedException error){
               System.out.println(error.getMessage());
           }
           sw.end();
           System.out.println("Duration : " + sw.getDuration());
           }
    }


