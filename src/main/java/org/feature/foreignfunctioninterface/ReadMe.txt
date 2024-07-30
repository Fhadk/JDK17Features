An FFI allows a high-level programming language like Java to interact with functions or libraries
written in lower-level languages like C or C++. Java has the Java Native Interface (JNI) for this
purpose. JNI allows Java applications to call and be called by native applications and libraries.
With JNI, you can load and invoke functions in dynamic link libraries (DLLs) or shared object files
(SOs) written in languages like C or C++.

Here's a basic overview of using JNI in Java:

    Write a Java class that contains native method declarations, specifying the native keyword.
    Implement these native methods in C or C++ and compile
    (gcc -shared -o libNativeSum.so -I$JAVA_HOME/include -I$JAVA_HOME/include/linux NativeSum.c)
    them into a shared library. Use the System.loadLibrary or System.load method in Java to load
    the shared library. Call the native methods from your Java code.