package org.moduleB;

import org.moduleA.Parser;

import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        final Parser parser = new  ParserImpl();
        final byte[] bytes = parser.serialize(Map.of("model", new Employee("name", 1L, "dev")));
        final Map<?, ?> map = parser.deserialize(bytes);

        System.out.println(map);
    }
}
