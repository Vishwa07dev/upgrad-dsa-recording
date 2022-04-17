package codes.dsa;

import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {

    public static void main(String[] args) {
        int[] weights = {10,30,20};
        int[] values = {60,120,100};
        int maxCapacity = 50;

        System.out.println(maxValue(weights,values, maxCapacity));
    }

    private static double maxValue(int[] weights, int[] values,
                                int maxCapacity) {

        /**
         * We are going to use the Greedy approach
         * 1. We need to find the value/weight of each items
         * 2. Sort in the decreasing order of value/weight
         */
        Item[] items = new Item[weights.length];

        for(int i=0;i<weights.length;i++){
            Item item = new Item(weights[i],values[i]);
            items[i]=item;
        }
        //Need to go and sort this items array in descending order of v/w

        Arrays.sort(items, new Comparator<Item>() {
            @Override
            public int compare(Item item1, Item item2) {
                return item2.valuePerUnitWeight.
                        compareTo(item1.valuePerUnitWeight);
            }
        });

        double totalValue = 0d;

        for(Item item : items){
            int currentWeight = (int)item.weight;
            int currentValue = (int)item.value;

            if(currentWeight <= maxCapacity){
                maxCapacity = maxCapacity-currentWeight;
                totalValue = totalValue+currentValue;
            }else{
                double fraction = (double)maxCapacity/(double)currentWeight ;
                totalValue = totalValue + fraction*currentValue;
                break;
            }


        }
        return totalValue;
    }

    static class Item {
        double weight;
        double value ;
        Double valuePerUnitWeight;

        public Item(int weight, int value) {
            this.weight = weight;
            this.value = value;
            this.valuePerUnitWeight = new Double((double)value/(double)weight);
        }
    }
}

