package com.example.demo.value;

import java.util.Objects;

public class UserName {
    private final String firstName;
    private final String lastName;

    private UserName(String firstName, String lastName) {
    	
    	// コンストラクタはプライベートに設定し、ファクトリメソッドを使用してEmailオブジェクトを作成する
        this.firstName = firstName;
        this.lastName = lastName;
        
    }
    
    // ファクトリメソッド：有効な値であるか検証してオブジェクトを生成する
    public static UserName create(String firstName, String lastName) {
    	
    	// 値の検証ロジック
        if (firstName == null || lastName == null) {
            throw new IllegalArgumentException("firstName and lastName must not be null");
        }
        return new UserName(firstName, lastName);
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserName userName = (UserName) o;
        return firstName.equals(userName.firstName) &&
                lastName.equals(userName.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    @Override
    public String toString() {
        return "UserName{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}