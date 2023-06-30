package qa.project.models;

import java.util.List;

public class AdvancedSearchResult {
    private String id;
    private String image;
    private String title;
    private String description;
    private String runtimeStr;

    private String genres;
    private List<KeyValueItem> genreList;
    private String contentRating;
    private String imDbRating;
    private String imDbRatingVotes;
    private String metacriticRating;
    private String plot;
    private String stars;
    private List<StarShort> starList;

    @Override
    public String toString() {
        return "AdvancedSearchMovie{" +
                "id='" + id + '\'' +
                ", image='" + image + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", runtimeStr='" + runtimeStr + '\'' +
                ", genres='" + genres + '\'' +
                ", genreList=" + genreList +
                ", contentRating='" + contentRating + '\'' +
                ", imDbRating='" + imDbRating + '\'' +
                ", imDbRatingVotes='" + imDbRatingVotes + '\'' +
                ", metacriticRating='" + metacriticRating + '\'' +
                ", plot='" + plot + '\'' +
                ", stars='" + stars + '\'' +
                ", starList=" + starList +
                '}';
    }

    public String getId() {
        return id;
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

    public String getRuntimeStr() {
        return runtimeStr;
    }

    public String getGenres() {
        return genres;
    }

    public List<KeyValueItem> getGenreList() {
        return genreList;
    }

    public String getContentRating() {
        return contentRating;
    }

    public String getImDbRating() {
        return imDbRating;
    }

    public String getImDbRatingVotes() {
        return imDbRatingVotes;
    }

    public String getMetacriticRating() {
        return metacriticRating;
    }

    public String getPlot() {
        return plot;
    }

    public String getStars() {
        return stars;
    }

    public List<StarShort> getStarList() {
        return starList;
    }
}
