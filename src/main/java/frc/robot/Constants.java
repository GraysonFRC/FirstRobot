/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide
 * numerical or boolean constants. This class should not be used for any other
 * purpose. All constants should be declared globally (i.e. public static). Do
 * not put anything functional in this class.
 *
 * <p>
 * It is advised to statically import this class (or one of its inner classes)
 * wherever the constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final Joystick m_stick = new Joystick(0);
    public static final SpeedController m_frontLeft = new PWMVictorSPX(0);
    public static final SpeedController m_rearLeft = new PWMVictorSPX(1);
    public static final SpeedControllerGroup m_left = new SpeedControllerGroup(m_frontLeft, m_rearLeft);

    public static final SpeedController m_frontRight = new PWMVictorSPX(3);
    public static final SpeedController m_rearRight = new PWMVictorSPX(2);
    public static final SpeedControllerGroup m_right = new SpeedControllerGroup(m_frontRight, m_rearRight);
    public static final PWMVictorSPX m_shooter = new PWMVictorSPX(4);
}
