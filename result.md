###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\dop_task1\Main.java
```java
import java.util.Scanner;
public class Main {

        int N = in.nextInt();
        // через закономерность прибавления вариантов от количества сдачи
        for (int i = 1; i <= N; i++) {
                sum++;
            else if ((i-1) % 15 == 0 || (i-2) % 15 == 0 || (i-4) % 15 == 0 || (i-7) % 15 == 0) {
            }
                plus++;
            }
                sum += plus;
            System.out.println("N = " + i + ": sum = " + sum);
        //System.out.println("N = " + N + ": " + sum);

        int k1 = 1, k3 = 3, k5 = 5, count = 0;
            for (int j = 0; j <= N / 3; j++) {
                    if (i * k1 + j * k3 + k * k5 == N) {
                    }
            }
        System.out.println("N = " + N + ": " + count);
}
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\dop_task3\Main.java
```java


    static int k = 10;

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < k; i++){
            Thread thread = new Thread(() -> work(localI));
            threads.add(thread);
        for (Thread t : threads) {
        }
        System.out.println("total time: " + (endTime - startTime));
        for (int i = 0; i < k; i++) {
        }
    }
    private static void work(int i) {
        long result = doHardWork(i * 1000, 100_000_000, i);
        System.out.println(i + ": " + result + " | " + (endTime-startTime));

        long a = 0;
        for (int i = 0; i < count; i++) {
            b++;
        array[numberOfThread] += b;
    }
null
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_1\Main.java
```java

import java.util.Scanner;



        int sum = 0;
        // пункт 3, for
            sum += a[i];
        System.out.println(sum);
        // пункт 3, while
        sum = 0;
            sum += a[i];
        }

        i = 0;
        do {
            i++;
        System.out.println(sum);

        for (i = 0; i < args.length; i++) {
        }

        for (i = 1; i <= 10; i++) {
            System.out.print(" ");
        System.out.println();

        int size = (int) (Math.random() * 10) + 1;
        for (int z = 0; z < size; z++) {
        }
            for (int i2 = i1 + 1; i2 < size; i2++) {
                    int t = mat[i1];
                    mat[i2] = t;
            }

            System.out.print(mat[i] + " ");
        System.out.println();
        // пункт 6 Random
        size = r.nextInt(10) + 1;
        for (i = 0; i < size; i++) {
        }
            for (int i2 = i1 + 1; i2 < size; i2++) {
                    int t = mat[i1];
                    mat[i2] = t;
            }
        for (i = 0; i < size; i++) {
        }

        System.out.println();


    {
        for (int i = 1; i <= N; i++) {
        }
    }
null
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_10\Calculator.java
```java

import java.awt.*;
public class Calculator extends JFrame {
    JLabel labelB = new JLabel("Значение B");
    JTextField fieldA = new JTextField();
    JButton addition = new JButton("+");
    JButton division = new JButton("/");
    JPanel panel = new JPanel();

        setTitle("Calculator");

        labelB.setHorizontalAlignment(JLabel.CENTER);
        labelB.setFont(new Font("Calibri", Font.ITALIC, 20));

        fieldA.addCaretListener(action -> {
                double value = Double.parseDouble(fieldA.getText());
            } catch (Exception ex) {
            }

        fieldB.addCaretListener(action -> {
                double value = Double.parseDouble(fieldB.getText());
            } catch (Exception ex) {
            }

        addition.setPreferredSize(new Dimension(60,40));
            try {
                        String.format("%.4f", Double.parseDouble(fieldA.getText()) +
            }
                labelResult.setText("Результат: ошибка ввода!");
        });
        subtraction.setFont(new Font("", Font.BOLD, 22));
        subtraction.addActionListener(action -> {
                labelResult.setText("Результат: " +
                                Double.parseDouble(fieldB.getText())));
            catch (Exception ex) {
            }

        division.setPreferredSize(new Dimension(60,40));
            try {
                        String.format("%.4f", Double.parseDouble(fieldA.getText()) /
            }
                labelResult.setText("Результат: ошибка ввода!");
        });
        multiplication.setFont(new Font("", Font.BOLD, 22));
        multiplication.addActionListener(action -> {
                labelResult.setText("Результат: " +
                                Double.parseDouble(fieldB.getText())));
            catch (Exception ex) {
            }

        panelDop.add(subtraction);
        panelDop.add(multiplication);
        panel.setLayout(new GridLayout(6, 1));
        panel.add(fieldA);
        panel.add(labelB);
        panel.add(labelResult);

    }
null
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_10\Main.java
```java


    public static void main(String[] args) {
            Calculator calc = new Calculator();
        });
}
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_11\Main.java
```java

import java.util.concurrent.locks.ReentrantLock;

    static int sum;
    static AtomicInteger sumAtomic = new AtomicInteger();
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(() -> work(localI));
            threads.add(thread);
        for (Thread t : threads) {
        }
        System.out.println("total time: " + (endTime - startTime));
        //System.out.println("sum = " + sumAtomic);

        long startTime = System.currentTimeMillis();
        long endTime = System.currentTimeMillis();
    }
    private synchronized static long mathOperations(int start, int count) {
        //lock.lock();
            a += (start + i) * Math.abs(start - i) / Math.sqrt(start + i);
            //sumAtomic.incrementAndGet();
        //lock.unlock();
    }
null
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_12\ColorEnums.java
```java

    BLACK("\u001B[30m"),
    GREEN("\u001B[32m"),
    BLUE("\u001B[34m"),
    CYAN("\u001B[36m"),


        this.field = field;

        return field;
}
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_12\Main.java
```java



        colorWrite("Zdravstvuite", ColorEnums.BLACK);
        colorWrite("Hello", ColorEnums.GREEN);
        colorWrite("Aloha", ColorEnums.BLUE);
        colorWrite("Gamardjobat", ColorEnums.CYAN);
    }
    public static void colorWrite(String s, ColorEnums ce) {
    }
null
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_13\Gas.java
```java

    public double volume;
    public void addVolume(double volume) throws MyException {
            throw new MyException();
        this.volume += volume;

        return volume;

    public String toString() {
                "volume=" + volume +
    }
null
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_13\Main.java
```java


    public static void main(String[] args) {

            double volume = Double.parseDouble(new Scanner(System.in).nextLine());
            System.out.println("No exceptions");
        catch (MyException mex) {
        }
            System.out.println("Incorrect input format: string");
        finally {
        }
        throw new MyRuntimeException();
}
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_13\MyException.java
```java

}
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_13\MyRuntimeException.java
```java

}
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_14\Main.java
```java

import java.util.Map;
import java.util.regex.Matcher;

    public static void main(String[] args) {
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
        }
        //System.out.println(regex(rules, word));
    }
    private static String regex(Map<String, String> rules, String word) {
        for (int i = 0; i < rules.size(); i++) {
            if (i != rules.size() - 1) {
            }
        Matcher m = Pattern.compile(sb.toString()).matcher(word);
        //return m.replaceAll(x -> rules.get(x.group()));

        StringBuilder sb = new StringBuilder();
            int t = 0;
                if (i + rule.length() < word.length()) {
                    if (rule.equals(key)) {
                        t = 1;
                        break;
                }
            if (t==0) {
            }
        return sb;
}
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_15_16\Graph.java
```java

    private State S1 = new State();
    private State S3 = new State();
    private State S5 = new State();

        S1.setup(0, "create_project", S2);
        S2.setup(0, "test", S3);
        S3.setup(0, "drop_db", S4);
        S4.setup(0, "restart", S3);
        S5.setup(0, "deploy", S1);
    }
    public void work(int a) {
            if (currentState.getConnections().get(i) == a) {
                currentState = currentState.getPointers().get(a);
            }
    }
null
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_15_16\Main.java
```java



        Graph graph = new Graph();
        while (true) {
            if (a == -1) {
            }
        }
}
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_15_16\State.java
```java


    private ArrayList<Integer> connections = new ArrayList<>();
    private ArrayList<State> pointers = new ArrayList<>();
    public void setup(Integer connection, String instruction, State pointer) {
        instructions.add(instruction);
    }
    public ArrayList<Integer> getConnections() {
    }
    public ArrayList<String> getInstructions() {
    }
    public ArrayList<State> getPointers() {
    }
null
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_17_18\Main.java
```java

import java.nio.file.Path;

    static StringBuilder result = new StringBuilder();
        File file = new File(path);
            for(String t : file.list()) {
            }
        else {
                try(BufferedReader reader = new BufferedReader(new FileReader(file.getPath()))) {
                    while(reader.readLine() != null) {
                    }
                }
                    System.out.println("file not found");
                }
                    e.printStackTrace();
            }


    public static void main(String[] args) {
        search(basePath);
            writer.print(result);
        catch (FileNotFoundException ex) {
            ex.printStackTrace();
        catch (IOException e) {
        }
}
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_2\num1\Shape.java
```java

    private String name;

        setName(name);
    }
    public String getName() {
    }
    public void setName(String name) {
    }
    public double getArea() {
    }
    public void setArea(double area) {
    }
    public String toString() {
                ", area: " + getArea();
}
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_2\num1\TestShape.java
```java

    public static void main(String[] args) {
        System.out.println(shape);
}
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_2\num2\Ball.java
```java

    private double diameter, pressure;

        setDiameter(diameter);
        setMaterial(material);
    }
    public double getDiameter() {
    }
    public void setDiameter(double diameter) {
    }
    public double getPressure() {
    }
    public void setPressure(double pressure) {
    }
    public String getMaterial() {
    }
    public void setMaterial(String material) {
    }
    public String getColor() {
    }
    public void setColor(String color) {
    }
    public String toString() {
                ", pressure: " + getPressure() +
                ", color: " + getColor();
}
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_2\num2\TestBall.java
```java

    public static void main(String[] args) {
        System.out.println(ball);
}
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_2\num3\Book.java
```java

    private int pages, year;

        setName(name);
        setYear(year);
    }
    public int getPages() {
    }
    public void setPages(int pages) {
    }
    public int getYear() {
    }
    public void setYear(int year) {
    }
    public String getName() {
    }
    public void setName(String name) {
    }
    public String getAuthor() {
    }
    public void setAuthor(String author) {
    }
    public String toString() {
                ", author: " + getAuthor() +
                ", pages: " + getPages();
}
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_2\num3\TestBook.java
```java

    public static void main(String[] args) {
        System.out.println(book);
}
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_2\num4\Dog.java
```java

    private String name;

        setName(name);
    }
    public String getName() {
    }
    public int getAge() {
    }
    public void setName(String name) {
    }
    public void setAge(int age) {
    }
    public String toString() {
    }
    public void intoHumanAge() {
    }
null
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_2\num4\DogKennels.java
```java


    private ArrayList<Dog> kennels = new ArrayList<>();
    public void matrix(Dog a, Dog... args) {
            kennels.add(args[i]);
    }
    public ArrayList<Dog> getKennels() {
    }
null
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_2\num4\Main.java
```java

    public static void main(String[] args) {
        Dog dogFirst = new Dog("Шарик", 2);
        Dog dogThree = new Dog("Снежок", 1);
        System.out.println(array.getKennels().get(1));
    }
null
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_3\num1\Circle.java
```java

    private double radius;
    public Circle(double radius) {
    }
    public void setRadius(double radius) {
    }
    public double getRadius() {
    }
null
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_3\num1\CircleTest.java
```java

    public static void main(String[] args) {
        System.out.println("radius: " + circle.getRadius());
}
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_3\num2\Hand.java
```java

    private double sizeOfHand;
    public Hand() {};
    public double getSizeOfHand() {
    }
    public void setSizeOfHand(double sizeOfHand) {
    }
    public String toString() {
    }
null
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_3\num2\Head.java
```java

    private double sizeOfHead;
    public Head() {};
    public double getSizeOfHead() {
    }
    public void setSizeOfHead(double sizeOfHead) {
    }
    public String toString() {
    }
null
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_3\num2\Human.java
```java

    private String name;
    Head head = new Head();
    Hand handRight = new Hand();
    Leg legRight = new Leg();
    public Human(String name, int age, int height, int weight, double sizeOfHead, double sizeOfHand, double sizeOfLeg) {
        setAge(age);
        setWeight(weight);
        handLeft.setSizeOfHand(sizeOfHand);
        legLeft.setSizeOfLeg(sizeOfLeg);
    }
    public String getName() {
    }
    public void setName(String name) {
    }
    public int getAge() {
    }
    public void setAge(int age) {
    }
    public int getHeight() {
    }
    public void setHeight(int height) {
    }
    public int getWeight() {
    }
    public void setWeight(int weight) {
    }
    public String toString() {
                "\nage: " + getAge() +
                "\nweight: " + getWeight() +
                "\nleft hand: " + handLeft.getSizeOfHand() +
                "\nleft leg: " + legLeft.getSizeOfLeg() +
    }
null
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_3\num2\HumanTest.java
```java

    public static void main(String[] args) {
        System.out.println(human);
        System.out.println(human.legRight.getSizeOfLeg());
}
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_3\num2\Leg.java
```java

    private double sizeOfLeg;
    public Leg() {};
    public double getSizeOfLeg() {
    }
    public void setSizeOfLeg(double sizeOfLeg) {
    }
    public String toString() {
    }
null
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_3\num3\Book.java
```java

    private String author, name, publishingHouse;

        setName(name);
        setYear(year);
        setPublishingHouse(publishingHouse);

        return author;

        this.author = author;

        return name;

        this.name = name;

        return publishingHouse;

        this.publishingHouse = publishingHouse;

        return pages;

        this.pages = pages;

        return year;

        this.year = year;

        return "Название: " + getName() +
                "\nГод написания: " + getYear() +
                "\nИздательство: " + getPublishingHouse();
}
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_3\num3\BookTest.java
```java

    public static void main(String[] args) {
        System.out.println(book);
}
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_4\Circle.java
```java

    protected double radius;
    public Circle() {
    }
    public Circle(double radius) {
        setRadius(radius);

        super(color, filled);
    }
    public double getRadius() {
    }
    public void setRadius(double radius) {
    }
    public double getArea() {
    }
    public double getPerimeter() {
    }
    public String toString() {
                ", area = " + getArea() +
                ", color = " + getColor() +
    }
null
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_4\Main.java
```java

    public static void main(String[] args) {
        System.out.println(shape);
        Circle circle = (Circle)shape;
        circle.setColor("red");
        System.out.println(circle);
        Rectangle rectangle = new Rectangle(3.0, 1.5);

        System.out.println(square);
}
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_4\Rectangle.java
```java

    protected double width;

        this(1, 1);

        super();
        setLength(length);

        super(color, filled);
        setLength(length);

        return width;

        this.width = width;

        return length;

        this.length = length;

        return width * length;

        return 2 * (width + length);

        return "Rectangle: width = " + getWidth() +
                ", area = " + getArea() +
                ", color = " + getColor() +
    }
null
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_4\Shape.java
```java

    protected String color;

        this("white", true);

        setColor(color);
    }
    public String getColor() {
    }
    public void setColor(String color) {
    }
    public boolean isFilled() {
    }
    public void setFilled(boolean filled) {
    }
    abstract public double getArea();
    abstract public String toString();
null
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_4\Square.java
```java



        this(1);
    public Square(double side) {
        setSide(side);

        super(color, filled);
    }
    public double getSide() {
    }
    public void setSide(double side) {
    }
    public double getArea() {
    }
    public double getPerimeter() {
    }

        return "Square: side = " + getSide() +
                ", perimeter = " + getPerimeter() +
                ", filled = " + isFilled();
}
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_5\Circle.java
```java

    private double radius;
    public Circle() {
    }
    public Circle(double radius) {
        setRadius(radius);

        super(color, filled);
    }
    public double getRadius() {
    }
    public void setRadius(double radius) {
    }
    public double getArea() {
    }
    public double getPerimeter() {
    }
    public String toString() {
                ", area = " + getArea() +
                ", color = " + getColor() +
    }
null
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_5\Main.java
```java


        MovablePoint point = new MovablePoint(2, 3);
        point.move(4, -5);

        System.out.println(circle);
        System.out.println(circle);
        circle.setCenter(1, 1);

        System.out.println(rectangle);
        System.out.println(rectangle);
        System.out.println(rectangle);
        System.out.println(rectangle);
}
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_5\Movable.java
```java


}
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_5\MovableCircle.java
```java

    private MovablePoint center;
    public MovableCircle(double x, double y, double radius) {
        setRadius(radius);

        return center;

        center.setX(x);
    }
    public String toString() {
                ", radius = " + getRadius();

        center.move(xSpeed, ySpeed);
}
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_5\MovablePoint.java
```java

    private double x, y;
    public MovablePoint(double x, double y) {
        setY(y);

        return x;

        this.x = x;

        return y;

        this.y = y;

        return "point (" + x +
    }
    public void move(double xSpeed, double ySpeed) {
        y += ySpeed;
}
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_5\MovableRectangle.java
```java

    private MovablePoint leftUp;

        this.leftUp = new MovablePoint(x1, y1);
        super.setWidth(Math.abs(x1-x2));
    }
    public MovablePoint getLeftUp() {
    }
    public void setLeftUp(double x, double y) {
        leftUp.setY(y);
        super.setLength(Math.abs(y - rightDown.getY()));

        return rightDown;

        rightDown.setX(x);
        super.setWidth(Math.abs(x - leftUp.getX()));
    }
    public void setWidth(double width) {
        if (leftUp.getX()<rightDown.getX()) {
            rightDown.setX(rightDown.getX() + Math.abs(width - widthDop) / 2);
        else {
            rightDown.setX(rightDown.getX() - Math.abs(width - widthDop) / 2);
        super.setWidth(width);

        double lengthDop = getLength();
            leftUp.setY(leftUp.getY() - Math.abs(length - lengthDop) / 2);
        }
            leftUp.setY(leftUp.getY() + Math.abs(length - lengthDop) / 2);
        }
    }
    public void move(double xSpeed, double ySpeed) {
        rightDown.move(xSpeed, ySpeed);

        return "rectangle: LeftUp (" + leftUp.getX() +
                "), RightDown (" + rightDown.getX() +
                "), width = " + getWidth() +
    }
null
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_5\Rectangle.java
```java

    private double width = 1;


        super();
        setLength(length);

        super(color, filled);
        setLength(length);

        return width;

        this.width = width;

        return length;

        this.length = length;

        return width * length;

        return 2 * (width + length);

        return "Rectangle: width = " + getWidth() +
                ", area = " + getArea() +
                ", color = " + getColor() +
    }
null
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_5\Shape.java
```java

    private String color;

        this("white", true);

        setColor(color);
    }
    public String getColor() {
    }
    public void setColor(String color) {
    }
    public boolean isFilled() {
    }
    public void setFilled(boolean filled) {
    }
    abstract public double getArea();
    abstract public String toString();
null
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_6\Main.java
```java

import java.util.Random;
public class Main {
        Scanner in = new Scanner(System.in);
        int[][] area = new int[N][N];
            for (int j = 0; j < N; j++) {
                //area[i][j] = (int)(Math.random() * 20 - 10);
        }
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < N; j++) {
//            }
//        }
        for (int i = 0; i < N; i++) {
                if (i == 0 && j != 0) {
                }
                    area[i][j] += area[i-1][j];
                else if (i != 0 && j != 0) {
                        area[i][j] += area[i][j-1];
                    else {
                    }
            }
        System.out.println(area[N-1][N-1]);
}
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_7_8\Company.java
```java




        return employees;

        this.employees = employees;

        Collections.sort(employees, new Comparator<Employee>() {
            public int compare(Employee o1, Employee o2) {
            }
        List<Employee> TopSalaryStaff = new ArrayList<>();
            if (count >= 1) {
                    TopSalaryStaff.add(employees.get(i));
            }
        else {
                TopSalaryStaff.add(employees.get(i));
        }
    }
    public List<Employee> getLowestSalaryStaff(int count) {
            @Override
                return (int)(o1.getSalary() - o2.getSalary());
        });
        if (count <= employees.size()) {
                for (int i = 0; i < count; i++) {
                }
        }
            for (int i = 0; i < employees.size(); i++) {
            }
        return TopSalaryStaff;

        double income = 0;
            income += employees.get(i).getPosition().getSalaryForCompany();
        return income;

        employees.add(employee);

        employees.addAll(toHire);

//    public void fire(double percent) {
//        for (int i = 0; i < delete/2; i++) {
//            employees.remove(employees.size() - 1);
//        if (delete % 2 == 1) {
//        }

    public void fire(double percent) {
        for (int i = 0; i < delete; i++) {
        }
}
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_7_8\Employee.java
```java


    private double baseSalary, salary;

        setFirstName(firstName);
        setBaseSalary(baseSalary);
    }
    public String getFirstName() {
    }
    public void setFirstName(String firstName) {
    }
    public String getSecondName() {
    }
    public void setSecondName(String secondName) {
    }
    public double getBaseSalary() {
    }
    public void setBaseSalary(double baseSalary) {
    }
    public double getSalary() {
    }
    public EmployeePosition getPosition() {
    }
    public void setPosition(EmployeePosition position) {
    }
null
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_7_8\EmployeePosition.java
```java


    double calcSalary(double baseSalary);
}
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_7_8\Main.java
```java



        Scanner in = new Scanner(System.in);
        List<Employee> arr = new ArrayList<>();
	    for (int i = 0; i < 180; i++) {
            String secondName = String.valueOf(i);
            company.hire(new Employee(firstName, secondName, baseSalary, new Operator(company)));
	    for (int i = 0; i < 80; i++) {
            String secondName = String.valueOf(i);
            company.hire(new Employee(firstName, secondName, baseSalary, new Manager(company)));
        }
            String firstName = "ТопМенеджер";
            double baseSalary = Math.random() * 5000 + 50000;
        }
        System.out.println("Список из 15 самых высоких зарплат (если пусто, то неправильное значение count)");
        for (int i = 0; i < arr.size(); i++) {
            System.out.println();
        System.out.println("Список из 30 самых низких зарплат (если пусто, то неправильное значение count)");
        for (int i = 0; i < arr.size(); i++) {
            System.out.println();


        arr = company.getTopSalaryStaff(15);
            System.out.printf("%.0f", arr.get(i).getSalary());
        }
        arr = company.getLowestSalaryStaff(30);
            System.out.printf("%.0f", arr.get(i).getSalary());
        }
}
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_7_8\Manager.java
```java

    private Company comp;

        this.comp = comp;

    public String getJobTitle() {
    };
    @Override
        return baseSalary + salaryForCompany * 0.05;

    public double getSalaryForCompany() {
    }
null
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_7_8\Operator.java
```java

    private Company comp;

        this.comp = comp;

    public String getJobTitle() {
    };
    @Override
        return baseSalary;

    public double getSalaryForCompany() {
    }
null
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_7_8\TopManager.java
```java

    private Company comp;

        this.comp = comp;

    public String getJobTitle() {
    };
    @Override
        if (comp.getIncome() > Math.pow(10, 7)) {
        }
            return baseSalary;
    }
    @Override
        return salaryForCompany;
}
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_9\Company.java
```java


    private final ArrayList<Employee> employees;
    public Company() {
    }
    public ArrayList<Employee> getEmployees() {
    }
    public void addEmployee(Employee employee) {
    }
    public void fireEmployee(int index) {
            employees.remove(index);
    }
    public void doSomething(
            EmployeeHandle handler
        int count = 0;
            if (selector.isNeedEmployee(employee)) {
            }
        }
}
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_9\Employee.java
```java

import java.time.format.DateTimeFormatter;
public class Employee {
    private final LocalDate date;
    private int salary;
    public Employee(String firstName, String secondName, LocalDate date, String town, String phoneNumber, int salary) {
        this.secondName = secondName;
        this.town = town;
        this.salary = salary;

        return firstName;

        return date;

        return secondName;

        this.secondName = secondName;

        return town;

        this.town = town;

        return phoneNumber;

        this.phoneNumber = phoneNumber;

        return salary;

        this.salary = salary;

    public String toString() {
                "first_name='" + firstName + '\'' +
                ", date=" + DateTimeFormatter.ofPattern("dd-MM-yyyy").format(date) +
                ", phoneNumber=" + phoneNumber +
                '}';
}
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_9\EmployeeHandle.java
```java

    void handleEmployee(Employee employee, int index);
null
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_9\EmployeeSelector.java
```java

    boolean isNeedEmployee(Employee employee);
null
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_9\Main.java
```java

import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        String[] arrFirstName = {"Ivan", "Artem", "Anatoliy", "Egor", "Maksim", "Gleb", "Andrei", "Dmitriy", "Igor", "Matvey"};
        String[] arrTown = {"Moscow", "Tomsk", "Omsk", "Voronezh", "Volgograd", "Kazan", "Ryazan", "Kaluga", "Ufa", "Penza"};
            String firstName = arrFirstName[(int)(Math.random()*10)];
            LocalDate date = LocalDate.of(
                    (int)(Math.random() * 11 + 1),
            );
            String phoneNumber = "89" + ((int)(Math.random() * 9 * Math.pow(10, 8) + Math.pow(10, 8)));
            company.addEmployee((new Employee(firstName, secondName, date, town, phoneNumber, salary)));

                new SalarySelector(66666, 77777),
        );

            @Override
                return employee.getSalary() >= 66666
            }
            @Override
                System.out.println("*******" + index + ": " + employee);
        });

        company.doSomething(
                (employee, index) -> selection.add(employee)
        for (int i = 0; i < selection.size(); i++) {
        }
}
```
###C:\Users\Asus\IdeaProjects\RTU-MIREA_3\src\practice_9\SalarySelector.java
```java


    private double salaryMax;
    public SalarySelector(double salaryMin, double salaryMax) {
        this.salaryMax = salaryMax;

    public boolean isNeedEmployee(Employee employee) {
                && employee.getSalary() <= salaryMax;
}
```
