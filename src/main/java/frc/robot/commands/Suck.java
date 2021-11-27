// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Sucker;

public class Suck extends CommandBase {
  /** Creates a new suck. */

  private Sucker m_sucker;
  
  public Suck(Sucker sucker, double speed) {
    m_sucker = sucker;
    m_sucker.suck(speed);
    addRequirements(m_sucker);
}



  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_sucker.suck(1);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_sucker.suck(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
