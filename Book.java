package edu.monmouth.hw6;


public enum BookTypes {
        HARDBACK, SOFTBACK, ELECTRONIC;
}

public class BookException extends Exception {
        // implementation required
}

public class Book implements Comparable<Book> {

        private int numberOfPages;
        private double price;
        private String title;
        private BookTypes bookType;

        public Book(int noOfPages, double price, String name, BookTypes bookType) throws BookException {
                this.numberOfPages = noOfPages;
                this.price = price;
                this.title = name;
                this.bookType = bookType;

        }

        public int getNoOfPages() {
                return numberOfPages;
        }

        public void setNoOfPages(int noOfPages) {
                this.numberOfPages = noOfPages;
        }

        public double getPrice() {
                return price;
        }

        public void setPrice(double price) {
                this.price = price;
        }

        public String getName() {
                return title;
        }

        public void setName(String name) {
                this.title = name;
        }

        public BookTypes getBookType() {
                return bookType;
        }

        public void setBookType(BookTypes bookType) {
                this.bookType = bookType;
        }

        @Override
        public boolean equals(Object o) {
                System.out.println("In Book's equals...");
                if (o == null) {
                        return false;
                }
                if (!(o instanceof Book)) {
                        return false;
                }
                if (o == this) {
                        return true;
                }
                Book otherBook = (Book) o;
                return otherBook.numberOfPages == this.numberOfPages && otherBook.price == this.price
                                && otherBook.bookType == this.bookType && otherBook.title == this.title;
        }


        @Override
        public int compareTo(Book otherBook) {
                final int BEFORE = -1;
                final int EQUAL = 0;
                final int AFTER = 1;
                if (this == otherBook) {
                        return EQUAL;
                }
                System.out.println("In Book's compareTo");
                if(this.numberOfPages<otherBook.numberOfPages) return BEFORE;
                if(this.numberOfPages>otherBook.numberOfPages) return AFTER;
                if(this.price<otherBook.price) return BEFORE;
                if(this.price>otherBook.price) return AFTER;
                return this.title.compareTo(otherBook.title);
        }

        @Override
        public String toString() {
                return "Book{" + "noOfPages=" + numberOfPages + ", price=" + price + ", name='" + title + '\'' + ", bookType="
                                + bookType + '}';

        }
}
