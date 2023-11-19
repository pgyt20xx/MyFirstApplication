package com.example.demo.value;

import java.time.LocalDateTime;

public class Timestamp {
	private final LocalDateTime value;

	private Timestamp(LocalDateTime value) {

		this.value = value;

	}

	// ファクトリメソッド：有効な値であるか検証してオブジェクトを生成する
	public static Timestamp create(LocalDateTime value) {

		if (value == null) {
			throw new IllegalArgumentException("タイムスタンプはnullではありません。");
		}

		return new Timestamp(value);
	}

	public LocalDateTime getValue() {
		return value;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Timestamp timestamp = (Timestamp) obj;
		return value.equals(timestamp.value);
	}

	@Override
	public int hashCode() {
		return value.hashCode();
	}

	public static void main(String[] args) {
		LocalDateTime timestampValue = LocalDateTime.now();

		Timestamp timestamp = new Timestamp(timestampValue);

		System.out.println("タイムスタンプ: " + timestamp.getValue());
	}
}
