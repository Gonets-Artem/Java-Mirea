package practice_21_22;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        ItemsStore is = null;
        int id;
        String data, description;
        boolean isGood;
        Scanner sc = new Scanner(System.in);
        System.out.println("Methods of implementation - file, server");
        System.out.println("Enter: file - 1, server - 2");
        int implementation = sc.nextInt();
        if (implementation == 1) {
            is = new WorkFile();
        } else if (implementation == 2) {
            is = new WorkServer();
        }
        System.out.println("\nInstructions of work with storage - getAll, get, add, edit, delete");
        System.out.println("Enter: exit - 0, getAll - 1, get - 2, add - 3, edit - 4, delete - 5");
        int instruction = sc.nextInt();
        while (instruction != 0) {
            List<Item> items = is.getAll();
            switch (instruction) {
                case 1: {
                    if (items.size() != 0) {
                        for (int i = 0; i < items.size(); i++) {
                            System.out.println(items.get(i));
                        }
                    } else {
                        System.out.println("Items are not found");
                    }
                    break;
                }
                case 2: {
                    if (items.size() != 0) {
                        System.out.print("Item id(>0): ");
                        id = sc.nextInt();
                        if (is.get(id) != null) {
                            System.out.println("Item is with id=" + id + ": " + is.get(id));
                        } else {
                            System.out.println("Item is not found with id=" + id);
                        }
                    } else {
                        System.out.println("Items are not found");
                    }
                    break;
                }
                case 3: {
                    System.out.print("Item id(>0): ");
                    id = sc.nextInt();
                    System.out.print("Item data: ");
                    data = sc.next();
                    System.out.print("Item isGood(true/false): ");
                    isGood = sc.nextBoolean();
                    System.out.print("Item description: ");
                    description = sc.next();
                    System.out.println("Item was added: " + is.addItem(new Item(id, data, isGood, description)));
                    break;
                }
                case 4: {
                    if (items.size() != 0) {
                        System.out.print("Item old id(>0): ");
                        int oldId = sc.nextInt();
                        if (is.get(oldId) != null) {
                            System.out.println("Item before: " + is.get(oldId));
                            System.out.print("Item new id(>0), if it is file: ");
                            id = sc.nextInt();
                            System.out.print("Item data: ");
                            data = sc.next();
                            System.out.print("Item isGood(true/false): ");
                            isGood = sc.nextBoolean();
                            System.out.print("Item description: ");
                            description = sc.next();
                            System.out.println("Item after: " + is.editItem(oldId, new Item(id, data, isGood, description)));
                        } else {
                            System.out.println("Item is not found with id=" + oldId);
                        }
                    } else {
                        System.out.println("Items are not found");
                    }
                    break;
                }
                case 5: {
                    if (items.size() != 0) {
                        System.out.print("Item id(>0): ");
                        id = sc.nextInt();
                        if (is.get(id) != null) {
                            is.deleteItem(id);
                            System.out.println("Item with id=" + id + " was deleted");
                        } else {
                            System.out.println("Item is not found");
                        }
                    } else {
                        System.out.println("Items are not found");
                    }
                    break;
                }
            }
            System.out.println("\nEnter: exit - 0, getAll - 1, get - 2, add - 3, edit - 4, delete - 5");
            instruction = sc.nextInt();
        }
        System.out.println("The end");
    }
}