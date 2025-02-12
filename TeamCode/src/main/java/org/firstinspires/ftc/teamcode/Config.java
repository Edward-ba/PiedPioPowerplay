package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.Gamepad;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class Config {
    public Telemetry telemetry = null;
    public HardwareMap hardwareMap = null;
    public Gamepad gamePad1 = null;
    public Gamepad gamePad2 = null;

    // Drive system
    public static final String RIGHT_FRONT_DRIVE = "rightFrontDrive";
    public static final String RIGHT_BACK_DRIVE = "rightBackDrive";
    public static final String LEFT_FRONT_DRIVE = "leftFrontDrive";
    public static final String LEFT_BACK_DRIVE = "leftBackDrive";

    public static final String ARM_MOTOR = "armMotor";

    public static final String CLAW_SERVO = "clawServo";

    private ElapsedTime runtime = new ElapsedTime();

    // Constructor
    public Config(Telemetry tlm, HardwareMap hwm, Gamepad gmp1, Gamepad gmp2) {
        this.telemetry = tlm;
        this.hardwareMap = hwm;
        this.gamePad1 = gmp1;
        this.gamePad2 = gmp2;
    }

    void updateTelemetry() {
        telemetry.addData("Status", "Run Time: " + runtime.toString());

        telemetry.addData("G1: bumper", "%b %b", gamePad1.left_bumper, gamePad1.right_bumper);
        telemetry.addData("G1: trigger", "%4.2f, %4.2f", gamePad1.left_trigger, gamePad1.right_trigger);
    }
}
