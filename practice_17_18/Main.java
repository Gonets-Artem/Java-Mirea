package practice_17_18;

import java.io.*;

public class Main {
    static PrintWriter writer;
    static String basePath = "C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src";

    static {
        try {
            writer = new PrintWriter(basePath + "/practice_17_18/result.md");
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Work(basePath);
        writer.close();
    }

    private static void Work(String path) {
        File file = new File(path);
        if (file.isDirectory()) {
            String[] content = file.list();
            for (String s : content) {
                Work(path + "/" + s);
            }
        }
        if (file.getName().endsWith(".java")) {
            try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
                writer.write("######" + path + "\n```java\n");
                String line = reader.readLine();
                while (line != null) {
                    writer.write(line + "\n");
                    line = reader.readLine();
                }
                writer.write("```\n");
            }
            catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}