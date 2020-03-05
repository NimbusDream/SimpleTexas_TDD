public class fibonacci{

    public static void main(String[] args){
        fibonacci f =new fibonacci();
        int i=1;
        while(true){
            int re=f.of(i);
            if(re>200) break;
            System.out.printf(re+",");
            i++;
        }
    }

    public static int of(int num){
        if(num==1) return 1;
        if(num==2) return 1;
        int res=of(num-1)+of(num-2);
        return res;
    }
}