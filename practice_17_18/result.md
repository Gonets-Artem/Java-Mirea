##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/dop_task1/Main.java
```java
package dop_task1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        // через закономерность прибавления вариантов от количества сдачи
        int sum = 1, plus = 1;
        for (int i = 1; i <= N; i++) {
            if (i == 3 || i == 5 || i == 6) {
                sum++;
            }
            else if ((i-1) % 15 == 0 || (i-2) % 15 == 0 || (i-4) % 15 == 0 || (i-7) % 15 == 0) {
                sum += plus - 1;
            }
            else if (i % 15 == 0) {
                plus++;
                sum += plus;
            }
            else {
                sum += plus;
            }
            System.out.println("N = " + i + ": sum = " + sum);
        }
        //System.out.println("N = " + N + ": " + sum);


        // полным перебором возможных значений
        int k1 = 1, k3 = 3, k5 = 5, count = 0;
        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= N / 3; j++) {
                for (int k = 0; k <= N / 5; k++) {
                    if (i * k1 + j * k3 + k * k5 == N) {
                        count++;
                    }
                }
            }
        }
        System.out.println("N = " + N + ": " + count);
    }
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/dop_task3/Main.java
```java
package dop_task3;

import java.util.ArrayList;

public class Main {
    static int k = 10;
    static long[] array = new long[k];

    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i < k; i++){
            final int localI = i;
            Thread thread = new Thread(() -> work(localI));
            thread.start();
            threads.add(thread);
        }
        for (Thread t : threads) {
            t.join();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("total time: " + (endTime - startTime));
        long res = 0;
        for (int i = 0; i < k; i++) {
            res += array[i];
        }
        System.out.println("total sum: " + res);
    }

    private static void work(int i) {
        long startTime = System.currentTimeMillis();
        long result = doHardWork(i * 1000, 100_000_000, i);
        long endTime = System.currentTimeMillis();
        System.out.println(i + ": " + result + " | " + (endTime-startTime));
    }

    private static long doHardWork(int start, int count, int numberOfThread) {
        long a = 0;
        long b = 0;
        for (int i = 0; i < count; i++) {
            a += (start + i) * (start + i) * Math.sqrt(start + i);
            b++;
        }
        array[numberOfThread] += b;
        return a;
    }
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_1/Main.java
```java
package practice_1;

import java.util.Random;
import java.util.Scanner;
import java.math.*;

public class Main {

    public static void main(String[] args) {

        int[] a = new int[]{4, 6, 2, 8, 12, 43, 6, 3, 7, 4};
        int sum = 0;

        // пункт 3, for
        for (int i = 0; i < 10; i++) {
            sum += a[i];
        }
        System.out.println(sum);

        // пункт 3, while
        int i = 0;
        sum = 0;
        while (i != 10) {
            sum += a[i];
            i++;
        }
        System.out.println(sum);

        // пункт 3, do-while
        i = 0;
        sum = 0;
        do {
            sum += a[i];
            i++;
        } while (i != 10);
        System.out.println(sum);


        // пункт 4 командная строка
        for (i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }


        // пункт 5 гармонический ряд
        for (i = 1; i <= 10; i++) {
            System.out.printf("%.3f", (double) 1 / i);
            System.out.print(" ");
        }
        System.out.println();


        // пункт 6 Math
        int size = (int) (Math.random() * 10) + 1;
        int[] mat = new int[size];
        for (int z = 0; z < size; z++) {
            mat[z] = (int) (Math.random() * 50);
        }
        for (int i1 = 0; i1 < size - 1; i1++) {
            for (int i2 = i1 + 1; i2 < size; i2++) {
                if (mat[i1] > mat[i2]) {
                    int t = mat[i1];
                    mat[i1] = mat[i2];
                    mat[i2] = t;
                }
            }
        }

        for (i = 0; i < size; i++) {
            System.out.print(mat[i] + " ");
        }
        System.out.println();

        // пункт 6 Random
        Random r = new Random();
        size = r.nextInt(10) + 1;
        mat = new int[size];
        for (i = 0; i < size; i++) {
            mat[i] = (int)(r.nextInt(50) + 1);
        }
        for (int i1 = 0; i1 < size - 1; i1++) {
            for (int i2 = i1 + 1; i2 < size; i2++) {
                if (mat[i1] > mat[i2]) {
                    int t = mat[i1];
                    mat[i1] = mat[i2];
                    mat[i2] = t;
                }
            }
        }
        for (i = 0; i < size; i++) {
            System.out.print(mat[i] + " ");
        }


        // пункт 7 факториал
        System.out.println();
        System.out.print(factorial((int)(Math.random()*20)+1));

    }

    public static int factorial(int N)
    {
        int res = 1;
        for (int i = 1; i <= N; i++) {
            res *= i;
        }
        return res;
    }
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_10/Calculator.java
```java
package practice_10;

import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
    JLabel labelA = new JLabel("Значение A");
    JLabel labelB = new JLabel("Значение B");
    JLabel labelResult = new JLabel("Результат: ");
    JTextField fieldA = new JTextField();
    JTextField fieldB = new JTextField();
    JButton addition = new JButton("+");
    JButton subtraction = new JButton("-");
    JButton division = new JButton("/");
    JButton multiplication = new JButton("*");
    JPanel panel = new JPanel();
    JPanel panelDop = new JPanel();

    public Calculator() {
        setTitle("Calculator");
        setSize(350, 350);

        labelA.setHorizontalAlignment(JLabel.CENTER);
        labelB.setHorizontalAlignment(JLabel.CENTER);
        labelA.setFont(new Font("Calibri", Font.ITALIC, 20));
        labelB.setFont(new Font("Calibri", Font.ITALIC, 20));
        labelResult.setFont(new Font("Calibri", Font.BOLD, 18));

        fieldA.setFont(new Font("Calibri", Font.ITALIC, 20));
        fieldA.addCaretListener(action -> {
            try {
                double value = Double.parseDouble(fieldA.getText());
                labelA.setText("Значение А");
            } catch (Exception ex) {
                labelA.setText(ex.getMessage());
            }
        });

        fieldB.setFont(new Font("Calibri", Font.ITALIC, 20));
        fieldB.addCaretListener(action -> {
            try {
                double value = Double.parseDouble(fieldB.getText());
                labelB.setText("Значение B");
            } catch (Exception ex) {
                labelB.setText(ex.getMessage());
            }
        });

        addition.setFont(new Font("", Font.BOLD, 22));
        addition.setPreferredSize(new Dimension(60,40));
        addition.addActionListener(action -> {
            try {
                labelResult.setText("Результат: " +
                        String.format("%.4f", Double.parseDouble(fieldA.getText()) +
                                Double.parseDouble(fieldB.getText())));
            }
            catch (Exception ex) {
                labelResult.setText("Результат: ошибка ввода!");
            }
        });

        subtraction.setFont(new Font("", Font.BOLD, 22));
        subtraction.setPreferredSize(new Dimension(60,40));
        subtraction.addActionListener(action -> {
            try {
                labelResult.setText("Результат: " +
                        String.format("%.4f", Double.parseDouble(fieldA.getText()) -
                                Double.parseDouble(fieldB.getText())));
            }
            catch (Exception ex) {
                labelResult.setText("Результат: ошибка ввода!");
            }
        });

        division.setFont(new Font("", Font.BOLD, 22));
        division.setPreferredSize(new Dimension(60,40));
        division.addActionListener(action -> {
            try {
                labelResult.setText("Результат: " +
                        String.format("%.4f", Double.parseDouble(fieldA.getText()) /
                                Double.parseDouble(fieldB.getText())));
            }
            catch (Exception ex) {
                labelResult.setText("Результат: ошибка ввода!");
            }
        });

        multiplication.setFont(new Font("", Font.BOLD, 22));
        multiplication.setPreferredSize(new Dimension(60,40));
        multiplication.addActionListener(action -> {
            try {
                labelResult.setText("Результат: " +
                        String.format("%.4f", Double.parseDouble(fieldA.getText()) *
                                Double.parseDouble(fieldB.getText())));
            }
            catch (Exception ex) {
                labelResult.setText("Результат: ошибка ввода!");
            }
        });

        panelDop.add(addition);
        panelDop.add(subtraction);
        panelDop.add(division);
        panelDop.add(multiplication);

        panel.setLayout(new GridLayout(6, 1));
        panel.add(labelA);
        panel.add(fieldA);
        panel.add(panelDop);
        panel.add(labelB);
        panel.add(fieldB);
        panel.add(labelResult);
        add(panel);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_10/Main.java
```java
package practice_10;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Calculator calc = new Calculator();
            calc.setVisible(true);
        });
    }
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_11/Main.java
```java
package practice_11;

import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    static int sum;
    static ReentrantLock lock = new ReentrantLock();
    static AtomicInteger sumAtomic = new AtomicInteger();
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Thread> threads = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            final int localI = i;
            Thread thread = new Thread(() -> work(localI));
            thread.start();
            threads.add(thread);
        }
        for (Thread t : threads) {
            t.join();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("total time: " + (endTime - startTime));
        System.out.println("sum = " + sum);
        //System.out.println("sum = " + sumAtomic);
    }

    private static void work(int i) {
        long startTime = System.currentTimeMillis();
        long result = mathOperations(i * 1000, 100_000_000);
        long endTime = System.currentTimeMillis();
        System.out.println("thread " + i + ": result=" + result + " | time=" + (endTime-startTime));
    }

    private synchronized static long mathOperations(int start, int count) {
        long a = 0;
        //lock.lock();
        for (int i = 0; i < count; i++) {
            a += (start + i) * Math.abs(start - i) / Math.sqrt(start + i);
            sum++;
            //sumAtomic.incrementAndGet();
        }
        //lock.unlock();
        return a;
    }
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_12/ColorEnums.java
```java
package practice_12;

public enum ColorEnums {
    BLACK("\u001B[30m"),
    RED("\u001B[31m"),
    GREEN("\u001B[32m"),
    YELLOW("\u001B[33m"),
    BLUE("\u001B[34m"),
    MAGENTA("\u001B[35m"),
    CYAN("\u001B[36m"),
    WHITE("\u001B[37m");

    private final String field;

    ColorEnums(String field) {
        this.field = field;
    }

    public String getField() {
        return field;
    }
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_12/Main.java
```java
package practice_12;

public class Main {

    public static final String RESET = "\u001B[0m";

    public static void main(String[] args) {
        colorWrite("Zdravstvuite", ColorEnums.BLACK);
        colorWrite("Paivaa", ColorEnums.RED);
        colorWrite("Hello", ColorEnums.GREEN);
        colorWrite("Aleihum", ColorEnums.YELLOW);
        colorWrite("Aloha", ColorEnums.BLUE);
        colorWrite("Shalom", ColorEnums.MAGENTA);
        colorWrite("Gamardjobat", ColorEnums.CYAN);
        colorWrite("Guten", ColorEnums.WHITE);
    }

    public static void colorWrite(String s, ColorEnums ce) {
        System.out.println(ce.getField() + s + RESET);
    }
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_13/Gas.java
```java
package practice_13;

public class Gas {
    public double volume;

    public void addVolume(double volume) throws MyException {
        if (volume < 0) {
            throw new MyException();
        }
        this.volume += volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "Gas{" +
                "volume=" + volume +
                '}';
    }
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_13/Main.java
```java
package practice_13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Gas argon = new Gas();

        try {
            double volume = Double.parseDouble(new Scanner(System.in).nextLine());
            argon.addVolume(volume);
            System.out.println("No exceptions");
        }
        catch (MyException mex) {
            System.out.println("input negative number");
        }
        catch (NumberFormatException mfe) {
            System.out.println("Incorrect input format: string");
        }
        finally {
            System.out.println(argon);
        }

        throw new MyRuntimeException();
    }
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_13/MyException.java
```java
package practice_13;

public class MyException extends RuntimeException{
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_13/MyRuntimeException.java
```java
package practice_13;

public class MyRuntimeException extends RuntimeException{
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_14/Main.java
```java
package practice_14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Map<String, String> rules = new HashMap<>();
        for (int i = 0; i < N; i++) {
            rules.put(scanner.next(), scanner.next());
        }
        String word = scanner.next();
        //System.out.println(regex(rules, word));
        System.out.println(irregex(rules, word));
    }

    private static String regex(Map<String, String> rules, String word) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rules.size(); i++) {
            sb.append(rules.keySet().toArray()[i]);
            if (i != rules.size() - 1) {
                sb.append("|");
            }
        }
        Matcher m = Pattern.compile(sb.toString()).matcher(word);
        return "";
        //return m.replaceAll(x -> rules.get(x.group()));
    }

    private static StringBuilder irregex(Map<String, String> rules, String word) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            int t = 0;
            for (String rule: rules.keySet()) {
                if (i + rule.length() < word.length()) {
                    String key = word.substring(i, i + rule.length());
                    if (rule.equals(key)) {
                        sb.append(rules.get(rule));
                        t = 1;
                        i += rule.length() - 1;
                        break;
                    }
                }
            }
            if (t==0) {
                sb.append(word.charAt(i));
            }
        }
        return sb;
    }
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_15_16/Graph.java
```java
package practice_15_16;

public class Graph {
    private State S1 = new State();
    private State S2 = new State();
    private State S3 = new State();
    private State S4 = new State();
    private State S5 = new State();
    private State currentState = S1;

    public Graph() {
        S1.setup(0, "create_project", S2);
        S1.setup(1, "add_library", S5);
        S2.setup(0, "test", S3);
        S2.setup(1, "drop_db", S4);
        S3.setup(0, "drop_db", S4);
        S3.setup(1, "add_library", S5);
        S4.setup(0, "restart", S3);
        S4.setup(1, "deploy", S5);
        S5.setup(0, "deploy", S1);
        S5.setup(1, "restart", S3);
    }

    public void work(int a) {
        for (int i = 0; i < currentState.getConnections().size(); i++) {
            if (currentState.getConnections().get(i) == a) {
                System.out.println(currentState.getInstructions().get(a));
                currentState = currentState.getPointers().get(a);
                break;
            }
        }
    }
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_15_16/Main.java
```java
package practice_15_16;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph();
        Scanner sc = new Scanner(System.in);
        while (true) {
            int a = sc.nextInt();
            if (a == -1) {
                break;
            }
            graph.work(a);
        }
    }
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_15_16/State.java
```java
package practice_15_16;

import java.util.ArrayList;

public class State {
    private ArrayList<Integer> connections = new ArrayList<>();
    private ArrayList<String> instructions = new ArrayList<>();
    private ArrayList<State> pointers = new ArrayList<>();

    public void setup(Integer connection, String instruction, State pointer) {
        connections.add(connection);
        instructions.add(instruction);
        pointers.add(pointer);
    }

    public ArrayList<Integer> getConnections() {
        return connections;
    }

    public ArrayList<String> getInstructions() {
        return instructions;
    }

    public ArrayList<State> getPointers() {
        return pointers;
    }
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_17_18/Main.java
```java
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
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_2/num1/Shape.java
```java
package practice_2.num1;

public class Shape {
    private String name;
    private double area;

    public Shape(String name, double area) {
        setName(name);
        setArea(area);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String toString() {
        return "name: " + getName() +
                ", area: " + getArea();
    }
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_2/num1/TestShape.java
```java
package practice_2.num1;

public class TestShape {
    public static void main(String[] args) {
        Shape shape = new Shape("triangle", 12.2);
        System.out.println(shape);
    }
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_2/num2/Ball.java
```java
package practice_2.num2;

public class Ball {
    private double diameter, pressure;
    private String material, color;

    public Ball(double diameter, double pressure, String material, String color) {
        setDiameter(diameter);
        setPressure(pressure);
        setMaterial(material);
        setColor(color);
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "diameter: " + getDiameter() +
                ", pressure: " + getPressure() +
                ", material: " + getMaterial() +
                ", color: " + getColor();
    }
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_2/num2/TestBall.java
```java
package practice_2.num2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(5, 2, "latex", "green");
        System.out.println(ball);
    }
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_2/num3/Book.java
```java
package practice_2.num3;

public class Book {
    private int pages, year;
    private String name, author;

    public Book(String name, String author, int year, int pages) {
        setName(name);
        setAuthor(author);
        setYear(year);
        setPages(pages);
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String toString() {
        return "name: " + getName() +
                ", author: " + getAuthor() +
                ", year: " + getYear() +
                ", pages: " + getPages();
    }
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_2/num3/TestBook.java
```java
package practice_2.num3;

public class TestBook {
    public static void main(String[] args) {
        Book book = new Book("Borodino", "Lermontov", 1837, 10);
        System.out.println(book);
    }
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_2/num4/Dog.java
```java
package practice_2.num4;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return getName() + " " + getAge();
    }

    public void intoHumanAge() {
        System.out.println("Human (new) age: " + getName() + " " + getAge() * 7);
    }
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_2/num4/DogKennels.java
```java
package practice_2.num4;

import java.util.*;

public class DogKennels {
    private ArrayList<Dog> kennels = new ArrayList<>();

    public void matrix(Dog a, Dog... args) {
        for (int i = 0; i < args.length; i++) {
            kennels.add(args[i]);
        }
    }

    public ArrayList<Dog> getKennels() {
        return kennels;
    }
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_2/num4/Main.java
```java
package practice_2.num4;

public class Main {
    public static void main(String[] args) {
        DogKennels array = new DogKennels();
        Dog dogFirst = new Dog("Шарик", 2);
        Dog dogSecond = new Dog("Бимка", 4);
        Dog dogThree = new Dog("Снежок", 1);
        array.matrix(dogFirst, dogSecond, dogThree);
        System.out.println(array.getKennels().get(1));
        array.getKennels().get(1).intoHumanAge();
    }
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_3/num1/Circle.java
```java
package practice_3.num1;

public class Circle {
    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_3/num1/CircleTest.java
```java
package practice_3.num1;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle(9.3);
        System.out.println("radius: " + circle.getRadius());
    }
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_3/num2/Hand.java
```java
package practice_3.num2;

public class Hand {
    private double sizeOfHand;

    public Hand() {};

    public double getSizeOfHand() {
        return sizeOfHand;
    }

    public void setSizeOfHand(double sizeOfHand) {
        this.sizeOfHand = sizeOfHand;
    }

    public String toString() {
        return "\nhand: " + getSizeOfHand();
    }
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_3/num2/Head.java
```java
package practice_3.num2;

public class Head {
    private double sizeOfHead;

    public Head() {};

    public double getSizeOfHead() {
        return sizeOfHead;
    }

    public void setSizeOfHead(double sizeOfHead) {
        this.sizeOfHead = sizeOfHead;
    }

    public String toString() {
        return "\nhead: " + getSizeOfHead();
    }
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_3/num2/Human.java
```java
package practice_3.num2;

public class Human {
    private String name;
    private int age, height, weight;
    Head head = new Head();
    Hand handLeft = new Hand();
    Hand handRight = new Hand();
    Leg legLeft = new Leg();
    Leg legRight = new Leg();

    public Human(String name, int age, int height, int weight, double sizeOfHead, double sizeOfHand, double sizeOfLeg) {
        setName(name);
        setAge(age);
        setHeight(height);
        setWeight(weight);
        head.setSizeOfHead(sizeOfHead);
        handLeft.setSizeOfHand(sizeOfHand);
        handRight.setSizeOfHand(sizeOfHand);
        legLeft.setSizeOfLeg(sizeOfLeg);
        legRight.setSizeOfLeg(sizeOfLeg);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String toString() {
        return "\nname: " + getName() +
                "\nage: " + getAge() +
                "\nheight: " + getHeight() +
                "\nweight: " + getWeight() +
                "\nhead: " + head.getSizeOfHead() +
                "\nleft hand: " + handLeft.getSizeOfHand() +
                "\nright hand: " + handRight.getSizeOfHand() +
                "\nleft leg: " + legLeft.getSizeOfLeg() +
                "\nright leg: " + legRight.getSizeOfLeg();
    }
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_3/num2/HumanTest.java
```java
package practice_3.num2;

public class HumanTest {
    public static void main(String[] args) {
        Human human = new Human("John", 20, 180, 70, 58, 9, 40);
        System.out.println(human);
        human.legRight.setSizeOfLeg(38);
        System.out.println(human.legRight.getSizeOfLeg());
    }
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_3/num2/Leg.java
```java
package practice_3.num2;

public class Leg {
    private double sizeOfLeg;

    public Leg() {};

    public double getSizeOfLeg() {
        return sizeOfLeg;
    }

    public void setSizeOfLeg(double sizeOfLeg) {
        this.sizeOfLeg = sizeOfLeg;
    }

    public String toString() {
        return "\nleg: " + getSizeOfLeg();
    }
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_3/num3/Book.java
```java
package practice_3.num3;

public class Book {
    private String author, name, publishingHouse;
    private int pages, year;

    public Book(String name, String author, int year, int pages, String publishingHouse) {
        setName(name);
        setAuthor(author);
        setYear(year);
        setPages(pages);
        setPublishingHouse(publishingHouse);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return "Название: " + getName() +
                "\nAвтор: " + getAuthor() +
                "\nГод написания: " + getYear() +
                "\nКоличество страниц: " + getPages() +
                "\nИздательство: " + getPublishingHouse();
    }
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_3/num3/BookTest.java
```java
package practice_3.num3;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("Война и мир", "Толстой Л.Н.", 1873, 1274, "Русский вестник");
        System.out.println(book);
    }
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_4/Circle.java
```java
package practice_4;

public class Circle extends Shape{
    protected double radius;

    public Circle() {
        this(1);
    }

    public Circle(double radius) {
        super();
        setRadius(radius);
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Circle: radius = " + getRadius() +
                ", area = " + getArea() +
                ", perimeter = " + getPerimeter() +
                ", color = " + getColor() +
                ", filled = " + isFilled();
    }
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_4/Main.java
```java
package practice_4;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Circle(4.0, "blue", false);
        System.out.println(shape);

        Circle circle = (Circle)shape;
        circle.setRadius(2.0);
        circle.setColor("red");
        circle.setFilled(true);
        System.out.println(circle);

        Rectangle rectangle = new Rectangle(3.0, 1.5);
        System.out.println(rectangle);

        Square square = new Square();
        System.out.println(square);
    }
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_4/Rectangle.java
```java
package practice_4;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle() {
        this(1, 1);
    }

    public Rectangle(double width, double length) {
        super();
        setWidth(width);
        setLength(length);
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        setWidth(width);
        setLength(length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    public String toString() {
        return "Rectangle: width = " + getWidth() +
                ", length = " + getLength() +
                ", area = " + getArea() +
                ", perimeter = " + getPerimeter() +
                ", color = " + getColor() +
                ", filled = " + isFilled();
    }
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_4/Shape.java
```java
package practice_4;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    public Shape() {
        this("white", true);
    }

    public Shape (String color, boolean filled) {
        setColor(color);
        setFilled(filled);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract public double getArea();
    abstract public double getPerimeter();
    abstract public String toString();
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_4/Square.java
```java
package practice_4;

public class Square extends Shape {

    protected double side;

    public Square() {
        this(1);
    }
    public Square(double side) {
        super();
        setSide(side);
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return Math.pow(side, 2);
    }

    public double getPerimeter() {
        return 4*side;
    }


    public String toString() {
        return "Square: side = " + getSide() +
                ", area = " + getArea() +
                ", perimeter = " + getPerimeter() +
                ", color = " + getColor() +
                ", filled = " + isFilled();
    }
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_5/Circle.java
```java
package practice_5;

public class Circle extends Shape{
    private double radius;

    public Circle() {
        this(1);
    }

    public Circle(double radius) {
        super();
        setRadius(radius);
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "Circle: radius = " + getRadius() +
                ", area = " + getArea() +
                ", perimeter = " + getPerimeter() +
                ", color = " + getColor() +
                ", filled = " + isFilled();
    }
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_5/Main.java
```java
package practice_5;

public class Main {

    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(2, 3);
        System.out.println(point);
        point.move(4, -5);
        System.out.println(point);

        MovableCircle circle = new MovableCircle(0, 0, 2);
        System.out.println(circle);
        circle.move(2, 3);
        System.out.println(circle);
        circle.setRadius(1);
        circle.setCenter(1, 1);
        System.out.println(circle);

        MovableRectangle rectangle = new MovableRectangle(1, 1, 2, 2);
        System.out.println(rectangle);
        rectangle.setWidth(4);
        System.out.println(rectangle);
        rectangle.setLength(rectangle.getLength()*2);
        System.out.println(rectangle);
        rectangle.setLeftUp(2, 5);
        System.out.println(rectangle);
    }
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_5/Movable.java
```java
package practice_5;

public interface Movable {

    void move(double xSpeed, double ySpeed);
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_5/MovableCircle.java
```java
package practice_5;

public class MovableCircle extends Circle implements Movable {
    private MovablePoint center;

    public MovableCircle(double x, double y, double radius) {
        this.center = new MovablePoint(x, y);
        setRadius(radius);
    }

    public MovablePoint getCenter() {
        return center;
    }

    public void setCenter(double x, double y) {
        center.setX(x);
        center.setY(y);
    }

    public String toString() {
        return "circle: center " + center +
                ", radius = " + getRadius();
    }

    public void move(double xSpeed, double ySpeed) {
        center.move(xSpeed, ySpeed);
    }
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_5/MovablePoint.java
```java
package practice_5;

public class MovablePoint implements Movable {
    private double x, y;

    public MovablePoint(double x, double y) {
        setX(x);
        setY(y);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String toString() {
        return "point (" + x +
                ", " + y + ")";
    }

    public void move(double xSpeed, double ySpeed) {
        x += xSpeed;
        y += ySpeed;
    }
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_5/MovableRectangle.java
```java
package practice_5;

public class MovableRectangle extends Rectangle implements Movable{
    private MovablePoint leftUp;
    private MovablePoint rightDown;

    public MovableRectangle(double x1, double y1, double x2, double y2) {
        this.leftUp = new MovablePoint(x1, y1);
        this.rightDown = new MovablePoint(x2, y2);
        super.setWidth(Math.abs(x1-x2));
        super.setLength(Math.abs(y1-y2));
    }

    public MovablePoint getLeftUp() {
        return leftUp;
    }

    public void setLeftUp(double x, double y) {
        leftUp.setX(x);
        leftUp.setY(y);
        super.setWidth(Math.abs(x - rightDown.getX()));
        super.setLength(Math.abs(y - rightDown.getY()));
    }

    public MovablePoint getRightDown() {
        return rightDown;
    }

    public void setRightDown(double x, double y) {
        rightDown.setX(x);
        rightDown.setY(y);
        super.setWidth(Math.abs(x - leftUp.getX()));
        super.setLength(Math.abs(y - leftUp.getY()));
    }

    public void setWidth(double width) {
        double widthDop = getWidth();
        if (leftUp.getX()<rightDown.getX()) {
            leftUp.setX(leftUp.getX() - Math.abs(width - widthDop) / 2);
            rightDown.setX(rightDown.getX() + Math.abs(width - widthDop) / 2);
        }
        else {
            leftUp.setX(leftUp.getX() + Math.abs(width - widthDop) / 2);
            rightDown.setX(rightDown.getX() - Math.abs(width - widthDop) / 2);
        }
        super.setWidth(width);
    }

    public void setLength(double length) {
        double lengthDop = getLength();
        if (leftUp.getY()<rightDown.getY()) {
            leftUp.setY(leftUp.getY() - Math.abs(length - lengthDop) / 2);
            rightDown.setY(rightDown.getY() + Math.abs(length - lengthDop) / 2);
        }
        else {
            leftUp.setY(leftUp.getY() + Math.abs(length - lengthDop) / 2);
            rightDown.setY(rightDown.getY() - Math.abs(length - lengthDop) / 2);
        }
        super.setLength(length);
    }

    public void move(double xSpeed, double ySpeed) {
        leftUp.move(xSpeed, ySpeed);
        rightDown.move(xSpeed, ySpeed);
    }

    public String toString() {
        return "rectangle: LeftUp (" + leftUp.getX() +
                ", " + leftUp.getY() +
                "), RightDown (" + rightDown.getX() +
                ", " + rightDown.getY() +
                "), width = " + getWidth() +
                ", length = " + getLength();
    }
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_5/Rectangle.java
```java
package practice_5;

public class Rectangle extends Shape {
    private double width = 1;
    private double length = 1;

    public Rectangle() {}

    public Rectangle(double width, double length) {
        super();
        setWidth(width);
        setLength(length);
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        setWidth(width);
        setLength(length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }

    public String toString() {
        return "Rectangle: width = " + getWidth() +
                ", length = " + getLength() +
                ", area = " + getArea() +
                ", perimeter = " + getPerimeter() +
                ", color = " + getColor() +
                ", filled = " + isFilled();
    }
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_5/Shape.java
```java
package practice_5;

public abstract class Shape {
    private String color;
    private boolean filled;

    public Shape() {
        this("white", true);
    }

    public Shape (String color, boolean filled) {
        setColor(color);
        setFilled(filled);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    abstract public double getArea();
    abstract public double getPerimeter();
    abstract public String toString();
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_6/Main.java
```java
package practice_6;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[][] area = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                area[i][j] = in.nextInt();
                //area[i][j] = (int)(Math.random() * 20 - 10);
            }
        }
        // для рандомного ввода
//        for (int i = 0; i < N; i++) {
//            System.out.print("| ");
//            for (int j = 0; j < N; j++) {
//                System.out.print(area[i][j] + " | ");
//            }
//            System.out.println();
//        }
        System.out.println();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == 0 && j != 0) {
                    area[i][j] += area[i][j-1];
                }
                else if (i != 0 && j == 0) {
                    area[i][j] += area[i-1][j];
                }
                else if (i != 0 && j != 0) {
                    if (area[i][j-1]>area[i-1][j]) {
                        area[i][j] += area[i][j-1];
                    }
                    else {
                        area[i][j] += area[i-1][j];
                    }
                }
            }
        }
        System.out.println(area[N-1][N-1]);
    }
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_7_8/Company.java
```java
package practice_7_8;

import java.util.*;

public class Company {

    private List<Employee> employees = new ArrayList<>();

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getTopSalaryStaff(int count) {
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int)(o2.getSalary() - o1.getSalary());
            }
        });
        List<Employee> TopSalaryStaff = new ArrayList<>();
        if (count <= employees.size()) {
            if (count >= 1) {
                for (int i = 0; i < count; i++) {
                    TopSalaryStaff.add(employees.get(i));
                }
            }
        }
        else {
            for (int i = 0; i < employees.size(); i++) {
                TopSalaryStaff.add(employees.get(i));
            }
        }
        return TopSalaryStaff;
    }

    public List<Employee> getLowestSalaryStaff(int count) {
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int)(o1.getSalary() - o2.getSalary());
            }
        });
        List<Employee> TopSalaryStaff = new ArrayList<>();
        if (count <= employees.size()) {
            if (count >= 1) {
                for (int i = 0; i < count; i++) {
                    TopSalaryStaff.add(employees.get(i));
                }
            }
        }
        else {
            for (int i = 0; i < employees.size(); i++) {
                TopSalaryStaff.add(employees.get(i));
            }
        }
        return TopSalaryStaff;
    }

    public double getIncome() {
        double income = 0;
        for (int i = 0; i < employees.size(); i++) {
            income += employees.get(i).getPosition().getSalaryForCompany();
        }
        return income;
    }

    public void hire(Employee employee) {
        employees.add(employee);
    }

    public void hireAll(List<Employee> toHire) {
        employees.addAll(toHire);
    }

    // удаление с начала и с конца списка
//    public void fire(double percent) {
//        int delete = (int)(employees.size()*percent/100);
//        for (int i = 0; i < delete/2; i++) {
//            employees.remove(0);
//            employees.remove(employees.size() - 1);
//        }
//        if (delete % 2 == 1) {
//            employees.remove(0);
//        }
//    }

    // рандомное удаление
    public void fire(double percent) {
        int delete = (int)(employees.size()*percent/100);
        for (int i = 0; i < delete; i++) {
            employees.remove((int)(Math.random() * (employees.size() - 1)));
        }
    }
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_7_8/Employee.java
```java
package practice_7_8;

public class Employee extends Company{

    private String firstName, secondName;
    private double baseSalary, salary;
    private EmployeePosition position;

    public Employee(String firstName, String secondName, double baseSalary, EmployeePosition position) {
        setFirstName(firstName);
        setSecondName(secondName);
        setBaseSalary(baseSalary);
        setPosition(position);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getSalary() {
        return position.calcSalary(baseSalary);
    }

    public EmployeePosition getPosition() {
        return position;
    }

    public void setPosition(EmployeePosition position) {
        this.position = position;
    }
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_7_8/EmployeePosition.java
```java
package practice_7_8;

public interface EmployeePosition {

    String getJobTitle();
    double calcSalary(double baseSalary);
    double getSalaryForCompany();
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_7_8/Main.java
```java
package practice_7_8;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	    Company company = new Company();
        List<Employee> arr = new ArrayList<>();

	    for (int i = 0; i < 180; i++) {
            String firstName = "Оператор";
            String secondName = String.valueOf(i);
            double baseSalary = Math.random() * 15000 + 30000;
            company.hire(new Employee(firstName, secondName, baseSalary, new Operator(company)));
        }
	    for (int i = 0; i < 80; i++) {
            String firstName = "Менеджер";
            String secondName = String.valueOf(i);
            double baseSalary = Math.random() * 10000 + 40000;
            company.hire(new Employee(firstName, secondName, baseSalary, new Manager(company)));
            //company.getEmployees().get(0).setPosition(new Operator(company));
        }
	    for (int i = 0; i < 10; i++) {
            String firstName = "ТопМенеджер";
            String secondName = String.valueOf(i);
            double baseSalary = Math.random() * 5000 + 50000;
            company.hire(new Employee(firstName, secondName, baseSalary, new TopManager(company)));
        }

        System.out.println("Список из 15 самых высоких зарплат (если пусто, то неправильное значение count)");
        arr = company.getTopSalaryStaff(15);
        for (int i = 0; i < arr.size(); i++) {
            System.out.printf("%.0f", arr.get(i).getSalary());
            System.out.println();
        }
        System.out.println("Список из 30 самых низких зарплат (если пусто, то неправильное значение count)");
        arr = company.getLowestSalaryStaff(30);
        for (int i = 0; i < arr.size(); i++) {
            System.out.printf("%.0f", arr.get(i).getSalary());
            System.out.println();
        }

        company.fire(50);

        System.out.println("Список из 15 самых высоких зарплат (если пусто, то неправильное значение count)");
        arr = company.getTopSalaryStaff(15);
        for (int i = 0; i < arr.size(); i++) {
            System.out.printf("%.0f", arr.get(i).getSalary());
            System.out.println();
        }
        System.out.println("Список из 30 самых низких зарплат (если пусто, то неправильное значение count)");
        arr = company.getLowestSalaryStaff(30);
        for (int i = 0; i < arr.size(); i++) {
            System.out.printf("%.0f", arr.get(i).getSalary());
            System.out.println();
        }
    }
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_7_8/Manager.java
```java
package practice_7_8;

public class Manager implements EmployeePosition {
    private Company comp;
    private double salaryForCompany = Math.random() * 25000 + 115000;

    public Manager(Company comp) {
        this.comp = comp;
    }

    @Override
    public String getJobTitle() {
        return "Manager";
    };

    @Override
    public double calcSalary(double baseSalary){
        return baseSalary + salaryForCompany * 0.05;
    };

    @Override
    public double getSalaryForCompany() {
        return salaryForCompany;
    }
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_7_8/Operator.java
```java
package practice_7_8;

public class Operator implements EmployeePosition {
    private Company comp;
    private double salaryForCompany = 0;

    public Operator(Company comp) {
        this.comp = comp;
    }

    @Override
    public String getJobTitle() {
        return "Operator";
    };

    @Override
    public double calcSalary(double baseSalary) {
        return baseSalary;
    };

    @Override
    public double getSalaryForCompany() {
        return salaryForCompany;
    }
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_7_8/TopManager.java
```java
package practice_7_8;

public class TopManager implements EmployeePosition {
    private Company comp;
    private double salaryForCompany = 0;

    public TopManager(Company comp) {
        this.comp = comp;
    }

    @Override
    public String getJobTitle() {
        return "TopManager";
    };

    @Override
    public double calcSalary(double baseSalary) {
        if (comp.getIncome() > Math.pow(10, 7)) {
            return 2.5 * baseSalary;
        }
        else {
            return baseSalary;
        }
    }

    @Override
    public double getSalaryForCompany() {
        return salaryForCompany;
    }
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_9/Company.java
```java
package practice_9;

import java.util.ArrayList;

public class Company {
    private final ArrayList<Employee> employees;

    public Company() {
        employees = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void fireEmployee(int index) {
        if (index < employees.size() && index >= 0) {
            employees.remove(index);
        }
    }

    public void doSomething(
            EmployeeSelector selector,
            EmployeeHandle handler
    ) {
        int count = 0;
        for (Employee employee : employees) {
            if (selector.isNeedEmployee(employee)) {
                handler.handleEmployee(employee, count);
            }
            count++;
        }
    }
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_9/Employee.java
```java
package practice_9;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Employee {
    private final String firstName;
    private final LocalDate date;
    private String secondName, town, phoneNumber;
    private int salary;

    public Employee(String firstName, String secondName, LocalDate date, String town, String phoneNumber, int salary) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.date = date;
        this.town = town;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "first_name='" + firstName + '\'' +
                ", second_name='" + secondName + '\'' +
                ", date=" + DateTimeFormatter.ofPattern("dd-MM-yyyy").format(date) +
                ", town=" + town +
                ", phoneNumber=" + phoneNumber +
                ", salary=" + salary +
                '}';
    }
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_9/EmployeeHandle.java
```java
package practice_9;

public interface EmployeeHandle {
    void handleEmployee(Employee employee, int index);
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_9/EmployeeSelector.java
```java
package practice_9;

public interface EmployeeSelector {
    boolean isNeedEmployee(Employee employee);
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_9/Main.java
```java
package practice_9;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Company company = new Company();
        String[] arrFirstName = {"Ivan", "Artem", "Anatoliy", "Egor", "Maksim", "Gleb", "Andrei", "Dmitriy", "Igor", "Matvey"};
        String[] arrSecondName = {"Filatov", "Gonets", "Dmitriev", "Gridasov", "Grevtsov", "Karvasarniy", "Pyrkin", "Karpov", "Chen", "Samokhin"};
        String[] arrTown = {"Moscow", "Tomsk", "Omsk", "Voronezh", "Volgograd", "Kazan", "Ryazan", "Kaluga", "Ufa", "Penza"};
        for (int i = 0; i < 100; i++) {
            String firstName = arrFirstName[(int)(Math.random()*10)];
            String secondName = arrSecondName[(int)(Math.random()*10)];
            LocalDate date = LocalDate.of(
                    (int)(Math.random() * 47 + 1955),
                    (int)(Math.random() * 11 + 1),
                    (int)(Math.random() * 28 + 1)
            );
            String town = arrTown[(int)(Math.random()*10)];
            String phoneNumber = "89" + ((int)(Math.random() * 9 * Math.pow(10, 8) + Math.pow(10, 8)));
            int salary = (int)(Math.random() * 80000 + 20000);
            company.addEmployee((new Employee(firstName, secondName, date, town, phoneNumber, salary)));
        }

        company.doSomething(
                new SalarySelector(66666, 77777),
                ((employee, index) -> System.out.println("^^^^^^^" + index + ": " + employee))
        );
        System.out.println();

        company.doSomething(new EmployeeSelector() {
            @Override
            public boolean isNeedEmployee(Employee employee) {
                return employee.getSalary() >= 66666
                        && employee.getSalary() <= 77777;
            }
        }, new EmployeeHandle() {
            @Override
            public void handleEmployee(Employee employee, int index) {
                System.out.println("*******" + index + ": " + employee);
            }
        });
        System.out.println();

        ArrayList<Employee> selection = new ArrayList<>();
        company.doSomething(
                employee -> employee.getSalary() >= 66666 && employee.getSalary() <= 77777,
                (employee, index) -> selection.add(employee)
        );
        for (int i = 0; i < selection.size(); i++) {
            System.out.println("-------" + i + ": " + selection.get(i));
        }
    }
}
```
##### C:/Users/Asus/IdeaProjects/RTU-MIREA_3/src/practice_9/SalarySelector.java
```java
package practice_9;

public class SalarySelector implements EmployeeSelector{

    private double salaryMin;
    private double salaryMax;

    public SalarySelector(double salaryMin, double salaryMax) {
        this.salaryMin = salaryMin;
        this.salaryMax = salaryMax;
    }

    @Override
    public boolean isNeedEmployee(Employee employee) {
        return employee.getSalary() >= salaryMin
                && employee.getSalary() <= salaryMax;
    }
}
```
