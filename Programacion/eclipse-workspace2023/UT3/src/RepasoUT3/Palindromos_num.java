package RepasoUT3;

public class Palindromos_num {
	public static boolean isPalindrome(int num)
    {
        // `n` almacena el entero dado
        int n = num;
 
        // `rev` almacena el reverso del entero dado
        int rev = 0;
 
        while (n > 0)
        {
            // esto almacenará el último dígito de `n` en la variable `r`
            // por ejemplo, si `n` es 1234, entonces `r` sería 4
            int r = n % 10;
 
            // añade `r` a `rev` en el lugar de uno
            // por ejemplo, si `rev = 65` y `r = 4`, entonces el nuevo `rev` sería 654
            rev = rev * 10 + r;
 
            // elimina el último dígito de `n`
            // por ejemplo, si `n` es 1234, entonces la nueva `n` sería 123
            n = n / 10;
        }
 
        // esta expresión devolverá 1 si el número dado es igual a
        // es al revés; de lo contrario, devolverá 0
        return (num == rev);
    }
    public static void main(String[] args)
    {
        int n = 12321;
 
        if (isPalindrome(n)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}
