public class Hello {
    public static void main(String[] args){
        String x = "!!!";
        String y = "New";
        System.out.println("Hello World" + x);
        System.out.printf("Hello %s World%s \n", y, x);
        for(int i =1; i < 6; i++){
            System.out.printf("Hello %s World #%d%s \n", y, i, x);
        }
    }
}