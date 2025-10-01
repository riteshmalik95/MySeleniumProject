package PropertiesFileBasics;

import Utilities1.PropertiesFileUtils;

import java.util.Properties;

public class ReadDataFromProperties {
    public static void main(String[] args) {
        Properties prValue= PropertiesFileUtils.getPropertiesFileData();
        String bName= prValue.getProperty("Browser_Name");
        String baseURL= prValue.getProperty("BaseUrl");
        String uName= prValue.getProperty("userName");
        System.out.println("Browser Name:  "+bName);
        System.out.println("Base URL:  "+baseURL);
        System.out.println("User Name: "+uName);
    }
}
