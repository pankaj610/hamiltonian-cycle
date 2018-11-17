package algo;
import java.util.*;
public class HamiltonianCycle {public void findHamiltonianCycle(int[][] graph,ArrayList<Integer> oldlist,int s){
//        if(!list.contains(s)){
//            list.add(s);
//        }else{
//            return;
//        }
        ArrayList<Integer> l = new ArrayList<>();
        for(int k=0; k<graph.length;k++){l.add(k);}
        
        for(int i=0; i<graph.length;i++){
            if(graph[s][i]==1 && !oldlist.contains(i)){
                ArrayList<Integer> newlist = new ArrayList<>();
                newlist.addAll(oldlist);
                newlist.add(i);
                if(newlist.containsAll(l)){
                        if(graph[i][newlist.get(0)]==1){
                            newlist.add(newlist.get(0));
                            for(Integer v : newlist){
                                System.out.print(v);
                            }
                        System.out.println("");
                        }
                }
                findHamiltonianCycle(graph,newlist,i);
            }
        }
    }
    public static void main(String[] args) {
        HamiltonianCycle hc = new HamiltonianCycle();
        int[][] graph = {{0,1,0,1,0},
                         {1,0,1,1,1},
                         {0,1,0,0,1},
                         {1,1,0,0,1},
                         {0,1,1,1,0}};
        int source = 1;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(source);
//        ArrayList<Integer> list2 = new ArrayList<>();
//        list2.add(0);
//        System.out.println(list.containsAll(list2));
        hc.findHamiltonianCycle(graph,list,source);
    }
}
