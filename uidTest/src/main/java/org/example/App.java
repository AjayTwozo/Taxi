package org.example;

import org.moduleB.Employee;

import java.io.*;
import java.nio.file.Files;
import java.util.Collection;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        final String fileName = "employee.ser";
        Collection<String> fieldsToRemove = List.of("field1", "field2", "field3");
        //serializeEmployee(fileName);
        deserializeEmployee(fileName);
        String script = "def fieldsToRemove = params.fieldsToRemove; ";
        script += "for (String field : fieldsToRemove) { ctx._source.remove(field) }";
        System.out.println(script);
    }

    private static void deserializeEmployee(final String fileName) {

        try(ObjectInputStream objectInputStream = new ObjectInputStream(Files.newInputStream(new File(fileName).toPath()))) {
            final Employee employee=(Employee) objectInputStream.readObject();

            System.out.println(employee.getName() + employee.id());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void serializeEmployee(final String fileName) {
        final Employee employee = new Employee("name", 1L, "dev");

        try(final ObjectOutputStream objectOutputStream = new ObjectOutputStream(Files.newOutputStream(new File(fileName).toPath()))) {

            objectOutputStream.writeObject(employee);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
