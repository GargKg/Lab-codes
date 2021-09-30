public class Base {
}
public class InterFace {
    class ExampleInstrumentedTest {
        @Test
        fun useAppContext() {
            // Context of the app under test.
            val appContext = InstrumentationRegistry.getInstrumentation().targetContext
            assertEquals("com.example.myapplication", appContext.packageName)
        }
    }
}


public class InterFace {
    class ExampleInstrumentedTest {
        @Test
        fun useAppContext() {
            // Context of the app under test.
            val appContext = InstrumentationRegistry.getInstrumentation().targetContext
            assertEquals("com.example.myapplication", appContext.packageName)
        }
    }
}