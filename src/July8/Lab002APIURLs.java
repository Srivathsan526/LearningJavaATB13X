package July8;

public enum Lab002APIURLs {
    google( "https://www.google.com"),
    yahoo("https://www.yahoo.com"),
    bing("https://www.bing.com");

    private String url;

    Lab002APIURLs(String url){
        this.url = url;
    }

    String getUrl(){
        return this.url;
    }
}
