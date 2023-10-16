package com.bms.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;


public class JDBC {
	public static final Connection CONN;
	public static final String DRIVER = "com.mysql.jdbc.Driver" ;
	public static final String URL = "jdbc:mysql://localhost:3306/BMS" ;
	public static final String UNAME = "root" ;
	public static final String UPASS = "MOHAMMADFAIZ@1306" ;
static {
	Connection conn= null;
	try {
		Class.forName(DRIVER);
		conn = DriverManager.getConnection(URL,UNAME,UPASS);
	} catch (Exception e) {
		e.printStackTrace();
	}
	CONN=conn;
}
public static Connection getConn()
{
	return CONN;
}


}

/*public class JDBC {
    public static final Connection CONN;
    public static final String URL = "jdbc:mysql://localhost:3306/your_database";
    public static final String USER = "your_username";
    public static final String PASSWORD = "your_password";

    static {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            // Handle the exception here or throw it for higher-level handling.
            e.printStackTrace();
        }
        CONN = connection;
    }
    
    
    
    
 When you declare a variable as `final`, it means that the variable's reference cannot be changed 
 after it is assigned a value. This applies to the reference itself, not the state or contents of the 
 object it references. In the case of a `final` reference to an object, you can't reassign the reference 
to point to a different object, but you can still modify the state of the object it references. This is why 
you encounter an error when you attempt to initialize a `final` variable after it has already been assigned a value.

In your code, `CONN` is declared as a `final` field of type `Connection`. When you initialize it with 
`DriverManager.getConnection(URL, UNAME, UPASS);`, you are essentially creating a new `Connection` object and 
assigning it to `CONN`. This assignment is allowed because it happens during the initialization phase before 
the `CONN` variable is considered "final."

Here's a step-by-step breakdown of what happens:

1. You declare `CONN` as a `final` field, but it is not yet assigned a value.

2. In the static initializer block, you attempt to assign a value to `CONN` using `DriverManager.getConnection(URL, UNAME, UPASS);`.

3. At this point, `CONN` is no longer eligible to be reassigned to a different `Connection` object because it's marked as `final`.

4. The static initializer block attempts to assign the newly created `Connection` object to `CONN`.

This attempt to assign a new value to `CONN` after it has been marked as `final` is what results in a compilation error. The 
`final` keyword enforces immutability of the reference itself, not the state of the object it references. If you want to use a 
`final`field but still change the connection it references, you could initialize it with a `null` reference and then set it to a 
valid connection within the static initializer block, as shown in my previous response.
}*/





