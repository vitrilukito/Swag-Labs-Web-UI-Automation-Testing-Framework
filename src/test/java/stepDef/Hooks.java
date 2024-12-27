package stepDef;

import io.cucumber.java.*;

import static helper.Utility.*;

public class Hooks {

    @BeforeAll
    public static void setUp(){
    }

    @AfterAll
    public static void tearDown(){
    }

    @Before
    public void beforeTest(){
        startDriver();
    }

    @After
    public void afterTest() throws InterruptedException{
        Thread.sleep(4000);
        quitDriver();
    }

}