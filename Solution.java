package com.avanseus.dempster;

import javafx.collections.transformation.SortedList;
import org.apache.commons.collections.list.TreeList;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by madan on 29/6/18
 */
public class Solution {
//        1 1 1 0 0 0
//        0 1 0 0 0 0
//        1 1 1 0 0 0
//        0 0 2 4 4 0
//        0 0 0 2 0 0
//        0 0 1 2 4 0
    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        List<Integer> sum = new LinkedList<>();
        for (int i = 0;i<=arr.length/2;i++){
            for (int j=0;j<=arr.length/2;j++){
                int sumValue =0;
                for (int k=0;k<3;k++){
                    for (int l=0;l<3;l++){
                        if (k==1 && l==0){
                            System.out.print("  ");
                            continue;
                        }
                        if (k==1 && l==2){
                            System.out.print("  ");
                            continue;
                        }
                        sumValue +=arr[k+i][l+j];
                        System.out.print(arr[k+i][l+j]+" ");
                    }
                    System.out.println();
                }
                sum.add(sumValue);
                System.out.println();
            }


        }
        System.out.println("max"+Collections.max(sum));
        return Collections.max(sum);
    }

//    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        List<List<Integer>> lists = Arrays.asList(Arrays.asList(1 ,1, 1, 0, 0, 0),
        Arrays.asList(0,1,0, 0, 0, 0),
        Arrays.asList(1, 1, 1, 0, 0, 0),
        Arrays.asList(0 ,0 ,2 ,4 ,4 ,0),
        Arrays.asList(0 ,0, 0, 2 ,0, 0),
        Arrays.asList(0 ,0 ,1, 2, 4, 0));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
//            String[] arrRowItems = scanner.nextLine().split(" ");
             List<Integer> integerList = lists.get(i);
//            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = integerList.get(j);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

//        scanner.close();
    }
}
