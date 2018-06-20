package lesson11.interfaceexample;

public class MySQLProvider implements DbProvider {

   // public MySQLProvider(String dbHost) {
   //     super(dbHost);
   // }

    @Override
    public void connectToDb() {
        //logic for MySQL
    }

    @Override
    public void disconnectFromDb() {

    }

    @Override
    public void encryptData() {

    }
}
