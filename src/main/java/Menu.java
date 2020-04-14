import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class Menu {

    private List<Food> food;

    public Menu(){}
    public Menu(List<Food> foods) {
        this.food = foods;
    }


    @XmlElement
    public List<Food> getFood() {
        return food;
    }
    public void setFood(List<Food> foods) {
        this.food = foods;
    }




}
