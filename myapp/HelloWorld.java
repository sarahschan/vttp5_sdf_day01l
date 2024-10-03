package myapp;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        
        //INITIALIZE CONSOLE
        Console console = System.console();


        // String name = console.readLine("What is your name?");
        // if (name.length() > 0) {
        //     System.out.printf("Hello %s, pleased to meet you. \n", name);
        // } else {
        //     System.err.println("You have not told me your name");
        // }
        

        // String sport = console.readLine("What is your favourite sport?");
        // if (sport.toUpperCase().equals("SWIMMING")){
        //     System.out.println("That's a nice water sport!");
        // } else if (sport.toUpperCase().equals("SOCCER")) {
        //     System.out.println("That's a great ball sport!");
        // } else {
        //     System.out.println("I am not sure about that sport");
        // }


        // String replaceName = name.replace('a', 'e');
        // System.out.printf("Your new name is %s \n", replaceName);


        // String valueString = console.readLine("Enter your score, between 0 to 100");
        // Integer score = Integer.parseInt(valueString);

        // switch (score) {
        //     case 100:
        //         System.out.println("You got a perfect score!");
        //         break;
        
        //     default:
        //         System.out.println("Score recorded");
        //         break;
        // }


        // // WHILE LOOP (evaluates condition first, then outputs. Possible to have no outputs)
        // int i = 0;
        // while (i < score){
        //     System.out.print(i + ", ");
        //     i++;
        // }

        // // DO WHILE LOOP (outputs first, then evaluates. Will have at least one output)
        // do {
        //     System.out.println(i + ", ");
        //     i++;
        // } while (i < score);


        // // ARRAYS
        // String[] todo = new String[5];

        // for (int n = 0; n < todo.length; n++) {
        //     String task = console.readLine("Enter task %d:", (n+1));
        //     todo[i] = task;
        // }

        // for (int n = 0; n < todo.length; n++) {
        //     System.out.println("Task " + (n+1) + ": " + todo[i]);
        // }

        // if (args.length > 0) {
        //     String[] names = new String[5];

        //     int x = 0;
        //     while (x < args.length) {
        //         names[x] = args [x];
        //         x++;

        //         if (x > 4) {
        //             break;
        //         }
        //     }

        //     for (int y = 0; y < names.length; y++){
        //         System.out.printf("Name %d: %s\n", y+1, names[y]);
        //     };


        // } else {
        //     System.out.println("No arguments passed");
        // }

        // List<String> names = new ArrayList<String>();

        // String input = "";
        // do {
        //     input = console.readLine("Enter a name, or type quit - ");
        //     if (!input.equals("quit")) {
        //         names.add(input);
        //     }

        // } while (!input.equals("quit"));

        // for(String name : names) {
        //     System.out.println(name);
        // }

        
        List<String> words = new ArrayList<>(); // No need to put ArrayList<String> because it will conform to the declaration of List<String>

        String keyboardInput = "";

        keyboardInput = console.readLine("Enter a sentence: ");
        Scanner scan = new Scanner(keyboardInput);

        while (scan.hasNext()){
            words.add(scan.next());
        }

        scan.close();

        for (int z = 0; z < words.size(); z++) {
            System.out.printf("%d : %s \r\n", (z+1), words.get(z));
        }

        for (String word : words.keySet()) {
            System.out.printf();
        }





    }
}


// TO COMPILE
// javac --source-path myapp -d bin myapp/*
//      > source-path : myapp
//      > destination (-d) : bin
//      > compile everything ( /* ) in the myapp folder
//
// javac --source-path myapp -d bin myapp/*.java
//      > compile everything in myapp folder with the file type .java
//
//
// TO RUN
// java -cp bin myapp.HelloWorld
//      > class path (cp) : bin
//      > Note that myapp has to be included, because it is in the package
//          If myapp wasn't in the package then just HelloWorld is fine