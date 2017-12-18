package nyc.c4q.inclassexercisesretrofit.Network;

import nyc.c4q.inclassexercisesretrofit.Model.Dog;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by c4q on 12/17/17.
 */

public interface DogService {
    @GET("api/breed/hound/images")
    Call<Dog> getDogUrls();
}
