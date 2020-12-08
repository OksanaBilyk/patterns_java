package com.bharath.patterns.command;

public class RemoteControl {

	private Command command;

	public void pressButton(){
		command.execute();
	}

	public Command getCommand() {
		return command;
	}

	public void setCommand(final Command command) {
		this.command = command;
	}
}
