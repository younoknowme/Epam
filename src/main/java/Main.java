import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Sweet> sweetList = new ArrayList<Sweet>();
        List<Chocolate> chocolateList = new ArrayList<Chocolate>();
        System.out.println("Enter the number of Candies");
        int  n = scanner.nextInt();
        for(int i=0;i<n;i++){
            Chocolate chocolate =  new Chocolate();
            Sweet sweet  = new Sweet();
            System.out.println("Enter the Name of the sweet");
            String sweetName = scanner.next();
            System.out.println("Enter the Weight of the sweet");
            double sweetWeight = scanner.nextDouble();
            System.out.println("Enter the Name of the Chocolate");
            String chocolateName = scanner.next();
            System.out.println("Enter the Weight of the Chocolate");
            double chocolateWeight = scanner.nextDouble();

            sweet.setName(sweetName); sweet.setWeight(sweetWeight);
            chocolate.setWeight(chocolateWeight); chocolate.setName(chocolateName);

            sweetList.add(sweet);
            chocolateList.add(chocolate);
        }
        Collections.sort(chocolateList);
        Collections.sort(sweetList);
        System.out.println("Press 1.To get the Chocolates Weight and Sweet Weight in Sorted Order");
        System.out.println("Press 2. To get the Chocolates Weight in the Desired Range");
        int  option = scanner.nextInt();
        switch (option){
            case 1:
                for(Chocolate chocolateObject :  chocolateList)
                    System.out.println(chocolateObject.getName()+" "+chocolateObject.getWeight());
                for(Sweet sweetObject : sweetList)
                    System.out.println(sweetObject.getName()+" "+sweetObject.getWeight());
                break;
            case 2:
                System.out.println("Enter boundaries");
                double lowerLimit = scanner.nextDouble();
                double upperLimit = scanner.nextDouble();
                for(Chocolate chocolateObject :  chocolateList){
                    if(chocolateObject.getWeight() >= lowerLimit && chocolateObject.getWeight() <= upperLimit )
                        System.out.println(chocolateObject.getName()+" "+chocolateObject.getWeight());
                }
                for(Sweet sweetObject : sweetList){
                    if(sweetObject.getWeight() >= lowerLimit && sweetObject.getWeight() <= upperLimit)
                        System.out.println(sweetObject.getName()+" "+sweetObject.getWeight());
                }
        }

    }
}
