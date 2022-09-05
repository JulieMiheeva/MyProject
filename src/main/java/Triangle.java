public class Triangle {
    public static int countArea(int a, int b, int c) throws MyException {
        if(a<=0 || b<=0 || c<=0) throw new MyException("It's not a triangle");
        int p = (a+b+c)/2;
        int result = (int) Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return result;
    }
}
