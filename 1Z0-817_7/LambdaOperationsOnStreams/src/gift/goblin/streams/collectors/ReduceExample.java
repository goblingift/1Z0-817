/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.streams.collectors;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author andre
 */
public class ReduceExample {

    public static void execute() {

        Stream<String> countries = Stream.of("Canada", "Germany", "Australia");
        Optional<String> optReduceResult = countries.reduce((c1, c2) -> c1.concat(c2));
        System.out.println(optReduceResult);

        Stream<String> countries2 = Stream.of("Canada", "Germany", "Australia");
        String reduceResult = countries2.reduce("RESULT=", (c1, c2) -> c1.toLowerCase().concat(c2));
        System.out.println(reduceResult);

        Stream<String> countries3 = Stream.of("Canada", "Germany", "Australia");
        Integer characterCount = countries3.reduce(0, (Integer sum, String c) -> sum + new Integer(c.length()),
                (count1, count2) -> count1 + count2);
        System.out.println(characterCount);

        
        Stream<Book> bookStream = Stream.of(new Book(12.99, "Dramas of B.D."), new Book(9.99, "Western Stories"));
        BinaryOperator<Double> bop = (d1, d2) -> d1 + d2;
        Double allBookPrices = bookStream.map(b -> b.getPrice()).reduce(bop).get();
        System.out.println(allBookPrices);
        
        Stream<Book> bookStream2 = Stream.of(new Book(12.99, "Dramas of B.D."), new Book(9.99, "Western Stories"));
        DoubleBinaryOperator dbo = (d1, d2) -> d1 + d2;
        OptionalDouble reduce = bookStream2.mapToDouble(b -> b.getPrice()).reduce(dbo);
        
        
    }
    
}
