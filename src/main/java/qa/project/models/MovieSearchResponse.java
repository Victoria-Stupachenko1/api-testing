package qa.project.models;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MovieSearchResponse {
    private String searchType;
    private String expression;
    private List<SearchResult> results;
    private String errorMessage;

    // Add getters and setters for the fields

    @Override
    public String toString() {
        return "MovieSearchResponse{" +
                "searchType='" + searchType + '\'' +
                ", expression='" + expression + '\'' +
                ", results=" + results +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }

    public String getSearchType() {
        return searchType;
    }

    public String getExpression() {
        return expression;
    }

    public List<SearchResult> getResults() {
        return results;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
