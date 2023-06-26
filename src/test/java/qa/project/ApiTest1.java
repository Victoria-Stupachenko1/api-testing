package qa.project;

import org.testng.annotations.Test;
import qa.project.models.MovieSearchResponse;
import qa.project.models.SearchResult;
import qa.project.services.SearchMovieService;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;
import java.util.List;

public class ApiTest1 {

    @Test
    public void task1() throws IOException {
        ApiClient apiClient = new ApiClient();
        Call<MovieSearchResponse> call = apiClient.movieService.searchMovie("k_83pv5z04", "inception 2010");
        Response<MovieSearchResponse> response = call.execute();
        System.out.println(response);

    }
 }

