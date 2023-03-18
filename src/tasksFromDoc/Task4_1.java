package tasksFromDoc;

/*
4.1 Upvotes vs Downvotes
Given an object containing counts of both upvotes and downvotes,
return what vote count should be displayed.
This is calculated by subtracting the number of downvotes from upvotes.

Examples:
getVoteCount({ upvotes: 13, downvotes: 0 }) ➞ 13
getVoteCount({ upvotes: 2, downvotes: 33 }) ➞ -31
getVoteCount({ upvotes: 132, downvotes: 132 }) ➞ 0


 */

public class Task4_1 {

    public static void main(String[] args) {
        System.out.println(getVoteCount(13,0));
        System.out.println(getVoteCount(2,33));
        System.out.println(getVoteCount(132, 132));


    }

    public static int getVoteCount(int upvotes, int downvotes) {

        return upvotes - downvotes;
    }

}

