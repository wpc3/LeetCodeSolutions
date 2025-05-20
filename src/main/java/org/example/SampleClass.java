package org.example;

import java.util.Objects;

public class SampleClass {
    public int a;
    public boolean b;

    @Override
    public String toString() {
        return "SampleClass{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SampleClass that = (SampleClass) o;
        return a == that.a && b == that.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

}
