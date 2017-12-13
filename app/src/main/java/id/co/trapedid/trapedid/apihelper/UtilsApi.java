package id.co.trapedid.trapedid.apihelper;

/**
 * Created by Reyditya on 10/12/2017.
 */

public class UtilsApi {
    // 10.0.2.2 ini adalah localhost.
    public static final String BASE_URL_API ="http://trapedid.000webhostapp.com/trapedid/";

    // Mendeklarasikan Interface BaseApiService
    public static BaseApiService getAPIService(){
        return RetrofitClient.getClient(BASE_URL_API).create(BaseApiService.class);
    }
}
