package testrunner;

import config.Setup;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.Utils;

import java.io.IOException;

public class userLoginTestRunner extends Setup {
    LoginPage loginPage;
@Test(priority = 1)
    public void userLogin() throws IOException, ParseException {

        loginPage=new LoginPage(driver);
          JSONArray empList= Utils.readEmployeesInfo();
        JSONObject empObj  = (JSONObject) empList.get(empList.size()-1);
        String username= (String) empObj.get("username");
        String password= (String) empObj.get("password");

        loginPage.doLogin(username,password);
    }

    public static  void main(String [] args) throws IOException, ParseException {
        JSONArray empList=Utils.readEmployeesInfo();
        JSONObject empObj  = (JSONObject) empList.get(1);
        System.out.println(empObj.get("username"));
    }
}
