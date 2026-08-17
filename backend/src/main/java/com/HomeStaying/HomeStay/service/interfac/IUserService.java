package com.HomeStaying.HomeStay.service.interfac;

import com.HomeStaying.HomeStay.dto.LoginRequest;
import com.HomeStaying.HomeStay.dto.Response;
import com.HomeStaying.HomeStay.entity.User;

public interface IUserService {

    Response register(User user);

    Response login(LoginRequest loginRequest);

    Response getAllUsers();

    Response getUserBookingHistory(String userId);

    Response deleteUser(String userId);

    Response getUserById(String userId);

    Response getMyInfo(String email);
}
