import java.util.*;
// Candidates have name and vote count

class Main{
    
    static class candidate 
    {
        String name;
        int votes;
        candidate(String n, int v){
            name = n;
            votes = v;
        }
    }
    
    static int MAX = 9;
    
    // Array of candidates
    static candidate candidates[] = new candidate[MAX];
    
    // Number of candidates
    static int candidate_count;
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("candidates: ");
        String cname = sc.nextLine();
        
        StringTokenizer st = new StringTokenizer(cname);
        int argc = st.countTokens();
        // Check for invalid usage
        if (argc < 1)
        {
            System.out.println("candidates: [....]");
            return;
        }

        // Populate array of candidates
        candidate_count = argc;
        if (candidate_count > MAX)
        {
            System.out.println("Maximum number of candidates is " + MAX);
            return;
        }
        for (int i = 0; i < candidate_count; i++)
        {
            candidates[i] = new candidate(st.nextToken(), 0);
        }
        
        System.out.print("Number of voters: ");
        int voter_count = sc.nextInt();

        // Loop over all voters
        for (int i = 0; i < voter_count; i++)
        {
            System.out.print("Vote: ");
            String name = sc.next();

            // Check for invalid vote
            if (!vote(name))
            {
                System.out.println("Invalid vote.");
            }
        }

        // Display winner of election
        print_winner();
    }
    
    static boolean vote(String name)
    {
        //TODO
        return false;
    }
    
    static void print_winner()
    {
        //TODO
        return;
    }
}
