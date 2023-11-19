package com.example.demo.value;

import java.util.Objects;

public class Email {
    private final String value;

    // コンストラクタはプライベートに設定し、ファクトリメソッドを使用してEmailオブジェクトを作成する
    private Email(String value) {
        this.value = value;
        
    }

    // ファクトリメソッド：有効な値であることを検証してオブジェクトを生成する
    public static Email create(String email) {
    	
    	// 値の検証ロジック
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email address: " + email);
        }
        return new Email(email);
    }

    // ゲッターメソッド
    public String getValue() {
        return value;
    }

    // equalsメソッドおよびhashCodeメソッドをオーバーライド
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Email email = (Email) o;
        return Objects.equals(value, email.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    // toStringメソッドをオーバーライド
    @Override
    public String toString() {
        return "Email{" +
                "value='" + value + '\'' +
                '}';
    }
}
