// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;

public class RobotContainer {

   ShooterSubsystem s_Shooter = ShooterSubsystem.getInstance();
  
  CommandXboxController pjyController = new CommandXboxController(0);
  
  private static RobotContainer container;  
  
  private void configureBindings() {
     pjyController.rightTrigger().whileTrue(s_Shooter.startShooter());
     pjyController.rightTrigger().onFalse(s_Shooter.stopShooter());
  }
   
   public RobotContainer() {
    configureBindings();
  }
   
  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
