package com.udea.labdrools.model;

public class AirlineResponse {
    private boolean eligibleForUpgrade = true; // Por defecto es true, la regla 4 lo cambia a false si el equipaje es pesado
    private boolean upgradedToBusiness = false;
    private boolean priorityCheckIn = false;
    private double discountPercentage = 0.0;
    private String assignedSeat = "";
    private double compensationAmount = 0.0;
    private int loyaltyPointsAdded = 0;
    private boolean luggageAllowed = true;
    private boolean vipLoungeAccess = false;
    private String message = "";

    public AirlineResponse() {}

    public boolean isEligibleForUpgrade() { return eligibleForUpgrade; }
    public void setEligibleForUpgrade(boolean eligibleForUpgrade) { this.eligibleForUpgrade = eligibleForUpgrade; }
    public boolean isUpgradedToBusiness() { return upgradedToBusiness; }
    public void setUpgradedToBusiness(boolean upgradedToBusiness) { this.upgradedToBusiness = upgradedToBusiness; }
    public boolean isPriorityCheckIn() { return priorityCheckIn; }
    public void setPriorityCheckIn(boolean priorityCheckIn) { this.priorityCheckIn = priorityCheckIn; }
    public double getDiscountPercentage() { return discountPercentage; }
    public void setDiscountPercentage(double discountPercentage) { this.discountPercentage = discountPercentage; }
    public String getAssignedSeat() { return assignedSeat; }
    public void setAssignedSeat(String assignedSeat) { this.assignedSeat = assignedSeat; }
    public double getCompensationAmount() { return compensationAmount; }
    public void setCompensationAmount(double compensationAmount) { this.compensationAmount = compensationAmount; }
    public int getLoyaltyPointsAdded() { return loyaltyPointsAdded; }
    public void setLoyaltyPointsAdded(int loyaltyPointsAdded) { this.loyaltyPointsAdded = loyaltyPointsAdded; }
    public boolean isLuggageAllowed() { return luggageAllowed; }
    public void setLuggageAllowed(boolean luggageAllowed) { this.luggageAllowed = luggageAllowed; }
    public boolean isVipLoungeAccess() { return vipLoungeAccess; }
    public void setVipLoungeAccess(boolean vipLoungeAccess) { this.vipLoungeAccess = vipLoungeAccess; }
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }
}