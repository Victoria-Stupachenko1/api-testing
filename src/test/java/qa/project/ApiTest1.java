package qa.project;

import org.testng.Assert;
import org.testng.annotations.Test;
import qa.project.models.AdvancedSearchData;
import qa.project.models.AdvancedSearchResult;
import qa.project.models.MovieSearchResponse;

import java.io.IOException;

import static org.testng.Assert.*;


public class ApiTest1 {
    private ImdbApi imdbApiClient = new ImdbApi();
    private String apiKey = "k_kw0qy43q";

    @Test(description = "Search Movie inception 2010")
    public void SearchMovie1() throws IOException {
        MovieSearchResponse movieSearchResponse = imdbApiClient.movieSearchService.searchMovie(apiKey, "inception 2010").execute().body();
        System.out.println(movieSearchResponse);
        assertEquals(movieSearchResponse.getResults().get(0).getTitle(), "Inception", "Title doesn't match");
        assertEquals(movieSearchResponse.getResults().get(0).getDescription(), "(2010)", "Description doesn't match");
    }

    @Test(description = "Search movie space")
    public void SearchMovie2() throws IOException {
        MovieSearchResponse movieSearchResponse = imdbApiClient.movieSearchService.searchMovie(apiKey, " ").execute().body();
        System.out.println(movieSearchResponse);
        assertNull(movieSearchResponse.getExpression(), "Expression is not null");
        assertTrue(movieSearchResponse.getErrorMessage().contains("Invalid request."), "Text doesn't contain required text");
    }

    @Test(description = "Search batman 1994")
    public void SearchMovie3() throws IOException {
        MovieSearchResponse movieSearchResponse = imdbApiClient.movieSearchService.searchMovie(apiKey, "batman 1994").execute().body();
        System.out.println(movieSearchResponse);
        movieSearchResponse.getResults().get(0).getTitle().contains("Batman");
        assertFalse(movieSearchResponse.getResults().get(0).getTitle().contains("1994"), "Title contains 1994");
        assertTrue(movieSearchResponse.getResults().get(0).getDescription().contains("1994"), "Description doesn't contain 1994");
    }

    @Test(description = "Advanced Search tv_movie,tv_series")
    public void AdvancedSearchMovie() throws IOException {
        AdvancedSearchData advancedSearch = imdbApiClient.movieAdvancedSearch.advancedSearchMovie(apiKey, "batman", "tv_movie,tv_series").execute().body();
        System.out.println(advancedSearch);
        AdvancedSearchData advancedSearch2 = imdbApiClient.movieAdvancedSearch.advancedSearchMovie(apiKey, "batman", "tv_movie").execute().body();
        System.out.println(advancedSearch2);
        // Compare the result sizes
        int size1 = advancedSearch.getResults().size();
        int size2 = advancedSearch2.getResults().size();
        assertTrue(size1 > size2, "First result is not larger than second result");
    }

    @Test(description = "Advanced Search genres")
    public void AdvancedSearchMovie2() throws IOException {
        AdvancedSearchData advancedSearch3 = imdbApiClient.movieAdvancedSearch.advancedSearchMovie2(apiKey, "comedy,thriller").execute().body();
        System.out.println(advancedSearch3);
        //For passed - set get(0); for fail - set get(1)
        AdvancedSearchResult firstResult = advancedSearch3.getResults().get(1);
        String genres = firstResult.getGenres();
        Assert.assertTrue(genres.contains("Comedy") || genres.contains("Thriller"), firstResult.getTitle() + " has differ genres " + firstResult.getGenres());
    }
}

