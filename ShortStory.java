public class ShortStory extends Story{

    private static final Integer maxlimit=50;

    public ShortStory(String title, String author){
        super(title, author);
    }

    @Override
    public void setPages(Integer pages) {
        if(pages<=maxlimit){
            this.pages=pages;
        }else{
            Integer tmp=pages-maxlimit;
            this.message="Hay que recortar "+tmp+" paginas";
            this.pages=pages;
        }
    }
    
}