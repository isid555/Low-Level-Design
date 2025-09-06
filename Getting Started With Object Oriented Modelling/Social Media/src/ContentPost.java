public abstract class ContentPost {
    User user;
    String caption;
    int likes;
    int score;


    abstract int calculateEngagementScore();
    abstract  void generateFeedback();
}
