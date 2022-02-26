public class Patron
{
    private String name;
    private Book book1, book2, book3;

    public Patron(String n)
    {
        name = n;
        book1 = null;
        book2 = null;
        book3 = null;
    }

    public void borrow(Book x) //allows patron to borrow a book
    {
        
        if(x != null && !didYouBorrow(x)){
        if(book1 == null)
        {
            book1 = new Book(x.getTitle(), x.getAuthor());
        }
        else if(book2 == null)
        {
            book2 = new Book(x.getTitle(), x.getAuthor());
        }
        else if(book3 == null)
        {
            book3 = new Book(x.getTitle(), x.getAuthor());
        }
        else
        {
            System.out.println("There are no books available to borrow");
        }
    }
    else
    {
        System.out.println("There are no books available to borrow");
    }

    }

    private boolean didYouBorrow(Book x)
    {
        if(book1 != null && x.getTitle().equals(book1.getTitle()) && x.getAuthor().equals(book1.getAuthor()))
        {
            return true;
        }
        if(book2 != null && x.getTitle().equals(book2.getTitle()) && x.getAuthor().equals(book2.getAuthor()))
        {
            return true;
        }
        if(book3 != null && x.getTitle().equals(book3.getTitle()) && x.getAuthor().equals(book3.getAuthor()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    String giveBack(Book x)
    {
        if(x != null && didYouBorrow(x) == true)
        {
            if(book1 != null && x.getTitle().equals(book1.getTitle())){
                book1 = null;
            }
            if(book2 != null && x.getTitle().equals(book2.getTitle())){
                book2 = null;
            }
            if(book3 != null && x.getTitle().equals(book3.getTitle())){
                book3 = null;
            }
            return "Book returned!";
        }
            return "please enter a different book title!";
    }

    public String toString()
    {
        String s = "Patron's name: " + name + "\n" + "\n" + "Books: " + "\n";
        if(book1 != null)
        {
            s += book1;
        }
        if(book2 != null)
        {
            s += book2;
        }
        if(book3 != null)
        {
            s += book3;
        }
        else if(book1 == null && book2 == null && book3 == null)
        {
            s += "None!";
        }
        return s;
    }

    
}