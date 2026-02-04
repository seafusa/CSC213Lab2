# Lab 2 - Compiling and Working with Java

**Author**: Justin Del Vecchio

**Edited by**: Jon Mrowczynski

This lab reinforces and/or introduces the following:

1. Compiling a Java program.
2. Looking at a compiler's output.
3. Looking at compiler options.
4. Using the `Math` library.
5. Using the Java API `math` package.

If you are unable to finish these tasks in the allotted time, you should install [VS Code](https://code.visualstudio.com/download)
and [Java 21](https://www.oracle.com/java/technologies/downloads/#java21) on your personal computer to finish them.

Perform the steps below and answer the questions as you go. Each question is worth 1 point unless stated otherwise.

## Part 1 (5pts.): Compiling a Java program | Looking at a compiler's output | Looking at compiler options

Perform the following steps to compile a Java program.

1. Login to a lab machine.
2. Open VS Code and its integrated terminal.
3. Create a Java source file named `Lab2.java`.
4. Create a class and add a main method to it.
5. Have this method print out **exactly** "Welcome to Lab 2!", with a newline, to the console. 
6. Compile the program with `javac` and ensure it compiles successfully!
7. Run the program using `java` to ensure it works.
    - You can run a compiled `.class` file, by executing the command `java NameOfClass`. Notice no `.class` or `.java` extension!

You used the java compiler to compile the program. There are many compile options (or flags). You can see all these options by entering in: `javac --help`.

### Q1 (2pts.): Recompile the program you created using the `-verbose` flag. Copy and paste the resulting compilation output below, explain what the `-verbose` flag does, and the meaning of the output.

Means to show me what is happening

[parsing started SimpleFileObject[C:\Users\ahmed\Downloads\compsci\sem4\IdeaProjects\CSC213Lab2\Lab2.java]]
[parsing completed 18ms]
[loading /modules/java.base/module-info.class]
[loading /modules/jdk.naming.dns/module-info.class]
[loading /modules/java.transaction.xa/module-info.class]
[loading /modules/jdk.zipfs/module-info.class]
[loading /modules/jdk.jconsole/module-info.class]
[loading /modules/jdk.dynalink/module-info.class]
[loading /modules/jdk.crypto.mscapi/module-info.class]
[loading /modules/java.sql.rowset/module-info.class]
[loading /modules/jdk.graal.compiler/module-info.class]
[loading /modules/java.security.jgss/module-info.class]
[loading /modules/jdk.jdwp.agent/module-info.class]
[loading /modules/java.desktop/module-info.class]
[loading /modules/java.smartcardio/module-info.class]
[loading /modules/jdk.management.agent/module-info.class]
[loading /modules/jdk.charsets/module-info.class]
[loading /modules/java.xml.crypto/module-info.class]
[loading /modules/java.management.rmi/module-info.class]
[loading /modules/jdk.internal.ed/module-info.class]
[loading /modules/jdk.incubator.vector/module-info.class]
[loading /modules/jdk.sctp/module-info.class]
[loading /modules/jdk.crypto.ec/module-info.class]
[loading /modules/jdk.attach/module-info.class]
[loading /modules/java.xml/module-info.class]
[loading /modules/jdk.management/module-info.class]
[loading /modules/jdk.jdeps/module-info.class]
[loading /modules/jdk.net/module-info.class]
[loading /modules/jdk.jartool/module-info.class]
[loading /modules/java.naming/module-info.class]
[loading /modules/jdk.nio.mapmode/module-info.class]
[loading /modules/java.datatransfer/module-info.class]
[loading /modules/java.rmi/module-info.class]
[loading /modules/jdk.internal.jvmstat/module-info.class]
[loading /modules/jdk.jcmd/module-info.class]
[loading /modules/jdk.internal.opt/module-info.class]
[loading /modules/java.instrument/module-info.class]
[loading /modules/jdk.jpackage/module-info.class]
[loading /modules/jdk.unsupported/module-info.class]
[loading /modules/java.net.http/module-info.class]
[loading /modules/jdk.internal.md/module-info.class]
[loading /modules/jdk.compiler/module-info.class]
[loading /modules/java.sql/module-info.class]
[loading /modules/jdk.security.jgss/module-info.class]
[loading /modules/java.security.sasl/module-info.class]
[loading /modules/jdk.jsobject/module-info.class]
[loading /modules/java.management/module-info.class]
[loading /modules/jdk.hotspot.agent/module-info.class]
[loading /modules/jdk.management.jfr/module-info.class]
[loading /modules/java.logging/module-info.class]
[loading /modules/jdk.unsupported.desktop/module-info.class]
[loading /modules/java.prefs/module-info.class]
[loading /modules/jdk.jshell/module-info.class]
[loading /modules/jdk.security.auth/module-info.class]
[loading /modules/jdk.naming.rmi/module-info.class]
[loading /modules/jdk.jlink/module-info.class]
[loading /modules/jdk.graal.compiler.management/module-info.class]
[loading /modules/jdk.jdi/module-info.class]
[loading /modules/jdk.jstatd/module-info.class]
[loading /modules/jdk.xml.dom/module-info.class]
[loading /modules/jdk.httpserver/module-info.class]
[loading /modules/java.se/module-info.class]
[loading /modules/jdk.editpad/module-info.class]
[loading /modules/jdk.javadoc/module-info.class]
[loading /modules/jdk.accessibility/module-info.class]
[loading /modules/jdk.internal.vm.ci/module-info.class]
[loading /modules/jdk.jfr/module-info.class]
[loading /modules/jdk.internal.le/module-info.class]
[loading /modules/jdk.crypto.cryptoki/module-info.class]
[loading /modules/jdk.localedata/module-info.class]
[loading /modules/java.scripting/module-info.class]
[loading /modules/java.compiler/module-info.class]
[search path for source files: .]
[search path for class files: C:\Users\ahmed\Downloads\compsci\sem4\First_time_java\oracleJdk-25\lib\modules,.]
[loading /modules/java.base/java/lang/Object.class]
[loading /modules/java.base/java/lang/String.class]
[loading /modules/java.base/java/lang/Exception.class]
[loading /modules/java.base/java/lang/Deprecated.class]
[loading /modules/java.base/java/lang/annotation/Retention.class]
[loading /modules/java.base/java/lang/annotation/RetentionPolicy.class]
[loading /modules/java.base/java/lang/annotation/Target.class]
[loading /modules/java.base/java/lang/annotation/ElementType.class]
[checking Lab2]
[loading /modules/java.base/java/io/Serializable.class]
[loading /modules/java.base/java/lang/AutoCloseable.class]
[loading /modules/java.base/java/lang/Throwable.class]
[loading /modules/java.base/java/lang/System.class]
[loading /modules/java.base/java/io/PrintStream.class]
[loading /modules/java.base/java/lang/Appendable.class]
[loading /modules/java.base/java/io/Closeable.class]
[loading /modules/java.base/java/io/FilterOutputStream.class]
[loading /modules/java.base/java/io/OutputStream.class]
[loading /modules/java.base/java/io/Flushable.class]
[loading /modules/java.base/java/lang/Comparable.class]
[loading /modules/java.base/java/lang/CharSequence.class]
[loading /modules/java.base/java/lang/constant/Constable.class]
[loading /modules/java.base/java/lang/constant/ConstantDesc.class]
[wrote Lab2.class]
[total 322ms]

### Q2: What is the name of the *type* of file generated by the `javac` compilation process?

Class file 

### Q3: Copy the *compiled* Java source file, rename it to some other valid file name, like `whatever.class`, and run it with the `java` command. Why does it not work?

It is not the correct class name so it is not matching it up. 

## Part 2 (3pts.): Using the `Math` **Library**

Leave the existing code in the file and add the requested functionality to it:

1. Open the `Math` Java API page found
   [here](https://docs.oracle.com/en/java/javase/21/docs/api//java.base/java/lang/Math.html).
2. Call a function in the `Math` class that can help you calculate log(0). 
    - **Hint**: The `Math` class is called statically meaning that you do not have to instantiate an object.
3. Store the result in a variable.
4. Print out the variable to the console.
5. Run the program.
    - You could either use the process [explained in Part 1](#part-1-compiling-a-java-program--looking-at-a-compilers-output--looking-at-compiler-options), or...
    - You can directly run **single-source** Java files and skip the explicit compilation process using the command `java FileNameWithMainMethod.java`.

### Q4: What value does the program output for log(0)?

-Infinity 

## Part 3 (9pts.): Using the Java API `math` **Package**.

Leave the existing code in the file and add the requested functionality to it:

1. Import the `math` package by adding this line to the top of your file:
```java
import java.math.*;
```
2. Create 2 separate integer variables and make both of their values 2,000,000,000.
3. Add these 2 numbers together and store them in a 3rd variable.
4. Print out the summed value.
5. Next, create 2 instances of the class `BigInteger` and make each instance have a value of 2,000,000,000.
6. Add these 2 `BigInteger`s together.
    - **Hint**: You need to do an object assignment here!
7. Print out their summed value.

### Q5 (2pts.): What is the value of the summed primitive `int`s? Explain why the value is either correct or incorrect.

1651507200, Incorrect memory overflow 

### Q6 (2pts.): What is the value for the summed `BigInteger` objects? Explain why the value is either correct or incorrect.

4000000000, Correct as it was able to add them correctly

### Q7 (2pts.): Why is it the case that there is no `BigShort` or `BigLong`?

Those two classes already account for this dilemma thus there is no need for them to e "Big"

### Q8: Upload this file and your Java source code to the corresponding D2L dropbox.

[Perform steps on D2L]
