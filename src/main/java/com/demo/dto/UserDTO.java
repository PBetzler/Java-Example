package com.demo.dto;

import java.util.Arrays;
import java.util.Base64;

public class UserDTO {
    public enum Role {
        DEFAULT_USER,
        VIP_USER,
        ADMIN;

        public static Role fromString(String enumString) {
            if (enumString.equalsIgnoreCase("ADMIN")) {
                return ADMIN;
            } else if (enumString.equalsIgnoreCase("VIP_USER")) {
                return VIP_USER;
            }
            return DEFAULT_USER;
        }

        public static Role fromBase64String(String encodedEnumString) {
            try {
                String enumString = new String(Base64.getDecoder().decode(encodedEnumString));
                if (enumString.equalsIgnoreCase("ADMIN")) {
                    return ADMIN;
                } else if (enumString.equalsIgnoreCase("VIP_USER")) {
                    return VIP_USER;
                }
            } catch (Exception ignored) {}
            return DEFAULT_USER;
        }
    }

    private Role role;
    private String username;
    private String email;
    private String password;
    private long id;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public UserDTO(){}

    public UserDTO(Role role, String username, String email, String password, long id) {
        this.role = role;
        this.username = username;
        this.email = email;
        this.password = password;
        this.id = id;
    }
}
