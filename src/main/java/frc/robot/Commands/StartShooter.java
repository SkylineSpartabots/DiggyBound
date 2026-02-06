import frc.robot.Subsystems.ShooterSubsystem;
import frc.robot.Subsystems.ShooterSubsystem.MotorSpeeds;

public class StartShooter extends Command {

    ShooterSubsystem shooter;
    MotorSpeeds state;

    public StartShooter(MotorSpeeds state){
        s_Shooter = ShooterSubsystem.getInstance();
        addRequirements(s_Shooter);
        this.state = state;
        
    }

    @Override
    public void initialize() {
        timer.restart();
        shooter.setMotorSpeed(MotorSpeeds.OUTTAKE);
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
