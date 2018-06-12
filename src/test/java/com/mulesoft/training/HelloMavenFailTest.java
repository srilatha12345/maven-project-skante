package com.mulesoft.training;

import static org.junit.Assert.*;

import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;

public class HelloMavenFailTest extends FunctionalTestCase {

    @Test
    public void mavenFlowReturnsHelloMaven() throws Exception {
        runFlowAndExpect("maven-demoFlow", "This is the Demo!!");
    }
    
    @Override
    protected String getConfigFile() {
        return "maven-demo.xml";
    }

}
