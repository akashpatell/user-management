package com.akash.usermanagement.service;

import java.util.List;

import com.akash.usermanagement.domain.ApiResponse;
import com.akash.usermanagement.domain.UserProfile;

public interface UserProfileService {

	ApiResponse<UserProfile> saveUser(UserProfile user);

	List<UserProfile> getUsers();

	ApiResponse<Void> deleteUser(Long userId);

}
