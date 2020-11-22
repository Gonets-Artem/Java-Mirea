package practice_21_22;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class WorkFile implements ItemsStore {
    Gson gson = new Gson();
    String path = "C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/main/java/practice_21_22/data.json";
    File file = new File(path);

    public WorkFile() throws IOException {
        file.createNewFile();
    }

    @Override
    public List<Item> getAll() {
        List<Item> items = new ArrayList<>();
        Type type = new TypeToken<List<Item>>() {
        }.getType();
        try (FileReader reader = new FileReader(file)) {
            items = gson.fromJson(reader, type);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return items;
    }

    @Override
    public Item get(int id) {
        List<Item> items = getAll();
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId() == id) {
                return items.get(i);
            }
        }
        return null;
    }

    @Override
    public Item addItem(Item item) throws IOException {
        List<Item> items = getAll();
        if (items == null) {
            items = new ArrayList<>();
        }
        items.add(item);
        checkId(items, item);
        items.sort(((o1, o2) -> (int)Math.signum(o1.getId()-o2.getId())));
        writeToFile(items);
        return get(item.getId());
    }

    @Override
    public Item editItem(int id, Item item) throws IOException {
        List<Item> items = getAll();
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId() == id) {
                items.remove(i);
            }
        }
        items.add(item);
        checkId(items, item);
        items.sort(((o1, o2) -> (int)Math.signum(o1.getId()-o2.getId())));
        writeToFile(items);
        return get(item.getId());
    }

    @Override
    public void deleteItem(int id) throws IOException {
        List<Item> items = getAll();
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getId() == id) {
                items.remove(i);
            }
        }
        writeToFile(items);
    }

    public void checkId(List<Item> items, Item item) {
        boolean flag = false;
        for (int i = 0; i < items.size() - 1; i++) {
            if (items.get(i).getId() == item.getId()) {
                flag = true;
                break;
            }
        }
        if (flag) {
            ArrayList<Integer> indexes = new ArrayList<>();
            int index = 1;
            for (int i = 0; i < items.size() - 1; i++) {
                indexes.add(items.get(i).getId());
            }
            while (indexes.contains(index)) {
                index++;
            }
            item.setId(index);
        }
    }

    public void writeToFile(List<Item> items) throws IOException {
        FileWriter writer = new FileWriter(path);
        writer.write("[\n");
        for (int i = 0; i < items.size(); i++) {
            writer.write(gson.toJson(items.get(i)));
            if (i != items.size() - 1) {
                writer.write(",");
            }
            writer.write("\n");
        }
        writer.write("]");
        writer.close();
    }
}
