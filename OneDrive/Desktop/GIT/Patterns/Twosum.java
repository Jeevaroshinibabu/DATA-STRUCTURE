import java.util.Set;
import java.util.HashSet;
public class Twosum{
    public static void main(String[] args) {
        int [] nums={2,5,11,15};
        int  target=7;
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    System.out.println("["+nums[i]+","+nums[j]+"]");
                }
            }
        }
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            int complement=target-nums[i];
            if(set.contains(complement)){
                System.out.println("["+complement+","+nums[i]+"]");
            }
            set.add(nums[i]);
        }
    }
}
