public class PhotoPost extends ContentPost{

    String filterUsed;
    int shares;


    PhotoPost( User user , String caption , int likes ,  String filterUsed , int shares){
        this.user = user;
        this.caption = caption;
        this.likes = likes;
        this.filterUsed = filterUsed;
        this.shares = shares;
    }


    @Override
    int calculateEngagementScore() {

        return (int) ((double) (this.likes*2)+(shares*3));



    }

    @Override
    void generateFeedback() {

        this.score = calculateEngagementScore();
        System.out.println("Engagement Score: "+this.score);

        if(this.score > 1000){
            System.out.println("Feedback: Excellent reach!");
        }else{
            System.out.println("Feedback: Try adding more hashtags for better reach");
        }
    }
}
