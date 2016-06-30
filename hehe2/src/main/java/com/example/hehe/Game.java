package com.example.hehe;

/**
 * Created by Administrator on 2016/6/25.
 */
public class Game {

    String title;
    String shorttitle;
    String source;
    String keywords;
    String description;
    String typename;

    String arcurl;
    //tup
    @Override
    public String toString() {
        return "Game{" +
                "title='" + title + '\'' +
                ", shorttitle='" + shorttitle + '\'' +
                ", source='" + source + '\'' +
                ", keywords='" + keywords + '\'' +
                ", description='" + description + '\'' +
                ", typename='" + typename + '\'' +
                ", arcurl='" + arcurl + '\'' +
                ", litpic='" + litpic + '\'' +
                ", typeurl='" + typeurl + '\'' +
                '}';
    }private String litpic;

    public String getTypeurl() {
        return typeurl;
    }

    public void setTypeurl(String typeurl) {
        this.typeurl = typeurl;
    }

    private  String typeurl;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShorttitle() {
        return shorttitle;
    }

    public void setShorttitle(String shorttitle) {
        this.shorttitle = shorttitle;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public String getArcurl() {
        return arcurl;
    }

    public void setArcurl(String arcurl) {
        this.arcurl = arcurl;
    }

    public String getLitpic() {
        return litpic;
    }

    public void setLitpic(String litpic) {
        this.litpic = litpic;
    }
}
