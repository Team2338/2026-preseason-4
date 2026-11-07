// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package team.gif.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveTrainSub extends SubsystemBase {
    WPI_TalonSRX talon;
    WPI_TalonSRX talon2;
    DifferentialDrive differentialDrive;
    /** Creates a new ExampleSubsystem. */
    public DriveTrainSub() {
        talon = new WPI_TalonSRX(41);
        talon2 = new WPI_TalonSRX(1);

        differentialDrive = new DifferentialDrive(talon, talon2);

        talon.configFactoryDefault();
        talon2.configFactoryDefault();

        talon.setNeutralMode(NeutralMode.Brake);
        talon2.setNeutralMode(NeutralMode.Brake);
    }

    public void arcadeDrive(double speed, double rotation) {
        differentialDrive.arcadeDrive(speed, rotation);
    }

}