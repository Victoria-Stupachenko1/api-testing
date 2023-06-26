package qa.project.services;

import qa.project.models.MovieSearchResponse;
import qa.project.models.SearchResult;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;


public interface SearchMovieService {
    @GET("/API/SearchMovie/{apiKey}/{expression}")
    Call<MovieSearchResponse> searchMovie(@Path("apiKey") String apiKey, @Path("expression") String expression);

}
