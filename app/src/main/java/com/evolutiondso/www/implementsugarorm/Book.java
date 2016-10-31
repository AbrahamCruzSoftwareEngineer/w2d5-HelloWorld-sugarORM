package com.evolutiondso.www.implementsugarorm;

import com.orm.SugarRecord;

/**
 * Created by Albrtx on 31/10/2016.
 */
public class Book extends SugarRecord {
    String title;
    String edition;

    public Book(){
    }

    public Book(String title, String edition){
        this.title = title;
        this.edition = edition;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle() {
        this.title = title;
    }

    public String getEdition(){
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    @Override
    public String toString() {
        return "Book{" + "title='" + title + '\'' + ", edition='" + edition + '\'' + '}';
    }
}
