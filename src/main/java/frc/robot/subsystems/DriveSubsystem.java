/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveSubsystem extends SubsystemBase {
  /**
   * Creates a new DriveSubsystem.
   */
  
  private static final SpeedController m_left = new PWMVictorSPX(Constants.m_left);
  private static final SpeedController m_right = new PWMVictorSPX(Constants.m_right);



  private final DifferentialDrive m_robotDrive;
  public DriveSubsystem() {
    m_robotDrive = new DifferentialDrive(m_left,m_right);
  }
  public void drive(double xSpeed, double zRotation){
    m_robotDrive.arcadeDrive(xSpeed,zRotation);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
