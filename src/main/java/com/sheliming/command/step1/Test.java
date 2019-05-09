package com.sheliming.command.step1;

import com.sheliming.command.product.Door;
import com.sheliming.command.product.Light;

public class Test {
    public static void main(String[] args) {
        Light light = new Light();
        LightOnCommand lightOnCommand = new LightOnCommand(light);

        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        simpleRemoteControl.setCommand(lightOnCommand);

        simpleRemoteControl.buttonWasPressed();


        Door door = new Door();
        DoorOpenCommand doorOpenCommand = new DoorOpenCommand(door);

        simpleRemoteControl.setCommand(doorOpenCommand);

        simpleRemoteControl.buttonWasPressed();
    }
}
