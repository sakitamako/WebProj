<!-- このファイルが通常のHTMLファイルではなく、JSPであることを示している -->
<!-- strutsタグ（下の補足参照）を使用する際に記述します。ここでは”s”としてタグを使用 -->
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>TEST</title>
    </head>
    <body>
        <!-- index.jspファイルのブラウザ上の送信ボタンを押すとTestAction.javaファイルにアクションし、処理結果をTest.jspで表示する -->
        <br>
        <s:property value="username"/>
        <br>
        <s:property value="password"/>
    </body>
</html>