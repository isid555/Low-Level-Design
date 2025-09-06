public class Main {
    public static void main(String[] args) {
        User user1 = new User("alice_insta", "U123");

        ContentPost post1 = new PhotoPost(user1, "Sunset vibes!", 120, "Vintage", 300); // user, caption, likes, filterUsed, shares
        post1.generateFeedback();


        ContentPost post2 = new VideoPost(user1, "Travel vlog", 250, 5000, 300); // user, caption, likes, views, duration
        post2.generateFeedback();


        ContentPost post3 = new TextPost(user1, "Morning motivation", 80, 500, 200); // user, caption, likes, wordCount, shares
        post3.generateFeedback();
    }
}