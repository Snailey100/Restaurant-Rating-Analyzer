import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Rating {
    int method;
    int rate1;
    int rate2;
    int rate3;
    int rate4;
    int rate5;
}

public class RestaurantData {

    static void percentageRating(List<Integer> method, List<Integer> rating) {
        Rating[] ratings = new Rating[5];
        for (int i = 0; i < 5; i++) {
            ratings[i] = new Rating();
            ratings[i].rate1 = 0;
            ratings[i].rate2 = 0;
            ratings[i].rate3 = 0;
            ratings[i].rate4 = 0;
            ratings[i].rate5 = 0;
            ratings[i].method = i;
        }

        for (int i = 0; i < method.size(); i++) {
            switch (rating.get(i)) {
                case 1:
                    ratings[method.get(i)].rate1 += 1;
                    break;
                case 2:
                    ratings[method.get(i)].rate2 += 1;
                    break;
                case 3:
                    ratings[method.get(i)].rate3 += 1;
                    break;
                case 4:
                    ratings[method.get(i)].rate4 += 1;
                    break;
                case 5:
                    ratings[method.get(i)].rate5 += 1;
                    break;
            }
        }

        double dineInPercentage = (ratings[0].rate5 + ratings[0].rate4) / (double) (ratings[0].rate1 + ratings[0].rate2 + ratings[0].rate3 + ratings[0].rate4 + ratings[0].rate5) * 100;
        double driveThruPercentage = (ratings[1].rate5 + ratings[1].rate4) / (double) (ratings[1].rate1 + ratings[1].rate2 + ratings[1].rate3 + ratings[1].rate4 + ratings[1].rate5) * 100;
        double takeAwayPercentage = (ratings[2].rate5 + ratings[2].rate4) / (double) (ratings[2].rate1 + ratings[2].rate2 + ratings[2].rate3 + ratings[2].rate4 + ratings[2].rate5) * 100;
        double neverPercentage = (ratings[3].rate5 + ratings[3].rate4) / (double) (ratings[3].rate1 + ratings[3].rate2 + ratings[3].rate3 + ratings[3].rate4 + ratings[3].rate5) * 100;
        double otherPercentage = (ratings[4].rate5 + ratings[4].rate4) / (double) (ratings[4].rate1 + ratings[4].rate2 + ratings[4].rate3 + ratings[4].rate4 + ratings[4].rate5) * 100;

        System.out.println("The method with the largest percentage of ratings >= 4 would be");
        if (dineInPercentage > driveThruPercentage && dineInPercentage > takeAwayPercentage && dineInPercentage > neverPercentage && dineInPercentage > otherPercentage) {
            System.out.println("Dine In");
        } else if (driveThruPercentage > dineInPercentage && driveThruPercentage > takeAwayPercentage && driveThruPercentage > neverPercentage && driveThruPercentage > otherPercentage) {
            System.out.println("Drive Thru");
        } else if (takeAwayPercentage > dineInPercentage && takeAwayPercentage > driveThruPercentage && takeAwayPercentage > neverPercentage && takeAwayPercentage > otherPercentage) {
            System.out.println("Take Away");
        } else if (neverPercentage > dineInPercentage && neverPercentage > driveThruPercentage && neverPercentage > takeAwayPercentage && neverPercentage > otherPercentage) {
            System.out.println("Never");
        } else if (otherPercentage > dineInPercentage && otherPercentage > driveThruPercentage && otherPercentage > takeAwayPercentage && otherPercentage > neverPercentage) {
            System.out.println("Other");
        }
    }

    static void numberRating(List<Integer> method, List<Integer> rating) {
        Rating[] ratings = new Rating[5];
        for (int i = 0; i < 5; i++) {
            ratings[i] = new Rating();
            ratings[i].rate1 = 0;
            ratings[i].rate2 = 0;
            ratings[i].rate3 = 0;
            ratings[i].rate4 = 0;
            ratings[i].rate5 = 0;
            ratings[i].method = i;
        }

        for (int i = 0; i < method.size(); i++) {
            switch (rating.get(i)) {
                case 1:
                    ratings[method.get(i)].rate1 += 1;
                    break;
                case 2:
                    ratings[method.get(i)].rate2 += 1;
                    break;
                case 3:
                    ratings[method.get(i)].rate3 += 1;
                    break;
                case 4:
                    ratings[method.get(i)].rate4 += 1;
                    break;
                case 5:
                    ratings[method.get(i)].rate5 += 1;
                    break;
            }
        }

        int dineInCount = ratings[0].rate1 + ratings[0].rate2;
        int driveThruCount = ratings[1].rate1 + ratings[1].rate2;
        int takeAwayCount = ratings[2].rate1 + ratings[2].rate2;
        int neverCount = ratings[3].rate1 + ratings[3].rate2;
        int otherCount = ratings[4].rate1 + ratings[4].rate2;

        System.out.println("The method with the largest number of ratings <= 2 would be");
        if (dineInCount > driveThruCount && dineInCount > takeAwayCount && dineInCount > neverCount && dineInCount > otherCount) {
            System.out.println("Dine In");
        } else if (driveThruCount > dineInCount && driveThruCount > takeAwayCount && driveThruCount > neverCount && driveThruCount > otherCount) {
            System.out.println("Drive Thru");
        } else if (takeAwayCount > dineInCount && takeAwayCount > driveThruCount && takeAwayCount > neverCount && takeAwayCount > otherCount) {
            System.out.println("Take Away");
        } else if (neverCount > dineInCount && neverCount > driveThruCount && neverCount > takeAwayCount && neverCount > otherCount) {
            System.out.println("Never");
        } else if (otherCount > dineInCount && otherCount > driveThruCount && otherCount > takeAwayCount && otherCount > neverCount) {
            System.out.println("Other");
        }
    }

    static void displayData(List<Integer> method, List<Integer> rating) {
        Rating[] ratings = new Rating[5];
        for (int i = 0; i < 5; i++) {
            ratings[i] = new Rating();
            ratings[i].rate1 = 0;
            ratings[i].rate2 = 0;
            ratings[i].rate3 = 0;
            ratings[i].rate4 = 0;
            ratings[i].rate5 = 0;
            ratings[i].method = i;
        }

        for (int i = 0; i < method.size(); i++) {
            switch (rating.get(i)) {
                case 1:
                    ratings[method.get(i)].rate1 += 1;
                    break;
                case 2:
                    ratings[method.get(i)].rate2 += 1;
                    break;
                case 3:
                    ratings[method.get(i)].rate3 += 1;
                    break;
                case 4:
                    ratings[method.get(i)].rate4 += 1;
                    break;
                case 5:
                    ratings[method.get(i)].rate5 += 1;
                    break;
            }
        }

        double[] sums = new double[5];
        for (int i = 0; i < 5; i++) {
            sums[i] = ratings[i].rate1 + ratings[i].rate2 + ratings[i].rate3 + ratings[i].rate4 + ratings[i].rate5;
            if (sums[i] == 0) sums[i] = 1;
        }

        double[][] percentages = new double[5][5];
        for (int i = 0; i < 5; i++) {
            percentages[i][0] = ratings[i].rate1 / sums[i] * 100;
            percentages[i][1] = ratings[i].rate2 / sums[i] * 100;
            percentages[i][2] = ratings[i].rate3 / sums[i] * 100;
            percentages[i][3] = ratings[i].rate4 / sums[i] * 100;
            percentages[i][4] = ratings[i].rate5 / sums[i] * 100;
        }

        String[] methods = {"Dine In", "Drive Thru", "Take Away", "Never", "Other"};

        System.out.printf("%14s%12s%12s%12s%12s%12s\n", "Method", "Rate: 1", "Rate: 2", "Rate: 3", "Rate: 4", "Rate: 5");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%14s\n%14s%12d%12d%12d%12d%12d\n%14s%12.4f%12.4f%12.4f%12.4f%12.4f\n",
                    methods[i], "Count", ratings[i].rate1, ratings[i].rate2, ratings[i].rate3, ratings[i].rate4, ratings[i].rate5,
                    "%", percentages[i][0], percentages[i][1], percentages[i][2], percentages[i][3], percentages[i][4]);
        }
    }

    public static void main(String[] args) {
        List<Integer> method = new ArrayList<>();
        List<Integer> rating = new ArrayList<>();

        try {
            File myObj = new File("RestaurantData.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] values = data.split(",");
                method.add(Integer.parseInt(values[0]));
                rating.add(Integer.parseInt(values[1]));
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        percentageRating(method, rating);
        numberRating(method, rating);
        displayData(method, rating);
    }
}