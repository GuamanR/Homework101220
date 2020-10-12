import org.graalvm.compiler.core.common.type.ArithmeticOpTable.UnaryOp.Sqrt;

public class Calculator {
    public int add(int num1, int num2){
        return num1+num2;

    }
    public int subtraction(int num1, int num2){
        return num1-num2;
    }
    public int multipliply(int num1, int num2){
        return num1*num2;
    }
    public int divide(int num1, int num2){
        return num1/num2;
    }
    public int square(int num1, int num2){
        int num=1;
        for (int i=0;i < num2;i++){
            num= num1*num;
        }
        return num; 
    }
    public class MagicCalculator{
        // Double just means that the computer will take double digits aka whole numbers and decimals
        public double root(double num1){
            return Math.sqrt(num1);
        }
        public double sin(double num1){
            return Math.sin(num1);
        }
        public double cos(double num1){
            return Math.cos(num1);
        }
        public double tan(double num1){
            return Math.tan(num1);
        }
        public int fact(int num1){
            int num = num1;
            for (int i=num1-1; i>1; i--){
                num= num*i;
            }
            return num; 

        }
    }
}
