package BinaryTree;
import java.util.* ;
public class Tree {
    static class Node {
        int data ;
        Node left ;
        Node right ;

        Node(int data) {
            this.data = data ;
            this.left = null ;
            this.right = null ;
        }

    }

    static class BinaryTree {
        static int idx = -1 ;
        public static Node buildTree(int nodes[]) {
            idx++ ;
            if(nodes[idx] == -1) {
                return null ;
            }

            Node newNode = new Node(nodes[idx]) ;
            newNode.left = buildTree(nodes) ;
            newNode.right = buildTree(nodes) ;

            return newNode ;

        }

        public static void print_PreOrder(Node root) {
            
            if(root == null) {
                // System.out.print(-1 + " ");
                return ;
            }
            System.out.print(root.data + " ");
            print_PreOrder(root.left) ;
            print_PreOrder(root.right) ;
        }

        public static void print_InOrder(Node root) {
            
            if(root == null) {
                return ;
            }

            print_InOrder(root.left) ;
            System.out.print(root.data + " ") ;
            print_InOrder(root.right) ;
        }

        public static void print_PostOrder(Node root) {
            
            if(root == null) {
                return ;
            }

            print_PostOrder(root.left) ;
            print_PostOrder(root.right) ;
            System.out.print(root.data + " ") ;

        }

        public static void print_LevelOrder(Node root) {
            
            if(root == null) {
                return ;
            }
            
            Queue<Node> q = new LinkedList<>() ;
            q.add(root) ;
            q.add(null) ;


            while(!q.isEmpty()) {
                Node currNode = q.remove() ;
                if(currNode==null) {
                    System.out.println();
                    if(q.isEmpty()) {
                        break ;
                    } else {
                        q.add(null) ;
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if(currNode.left != null) {
                        q.add(currNode.left) ;
                    }
                    if(currNode.right != null) {
                        q.add(currNode.right) ;
                    }
                }
            }
        }

        public static int height(Node root) {
            if(root == null) {
                return 0 ;
            }
            int lh = height(root.left) ;
            int rh = height(root.right) ;
            int Height = Math.max(lh,rh) + 1 ;
            return Height ;
        }

        public static int countNodes(Node root) {
            if(root == null) {
                return 0 ;
            }
            int ln = countNodes(root.left) ;
            int rn = countNodes(root.right) ;
            int count = ln + rn + 1 ;
            return count ;
        }

        public static int sumNode(Node root) {
            if(root == null ) {
                return 0 ;
            }
            
            int lSum = sumNode(root.left) ;
            int rSum = sumNode(root.right) ;
           
            int sumNode = lSum + rSum + root.data ;

            return sumNode ;
        }

        public static int diameter1(Node root) {
            if(root == null) {
                return 0 ;
            }
    
            int leftDiam = diameter(root.left) ;
            int leftHt = diameter(root.left) ;
            
            int rightDiam = diameter(root.right) ;
            int rightHt = diameter(root.right) ;
    
            int selfDiam = leftHt + rightHt + 1 ;
    
            return Math.max(selfDiam , Math.max(rightDiam, leftDiam)) ;
        }

        static class Info {
            int diam ;
            int ht ;

            public Info(int diam , int ht) {
                this.diam = diam ;
                this.ht = ht ;
            }
        }

        public static Info diameter() {


            Info leftinfo = 
        }

    }

    

    public static void main(String args[]) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1} ;

        BinaryTree tree = new BinaryTree() ;
        Node root = tree.buildTree(nodes) ;
        

        // tree.print_PreOrder(root) ;
        
        // tree.print_InOrder(root) ;
        
        // tree.print_PostOrder(root) ;

        // tree.print_LevelOrder(root);

        // System.out.println(tree.height(root));

        // System.out.println(tree.countNodes(root));

        // System.out.println(tree.sumNode(root)) ;

        System.out.println(tree.diameter(root)) ;
        

        



    }
}
