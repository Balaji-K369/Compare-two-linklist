Compare two linklist:
--------------------


import java.util.*;
public class Main{
    public static void main(String[] args){
        int flag=0;
        LinkedList<String> ll=new LinkedList<String>();
        LinkedList<String> l1=new LinkedList<String>();
        ll.add("balaji");
        ll.add("santhosh pandi");
        ll.add("vasanth ramm");
        l1.add("balaji");
        l1.add("santhosh pandi");
        l1.add("vasanth ramm");
        Iterator<String> ir=ll.iterator();
        Iterator<String> itr=l1.iterator();
        while(ir.hasNext() && itr.hasNext()){
            if(ir.next().equals(itr.next()))
            flag=0;
            else{
                flag=1;
            }
        }if(flag==0)
        System.out.println("Linklist matches");
        else
        System.out.println("Linklist doesn't match");
        
    }
}