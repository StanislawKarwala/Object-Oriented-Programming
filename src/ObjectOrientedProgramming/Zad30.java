package ObjectOrientedProgramming;

/*
Write a Java program to create a class called "GymMembership" with attributes for member name, membership type, and duration.
Create a subclass "PremiumMembership" that adds attributes for personal trainer availability and spa access.
Implement methods to calculate membership fees and check for special offers based on membership type.
*/

class GymMembership{
    private String memberName;
    private String membershipType;
    private int duration;

    public GymMembership(String memberName, String membershipType, int duration){
        this.memberName = memberName;
        this.membershipType = membershipType;
        this.duration = duration;
    }

    public int getDuration(){
        return duration;
    }

    public double membershipFees(){
        double baseFee = 65.0;
        return duration * baseFee;
    }

    public String checkSpecialOffers(){
        if(membershipType.equalsIgnoreCase("annual")){
            return "10% discount on annual membership";
        } else{
            return "No special offers available";
        }
    }

    public void displayDetails() {
        System.out.println("Member Name: " + memberName);
        System.out.println("Membership Type: " + membershipType);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Membership Fees: $" + membershipFees());
        System.out.println("Special Offers: " + checkSpecialOffers());
    }

}

class PremiumMembership extends GymMembership{
    boolean personalTrainer;
    boolean spaAccess;

    public PremiumMembership(String memberName, String membershipType, int duration, boolean personalTrainer, boolean spaAccess){
        super(memberName, membershipType, duration);
        this.personalTrainer = personalTrainer;
        this.spaAccess = spaAccess;
    }

    @Override
    public double membershipFees(){
        double baseFee = super.membershipFees();
        double additionalFee = 0.0;

        if(personalTrainer){
            additionalFee += 20 * getDuration();
        }
        if(spaAccess){
            additionalFee += 10 * getDuration();
        }
        return baseFee + additionalFee;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Personal Trainer Available: " + (personalTrainer ? "Yes" : "No"));
        System.out.println("Spa Access: " + (spaAccess ? "Yes" : "No"));
    }

}

public class Zad30 {
    public static void main(String[] args) {
        GymMembership basicMember = new GymMembership("John Doe", "Monthly", 8);
        PremiumMembership premiumMember = new PremiumMembership("Willy Wonka", "Annual", 6, true, false);

        System.out.println("Basic Membership Details:");
        basicMember.displayDetails();

        System.out.println("\nPremium Membership Details:");
        premiumMember.displayDetails();
    }
}
