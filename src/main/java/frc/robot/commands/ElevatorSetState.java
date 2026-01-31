package frc.robot.commands;

import frc.robot.subsystems.elevator.Elevator;
import frc.robot.subsystems.elevator.Elevator.ElevatorState;
import edu.wpi.first.wpilibj2.command.InstantCommand;

public class ElevatorSetState extends InstantCommand {
    private final Elevator elevator;
    private final ElevatorState state;

    public ElevatorSetState(ElevatorState state) {
        this.elevator = Elevator.getInstance();
        this.state = state;

        addRequirements(elevator);
    }

    @Override
    public void execute() {
        elevator.setState(state);
    }
    // WRITE THE COMMAND
    // Don't forget addRequirements(...) in your constructor
}