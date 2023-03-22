

//****************Count 7************

import java.util.*;
// TC=O(logn) && SC= O(logn)

// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         System.out.println(count7(n));
//         sc.close();
//     }

//     public static int count7(int n) {
//         // your code here
// 		if(n==0) return 0;

// 		  if(n%10==7) return 1+count7(n/10);
// 		  else
// 			  return count7(n/10);
//     }
// }



//TC=O(logn) &&  SC=O(1)

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println(count7(n));
//        sc.close();
//    }
//
//    public static int count7(int n) {
//        // your code here
//        int count=0;
//        while(n!=0){
//            count=(n%10==7?count+1: count);
//            n=n/10;
//        }
//        return count;
//    }
//}



//********************** revereString***************************

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans = revereString(s);
        for (int i = 0; i < ans.length(); i++) {
            System.out.print(ans.charAt(i));
        }
    }

    public static  String revereString(String s) {
        // your code here

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            st.push(s.charAt(i));
        }
        String ans = "";
        while (!st.isEmpty()) {
            ans = ans + st.pop();
        }
        return ans;
    }

}


//**********************