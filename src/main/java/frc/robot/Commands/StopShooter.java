import frc.robot.Subsystems.ShooterSubsystem;
import frc.robot.Subsystems.ShooterSubsystem.MotorSpeeds;

public class StopShooter extends Command {

    ShooterSubsystem s_Shooter;
    MotorSpeeds state;

    public StopShooter(MotorSpeeds state){
        s_Shooter = ShooterSubsystem.getInstance();
        this.state = state;
        addRequirements(s_Shooter);
        
    }

    @Override
    public void initialize() {
        timer.restart();
        s_Shooter.setMotorSpeed(MotorSpeeds.HOLD);
    }

    @Override
    public void execute() {
    }

    @Override
    public boolean isFinished() {
        return (timer.hasElapsed(1));
    }

    @Override
    public void end() {
        
    }

}
