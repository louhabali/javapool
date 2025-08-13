public class DoOp {
    public static String operate(String[] args) {
         if (args.length != 3) {
            return "Error";
        }
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[2]);
       
       switch (args[1]) {
        case "+":
            int sum = num1 + num2;
            return Integer.toString(sum);
        
        case "*" :
            int pro = num1  * num2;
            return Integer.toString(pro);

        case "-" :
            int sub = num1  - num2;
            return Integer.toString(sub);

        case "/" :
        if (num2 ==0){
            return "Error";
        }
            int div = num1 / num2;
            return Integer.toString(div);

        case "%" :
         if (num2 ==0){
            return "Error";
        }
            int mod = num1  % num2;
            return Integer.toString(mod);
        default:
        return "Error";
       }
    }
}