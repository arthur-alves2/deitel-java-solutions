// This program projects world population growth over 75 years, starting from 2026,
// using an annual growth rate of 0.055%, and prints the results in a tabular format
// Author: Arthur Alves

package chapter04.exercise39;

public class WorldPopulationGrowth {
    public static void main(String[] args) {
        long worldPopulation = 8270841800L;
        double growthRate = 0.055;
        int year = 2026;
        int count = 1;

        System.out.println("Year\tPopulation\t\tGrowth");

        while (count <= 75) {
            double populationGrowthNumber = worldPopulation * growthRate;
            worldPopulation = (long) (worldPopulation + populationGrowthNumber);
            System.out.println(year + "\t" + worldPopulation + "\t\t" + (long)populationGrowthNumber);
            year++;
            count++;
        }

    }
}

