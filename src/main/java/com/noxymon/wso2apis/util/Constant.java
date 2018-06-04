package com.noxymon.wso2apis.util;

public final class Constant {

    public static final class Register {
	public static final String CLIENT_REGISTER_URL = "/client-registration/v0.12/register";
	public static final String CLIENT_REGISTER_TOKEN = "/token";
    }
    
    public static final class Apis {
	public static final String CLIENT_APIS_RETRIEVE_URL = "/api/am/store/v0.12/apis";
	public static final String CLIENT_APIS_SUBSCRIBE_URL = "/api/am/store/v0.12/subscriptions";
    }

    public static final class Apps {
	public static final String CLIENT_APPS_RETRIEVE_URL = "/api/am/store/v0.12/applications";
    }
}
