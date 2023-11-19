package com.example.demo.entity;

import java.util.Objects;

import com.example.demo.value.UserName;

public class LoginUser {
    private Long id;
    private UserName userName;

    private LoginUser(Long id, UserName userName) {
        this.id = id;
        this.userName = userName;
    }

    // ファクトリメソッド
    public static LoginUser create(Long id, UserName userName) {
        if (id == null || userName == null) {
            throw new IllegalArgumentException("id and userName must not be null");
        }
        return new LoginUser(id, userName);
    }

    // equalsメソッドの実装
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LoginUser loginUser = (LoginUser) o;
        return Objects.equals(id, loginUser.id);
    }

    // hashCodeメソッドの実装
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // ユーザー情報を取得するメソッド
    public String getUserInfo() {
        return "User ID: " + id + ", UserName: " + userName;
    }

    @Override
    public String toString() {
        return "LoginUser{" +
                "id=" + id +
                ", userName=" + userName +
                '}';
    }
}