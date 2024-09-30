package ObjectOrientedProgramming;

/*
Write a Java program to create a class called "Restaurant" with attributes for menu items, prices, and ratings, and methods to add and remove items, and to calculate average rating.
*/

import java.util.ArrayList;
import java.util.List;

class Restaurant{
    private List<String> menuItems;
    private List<Double> prices;
    private List<Double> ratings;
    private List<Integer> itemCounts;

    public Restaurant(){
        this.menuItems = new ArrayList<>();
        this.prices = new ArrayList<>();
        this.ratings = new ArrayList<>();
        this.itemCounts = new ArrayList<>();
    }

    public void addItem(String item, double price){
        menuItems.add(item);
        prices.add(price);
        ratings.add(0.0);
        itemCounts.add(0);
    }

    public void removeItem(String item){
        int index = menuItems.indexOf(item);
        if(index >= 0){
            menuItems.remove(index);
            prices.remove(index);
            ratings.remove(index);
            itemCounts.remove(index);
        }
    }

    public void addRating(String item, double rating){
        int index = menuItems.indexOf(item);
        if(index >= 0){
            double currentRating = ratings.get(index);
            int totalCount = itemCounts.get(index);
            ratings.set(index, currentRating + rating);
            itemCounts.set(index, totalCount + 1);
        }
    }

    public double calculateAverageRatingSingleItem(String item){
        int index = menuItems.indexOf(item);
        if(index >= 0){
            double totalRating = ratings.get(index);
            int itemCount = itemCounts.get(index);
            return itemCount > 0 ? totalRating / itemCount : 0.0;
        } else{
            return 0.0;
        }
    }

    public void displayMenu(){
        for(int i = 0; i < menuItems.size(); i++){
            System.out.println(menuItems.get(i) + ": " + prices.get(i) + "$");
        }
    }

    public double calculateAverageRatingAllItems(){
        double totalRating = 0;
        int numRatings = 0;

        for(int i = 0; i < ratings.size(); i++){
            totalRating += ratings.get(i) / itemCounts.get(i);
            numRatings++;
        }
        return numRatings > 0 ? totalRating / numRatings : 0.0;
    }
}

public class Zad18 {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        restaurant.addItem("Burger", 12.99);
        restaurant.addItem("Pizza", 19.99);
        restaurant.addItem("Salad", 5.00);
        restaurant.addItem("French fries", 3.00);

        System.out.println("Best Restaurant menu:");
        restaurant.displayMenu();

        restaurant.addRating("Burger", 3);
        restaurant.addRating("Burger", 5);
        restaurant.addRating("Burger", 4);
        restaurant.addRating("Pizza", 3);
        restaurant.addRating("Pizza", 4);
        restaurant.addRating("Pizza", 4);
        restaurant.addRating("Salad", 2);
        restaurant.addRating("Salad", 3);
        restaurant.addRating("French fries", 4);
        restaurant.addRating("French fries", 5);

        double averageRating = restaurant.calculateAverageRatingSingleItem("Burger");
        System.out.println("\nAverage rating for Burger: " + averageRating);

        averageRating = restaurant.calculateAverageRatingSingleItem("Pizza");
        System.out.println("Average rating for Pizza: " + averageRating);

        averageRating = restaurant.calculateAverageRatingSingleItem("Salad");
        System.out.println("Average rating for Salad: " + averageRating);

        averageRating = restaurant.calculateAverageRatingSingleItem("French fries");
        System.out.println("Average rating for french fries: " + averageRating);

        System.out.println("Average rating of all menu: " + restaurant.calculateAverageRatingAllItems());

        System.out.println("\nRemove 'Salad' from the above menu.");
        restaurant.removeItem("Salad");

        System.out.println("\nUpdated menu:");
        restaurant.displayMenu();
    }
}
