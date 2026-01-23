// Function to reverse a string

function reverse(str) {
    if (str.length === 0)
        return str;
    return reverse(str.substring(1)) + str[0];
}

// Main function
const str = 'Geeks for Geeks';
console.log(reverse(str));



//2 method 



public class GfG {
    // Function to reverse a string using recursion
    public static String reverse(String str, int len)
    {
        if (len < 1) {
            return "";
        }

        // Base case
        if (len == 1) {
            return String.valueOf(str.charAt(0));
        }

        return str.charAt(len - 1) + reverse(str, len - 1);
    }

    public static void main(String[] args)
    {
        String str = "Geeks for geeks";
        System.out.println(reverse(str, str.length()));
    }
}