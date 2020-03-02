/*----------------------------------------------------------------------------*/
/* Copyright (c) 2019 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.ScooperSubsystem;



public class shootscoop extends ParallelCommandGroup {
  /**
   * Creates a new shootscoop.
   */
  public shootscoop(DriveSubsystem drive, ScooperSubsystem scoop,double scoops, double speed) {
    // Add your commands in the super() call, e.g.
    // super(new FooCommand(), new BarCommand());super();

    super(
      new Shooter(drive, speed),

      new Scooper(scoop, scoops)






    );
  }
}
