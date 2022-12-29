Question-> Java annotation can be used to define the metadata of a Java class or class element. We can use Java annotation at the compile time to 
instruct the compiler about the build process. Annotation is also used at runtime to get insight into the properties of class elements.

import java.lang.annotation.*;
import java.lang.reflect.*;
import java.util.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface FamilyBudget {
   String userRole() default "GUEST";
   int roleLimit() default 200;
}

class FamilyMember {
   @FamilyBudget(userRole = "SENIOR", roleLimit=100)
   public void seniorMember(int budget, int moneySpend) {
      System.out.println("Senior Member");
      System.out.println("Spend: " + moneySpend);
      System.out.println("Budget Left: " + (budget - moneySpend));
   }

   @FamilyBudget(userRole = "JUNIOR", roleLimit=50)
   public void juniorUser(int budget, int moneySpend) {
      System.out.println("Junior Member");
      System.out.println("Spend: " + moneySpend);
      System.out.println("Budget Left: " + (budget - moneySpend));
   }
}

public class Solution {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      while (testCases > 0) {
         String role = in.next();
         int spend = in.nextInt();
         try {
            Class annotatedClass = FamilyMember.class;
            Method[] methods = annotatedClass.getMethods();
            for (Method method : methods) {
               if (method.isAnnotationPresent(FamilyBudget.class)) {
                  FamilyBudget family = method
                        .getAnnotation(FamilyBudget.class);
                  String userRole = family.userRole();
                  int budgetLimit = family.roleLimit();
                  if (userRole.equals(role)) {
                     if(budgetLimit>=spend){
                        method.invoke(FamilyMember.class.newInstance(),
                              budgetLimit, spend);
                     }else{
                        System.out.println("Budget Limit Over");
                     }
                  }
               }
            }
         } catch (Exception e) {
            e.printStackTrace();
         }
         testCases--;
      }
   }
}
