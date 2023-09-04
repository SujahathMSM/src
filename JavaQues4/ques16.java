public class ques16 {
    public static void main(String[] args) {
//        Write the outputs for the following code lines.
        int x=99;
        if(x++==x){
            System.out.println("x++==x : "+x);
        }
        if(++x==x ){
            System.out.println("++x==x : "+x);
        }
        if(x==x++){
            System.out.println("x==x++ : "+x);
        }
        if(x==++x){
            System.out.println("x==++x : "+x);
        }
        if(++x==++x){
            System.out.println("++x==++x : "+x);
        }
        if(x++==x++){
            System.out.println("x++==x++ : "+x);
        }
        if(++x==x++){
            System.out.println("++x==x++ : "+x);
        }
    }
}
