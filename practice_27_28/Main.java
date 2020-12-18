package practice_27_28;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException, InvocationTargetException, IllegalAccessException {
        Worker worker = new Worker();
        Gson gson = new Gson();
        Type ReflectionTaskType = new TypeToken<ArrayList<ReflectionTask>>(){
        }.getType();
        Class<? extends Worker> workerClass = worker.getClass();
        List<Method> declaredMethods = Arrays.stream(workerClass.getDeclaredMethods())
                .filter(m -> Arrays.stream(m.getAnnotations()).anyMatch(a -> a instanceof MyAnnotation))
                .collect(Collectors.toList());
        ArrayList<ReflectionTask> reflectionTasks = gson.fromJson(Worker.getReflectionTasks(), ReflectionTaskType);
        for (ReflectionTask reflectionTask : reflectionTasks) {
            for (Method declaredMethod : declaredMethods) {
                MyAnnotation operation = declaredMethod.getAnnotation(MyAnnotation.class);
                if (reflectionTask.getType().equals(operation.title())) {
                    System.out.print(operation.title() + ": ");
                    declaredMethod.invoke(worker, reflectionTask.getData());
                }
            }
        }
    }
}
