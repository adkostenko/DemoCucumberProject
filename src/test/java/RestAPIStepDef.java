import io.cucumber.java.en.When;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.Assert;

import javax.xml.ws.Response;
import java.io.IOException;

//public class RestAPIStepDef {
//    protected static RequestSpecification request;
//    protected static ResponseSpecification responseSpec;
//
//    @When("I call Get Categories I have a response")
//    public void iCallGetCategoriesIHaveAResponse() throws IOException {
//        request = new RequestSpecBuilder().
//                setBaseUri("https://petstore.swagger.io/v2").
//                build();
//        Response response = given().
//                spec(request).
//                when().
//                get("/pet/findByStatus?status=available");
//        int responseCode = response.then().assertThat().extract().response().getStatusCode();
//        Assert.assertEquals(responseCode, 201);
//
//    }
//}

