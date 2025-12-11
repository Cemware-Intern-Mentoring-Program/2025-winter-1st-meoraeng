package com.cemware.lavine.dto;

public record AuthResponse(
        String accessToken,
        String tokenType,
        Long userId,
        String email,
        String name
) {
    public static AuthResponse of(String accessToken, Long userId, String email, String name) {
        return new AuthResponse(accessToken, "Bearer", userId, email, name);
    }
}

