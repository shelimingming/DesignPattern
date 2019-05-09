package com.sheliming.command.step1;

import com.sheliming.command.product.Door;
import com.sheliming.command.product.Light;

public class DoorOpenCommand implements Command {
    Door door;

    public DoorOpenCommand(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.open();
    }
}
