package LeetcodeAssignment;
class TrailingZeroes {
    public static int Zeroes(int n){
        int Zeroes=0;
        while (n>=5){
            n/=5;
            Zeroes+=n;
                        }
         return Zeroes;
    }
        public static void main(String[] args) {
            int n=200;
            System.out.println(Zeroes(n));
        }
    }
