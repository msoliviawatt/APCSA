public class Book 
{
    private String title;
    private String author;

    public Book(String t, String a)
    {
        title = t;
        author = a;
    }

    public String getTitle()
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }

    public boolean match(Object other)
    {
        Book x = (Book)(other);
        if(title.equals(x.getTitle()) && author.equals(x.getAuthor()))
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public String toString()
    {
        return "Title: " + title + "\n" + "Author: " + author + "\n";
    }
}
