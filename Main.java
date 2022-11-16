public class Main {
    public static void main(String[] args) {
        System.out.println("sem_1");
        System.out.println('\t'+"P"+'\t'+"|"+'\t'+"Q"+'\t'+"|"+'\t'+"P&Q"+'\t'+"|"+'\t'+"P|Q"+'\t'+"|"+'\t'+"P^Q"+'\t'+"|"+'\t'+"!P");
        System.out.println("------------------------------------------------");
        boolean p= false; boolean q=false;
        System.out.print(" "+p+" "+'\t'+"|"+" "+q+'\t'+"|");
        if((p== false)&(q==false)){
            System.out.println(" "+(p&q)+'\t'+"|"+" "+(p|q)+'\t'+"|"+" "+(p^q)+'\t'+"|"+" "+(!p));
        }
        System.out.println("------------------------------------------------");
        boolean p1= true; boolean q1=false;
        System.out.print(" "+p1+" "+'\t'+"|"+" "+q1+'\t'+"|");
        if((p1== true)&(q1==false)){
            System.out.println(" "+(p1&q1)+'\t'+"|"+" "+(p1|q1)+'\t'+"|"+" "+(p1^q1)+'\t'+"|"+" "+(!p1));
        }
        System.out.println("------------------------------------------------");
        boolean p2= false; boolean q2=true;
        System.out.print(" "+p2+" "+'\t'+"|"+" "+q2+'\t'+"|");
        if((p2== false)&(q2==true)){
            System.out.println(" "+(p2&q2)+'\t'+"|"+" "+(p2|q2)+'\t'+"|"+" "+(p2^q2)+'\t'+"|"+" "+(!p2));
        }
        System.out.println("------------------------------------------------");
        boolean p3= true; boolean q3=true;
        System.out.print(" "+p3+" "+'\t'+"|"+" "+q3+'\t'+"|");
        if((p3== true)&(q3==true)){
            System.out.println(" "+(p3&q3)+'\t'+"|"+" "+(p3|q3)+'\t'+"|"+" "+(p3^q3)+'\t'+"|"+" "+(!p3));
        }
    }}