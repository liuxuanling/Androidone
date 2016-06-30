package com.example.items;

/**
 * Created by Administrator on 2016/6/24.
 */
public class Game {
     String id;
      String typeid;
      String click;
      String title;
      String shorttitle;
      String source;
      String litpic;
      String writer;
      String keywords;
      String description;
      String typename;
      String namerule2;
      String typeurl;
    //tupian
       String arcurl;

   /* public Game(String click, String title, String shorttitle, String source, String litpic, String writer, String keywords, String description, String typename, String namerule2, String typeurl, String arcurl) {


    }*/

    public Game() {

    }


    @Override
    public String toString() {
        return "Game{" +
                "id='" + id + '\'' +
                ", typeid='" + typeid + '\'' +
                ", click='" + click + '\'' +
                ", title='" + title + '\'' +
                ", shorttitle='" + shorttitle + '\'' +
                ", source='" + source + '\'' +
                ", litpic='" + litpic + '\'' +
                ", writer='" + writer + '\'' +
                ", keywords='" + keywords + '\'' +
                ", description='" + description + '\'' +
                ", typename='" + typename + '\'' +
                ", namerule2='" + namerule2 + '\'' +
                ", typeurl='" + typeurl + '\'' +
                ", arcurl='" + arcurl + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTypeid() {
        return typeid;
    }

    public void setTypeid(String typeid) {
        this.typeid = typeid;
    }

    public String getClick() {
        return click;
    }

    public void setClick(String click) {
        this.click = click;
    }

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

    public String getLitpic() {
        return litpic;
    }

    public void setLitpic(String litpic) {
        this.litpic = litpic;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
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

    public String getNamerule2() {
        return namerule2;
    }

    public void setNamerule2(String namerule2) {
        this.namerule2 = namerule2;
    }

    public String getTypeurl() {
        return typeurl;
    }

    public void setTypeurl(String typeurl) {
        this.typeurl = typeurl;
    }

    public String getArcurl() {
        return arcurl;
    }

    public void setArcurl(String arcurl) {
        this.arcurl = arcurl;
    }


}
