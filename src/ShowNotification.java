import java.util.Scanner;

/**
 * Created by izola on 8/14/2017.
 */
public class ShowNotification extends Notification {
    Scanner in=new Scanner(System.in);
    public void TypeNotification( ){
//green for like 2-red  for comment 3- blue for add group 4- pink poked



        if(getLedcolor()=="green"){
        System.out.println("the like comment "+getTitle()+" \n "+getContent()+" \n "+getIcon()+" \n "+getLedcolor() );
        }  if(getLedcolor()=="red"){
         System.out.println("comment  on your photo"+getTitle()+" \n "+getContent()+" \n "+getIcon()+" \n "+getLedcolor() );
        }
        if(getLedcolor()=="pink"){
        System.out.println("add to new group "+getTitle()+" \n "+getContent()+" \n "+getIcon()+" \n "+getLedcolor() );
        }if(getLedcolor()=="blue"){
        System.out.println("poked "+getTitle()+" \n "+getContent()+" \n "+getIcon()+" \n "+getLedcolor() );
        }
in.close();
    }
}

