// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package team.gif.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.RobotMap;

public class TalonCollect extends SubsystemBase {
    TalonSRX talon;
    /** Creates a new ExampleSubsystem. */
    public TalonCollect() {
        talon = new TalonSRX(RobotMap.COLLECTOR_ID);
    }
    public void output(double input) {
        talon.set(ControlMode.PercentOutput, input);
    }

}
