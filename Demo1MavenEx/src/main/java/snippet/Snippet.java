package snippet;

public class Snippet {
	The library is composed of several modules, organized in 3 main sub-projects:
	
	JUnit Platform – which enables launching testing frameworks on the JVM
	JUnit Jupiter – which contains new features for writing tests in JUnit 5
	JUnit Vintage – which provides support for running JUnit 3 and JUnit 4 tests on the JUnit 5 platform
	
	@ParameterizedTest
	    @ValueSource(ints = {8,4,2,6,12})
	    void test_int_arrays(int arg) {
	      System.out.println("arg => "+arg);
	      Assertions.assertTrue(arg % 2 == 0);
	    }   
		
		@DisplayName("Should pass a non-null message to our test method")
		    @ParameterizedTest
		    @ValueSource(strings = {"Hello"})
		    void testParam(String message) {
			 Assertions.assertNotNull(message);
		    }
	
			@ParameterizedTest(name="#{index} - Test with Argument={0}")
		    @ValueSource(strings = {"Peter King", "Arthur King", "Martin King"})
		    void test_string_arrays(String arg) {
		      String searchKey = "King";
		      
		      System.out.println("arg => "+arg);
		      Assertions.assertTrue(arg.contains(searchKey));
		    }  
}

