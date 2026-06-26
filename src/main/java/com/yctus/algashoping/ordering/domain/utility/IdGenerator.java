package com.yctus.algashoping.ordering.domain.utility;

import com.fasterxml.uuid.Generators;
import com.fasterxml.uuid.impl.TimeBasedEpochRandomGenerator;

import java.util.UUID;

public class IdGenerator {

    public IdGenerator() {
    }

    private static final TimeBasedEpochRandomGenerator timeBasedEpochRandomGenerator =
            Generators.timeBasedEpochRandomGenerator();


    public static UUID generatorTimeBasedUUID() {
        return timeBasedEpochRandomGenerator.generate();
    }
}