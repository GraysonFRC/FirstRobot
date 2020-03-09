/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.commands.Scooper;
import frc.robot.commands.Shooter;
import frc.robot.commands.TeleOpDrive;
import frc.robot.commands.shootscoop;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.ScooperSubsystem;
import frc.robot.subsystems.ShooterSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
/**
 * This class is where the bulk of the robot should be declared.  Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls).  Instead, the structure of the robot
 * (including subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  private final DriveSubsystem m_DriveSubsystem = new DriveSubsystem();
  private final ScooperSubsystem m_ScooperSubsystem = new ScooperSubsystem();
  private final ShooterSubsystem m_ShooterSubsystem = new ShooterSubsystem();
  private final PowerDistributionPanel pdp = new PowerDistributionPanel();
  

  /**
   * The container for the robot.  Contains subsystems, OI devices, and commands.
   */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();

    m_DriveSubsystem.setDefaultCommand(new TeleOpDrive(m_DriveSubsystem,
    () -> (-Constants.m_stick.getY()* 0.8), //remove 0.7 value
    () -> (Constants.m_stick.getZ()*0.6)));
  }
  /**
   * Use this method to define your button->command mappings.  Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a
   * {@link edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() { 
    final JoystickButton A = new JoystickButton(Constants.m_stick, 2);
    final JoystickButton B = new JoystickButton(Constants.m_stick, 3);
    final JoystickButton X = new JoystickButton(Constants.m_stick, 1);
    final JoystickButton R2 = new JoystickButton(Constants.m_stick, 8);
    final JoystickButton LB = new JoystickButton(Constants.m_stick, 5);

    A.whenHeld(new Shooter(m_ShooterSubsystem, 1.0));
    B.whenHeld(new Scooper(m_ScooperSubsystem, -1.0));
    X.whenHeld(new shootscoop(m_ShooterSubsystem, m_ScooperSubsystem, -1.0, 0.5));
    R2.whenHeld(new shootscoop(m_ShooterSubsystem, m_ScooperSubsystem, -1.0, 0.5));
    LB.whenHeld(new TeleOpDrive(m_DriveSubsystem, 
    () -> (0),
    () -> (0)
    
    
    ));
  }


  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
	return null;
}
}
