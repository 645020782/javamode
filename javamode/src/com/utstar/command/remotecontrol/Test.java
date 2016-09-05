package com.utstar.command.remotecontrol;

public class Test {

	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();
		Light light = new Light();
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		LightOffCommand lightOffCommand = new LightOffCommand(light);
		remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
		System.out.println(remoteControl);
		remoteControl.onButtonPressed(0);
		remoteControl.offButtonPressed(0);
		remoteControl.undoButtonPressed();
	}

}
