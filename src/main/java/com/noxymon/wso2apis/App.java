package com.noxymon.wso2apis;

import com.noxymon.wso2apis.util.Config;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World! Testing wso2 restful client in the house yo !" );        
        Config.applicationName = "WSO2 bear RESTful Client";
        Config.callBackURL = "alfacart.com";
        Config.host = "http://10.0.4.201:9443";
        
    }
}
