package com.example;

import java.lang.instrument.Instrumentation;

/**
 * @author meijunjie
 */
public class InstrumentationPremainTest {

    public static void premain(String agentArgs, Instrumentation inst){
        inst.addTransformer(new ClassFileTransformerTest());
    }
}
