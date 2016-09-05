package com.utstar.command.remotecontrol;

/**
 * @author Lenovo
 *
 *组装命令实例，一个命令实例由真正命令执行者和命令组成.
 * 
 *
 */
public class LightOffCommand implements Command{
	private Light light;

	public LightOffCommand(Light light) {
		super();
		this.light = light;
	}

	public LightOffCommand() {
		super();
	}

	public Light getLight() {
		return light;
	}

	public void setLight(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.off();
	}

	@Override
	public void undo() {
		light.on();
	}
	
}
