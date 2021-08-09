

class movie {
    private final Integer regularCharge = 2;
    private final Integer newRealeseCharge = 3;
    private final Double childrenCharge = 1.5;
    private final Integer maxDayRentedRegular = 2;
    private final Integer maxDayRentedChildren = 3;
    private final Double extraCharge = 1.5;
    public String priceCode() {
        return "";
    }
    double RentingCharge(int daysRented) {
        double charge = 0;
        String movieType = priceCode();
        switch (movieType) {
            case "REGULAR":
                charge += regularCharge;
                if (daysRented > maxDayRentedRegular) {
                    charge += (daysRented - maxDayRentedRegular) * extraCharge;
                }
                break;
            case "NEW_RELEASE":
                charge += daysRented * newRealeseCharge;
                break;
            case "CHILDRENS":
                charge += childrenCharge;
                if (daysRented > maxDayRentedChildren) {
                    charge += (daysRented - maxDayRentedChildren) * extraCharge;
                }
                break;
        }
        return charge;
    }
}
