public class VideoPost extends  ContentPost{

    int views;
    int duration;
    VideoPost(User user , String caption , int likes , int views,int duration){
        this.user = user;
        this.caption = caption;
        this.likes = likes;
        this.views = views;
        this.duration = duration;
    }

    @Override
    int calculateEngagementScore() {

        return (int) (views * 1.5) + (likes*2);
    }

    @Override
    void generateFeedback() {
        this.score = calculateEngagementScore();
        System.out.println("Engagement Score: "+this.score);

        if(this.score > 2000){
            System.out.println("Feedback: Great engagement!");
        }else{
            System.out.println("Feedback: Consider creating shorter videos for higher engagement");
        }
    }
}
