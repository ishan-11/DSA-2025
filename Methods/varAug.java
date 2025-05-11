
        public class varAug {
    public static void main(String[] args) {
      System.out.println("total of 2 values 5 and 8 is :" + view(5,8));
       System.out.println("total of 3 values 5 , 24 ,33 is "+ view(5,24,33));
    }

    static int view(int ...arr)
    {
//we can use as many args as we want we don't have to create new args everytime
            int result = 0;
            for(int a:arr)
            {
                result += a;
            }
            return result;
    }
}