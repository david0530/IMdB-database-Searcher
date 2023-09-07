
public class BSTIndex {
	
	private Node root;	
	public class Node {
		String key;
		MovieInfo data;
		Node left, right;
		
		public Node(String key, MovieInfo mov) {
			this.key = key;
			this.data = mov;
		}
	} 
	
	public BSTIndex() {
		root = null;
	}
	
	public MovieInfo findExact(String key) {
		Node fnode = root;
		while (fnode!=null) {
			int compare = key.compareToIgnoreCase(fnode.key);		
			if (compare<0) {
				fnode = fnode.left;
			}
			else if (compare>0) {
				fnode = fnode.right;
			}
			else {
				return fnode.data;									
			}
		}
		
		return null;
	}
	
	public MovieInfo findPrefix(String prefix) {
	    prefix = prefix.substring(0, prefix.indexOf('*'));
	    Node node = root;
	    while (node != null) {
	        prefix = prefix.toLowerCase();
	        String lowercaseNodeKey = node.key.toLowerCase();

	        boolean there = lowercaseNodeKey.startsWith(prefix);
	        if (!there) {
	            int compare = prefix.compareTo(lowercaseNodeKey);

	            if (compare == 0) {
	                return node.data;
	            } else if (compare < 0) {
	                node = node.left;
	            } else {
	                node = node.right;
	            }
	        } else {
	            return node.data;
	        }
	    }
	    return null;
	}
	public void insert(MovieInfo data) {
		root = insert(root,data);
	}	
	
	public Node insert(Node node, MovieInfo movie) {
		if (node==null) {
			return new Node(movie.shortName,movie);
		}		
		int compare = movie.shortName.compareTo(node.key);		
		if (compare<0) {
			node.left = insert(node.left,movie);
		}		
		else if (compare>0) {
			node.right = insert(node.right,movie);
		}		
		else {
			node.data = movie;
		}
		return node;
	}
	
}