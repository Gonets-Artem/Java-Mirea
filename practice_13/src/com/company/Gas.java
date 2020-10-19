package com.company;

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
