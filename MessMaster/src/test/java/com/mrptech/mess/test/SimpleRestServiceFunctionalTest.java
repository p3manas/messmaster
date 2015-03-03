package com.mrptech.mess.test;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
/** Spring 3.2.x use these */
 
/** Spring 3.1.x use these */
//import static org.springframework.test.web.client.match.RequestMatchers.method;
//import static org.springframework.test.web.client.match.RequestMatchers.requestTo;
//import static org.springframework.test.web.client.response.ResponseCreators.withServerError;
//import static org.springframework.test.web.client.response.ResponseCreators.withStatus;
//import static org.springframework.test.web.client.response.ResponseCreators.withSuccess;



@ContextConfiguration(locations = {"classpath*:/test-applicationContext.xml"})
public class SimpleRestServiceFunctionalTest extends AbstractJUnit4SpringContextTests {/*
    @Autowired
    private SimpleRestService simpleRestService;

    @Autowired
    private RestTemplate restTemplate;

    private MockRestServiceServer mockServer;

    @Before
    public void setUp() {
        mockServer = MockRestServiceServer.createServer(restTemplate);
    }
    
    
	@Test
    public void testGetMessage() {
        //mockServer.expect(requestTo("http://google.com")).andExpect(method(HttpMethod.GET))
          //      .andRespond(withSuccess("resultSuccess", MediaType.TEXT_PLAIN));

		

	        
        mockServer.expect(requestTo("http://google.com")).andExpect(method(HttpMethod.POST))
        .andRespond(withSuccess("{ \"id\" : \"42\", \"name\" : \"Manas Inn\"}", MediaType.APPLICATION_JSON));

    	
    	
       // Hotel hotel = restTemplate.getForObject("http://google.com", Hotel.class);
        
        Hotel result = simpleRestService.getHotels();

        System.out.println(result);
        mockServer.verify();
        //assertThat(result, allOf(containsString("SUCCESS"), containsString("resultSuccess")));
        //assertThat(result.getId(), allOf(containsString("SUCCESS"), containsString("resultSuccess")));
    }

    @SuppressWarnings("unchecked")
	@Test
    public void testGetMessage_500() {
        mockServer.expect(requestTo("http://google.com")).andExpect(method(HttpMethod.GET))
                .andRespond(withServerError());

        String result = simpleRestService.getMessage();

        mockServer.verify();
        assertThat(result, allOf(containsString("FAILED"), containsString("500")));
    }

    @SuppressWarnings("unchecked")
	@Test
    public void testGetMessage_404() {
        mockServer.expect(requestTo("http://google.com")).andExpect(method(HttpMethod.GET))
                .andRespond(withStatus(HttpStatus.NOT_FOUND));

        String result = simpleRestService.getMessage();

        mockServer.verify();
        assertThat(result, allOf(containsString("FAILED"), containsString("404")));
    }
*/}
