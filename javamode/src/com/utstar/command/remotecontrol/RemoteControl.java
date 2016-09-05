package com.utstar.command.remotecontrol;

import java.util.Arrays;

/**
 * @author Lenovo
 *
 *组装命令调用者，把命令实例set到调用者中，调用者调用命令中的方法
 *
 */
public class RemoteControl {
	private Command[] commandOn;
	private Command[] commandOff;
	private Command undoCommand;
	public RemoteControl(){
		commandOn = new Command[7];
		commandOff = new Command[7];
		Command noCommand = new NoCommand();
		for(int i=0;i<commandOn.length;i++){
			commandOn[i] = noCommand;
			commandOff[i] = noCommand;
		}
		undoCommand = noCommand;
	}
	public void setCommand(int slot,Command on,Command off){
		commandOn[slot] = on;
		commandOff[slot] = off;
	}
	public void onButtonPressed(int slot){
		commandOn[slot].execute();
		undoCommand = commandOn[slot];
	}
	public void offButtonPressed(int slot){
		commandOff[slot].execute();
		undoCommand = commandOff[slot];
	}
	public void undoButtonPressed(){
		undoCommand.undo();
	}
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("\n ------remote control ------\n");
		for(int i=0;i<commandOn.length;i++){
			builder.append("[solt"+i+"]"+commandOn[i].getClass().getName()+"   "+commandOff[i].getClass().getName()+"\n");
		}
		return builder.toString();
	}
	
}
