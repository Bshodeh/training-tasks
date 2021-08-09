

class movie {
    private final Integer regularCharge = 2;
    private final Integer newRealeseCharge = 3;
    private final Double childrenCharge = 1.5;
    private final Integer maxDayRentedRegular = 2;
    private final Integer maxDayRentedChildren = 3;
    private final Double extraCharge = 1.5;

    public MovieType priceCode() {
        return MovieType.REGULAR;
    }

    public double RentingCharge(int daysRented) {
        double charge = 0;
        MovieType movieType = priceCode();
        switch (movieType) {
            case REGULAR:
                charge += regularCharge +
                        MovieType.checkTaxesRegular(daysRented, maxDayRentedRegular, extraCharge);
                break;
            case NEW_RELEASE:
                charge += daysRented * newRealeseCharge;
                break;
            case CHILDREN:
                charge += childrenCharge
                        + MovieType.checkTaxesChildren(daysRented, maxDayRentedRegular, extraCharge);
                break;
        }
        return charge;
    }
}

enum MovieType {
    REGULAR, NEW_RELEASE, CHILDREN;

    public static double checkTaxesRegular(int daysRented, int maxDayRentedRegular, double extraCharge) {
        if (daysRented > maxDayRentedRegular) {
            return (daysRented - maxDayRentedRegular) * extraCharge;
        }
        return 0.0;
    }

    public static double checkTaxesChildren(int daysRented, int maxDayRentedChildren, double extraCharge) {
        if (daysRented > maxDayRentedChildren) {
            return (daysRented - maxDayRentedChildren) * extraCharge;
        }
        return 0.0;
    }

}