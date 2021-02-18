package school.assessment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuizTest {
    Question q1, q2;

    @org.junit.jupiter.api.BeforeEach
    void setUp() throws Exception{
        q1 = new FillIn("CSUeb asd city of ___", "Hayward");
    }

    @Test
    void testMark(){
        assertTrue(q1.mark("Hayward"));
        assertFalse(q1.mark("San Leandro"));
    }
}