package Utilities1;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFileUtils {

    public static Properties getPropertiesFileData(){
        Properties propertiesVariable=new Properties();
        //TODO: I will explain we we learn maven command
        String env=System.getProperty("env");//It will run according the command which we profile in the console
        if(env==null){
            env="dev";
        }
        String propertiesFilePath=env+".properties";
        try(InputStream resourceFileData=PropertiesFileUtils.class.getClassLoader().getResourceAsStream(propertiesFilePath)){
            propertiesVariable.load(resourceFileData);
        }catch (IOException e){
            System.err.println("Unable to load the properties file "+propertiesFilePath);
        }
        return propertiesVariable;
    }

}
