package com.xeiam.proprioceptron.states;

import com.xeiam.proprioceptron.FreeVar;
import com.xeiam.proprioceptron.State;

/**
 * TorqueState contains information about the linear acceleration of the joints perpendicular to the direction of the rod. counterclockwise is positive, units are newtons*meters.
 * 
 * @author Zackkenyon
 * @create Sep 11, 2012
 */
public class TorqueState implements State {

  public FreeVar[] torques;

  @Override
  public FreeVar[] toVector() {

    return torques;
  }

  @Override
  public String[] vectorDoc() {

    return new String[] { torques.length + " torques" }; // + id
  }

  @Override
  public void addVars(FreeVar[] torques) {

    this.torques = torques;

  }
}