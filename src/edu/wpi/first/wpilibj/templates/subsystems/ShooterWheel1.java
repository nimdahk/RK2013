/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.commands.*;

/**
 *
 * @author Chris_2
 */
public class ShooterWheel1 extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    Jaguar wheel1;
    
    public void ShooterWheel1(){
        wheel1 = new Jaguar(1);
    }
    
    public void setSpeed(double speed){
        wheel1.set(speed);
    }
    
    public double getSpeed(){
        return wheel1.get();
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
