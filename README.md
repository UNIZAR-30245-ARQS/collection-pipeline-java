# Collection pipeline in Java
It requires Java 8 (it will not work in previous versions). Java 8 docs call pipeline to a [sequence of aggregate operations](http://docs.oracle.com/javase/tutorial/collections/streams/). You can check the available operations at the [Stream interface documentation](http://docs.oracle.com/javase/8/docs/api/java/util/stream/Stream.html).

## Use (console)
Open a console in the directory and run `$ ./gradlew --quiet run` to compile and run the example (the --quiet is to prevent Gradle from writin so the output of the program is clearer).

## Architecture
A UML sequence diagram of the example.
![UML sequence diagram](https://rbejar.github.io/images/arqs_collpipeline_Java.png)
