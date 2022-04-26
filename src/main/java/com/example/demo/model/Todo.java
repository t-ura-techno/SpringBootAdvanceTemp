package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter // フィールドのgetメソッド(id, content)を自動生成する
@Setter // フィールドのsetメソッド(id, content)を自動生成する
@Entity // データの入れ物であるEntityクラスであることを指定する
public class Todo {
	@Id // Entityの主キーを設定する
	@GeneratedValue // Entityの値を自動採番する
	private Long id;
	private String content;
}