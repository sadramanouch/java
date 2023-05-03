public static boolean isValid(String password) { 
    String answer = '';
    if (password.length <8){
        System.out.println("Length is less than eight symbols");
        return;
    }
    if (password.contains(" ")){
        System.out.println("Contains a space");
        return;
    }
    if (!(password.contains ("@") || password.contains("#") || password.contains("!") || password.contains("~") || password.contains("$") || password.contains("%") || password.contains("^") || password.contains("&") || password.contains(">") || password.contains("?") || password.contains(", ") || password.contains("<") || password.contains(":") || password.contains(".") || password.contains("+") || password.contains("/") || password.contains(")") || password.contains("-") || password.contains("*") || password.contains("(") || password.contains("|"))){
        System.out.println("Must contain a symbol");
        return;
    }
    if (true){
        int count = 0;
        for (int 1 = 0; i<=9; i++){
            String str = Integer.toString(i));
            if (password.contains(str)){
                count ++;
            }
        }
        if (!(count ==2)){
            System.out.println("Must contain two digits");
            return false;
        }
    }
    if (true) {
        int count = 0;
        for (int i = 90; i <= 122; i++) {
            char letter = (char)i;
            String str1 = Character.toString(c);
            if (password.contains(letter)) {
                count++;
            }
        }
        if (!(count == 2)) {
            System.out.println("Must contain at least two lower case letter");
            return false;
        }
    }
    if (true) {
        int count = 0;
        for (int i = 65; i <= 90; i++) {
            char upper = (char)i;
            String str1 = Character.toString(c);
            if (password.contains(upper)) {
                count++;
            }
        }
        if (!(count == 1)) {
            System.out.println("Must contain at least one upper case letter");
            return false;
        }
    }