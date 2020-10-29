package com.company;

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