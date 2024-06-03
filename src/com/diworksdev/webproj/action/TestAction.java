package com.diworksdev.webproj.action;

import com.opensymphony.xwork2.ActionSupport;

//struts2が持つActionSupportというクラスを継承
//（Actionクラスは基本的にこのクラスを継承）
//LoginAciton（子クラス） extends（継承） ActionSupport（親クラス）
//すでにあるクラスとにたクラスを作る場合、元のクラスに必要な機能だけを追加する形で、新しいクラスを作ることを継承
public class TestAction extends ActionSupport {
	private String username;
	private String password;

	//管理コマンド・メッセージをコマンド・サーバーに送信し、何らかの応答メッセージを待ちます
	public String execute() {
		return SUCCESS;
	}

	//getterは値を引っ張ってくるメソッド
	//メソッド＝オブジェクトの操作を定義したもの
	public String getUsername() {
		return username;
	}

	//setterは値を代入するメソッド
	//メソッド＝オブジェクトの操作を定義したもの
	public void setUsername(String username) {
		this.username = username;
	}

	//getterは値を引っ張ってくるメソッド
	//メソッド＝オブジェクトの操作を定義したもの
	public String getPassword() {
		return password;
	}

	//setterは値を代入するメソッド
	//メソッド＝オブジェクトの操作を定義したもの
	public void setPassword(String password) {
		this.password = password;
	}

}
