import java.util.ArrayList;
import java.util.List;

public class Home {
    private List<Appliance> appliances = new ArrayList<>();

    public Home(List<Appliance> appliances) {
        this.appliances = appliances;
    }

    public List<Appliance> getAppliances() {
        return appliances;
    }

    public void addAppliance(Appliance appliance) {
        appliances.add(appliance);
    }
}
