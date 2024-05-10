package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public  class DriveTrain extends SubsystemBase{
    private final CANSparkMax leftMotor = new CANSparkMax(1, MotorType.kBrushless);
    private final CANSparkMax rightMotor = new CANSparkMax(3, MotorType.kBrushless);
    private final CANSparkMax leftMotor2 = new CANSparkMax(2, MotorType.kBrushless);
    private final CANSparkMax rightMotor2 = new CANSparkMax(4, MotorType.kBrushless);
    
    
    private final DifferentialDrive drive = new DifferentialDrive(leftMotor, rightMotor);  
    
    //  



    public DriveTrain(){
        leftMotor.setInverted(true);
        leftMotor2.follow(leftMotor);
        rightMotor2.follow(rightMotor);

    }

    public void arcadeDrive(double fwd, double rot){
        drive.arcadeDrive(fwd, rot);
    }

    public void stop(){
        drive.stopMotor();
    }


    





}
