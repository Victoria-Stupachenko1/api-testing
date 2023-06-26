package qa.project;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import qa.project.models.SearchResult;
import qa.project.services.SearchMovieService;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    public SearchMovieService movieService;

    public SearchResult result;

    public ApiClient() {

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://imdb-api.com")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            movieService = retrofit.create(SearchMovieService.class);
      //      result = retrofit.create(SearchResult.class);

        }
    }
