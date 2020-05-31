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

    //Дополненные переменные

    private int ownerId;
    private int fromId;
    private int createdBy;
    private int replyOwnerId;
    private int replyPostId;
    private boolean friensOnly;
    private String copyright;
    private String postType;
    private int signerId;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isPinned;
    private boolean markedAsAds;
    private boolean isFavorite;
    private int postponedId;

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getFromId() {
        return fromId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public boolean getFriensOnly() {
        return friensOnly;
    }

    public void setFriensOnly(boolean friensOnly) {
        this.friensOnly = friensOnly;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public int getSignerId() {
        return signerId;
    }

    public void setSignerId(int signerId) {
        this.signerId = signerId;
    }

    public boolean isCanPin() {
        return canPin;
    }

    public void setCanPin(boolean canPin) {
        this.canPin = canPin;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public boolean isPinned() {
        return isPinned;
    }

    public void setPinned(boolean pinned) {
        isPinned = pinned;
    }

    public boolean isMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(boolean markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public int getPostponedId() {
        return postponedId;
    }

    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }

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

    private Geo[] geos;

    private LikesInfo[] likesInfos;

    private RepostInfo[] repostInfos;

    private Comment[] comments;

    private View[] views;
}
