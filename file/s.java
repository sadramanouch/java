public static int odd (int put){
    int result = 0;
    while (put >0){
        int num = put%10;
        if ((num%2) = 1){
            result += num + "";
        }
        put = put/10;
    }
    System.out.println(result);
}