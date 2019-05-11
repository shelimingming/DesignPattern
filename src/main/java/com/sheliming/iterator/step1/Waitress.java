package com.sheliming.iterator.step1;

public class Waitress {
    public static void main(String[] args) {
        DinerMenu dinerMenu = new DinerMenu();
        MenuItem menuItem1 = new MenuItem("steak");
        MenuItem menuItem2 = new MenuItem("salad");
        MenuItem menuItem3 = new MenuItem("spaghetti");
        dinerMenu.addMenuItem(menuItem1);
        dinerMenu.addMenuItem(menuItem2);
        dinerMenu.addMenuItem(menuItem3);

        Iterator dinerMenuIterator = dinerMenu.createIterator();
        new Waitress().printMenu(dinerMenuIterator);


    }

    private void printMenu(Iterator iterator) {
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
