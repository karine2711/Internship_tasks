package customAnnotations;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class Car {
    private String brand;
    private int speed;
    private boolean isRiding;
    private boolean isStopped=true;
    private final int MAX_SPEED=250;

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isRiding() {
        return isRiding;
    }

    public boolean isStopped() {
        return isStopped;
    }

    @Timed
    public boolean startRide(){
        if(isRiding){
            System.out.println("The car is already riding");
            return false;
        } else {
            isRiding=true;
            isStopped=false;
            return true;
        }
    }


    public void accelerate(){
        if(this.isStopped){
            System.out.println("The carisnot currently riding!");
        }else if(speed>=MAX_SPEED-10){
            speed=MAX_SPEED;
        } else{
            speed+=10;
        }
    }

    public void deccelerate(){
        if(this.isStopped){
            System.out.println("The carisnot currently riding!");
        }else if(speed<=10){
            speed=0;
            this.isStopped=true;
            this.isRiding=false;
        } else{
            speed-=10;
        }
    }

    @Timed
    public boolean stop(){
        if(isStopped){
            System.out.println("The car is already stopped");
            return false;
        } else {
            isRiding=false;
            isStopped=true;
            return true;
        }
    }
}
