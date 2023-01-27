package edu.miu.WAALab5.service;

import edu.miu.WAALab5.domain.dto.request.LoginRequest;
import edu.miu.WAALab5.domain.dto.request.RefreshTokenRequest;
import edu.miu.WAALab5.domain.dto.response.LoginResponse;

public interface AuthService {
    LoginResponse login(LoginRequest loginRequest);
    LoginResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
