import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(1,"Samsung A5", 17000f));
		list.add(new Product(2,"iPhone 6s", 65000f));
		list.add(new Product(3,"Sony Xperia", 25000f));
		list.add(new Product(4,"Nokia Lumina", 15000f));
		list.add(new Product(5,"Redmi4", 26000f));
		list.add(new Product(6,"Lenovo Vibe", 19000f));
		
		Stream<Product> filter_data = list.stream().filter(p -> p.name == "Samsung A5");
		filter_data.forEach(product -> System.out.println(product.name + " " + product.price));
		
		System.out.println("\n");
		
		Stream<Product> data = list.stream().filter(p -> p.price >15000);
		data.forEach(product -> System.out.println(product.name + " " + product.price));
		
		

	}

}
