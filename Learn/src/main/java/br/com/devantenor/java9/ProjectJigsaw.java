package br.com.devantenor.java9;

import br.com.devantenor.goodbye.GoodBye;
import br.com.devantenor.helloworld.HelloWorld;

public class ProjectJigsaw {
    public static void tests() {
        System.out.println("In java 9 the project Jigsaw (exists since java 7) is implemented. Basically this can " +
                "provide a module control for java. We can use module-info.java files to specify which module " +
                "needs to be exposed or not.");

        HelloWorld.say();
        GoodBye.say();

        System.out.println("For more tests try see and edit the module-info.java files (on modules Learn and " +
                "TestModule) and recompile the project");
    }
}
