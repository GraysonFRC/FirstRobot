/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;
import java.util.function.DoubleSupplier;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveSubsystem;

public class TeleOpDrive extends CommandBase {
  private final DriveSubsystem drive;
  private final DoubleSupplier xSpeed;
  private final DoubleSupplier zRotation;
  
  
  
  /**
   * Creates a new TeleOpDrive.
   */
  public TeleOpDrive(DriveSubsystem drive, DoubleSupplier xSpeed, DoubleSupplier zRotation) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.drive = drive;
    this.xSpeed = xSpeed;
    this.zRotation = zRotation;
    addRequirements(drive);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    drive.drive(xSpeed.getAsDouble(), zRotation.getAsDouble());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    drive.drive(0, 0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
