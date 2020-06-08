package com.github.ahmadshadab.daata.core;

import java.util.Collection;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static com.github.ahmadshadab.daata.common.GeneratorUtils.MAX_BAG_SIZE;
import static com.github.ahmadshadab.daata.common.GeneratorUtils.MIN_BAG_SIZE;

/**
 * @author sahmad
 */
public class BooleanGenerator {
    public static Boolean getBoolean(){
        return ThreadLocalRandom.current().nextBoolean();
    }

    public static Collection<Boolean> getBooleans(int size){
        return IntStream.range(0, size)
                .mapToObj(i -> getBoolean())
                .collect(Collectors.toList());
    }

    public static Collection<Boolean> getBooleans(){
        int size = ThreadLocalRandom.current().nextInt(MIN_BAG_SIZE, MAX_BAG_SIZE + 1);
        return getBooleans(size);
    }
}
