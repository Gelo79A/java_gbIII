package Order;

import lombok.Data;
import lombok.ToString;
import org.springframework.context.annotation.Scope;

@Data
@ToString
public class Product {

    public int id;
    public String title;
    public String cost;

    public Product(int id, String title, String cost) {
        this.id = id;
        this.title = title + id;
        this.cost = cost + id;
    }
}
