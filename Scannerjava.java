import java.util.*;

public class Programa
{
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        
        if(N % 2 != 0)
        {
            System.out.println("Estranho");
        }
        else
        {
            if(N < 10)
            {
                System.out.println("Não é estranho");
            }