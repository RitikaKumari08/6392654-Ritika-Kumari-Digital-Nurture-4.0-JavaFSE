import java.util.*;

class Product implements Comparable<Product> {
    int productId;
    String productName;
    String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName.toLowerCase();
        this.category = category.toLowerCase();
    }

    @Override
    public int compareTo(Product other) {
        return this.productName.compareTo(other.productName);
    }

    @Override
    public String toString() {
        return "ProductID: " + productId + ", Name: " + productName + ", Category: " + category;
    }
}

public class EcommerceSearchInput {

    // Linear search by product name
    public static Product linearSearch(Product[] products, String targetName) {
        for (Product product : products) {
            if (product.productName.equalsIgnoreCase(targetName)) {
                return product;
            }
        }
        return null;
    }

    // Binary search by product name (on sorted array)
    public static Product binarySearch(Product[] products, String targetName) {
        int left = 0, right = products.length - 1;
        targetName = targetName.toLowerCase();

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int cmp = products[mid].productName.compareTo(targetName);

            if (cmp == 0)
                return products[mid];
            else if (cmp < 0)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of products
        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Product[] products = new Product[n];

        // Input product details
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for product " + (i + 1));
            System.out.print("Product ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Product Name: ");
            String name = sc.nextLine();

            System.out.print("Category: ");
            String category = sc.nextLine();

            products[i] = new Product(id, name, category);
        }

        // Input target product name for search
        System.out.print("\nEnter product name to search: ");
        String searchName = sc.nextLine();

        // Linear Search
        Product foundLinear = linearSearch(products, searchName);
        System.out.println("\nLinear Search Result:");
        System.out.println(foundLinear != null ? foundLinear : "Product not found");

        // Binary Search (requires sorting)
        Arrays.sort(products);
        Product foundBinary = binarySearch(products, searchName);
        System.out.println("\nBinary Search Result:");
        System.out.println(foundBinary != null ? foundBinary : "Product not found");

        sc.close();
    }
}
