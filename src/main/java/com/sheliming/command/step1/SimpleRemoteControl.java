package com.sheliming.command.step1;

/**
 * 简单的遥控器，只有一个按钮，这个按钮做的动作可以被动态的修改
 */
public class SimpleRemoteControl {
    //遥控器上按钮对应的动作
    private Command slot;

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
