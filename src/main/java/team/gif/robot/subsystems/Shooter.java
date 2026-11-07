// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package team.gif.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.revrobotics.PersistMode;
import com.revrobotics.ResetMode;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.config.SparkBaseConfig;
import com.revrobotics.spark.config.SparkMaxConfig;
import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import team.gif.robot.RobotMap;

import static com.revrobotics.spark.SparkLowLevel.MotorType.kBrushless;

public class Shooter extends SubsystemBase {
    /** Creates a new ExampleSubsystem. */
    SparkMax neo;
    SparkMaxConfig motorConfig;
    public Shooter() {
        neo = new SparkMax(RobotMap.SHOOTER_ID, kBrushless);

        motorConfig = new SparkMaxConfig();
        motorConfig.idleMode(SparkBaseConfig.IdleMode.kBrake);

        neo.configure(motorConfig, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
    }

    public void runMotor(int motorPower) {
        neo.setVoltage(motorPower);
    }

    public void stopMotor() {
        neo.setVoltage(0);
    }
}
