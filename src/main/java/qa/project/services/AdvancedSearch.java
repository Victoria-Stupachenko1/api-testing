package qa.project.services;

import qa.project.models.AdvancedSearchData;
import qa.project.models.AdvancedSearchResult;
import retrofit2.Call;
import retrofit2.http.*;

public interface AdvancedSearch {

    @GET("/API/AdvancedSearch/{apiKey}")
    Call<AdvancedSearchData> advancedSearchMovie(@Path("apiKey") String apiKey, @Query("title") String valueTitle, @Query("title_type") String valueTitle_type);

    @GET("/API/AdvancedSearch/{apiKey}")
    Call<AdvancedSearchData> advancedSearchMovie2(@Path("apiKey") String apiKey, @Query("genres") String valueGenres);

}
