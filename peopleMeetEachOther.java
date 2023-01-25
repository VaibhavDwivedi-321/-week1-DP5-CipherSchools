public class peopleMeetEachOther{
public static boolean isMeet(int p1,int p2,int s1,int s2){

while(p1>=p2){
    if(p1==p2){
        return true;
    }
    p1=p1+s1;
    p2=p2+s2;
}
return false;
}
public static boolean isMeetOptimised(int p1,int p2,int s1,int s2){
    if(p1>p2 && s1>s2){
        return false;
    }
    if(p2>p1 && s2>s1){
        return false;
    }
    int distanceNeedsToBeCovered = p1-p2;
    int speedNeedsToBeUsed = s1-s2;
    if(distanceNeedsToBeCovered % speedNeedsToBeUsed ==0){
        return true;
    }
    return false;

}
public static void main(String[] args){
int p1=6;
int p2=4;
int s1=6;
int s2=8;
boolean ans =  isMeetOptimised(p1,p2,s1,s2);
if(ans==true){
    System.out.println("They met");
}else{
    System.out.println("They didn't");
}

}
}