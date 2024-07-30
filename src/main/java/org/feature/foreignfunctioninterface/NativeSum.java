package org.feature.foreignfunctioninterface;

public class NativeSum {
    // Load the shared library containing the native function
    static {
        System.loadLibrary("NativeSum");
    }

    // Declare the native method to add two integers
    public native boolean add(int a, int b);
}
