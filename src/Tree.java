import java.util.ArrayList;
import java.util.List;

public class Tree {
    // We recommend attempting this class last, as it hasn't been scaffolded for your team.
    // Even if your team doesn't have time to implement this class, it is a useful exercise
    // to think about how you might split up the work to get the Tree and TreeMultiSet
    // implemented.
    private Integer root;
    private List<Tree> subtrees = new ArrayList<Tree>();

    public Tree(int root, List<Tree> subtrees) {
        this.root = root;
        if (subtrees == null) {
            this.subtrees = new ArrayList<Tree>();
        } else {
            this.subtrees = subtrees;
        }
    }

    public boolean is_empty() {
        return this.root == null;
    }

    public int length(){
        if (this.is_empty()) {
            return 0;
        } else{
            int size = 0;
            for (Tree subtree : this.subtrees){
                size += subtree.length();
            }
            return size;

        }
    }
    public int count(int item){
        if (this.is_empty()){
            return 0;
        } else {
            int num = 0;
            if (this.root == item){
                num += 1;
            }
            for (Tree subtree : this.subtrees){
                num += subtree.count(item);
            }
            return num;
        }
    }

}