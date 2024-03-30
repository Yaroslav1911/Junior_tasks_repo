package org.example.reflection;

import java.io.File;
import java.lang.reflect.Field;

public class ReflectionTesting {
    public static void main(String[] args) throws ReflectiveOperationException {
        IAmTheBlock block = new IAmTheBlock("I am unreachable", 666);

        System.out.println(block.imFree() + "\n");

        Field[] fields =  block.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        } System.out.println();

        System.out.println(block.getText() + " " + block.getNum());
        for (Field field : fields) {
            if(field.getName().equalsIgnoreCase("text")) {
                field.setAccessible(true);
                field.set(block, "No you aren't");
            }
            if (field.getName().equalsIgnoreCase("num")) {
                field.setAccessible(true);
                field.set(block, 13);
            }
        }
        System.out.println(block.getText() + " " + block.getNum());
        System.out.println();

        var inner = block.getClass().getDeclaringClass();

        for (Field field : inner.getDeclaredFields()) {
            System.out.println(field.getName());
        }


//        Method[] methods = block.getClass().getDeclaredMethods();
//        for (Method method : methods) {
//            System.out.println(method);
//        }



//        System.out.println();

//        Method areYouBlocked = block.getClass().getDeclaredMethod("imBlocked");
//        areYouBlocked.setAccessible(true);
//        System.out.println(areYouBlocked.invoke(areYouBlocked));
    }
}
