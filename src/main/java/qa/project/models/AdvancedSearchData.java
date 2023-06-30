package qa.project.models;

import java.util.List;

public class AdvancedSearchData {
    private String queryString;
    private List<AdvancedSearchResult> results;
    private String errorMessage;

    @Override
    public String toString() {
        return "AdvancedSearchData{" +
                "queryString='" + queryString + '\'' +
                ", results=" + results +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }

    public String getQueryString() {
        return queryString;
    }

    public List<AdvancedSearchResult> getResults() {
        return results;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
