package Lexception.runtime.test;

import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest05 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("dentro da ArrayIndexOutOfBoundsException | ArithmeticException | IllegalArgumentException");
        } catch (RuntimeException e) {
            System.out.println("dentro da RuntimeException");
        }

        try{
        talvezLanceException();
        }catch (IOException | SQLException e){
           e.printStackTrace();
        }
    }


    private static void talvezLanceException() throws SQLException, IOException {

    }
}
