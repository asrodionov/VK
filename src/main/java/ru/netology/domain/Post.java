package ru.netology.domain;

public class Post {
    private int idPost;
    private String nameAuthorPost;
    private String imgUrlLogoAuthorPost;
    private int datePost;
    private int timePost;
    private String textPost;
    private String imgUrlPost[];
    private boolean isSubscribe;
    private boolean isСomplain;
    private boolean isBookmark;
    private int countLike;
    private int countRepost;
    private int countView;

    public int getIdPost() {
        return idPost;
    }

    public void setIdPost(int idPost) {
        this.idPost = idPost;
    }

    public String getNameAuthorPost() {
        return nameAuthorPost;
    }

    public void setNameAuthorPost(String nameAuthorPost) {
        this.nameAuthorPost = nameAuthorPost;
    }

    public String getImgUrlLogoAuthorPost() {
        return imgUrlLogoAuthorPost;
    }

    public void setImgUrlLogoAuthorPost(String imgUrlLogoAuthorPost) {
        this.imgUrlLogoAuthorPost = imgUrlLogoAuthorPost;
    }

    public int getDatePost() {
        return datePost;
    }

    public void setDatePost(int datePost) {
        this.datePost = datePost;
    }

    public int getTimePost() {
        return timePost;
    }

    public void setTimePost(int timePost) {
        this.timePost = timePost;
    }

    public String getTextPost() {
        return textPost;
    }

    public void setTextPost(String textPost) {
        this.textPost = textPost;
    }

    public String[] getImgUrlPost() {
        return imgUrlPost;
    }

    public void setImgUrlPost(String[] imgUrlPost) {
        this.imgUrlPost = imgUrlPost;
    }

    public boolean isSubscribe() {
        return isSubscribe;
    }

    public void setSubscribe(boolean subscribe) {
        isSubscribe = subscribe;
    }

    public boolean isСomplain() {
        return isСomplain;
    }

    public void setСomplain(boolean сomplain) {
        isСomplain = сomplain;
    }

    public boolean isBookmark() {
        return isBookmark;
    }

    public void setBookmark(boolean bookmark) {
        isBookmark = bookmark;
    }

    public int getCountLike() {
        return countLike;
    }

    public void setCountLike(int countLike) {
        this.countLike = countLike;
    }

    public int getCountRepost() {
        return countRepost;
    }

    public void setCountRepost(int countRepost) {
        this.countRepost = countRepost;
    }

    public int getCountView() {
        return countView;
    }

    public void setCountView(int countView) {
        this.countView = countView;
    }


}
