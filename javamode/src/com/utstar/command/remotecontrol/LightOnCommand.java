package com.utstar.command.remotecontrol;

public class LightOnCommand implements Command{
	private Light light;
	
	public LightOnCommand() {
		super();
	}

	public LightOnCommand(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();
		
	}

	@Override
	public void undo() {
		light.off();
	}
	public Light getLight() {
		return light;
	}

	public void setLight(Light light) {
		this.light = light;
	}
}
