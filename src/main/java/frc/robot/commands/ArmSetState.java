package frc.robot.commands;

import frc.robot.subsystems.arm.Arm;
import frc.robot.subsystems.arm.Arm.ArmState;
import edu.wpi.first.wpilibj2.command.InstantCommand;

public class ArmSetState extends InstantCommand {
    private final Arm arm = Arm.getInstance();
    private final ArmState state;

    public ArmSetState(ArmState state) {
        this.state = state;

        addRequirements(arm);
    }

    public void execute() {
        arm.setState(state);
    }
    // WRITE THIS COMMAND!!!
    // Don't forget addRequirements(...) in your constructor
}