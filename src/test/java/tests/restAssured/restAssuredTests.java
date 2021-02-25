package tests.restAssured;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class restAssuredTests {


    private static RequestSpecification requestSpec;
    private static ResponseSpecification responseSpec;

    @DataProvider(name = "countryCodeAndPlaces")
    public static Object[][] zipCodesAndPlaces() {
        return new Object[][]{
                {"us", "90210", "Beverly Hills"},
                {"us", "12345", "Schenectady"},
                {"ca", "B2R", "Waverley"}
        };
    }

    @BeforeClass
    public static void createRequestSpecification() {
        requestSpec = new RequestSpecBuilder().setBaseUri("http://api.zippopotam.us").build();
    }

    @BeforeClass
    public static void createResponseSpecification() {
        responseSpec = new ResponseSpecBuilder().expectContentType(ContentType.JSON).expectStatusCode(200).build();
    }

    /**
     *  <<<< A method to assert in the response by using the request spec and the response spec.  >>>>
     */
    @Test
    public void requestUsZipCode90210_checkPlaceNameInResponseBody_expectBeverlyHills_withResponseSpec() {
        given().spec(requestSpec).when().get("us/90210").then().spec(responseSpec).and().assertThat().
                body("places[0].'place name'", equalTo("Beverly Hills"));
    }

    /**
     * <<<< A method to assert for a certain key by its value.  >>>>
     */
    @Test
    public void requestUsZipCode90210_checkPlaceNameInResponseBody_expectBeverlyHills() {
        given().
                when().
                get("http://zippopotam.us/us/90210").then().
                assertThat().body("places[0].'place name'", equalTo("Beverly Hills"));

    }

    /**
     * <<<< 1- A method to get the status code of a request >>>>
     */
    @Test
    public void requestUsZipCode90210_checkStatusCode_expectHttp200() {
        given().when().get("http://zippopotam.us/us/90210").then().assertThat().statusCode(200);
    }

    /**
     * <<<< 2- A method to check the return type of the response >>>>
     */
    @Test
    public void requestUsZipCode90210_checkContentType_expectApplicationJson() {
        given().when().get("http://zippopotam.us/us/90210").then().assertThat().contentType(ContentType.JSON);
    }

    /**
     * <<<< 3- A method to log the request's all and the response's body >>>>
     */
    @Test
    public void requestUsZipCode90210_logRequestAndResponseDetails() {
        given().log().all().when().get("http://zippopotam.us/us/90210").then().log().body();
    }

    /**
     * <<<< 4- A method to assert on the level of the json by value >>>>
     */
    @Test
    public void requestUsZipCode90210_checkStateNameInResponseBody_expectCalifornia() {
        given().when().get("http://zippopotam.us/us/90210").then().assertThat().body("places[0].state", equalTo("California"));
    }

    /**
     * <<<< 4- A method to assert on the level of the json by value >>>>
     */
    @Test
    public void requestUsZipCode90210_checkListOfPlaceNamesInResponseBody_expectContainsBeverlyHills() {
        given().when().get("http://zippopotam.us/us/90210").then().assertThat().body("places[0].'place name'", equalTo("Beverly Hills"));
    }

    /**
     * <<<< A method to return the json as a string. >>>>
     */
    @Test
    public String requestUsZipCode90210_returnResponseBody_expectContainsBeverlyHills() {
        return given().when().get("http://zippopotam.us/us/90210").then().extract().body().asString();
    }

    /**
     * <<<< A method to pass the path parameters and the expected output >>>>
     */
    @Test(dataProvider = "countryCodeAndPlaces")
    public void requestZipCodesFromCollection_checkPlaceNameInResponseBody_expectSpecifiedPlaceName(String countryCode, String zipCode, String expectedPlaceName) {

        given().pathParam("countryCode", countryCode).pathParam("zipCode", zipCode).when().get("http://zippopotam.us/{countryCode}/{zipCode}").
                then().assertThat().body("places[0].'place name'", equalTo(expectedPlaceName));
    }

    /**
     * <<<< A method to pass the request specs >>>>
     */
    @Test
    public void requestUsZipCode90210_checkPlaceNameInResponseBody_expectBeverlyHills_withRequestSpec() {
        given().spec(requestSpec).when().get("us/90210").then().assertThat().statusCode(200);
    }

    /**
     * <<<< A method to return the value of a key by using requestSpec and response spec.  >>>>
     */
    @Test
    public void requestUsZipCode90210_extractPlaceNameFromResponseBody_assertEqualToBeverlyHills() {

        String placeName =
                given().spec(requestSpec).when().get("us/90210").then().spec(responseSpec).and().extract().path("places[0].'place name'");

        Assert.assertEquals(placeName, "Beverly Hills");
    }


    /**
     * <<<< A method to return the value of a key by using requestSpec and response spec.  >>>>
     */
    @Test
    public void requestUsZipCode90210_checkPlaceNameInResponseBodyUsingPOJO_expectBeverlyHills() {

        location location = given().when().get("http://api.zippopotam.us/us/90210").as(tests.restAssured.location.class);
        Assert.assertEquals("United States", location.getCountry());
    }


    @Test
    public void postUserNameAndJob() {
        userPost userPost = new userPost();
        userPost.setName("Abdelqader");
        userPost.setJob("softwareEngineer");
        given().contentType(ContentType.JSON).body(userPost).when().get("https://reqres.in/api/users").then().log().all();
    }


}
