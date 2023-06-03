public class Main {
    public static void main(String[] args) {
        Class<Product> c = Product.class;
        Author a = c.getAnnotation(Author.class);
        System.out.println(a.name());
        System.out.println(a.year());
    }
}
