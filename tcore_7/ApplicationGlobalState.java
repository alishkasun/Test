package tcore_7;

public class ApplicationGlobalState {
    private static ApplicationGlobalState INSTANCE;
    private String selectedCity = null;
    private final String API_KEY = "1Pu57qZ5H2PpiDwqf8HqEiUSsth5VRhU";
//    private final String DB_FILENAME = "application.db";

    private ApplicationGlobalState() {
    }

    public static ApplicationGlobalState getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new ApplicationGlobalState();
        }

        return INSTANCE;
    }


    public String getSelectedCity(String city) {

        return selectedCity;
    }

    public String getApiKey() {

        return this.API_KEY;
    }
}
