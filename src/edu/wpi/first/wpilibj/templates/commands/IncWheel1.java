
package edu.wpi.first.wpilibj.templates.commands;
import edu.wpi.first.wpilibj.templates.subsystems.*;

public class IncWheel1 extends CommandBase {
    
    public IncWheel1() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        //ShooterWheel1 wheel1;
        //wheel1 = new ShooterWheel1();
        requires(wheel1);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        if (wheel1.getSpeed() >= 1.0){
            wheel1.setSpeed(wheel1.getSpeed() + 0.05);
        }
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
