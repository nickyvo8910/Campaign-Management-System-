/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Entity;
import java.io.Serializable;

/**
 *
 * @author Vangnd
 */
public class Server implements Serializable
{
    //field of class
   
    private String serverName;
    private String userName;
    private String databaseName;
    private String password;
    private String port;
    public static final String configFile="src\\library\\serverconfig.txt";
    //default constructor
    public Server()
    {
    }
    //constructor with paramenter
    public Server(String serverName, String userName,String databaseName,String password,String port)
    {
        this.serverName=serverName;
        this.userName=userName;
        this.databaseName=databaseName;
        this.password=password;
        this.port=port;
    }
  

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getPassword() {
        return password;
    }
    public static String getConfigFile() {
        return configFile;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public String getServerName() {
        return serverName;
    }

    public String getUserName() {
        return userName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setPassword(String password)
    {
        this.password=password;
    }
    

}
