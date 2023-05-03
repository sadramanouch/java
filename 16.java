public static int result(final int digit,final int num){
    if (num<0){
        return 0; 
    }
    if (num % 10 == digit){
        return 1 + result (num /10, digit);
    }
    else {
        return result (num / 10, digit);
    }
}

