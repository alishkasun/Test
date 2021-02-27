package tcore_7;

public enum Period {

    FIVE_DAYS("5day");

    private String apiDaysCode;

    Period(String apiDaysCode) {
        this.apiDaysCode = apiDaysCode;
    }

    public String getApiDaysCode() {
        return apiDaysCode;
    }
}
