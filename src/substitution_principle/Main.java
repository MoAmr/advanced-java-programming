package substitution_principle;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Building building = new Building();
        Office office = new Office();
        build(building);
        // Applying The Substitution Principle here, since Office is a sub class of Building.
        build(office);

        List<Building> buildings = new ArrayList();
        buildings.add(new Building());
        buildings.add(new Office());
        printBuildings(buildings);

        /** Note: The Substitution Principle lets you assign variables of a given
         * type to the subtype, but the principle does not apply with
         * types of lists. as written below */
        // So the substitution principle does not apply here.
        /*
        List<Office> offices = new ArrayList();
        offices.add(new Office());
        offices.add(new Office());
        printBuildings(offices);
        */

    }

    static void build(Building building) {
        System.out.println("Constructing a new " + building.toString());
    }

    static void printBuildings(List<Building> buildings) {
        for (int i = 0; i < buildings.size(); i++) {
            System.out.println(i + 1 + ": " + buildings.get(i).toString());
        }
    }
}
