package qa.project.models;

import com.google.gson.annotations.SerializedName;

public class SearchResult {
    public String id;
    public String resultType;
    public String image;
    public String title;
    public String description;

    @Override
    public String toString() {
        return "SearchResult{" +
                "id='" + id + '\'' +
                ", resultType='" + resultType + '\'' +
                ", image='" + image + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getResultType() {
        return resultType;
    }

    public String getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }
}
