package com.utstar.command.remotecontrol;

/**
 * @author Lenovo
 *
 *��װ����ʵ����һ������ʵ������������ִ���ߺ��������.
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
