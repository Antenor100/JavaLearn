package br.com.devantenor.java8;

import javax.script.*;

public class JavaNashorn {
    public static void tests() {
        System.out.println("The Nashorn javascript has setted with deprecated on java 11 and removed on java 15!!!");
        System.out.println("For example, a dependency was imported into the project(org.graalvm.js)");
        System.out.println("For run js codes on prompt, use the jjs comamand and put your js code in sequence!!!");

        ScriptEngine se = new ScriptEngineManager().getEngineByName("JavaScript");

        Bindings b = se.getBindings(ScriptContext.ENGINE_SCOPE);
        b.put("javaVersion", System.getProperty("java.version"));


        String jsCommand = "var javaVersion; print('Hello world! I print this JS code from java ' + javaVersion);";
        System.out.println("JS code to be runned: " + jsCommand);

        try {
            se.eval(jsCommand);
        } catch (ScriptException e) {
            throw new RuntimeException(e);
        }
    }
}
