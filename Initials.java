import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by d1mys1klapo4ka on 14.03.2017.
 */
public class Initials {

    public static void main(String[] args) throws IOException {
	
	String result = readName();
	char[] name = result.toCharArray();
	char[] upperName = toUpperCase(name);

        printInitials(upperName);
    }


    static String readName() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String init = reader.readLine();

        reader.close();

        return init;
    }

    //static char[] getStringName() throws IOException {

    //    String name = Buffer();

    //    char [] nameChar = name.toCharArray();

    //    return nameChar;
    //}

    static char[] toUpperCase(char[] s) throws IOException {

        //char[] s = getStringName();

        for (int i = 0, n = s.length; i < n; i++){

            if(s[i] >= (char) 97 && s[i] <= (char) 122 ) {

                s[i] = (char) ( s[i] - 32);
            }
        }

        return s;
    }

    static void printInitials(char[] upperName) throws IOException {

    //    char[] s = checkRegister();
        System.out.print(upperName[0]);

        for (int i = 1, n = upperName.length; i < n; i++) {
            if (upperName[i] == (char) 32) {

                System.out.print(upperName[i + 1]);

            }
        }

	System.out.println();
    }
}