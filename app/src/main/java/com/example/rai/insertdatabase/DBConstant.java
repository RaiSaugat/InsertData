package com.example.rai.insertdatabase;

/**
 * Created by sangitashres on 3/5/2017.
 */
public class DBConstant {
    final static public int DB_VERSION = 2;
    final static public String DB_NAME = "FIRST";
    final static public String TB_NAME = "Info";
    final static public String _ID = "id";
    final static public String ST_NAME = "Name";
    final static public String ST_ADDRESS = "Address";
    final static public String ST_PHONE= "Phone";
    final static public String CREATE_QUERY = "CREATE TABLE "+TB_NAME+" ("+_ID+" INTEGER PRIMARY KEY AUTOINCREMENT,"+
            ST_NAME+" VARCHAR(255),"+
            ST_ADDRESS+" VARCHAR(255))," +
            ST_PHONE+" VARCHAR(15);";
    final static String DELETE_QUERY = "DELETE TABLE IF EXIST "+TB_NAME;
}
