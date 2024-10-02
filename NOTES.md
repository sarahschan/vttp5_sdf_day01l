# Compilation Instructions


# Compiling Instructions
    javac fileName

    //to compile
    javac --source-path myapp -d bin myapp/*
        - Means that I want to take everything in the myapp folder, compile it, and put it into the bin myapp/* folder
        - source-path is myapp
    //to run
    java -cp bin myapp.HelloWorld
        - cp: class path