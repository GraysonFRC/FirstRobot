/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import frc.robot.subsystems.ServoSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;

/**
 * Command that should tilt the servo motor to modify the angle to shoot out at.
 */
public class servoUp extends CommandBase {
  private final ServoSubsystem servo;
  private final double aim;

  /**
   * Creates a new servoUp
   *
   * @param subsystem The subsystem used by this command.
   */
  public servoUp(ServoSubsystem servo, double aim) {
    this.servo = servo;
    this.aim = aim;

    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(servo);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    servo.aim(aim);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
