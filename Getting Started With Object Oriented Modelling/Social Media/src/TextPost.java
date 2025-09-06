public class TextPost extends  ContentPost{

    int wordCount;
    int shares;

    TextPost(User user , String caption , int likes , int wordCount , int shares){
        this.user = user;
        this.caption = caption;
        this.likes = likes;
        this.wordCount = wordCount;
        this.shares = shares;
    }

    @Override
    int calculateEngagementScore() {
        return (int) ((this.likes * 1.5) + (this.shares*2) +(this.wordCount*0.5));

    }

    @Override
    void generateFeedback() {
        this.score = calculateEngagementScore();
        System.out.println("Engagement Score: "+this.score);

        if(this.score > 500){
            System.out.println("Feedback: Your audience loves your content!");
        }else{
            System.out.println("Feedback: Try using shorter and catchy captions");
        }
    }
}
