public static boolean[] prime (array[] num){
    boolean array[]= new boolean[num.length];
    for (int i=0;i<num.lenght; i++){
        for (int j=2; j<num[1]; j++){
            if (num[i] % j == 0){
                array[i] = flase;
            }
        }
    }
    return array[];
}