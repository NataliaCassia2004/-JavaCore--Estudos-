package Lexception.runtime.test;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("dentro da ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("dentro da IndexOutOfBoundsException");
        } catch (IllegalArgumentException e) {
            System.out.println("dentro da IllegalArgumentException");
        } catch (RuntimeException e) {
            System.out.println("dentro da RuntimeException");
        }
    }
}
