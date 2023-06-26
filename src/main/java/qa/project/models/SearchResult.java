package qa.project.models;

import com.google.gson.annotations.SerializedName;

public class SearchResult {
    @SerializedName("Id")
    public String Id;
    @SerializedName("ResultType")
    public String ResultType;
    @SerializedName("Image")
    public String Image;
    @SerializedName("Title")
    public String Title;
    @SerializedName("Description")
    public String Description;

    @Override
    public String toString() {
        return "SearchResult{" +
                "Id='" + Id + '\'' +
                ", ResultType='" + ResultType + '\'' +
                ", Image='" + Image + '\'' +
                ", Title='" + Title + '\'' +
                ", Description='" + Description + '\'' +
                '}';
    }

    public String getId() {
        return Id;
    }

    public String getResultType() {
        return ResultType;
    }

    public String getImage() {
        return Image;
    }

    public String getTitle() {
        return Title;
    }

    public String getDescription() {
        return Description;
    }
}
