

//****************Count 7************

import java.net.SocketOption;
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

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
//        String ans = revereString(s);
//        for (int i = 0; i < ans.length(); i++) {
//            System.out.print(ans.charAt(i));
//        }
//    }
//
//    public static  String revereString(String s) {
//        // your code here
//
//        Stack<Character> st = new Stack<>();
//
//        for (int i = 0; i < s.length(); i++) {
//            st.push(s.charAt(i));
//        }
//        String ans = "";
//        while (!st.isEmpty()) {
//            ans = ans + st.pop();
//        }
//        return ans;
//    }
//
//}


//********************** findFreqOfChar *****************

//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
//        findFreqOfChar(s);
//
//    }
//
//    public static  void findFreqOfChar(String s) {
//        // your code here
//        int[]freq= new int[26];
//
//
//        for (int i = 0; i < s.length(); i++) {
//            freq[s.charAt(i)-'a']++;
//        }
//
//       for(int i=0;  i<s.length(); i++){
//           if(freq[s.charAt(i)-'a']!=0){
//               System.out.print(s.charAt(i));
//               System.out.print(freq[s.charAt(i)-'a']+" ");
//               freq[s.charAt(i)-'a']=0;
//           }
//       }
//    }
//
//}


//using HashMap SC= O(n) & TC=O(n)

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        findFreqOfChar(s);

    }

    public static void findFreqOfChar(String s) {
        // your code here
        HashMap<Character, Integer> map = new HashMap();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (char c : map.keySet()) {
            System.out.print(c);
            System.out.print(map.get(c) + " ");

        }
    }
}
