package git;

public class Class1 {
    public static void main(String[] args)
    {

        System.out.println("Let's practice GIT");
        System.out.println("  *****   ****   ********\n" +
                           " **   **   **       **\n" +
                           "**         **       **\n" +
                           "**  ****   **       **\n" +
                           "**   **    **       **\n" +
                           " **   **   **       **\n" +
                           "  *****   ****     ****\n");

        /*
        Developer:
        1. Make sure that your local master branch is up to date with your remote master branch. Switch to local master branch and then
        pull from origin master branch.
        Commands: git checkout master
        git pull origin master
        2. Create your own local branch to work on(we do not work on master branch) name it as jira ticket number hypen your name: jirahwd-mike
        Commands: git checkout branch branchName or git checkout -b branchName       (git checkout -b branchName creates a branch and switches to it
        3. Now you can create your code for the jira ticket on intellij
        4. Once you are done with code go to terminal and add . and commit
        Commands: git add . or git add theNameOfTheClass or file
        git commit -m 'Message'
        5. Push your local branch that you created to the remote repo make sure that the name of the branch you are pushing to is the same branch
        name as the new local branch that you just created
        Commands: git push origin nameOfNewLocalBranch
        6. Create a pull request on Github the base: will be master and the branch that you are merging to master is your new branch name
        add reviewers

        Reviewers: Look over the pull request, if everything looks fine approve and merge to master branch


        Tester:
         1. Make sure that your local master branch is up to date with your remote master branch. Switch to local master branch and then
        pull from origin master branch.
        Commands: git checkout master
        git pull origin master

        2. Navigate to intellij and run code, test the behavior of the code and document results and report on confluence and Jira



         */



    }
}
