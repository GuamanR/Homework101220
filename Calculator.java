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
}
