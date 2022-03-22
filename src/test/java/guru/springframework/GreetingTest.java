package guru.springframework;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    Greeting greeting;

    // This method must be static as per JUnit5
    @BeforeAll
    public static void beforeClass(){
        System.out.println("In Before All - I am only called once!");
    }

    @BeforeEach
    void setUp() {

        System.out.println("In Before Each");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void testHelloWorld() {
        System.out.println(greeting.helloWorld("John"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("In After Each");
    }

    // This method must be static as per JUnit5
    @AfterAll
    public static void afterClass(){
        System.out.println("In after All - I am only called once!");
    }
}