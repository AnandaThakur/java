public class Cancel {
    public static void main (String[] args){
        for (int i=1; i<=200; i++){
            if (i==66){
                continue;
            }
            System.out.println(i);
        }
    }
}
