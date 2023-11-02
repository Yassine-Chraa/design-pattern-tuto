public class Main {
    public static void main(String[] args){
        // Using the builder to create a House object
        House house = new House.Builder()
                            .floors(2)
                            .bedrooms(4)
                            .bathrooms(2)
                            .hasGarage(true)
                            .build();

        // Accessing the attributes of the House object
        System.out.println("Number of floors: " + house.getFloors());
        System.out.println("Number of bedrooms: " + house.getBedrooms());
        System.out.println("Number of bathrooms: " + house.getBathrooms());
        System.out.println("Has a garage: " + house.hasGarage());
    }
}

// House class
public class House {
    private int floors;
    private int bedrooms;
    private int bathrooms;
    private boolean hasGarage;

    private House(Builder builder) {
        this.floors = builder.floors;
        this.bedrooms = builder.bedrooms;
        this.bathrooms = builder.bathrooms;
        this.hasGarage = builder.hasGarage;
    }

    // Getters for house attributes
    public int getFloors() {
        return floors;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public boolean hasGarage() {
        return hasGarage;
    }

    // House Builder
    public static class Builder {
        private int floors;
        private int bedrooms;
        private int bathrooms;
        private boolean hasGarage;


        // Etaps
        public Builder floors(int floors) {
            this.floors = floors;
            return this;
        }

        public Builder bedrooms(int bedrooms) {
            this.bedrooms = bedrooms;
            return this;
        }

        public Builder bathrooms(int bathrooms) {
            this.bathrooms = bathrooms;
            return this;
        }

        public Builder hasGarage(boolean hasGarage) {
            this.hasGarage = hasGarage;
            return this;
        }

        // Build method to create the House
        public House build() {
            return new House(this);
        }
    }
}

