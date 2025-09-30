import javax.swing.tree.TreeNode;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.jar.JarOutputStream;

public class TestArrayApi {
    private String str;
    public TestArrayApi(){

    }
    public TestArrayApi(String str){
        this.str=str;
    }
    public static void main(String[] args) {

//        int[] a = {1, 2, 3};
//
//        int[] b;
//        b=new int[]{1,2,3};
//
//        int[] c=new int[3];
//        c[1]=1;c[2]=1;c[3]=1;
//
//        int[] d=new int[]{1,2,3};
//        //空数组
//        int[] e={};
//
//        int[] f=new int[0];
//        int[] g=new int[]{};
//        Deque<TreeNode> arrayDeque = new ArrayDeque<TreeNode>();
////        arrayDeque.offer(');
//        arrayDeque.poll();
        int []oo=new int [10];//初始值为0
        for (int i = 0; i < oo.length; i++) {
            System.out.println(oo[i]+1);
        }

    }
}
