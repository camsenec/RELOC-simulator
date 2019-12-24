package Retrofit;

import Model.ClientModel;
import Model.EdgeServerModel;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface EdgeServerAPI {

    @Multipart
    @POST("api/v1/manager/server/post/")
    Call<EdgeServerModel> postServer(@Query("application_id") int application_id,
                                     @Part("x") RequestBody x,
                                     @Part("y") RequestBody y,
                                     @Part("capacity") RequestBody capacity);

    @Multipart
    @POST("api/v1/manager/user/post/")
    Call<ClientModel> postClient(@Query("application_id") int application_id,
                                 @Part("x") RequestBody x,
                                 @Part("y") RequestBody y);

    @Multipart
    @POST("api/v1/manager/user/post_from_simulator/")
    Call<ClientModel> postClientWithId(@Query("application_id") int application_id,
                                 @Part("client_id") RequestBody client_id,
                                 @Part("x") RequestBody x,
                                 @Part("y") RequestBody y);

    @Multipart
    @PUT("api/v1/manager/user/update_location/")
    Call<ClientModel> updateLocationOfClient(@Query("application_id") int application_id,
                                 @Query("client_id") int client_id,
                                 @Part("x") RequestBody x,
                                 @Part("y") RequestBody y);

    @PUT("api/v1/manager/user/update_home/")
    Call<ClientModel> updateHomeOfClient(@Query("application_id") int application_id,
                                         @Query("client_id") int client_id);






}