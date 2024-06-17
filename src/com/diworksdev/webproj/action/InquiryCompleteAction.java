package com.diworksdev.webproj.action;

import com.opensymphony.xwork2.ActionSupport;

//Actionクラスでは、画面から送られてきたリクエストを取得する
//内部処理に応じてDAOやDTOクラスを呼び出し、最終的に次のJSPへ値を返すファイル

//struts2が持つActionSupportというクラスを継承
//（Actionクラスは基本的にこのクラスを継承）
//LoginAciton（子クラス） extends（継承） ActionSupport（親クラス）
//すでにあるクラスとにたクラスを作る場合、元のクラスに必要な機能だけを追加する形で、新しいクラスを作ることを継承
public class InquiryCompleteAction extends ActionSupport {

	//テーブルから取得するデータに対応したフィールド変数を宣言
	private String name;
	private String qtype;
	private String body;

	//管理コマンド・メッセージをコマンド・サーバーに送信し、何らかの応答メッセージを待ちます
	public String execute() {

		//SUCCESSに入った値を呼び出し元であるActionクラスに渡す
		return SUCCESS;

	}

	//フィールド変数に対応したgetterとsetterを定義
	//Actionクラスから呼び出され、nameフィールドの値をActionに渡す
	public String getName() {
		return name;

	}

	//フィールド変数に対応したgetterとsetterを定義
	//DAOクラスから呼び出され、引数として受け取ったテーブルの値を自身のnameフィールドに格納
	public void setName(String name) {
		this.name = name;

	}

	//フィールド変数に対応したgetterとsetterを定義
	//Actionクラスから呼び出され、qtypeフィールドの値をActionに渡す
	public String getQtype() {
		return qtype;

	}

	//フィールド変数に対応したgetterとsetterを定義
	//DAOクラスから呼び出され、引数として受け取ったテーブルの値を自身のqtypeフィールドに格納
	public void setQtype(String qtype) {
		this.qtype = qtype;

	}

	//フィールド変数に対応したgetterとsetterを定義
	//Actionクラスから呼び出され、bodyフィールドの値をActionに渡す
	public String getBody() {
		return body;

	}

	//フィールド変数に対応したgetterとsetterを定義
	//DAOクラスから呼び出され、引数として受け取ったテーブルの値を自身のbodyフィールドに格納
	public void setBody(String body) {
		this.body = body;

	}
}
