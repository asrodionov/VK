package ru.netology.domain;

public class Comment {
    private int idComment;
    private int dateComment;
    private int timeComment;
    private String nameAuthorComment;
    private String imgUrlAvatarAuthorComment;
    private String textComment;
    private int countLikeComment;
    private int idResponseComment[];
    private boolean isСomplain;

    public int getIdComment() {
        return idComment;
    }

    public void setIdComment(int idComment) {
        this.idComment = idComment;
    }

    public int getDateComment() {
        return dateComment;
    }

    public void setDateComment(int dateComment) {
        this.dateComment = dateComment;
    }

    public int getTimeComment() {
        return timeComment;
    }

    public void setTimeComment(int timeComment) {
        this.timeComment = timeComment;
    }

    public String getNameAuthorComment() {
        return nameAuthorComment;
    }

    public void setNameAuthorComment(String nameAuthorComment) {
        this.nameAuthorComment = nameAuthorComment;
    }

    public String getImgUrlAvatarAuthorComment() {
        return imgUrlAvatarAuthorComment;
    }

    public void setImgUrlAvatarAuthorComment(String imgUrlAvatarAuthorComment) {
        this.imgUrlAvatarAuthorComment = imgUrlAvatarAuthorComment;
    }

    public String getTextComment() {
        return textComment;
    }

    public void setTextComment(String textComment) {
        this.textComment = textComment;
    }

    public int getCountLikeComment() {
        return countLikeComment;
    }

    public void setCountLikeComment(int countLikeComment) {
        this.countLikeComment = countLikeComment;
    }

    public int[] getIdResponseComment() {
        return idResponseComment;
    }

    public void setIdResponseComment(int[] idResponseComment) {
        this.idResponseComment = idResponseComment;
    }

    public boolean isСomplain() {
        return isСomplain;
    }

    public void setСomplain(boolean сomplain) {
        isСomplain = сomplain;
    }


}
