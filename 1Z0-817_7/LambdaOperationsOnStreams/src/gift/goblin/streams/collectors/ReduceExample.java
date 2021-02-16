/*
 * Copyright (C) 2021 Andre Kessler (https://github.com/goblingift)
 * All rights reserved
 */
package gift.goblin.streams.collectors;

import java.util.Optional;
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

    }

}
