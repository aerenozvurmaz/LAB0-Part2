if(choice == 2){
    for(int i = 0; i < array.length; i++){
        average += array[i];
    }
    average = average / array.length;
    System.out.println("Average is: " + average);

    for(int i = 0; i < array.length; i++){
        differenceArray[i] = array[i] - average;
    }
    System.out.println("Differences from the average respectively are: " + Arrays.toString(differenceArray));

    System.out.print("1-Find min/max \n 2-Find average \n 3-Find sum of even and odd indexes \n 4-Exit \n");
    choice = in.nextInt();
}

if(choice == 3){
    for(int i = 0; i < array.length; i++){
        if(i % 2 == 0){
            sumOfEvenIndexes += array[i];
        }else{
            sumOfOddIndexes += array[i];
        }
    }
    System.out.println("Sum of odd indexes are: " + sumOfOddIndexes + "\n Sum of even indexes are: " + sumOfEvenIndexes);

    System.out.print("1-Find min/max \n 2-Find average \n 3-Find sum of even and odd indexes \n 4-Exit \n ");
    choice = in.nextInt();
}
} while (choice != 4);
}

}