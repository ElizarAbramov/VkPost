package domain;

public class VkPost {
    private int id;
    private int ownerId;
    private int fromId;
    private int replyOwnerId;
    private int replyPostId;
    private int signerId;
    private int reposts;
    private int postponedId;
    private int date;
    private String postType;
    private boolean canPost;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isPinned;
    private boolean markedAsAds;
    private boolean isFavorite;
    private boolean friendsOnly;
    private RepostsInfo repostInfo;
    private Content content;
    private CommentsInfo commentsInfo;
    private Copyright copyright;
    private LikesInfo likes;
    private ViewsInfo viewsInfo;
    private PostSource postSource;
    private Geo geo;
    // + getters/setters
}
