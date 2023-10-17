package com.ims.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {
private static final Connection CONN ;
private static final String DRIVER="com.mysql.jdbc.Driver";
private static final String URL="jdbc:mysql://localhost:3306/IMS";
private static final String UNAME="root";
private static final String UPASS="MOHAMMADFAIZ@1306";
static
{
	Connection con=null;
	try {
		Class.forName(DRIVER);
	 con = DriverManager.getConnection(URL,UNAME,UPASS);
} catch (Exception e) {
	e.printStackTrace();
}	
	CONN=con;
}
public static Connection getConn()
{
	return CONN;
	
}

}
