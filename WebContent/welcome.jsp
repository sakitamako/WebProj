<!-- このファイルが通常のHTMLファイルではなく、JSPであることを示している -->
<!-- strutsタグ（下の補足参照）を使用する際に記述します。ここでは”s”としてタグを使用 -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>WELCOME</title>
    </head>
    <body>
        <!-- index.jspファイルのブラウザ上のWelcomeボタンを押した先の入力項目が下記の内容、
        名前とパスワードを入力して送信ボタンを押すとWelcomeAction.javaファイルにアクションし、処理結果をlogin.jspで表示する -->
        名前とパスワードを入力してください。
        <s:form method="post" action="LoginAction">
            <s:textfield name="username" label="ユーザー名"/>
            <s:password name="password" label="パスワード"/>
            <s:submit value="送信"/>
        </s:form>
    </body>
</html>