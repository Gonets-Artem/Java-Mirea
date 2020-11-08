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
        work(basePath);
        writer.close();
    }

    private static void work(String path) {
        File file = new File(path);
        if (file.isDirectory()) {
            String[] content = file.list();
            for (String s : content) {
                work(path + "/" + s);
            }
        }
        if (file.getName().endsWith(".java")) {
            try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
                writer.append("##### " + path + "\n```java\n");
                String line = reader.readLine();
                while (line != null) {
                    writer.append(line + "\n");
                    line = reader.readLine();
                }
                writer.append("```\n");
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