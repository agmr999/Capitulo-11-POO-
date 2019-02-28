public abstract class Story {

    protected String title;
    protected String author;
    protected Integer pages;
    protected String message;


    public Story(String title, String author){
        this.title=title;
        this.author=author;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @return the pages
     */
    public Integer getPages() {
        return pages;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

    public abstract void setPages(Integer pages);

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        if(this.message==null){
            return "Se está publicando la historia "+this.getTitle()+" de "+this.getAuthor()+"\n La historia tiene "+this.getPages()+" paginas";
        }else{
            return "Se está publicando la historia "+this.getTitle()+" de "+this.getAuthor()+"\n La historia tiene "+this.getPages()+" paginas\n"+this.getMessage();
        }
    }

}