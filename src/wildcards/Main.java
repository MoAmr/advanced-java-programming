package wildcards;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // List of buildings
        List<Building> buildings = new ArrayList();
        buildings.add(new Building());
        buildings.add(new Building());
        printBuildings(buildings);

        /**
         * However, I cannot pass either of these lists into the printBuilding methods.
         * Because the list of type office is not a subtype of a list of type building.
         * And nor is a list of type house.
         * In order for this to work, we can use wildcards.
         */
        // List of offices
        List<Office> offices = new ArrayList();
        offices.add(new Office());
        offices.add(new Office());
        printBuildings(offices);

        // List of houses
        List<House> houses = new ArrayList();
        houses.add(new House());
        houses.add(new House());
        printBuildings(houses);

        addHouseToList(houses);
        addHouseToList(buildings);
    }

    /**
     * To use a wildcard, I put a question mark and then write extends.
     * @param buildings
     */
    static void printBuildings(List<? extends Building> buildings) {
        for (int i = 0; i < buildings.size(); i++) {
            System.out.println(buildings.get(i).toString() + " " + (i + 1));
        }
        System.out.println();
    }

    /**
     * Wildcards can also be used to specify that super types can be used
     * when a subtype is specified.
     * @param buildings
     */
    static void addHouseToList(List<? super House> buildings) {
        buildings.add(new House());
        System.out.println();
    }
}
