package JavaInterface;

/*
Write a Java program to create an interface Searchable with a method search(String keyword) that searches for a given keyword in a text document.
Create two classes Document and WebPage that implement the Searchable interface and provide their own implementations of the search() method.
*/

interface Searchable{
    boolean search(String keyword);
}

class Document implements Searchable{
    private String document;

    public Document(String document){
        this.document = document;
    }

    @Override
    public boolean search(String keyword){
        return document.contains(keyword);
    }
}

class WebPage implements Searchable{
    private String url;
    private String htmlContent;

    public WebPage(String url, String htmlContent){
        this.url = url;
        this.htmlContent = htmlContent;
    }

    @Override
    public boolean search(String keyword){
        return htmlContent.contains(keyword);
    }
}

public class Zad9 {
    public static void main(String[] args) {
        String keyword = "doc";
        Document document = new Document("Document sample");
        boolean documentContainsKeyword = document.search(keyword);
        System.out.println("Document contains keyword '" + keyword + "': " + documentContainsKeyword);

        String webKeyword = "is good";
        WebPage webPage = new WebPage("https://www.noobnobody.com", "Content of html is good nonetheless it needs improvement");
        boolean webPageContainsKeyword = webPage.search(webKeyword);
        System.out.println("Webpage contains keyword '" + webKeyword + "': " + webPageContainsKeyword);
    }
}
