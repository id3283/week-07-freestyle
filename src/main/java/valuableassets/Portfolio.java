package valuableassets;

import java.util.ArrayList;

public class Portfolio {
    private ArrayList<Valuable> valuables;

    public Portfolio() {
        this.valuables = new ArrayList<>();
    }

    public void addValuable(Valuable valuable) {
        this.valuables.add(valuable);
    }


    public double getValue() {
        double totalValue = 0;

        for (Valuable v: this.valuables) {
            totalValue += v.getValue();
        }

        return totalValue;
    }

    public ArrayList<Truck> getTrucks() {
        ArrayList<Truck> trucks = new ArrayList<>();
        for ( Valuable v: valuables) {
            if (v instanceof Truck) {
                Truck t = (Truck) v;
                trucks.add(t);
            }
        }

        return trucks;
    }
}
