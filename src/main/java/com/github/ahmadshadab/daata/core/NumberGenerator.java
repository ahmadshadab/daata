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
public class NumberGenerator {

    public static Long getNumber(){
        return ThreadLocalRandom.current().nextLong();
    }

    public static Collection<Long> getNumbers(int size){
        return IntStream.range(0, size)
                .mapToObj(i -> getNumber())
                .collect(Collectors.toList());
    }

    public static Collection<Long> getNumbers(){
        int size = ThreadLocalRandom.current().nextInt(MIN_BAG_SIZE, MAX_BAG_SIZE + 1);
        return getNumbers(size);
    }
}
