public class Novel extends Story{

    private static final Integer minlimit=100;

    public Novel(String title, String author){
        super(title, author);
    }

    @Override
    public void setPages(Integer pages) {
        
        if(pages>=minlimit){
            this.pages=pages;
        }else{
            Integer tmp=minlimit-pages;
            this.message="Te faltan "+tmp+" paginas para ser Novel";
            this.pages=pages;
        }

    }
    
}