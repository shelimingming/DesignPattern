package com.sheliming.iterator.step1;

public class DinerMenu {
    private static final int MAX_ITEM = 6;

    private MenuItem[] menuItems;
    private int menuItemsSize = 0;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEM];
    }

    public void addMenuItem(MenuItem menuItem) {
        if (menuItemsSize >= 6) {
            System.out.println("menu is full");
        } else {
            menuItems[menuItemsSize] = menuItem;
            menuItemsSize++;
        }
    }

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }

}
