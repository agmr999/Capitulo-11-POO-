public class Novella extends Story{

    private static final Integer maxlimit=100;
    private static final Integer minlimit=50;

    public Novella(String title, String author){
        super(title, author);
    }

    @Override
    public void setPages(Integer pages) {
        if(pages>=minlimit && pages<=maxlimit){
            this.pages=pages;
        }else{
            if(pages<minlimit){
                Integer tmp=minlimit-pages;
                this.message="Te faltan "+tmp+" paginas para ser Novella";
                this.pages=pages;
            }else if(pages>maxlimit){
                Integer tmp2=pages-maxlimit;
                this.message="Te pasaste por "+tmp2+" paginas para ser Novella";
            }
        }

    }
    
}