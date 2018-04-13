public class Sample {

    //your main containing tests and output
    public static void main(String[] args) {

        System.out.println(sleepIn(false, false));
        System.out.println(sleepIn(true, false));
        System.out.println(sleepIn(false, true));


        System.out.println(helloName("Bob"));
        System.out.println(helloName("Alice"));
        System.out.println(helloName("X"));


        System.out.println(teaParty(6,8));
        System.out.println(teaParty(3,8));
        System.out.println(teaParty(20, 6));


        System.out.println(countHi("abc hi ho"));
        System.out.println(countHi("ABChi hi"));
        System.out.println(countHi("hihi"));


        int[] x = {2, 1, 2, 3, 4};
        int[] y = {2, 2, 0};
        int[] z = {1,3,5};
        System.out.println(countEvens(x));
        System.out.println(countEvens(y));
        System.out.println(countEvens(z));


        System.out.println(stringTimes("Hi", 2));
        System.out.println(stringTimes("Hi", 3));
        System.out.println(stringTimes("Hi", 1));

        int[] a = {2,5};
        int[] b = {4,3};
        int[] c = {4,5};
        System.out.println(has23(a));
        System.out.println(has23(b));
        System.out.println(has23(c));

        System.out.println(loneSum(1,2,3));
        System.out.println(loneSum(3,2,3));
        System.out.println(loneSum(3,3,3));

        System.out.println(gHappy("xxggxx"));
        System.out.println(gHappy("xxgxx"));
        System.out.println(gHappy("xxggyygxx"));

        int[] d = {1,2,2,3,4,4};
        int[] e = {1,1,2,1,1};
        int[] f = {1,1,1,1,1};
        System.out.println(countClumps(d));
        System.out.println(countClumps(e));
        System.out.println(countClumps(f));



    }

    //your codingbat method here - must match
    // the method name from codingbat


    // 1. Sleep In

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (vacation) {
            return true;
        } else {
            if (weekday) {
                return false;
            } else {
                return true;
            }
        }
    }

    // 2. Hello Name

    public static String helloName(String name){
        return "Hello " + name + "!";
    }


    // 3. teaParty

    public static int teaParty(int tea, int candy){
            if(tea < 5|| candy < 5){
                return 0;
            }
            if(tea >= candy * 2 || candy >= tea * 2){
                return 2;
            }
            if(tea >= 5 && candy >= 5){
                return 1;
            }else{
                return 0;
            }

    }

    // 4. countHi
    public static int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'h') {
                if (str.charAt(i + 1) == 'i') {
                    count = count + 1;
                }
            }
        }
        return count;
    }



    // 5. countEvens
    public static int countEvens(int[] nums){
        int evens = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                evens = evens + 1;
            }
        }
        return evens;
    }


    // 6. String Times
    public static String stringTimes(String str, int n) {
        String time = "";
        for(int i = 0; i < n; i++){
            time = time + str;
        }
        return time;
    }

    // 7. has23
    public static boolean has23(int[] nums){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 2 || nums[i] == 3){
                return true;
            }
            if(nums[i+1] == 2 || nums[i+1] == 3){
                return true;
            }
            return false;
        }
        return true;
    }

    //8. loneSum
    public static int loneSum(int a, int b, int c) {
        if(a == b && b == c){
            return 0;
        }
        if(a == b){
            return c;
        }
        if(a == c){
            return b;
        }
        if(b == c){
            return a;
        }
        return a+b+c;
    }

    //9.
    public static boolean gHappy(String str){
        int allG = 0;
        int allHappy = 0;
         for (int i =0; i< str.length(); i++){
             if(str.charAt(i) == 'g'){
                 allG = allG + 1;
                 if(str.charAt(i+1) == 'g' || str.charAt(i-1)== 'g'){
                     allHappy = allHappy + 1;
                 }
             }
         }
         if (allHappy == allG){
             return true;
         }else{
             return false;
         }
    }

    //10. CountClumps
    public static int countClumps(int[] nums){
        boolean match = false;
        int count = 0;
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i] == nums[i+1] && !match){
                match = true;
                count++;
            }
            else if(nums[i] != nums[i+1]){
                match = false;
            }
        }
        return count;
    }



}