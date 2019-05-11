package com.sheliming.iterator.step1;

public class DinerMenuIterator implements Iterator {

    private MenuItem[] menuItems;

    private int position = 0;

    public DinerMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        if (position < menuItems.length && menuItems[position] != null) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if (position < menuItems.length && menuItems[position] != null) {
            Object menuItem = menuItems[position];
            position++;
            return menuItem;
        } else {
            return null;
        }
    }
}
