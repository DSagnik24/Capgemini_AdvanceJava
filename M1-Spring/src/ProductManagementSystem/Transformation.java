package ProductManagementSystem;

@FunctionalInterface
public interface Transformation {
    public Product operation(Product p);
}
