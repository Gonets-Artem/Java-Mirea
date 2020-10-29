package com.company;

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