/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

	public static final int Front_Left_Motor_ID1 = 1;
	public static final int Front_Right_Motor_ID2 = 2;
	public static final int Rear_Left_Motor_ID3 = 3;
	public static final int Rear_Right_Motor_ID4 = 4;
	public static final int Driver_Controller = 0;
	public static final int LeftStickY = 1;
	public static final int RightStickX = 4;
	public static final int Front_Left_Motor_ID5 = 0;
	public static final int MotorID6 = 0;
	public static final int MotorID5 = 0;
	public static int buttonNumber1;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
}
