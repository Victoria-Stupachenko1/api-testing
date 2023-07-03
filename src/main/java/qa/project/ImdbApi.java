package qa.project;

import qa.project.services.AdvancedSearch;
import qa.project.services.SearchMovieService;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ImdbApi {
    public SearchMovieService movieSearchService;
    public AdvancedSearch movieAdvancedSearch;


    public ImdbApi() {

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl("https://imdb-api.com")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            movieSearchService = retrofit.create(SearchMovieService.class);
            movieAdvancedSearch = retrofit.create(AdvancedSearch.class);

        }
    }
