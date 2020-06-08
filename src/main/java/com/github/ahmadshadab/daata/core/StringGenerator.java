package com.github.ahmadshadab.daata.core;

import java.util.Collection;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static com.github.ahmadshadab.daata.common.GeneratorUtils.MAX_BAG_SIZE;
import static com.github.ahmadshadab.daata.common.GeneratorUtils.MIN_BAG_SIZE;
/**
 * @author sahmad
 */
public class StringGenerator {

    public static String getString(){
        return UUID.randomUUID().toString();
    }

    public static Collection<String> getStrings(int size){
        return IntStream.range(0, size)
                .mapToObj(i -> getString())
                .collect(Collectors.toList());
    }

    public static Collection<String> getStrings(){
        int size = ThreadLocalRandom.current().nextInt(MIN_BAG_SIZE, MAX_BAG_SIZE + 1);

        return getStrings(size);
    }
}
