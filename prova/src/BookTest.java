public class BookTest {
    public static void main(String[] args){
        Book book1 = new Book(new AvailableState());

        System.out.println("Borrowing the book");
        book1.borrow();
        System.out.println("Returning the book");
        book1.return();
        System.out.println("Reserving the book");
        book1.reserve();
        System.out.println("Reserving the book again, will throw an error");
        book1.reserve();
    }
}
