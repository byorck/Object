public class Main {
    public static void main(String[] args) {
        Author kingSteven = new Author("Steven", "King");
        System.out.println("authorBestseller.getFirstName() = " + kingSteven.getFirstName());
        System.out.println("authorBestseller.getLastName() = " + kingSteven.getLastName());

        Book carry = new Book("Carry", kingSteven, 1999);
        System.out.println("carry.getTitle() = " + carry.getTitle());
        System.out.println("carry.getAuthor() = " + carry.getAuthor());
        System.out.println("carry.getYear() = " + carry.getPublicationYear());

        carry.setPublicationYear(1999);
        System.out.println("carry.getYear() = " + carry.getPublicationYear());

        Author tolkienJohn = new Author("John", "Tolkien");
        System.out.println("tolkienJohn.getFirstName() = " + tolkienJohn.getFirstName());
        System.out.println("tolkienJohn.getLastName() = " + tolkienJohn.getLastName());

        Book lordOfTheRings = new Book("The Lord of the Rings", tolkienJohn, 1954);
        System.out.println("lordOfTheRings.getTitle() = " + lordOfTheRings.getTitle());
        System.out.println("lordOfTheRings.getAuthor() = " + lordOfTheRings.getAuthor());
        System.out.println("lordOfTheRings.getPublicationYear() = " + lordOfTheRings.getPublicationYear());
    }
}