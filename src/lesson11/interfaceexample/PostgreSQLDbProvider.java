package lesson11.interfaceexample;

public class PostgreSQLDbProvider implements DbProvider {



    @Override
    public void connectToDb() {
        //some logic for Postgres
    }
    @Override
   public void disconnectFromDb() {
        //logic for Postgres
    }

    @Override
    public void encryptData() {
    }
}

