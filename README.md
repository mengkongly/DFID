# DFID
DFID for AI homework

# Initialize the tree list in main
#
# 	1
#  	|-	2
#  	|	|-	4
#  	|	|	|-	7
#  	|	|	
#  	|	|-	5
# 	|		|-	8
#  	|		|-	9
#  	|-	3
#  		|-	6
#  			|-	10
#  			|-	11
#  


Start Node is "1"
The goal that we find is "9"


# Main Running
package main;
import java.util.List;

import main.TreeNode;

public class mainDFID {
	
	public static void main(String[] args) {
		TreeNode n7	=	new TreeNode("7");
		TreeNode n8	=	new TreeNode("8");
		TreeNode n9	=	new TreeNode("9");
		TreeNode n10	=	new TreeNode("10");
		TreeNode n11	=	new TreeNode("11");
		
		TreeNode n4	=	new TreeNode("4");
		n4.addChildren(n7);

		TreeNode n5	=	new TreeNode("5");
		n5.addChildren(n8);
		n5.addChildren(n9);
		
		TreeNode n6	=	new TreeNode("6");
		n6.addChildren(n10);
		n6.addChildren(n11);
		
		TreeNode n2	=	new TreeNode("2");
		n2.addChildren(n4);
		n2.addChildren(n5);
		
		TreeNode n3 =	new TreeNode("3");
		n3.addChildren(n6);
		
		TreeNode n1 =	new TreeNode("1");
		n1.addChildren(n2);
		n1.addChildren(n3);
		
		NewDFID dfid	=	new NewDFID();
		List<String> result	=	dfid.dfid(n1, "9");
		
		System.out.println("Result:"+result);
	}
}

# TreeNode Class
package main;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
	private List<TreeNode> children = null;
    private String value;
    
    public TreeNode(){
    	
    }
    public TreeNode(String value){
    	this.children=new ArrayList<>();
    	this.value=value;
    }
    
	public List<TreeNode> getChildren() {
		return children;
	}
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public void addChildren(TreeNode child)
    {
        children.add(child);
    }

}


# DFID algorithms
package main;
import java.util.ArrayList;
import java.util.List;

public class NewDFID {
	boolean maxDepth = false;
	List<String> results = new ArrayList<String>();
	int i=1;
	public List<String> dfid(TreeNode t, String goal)
	{
		int depth = 0;
		while (!maxDepth)
		{
			//System.out.println(results);
			maxDepth = true;
			depth += 1;
			dls((TreeNode)t, goal, depth);
		}
		return results;
	}
	public void dls(TreeNode node, String goal, int depth)
	{
		//System.out.println(depth);
		
		//System.out.println("value:"+node.getValue());
		if (depth == 0 && node.getValue().contains(goal)){
			//set maxDepth to false if the node has children
			if (!node.getChildren().isEmpty()){
				maxDepth = false;
			}
			results.add(node.getValue());
		}else if (depth > 0){
			System.out.println("\n\nDept "+i+":"+node.getValue());
			i++;
			for(TreeNode child : node.getChildren()){
				dls(child, goal, depth-1);
			}
		}else{
			System.out.println("=>"+node.getValue());
			maxDepth	=	false;
		}
	}
}


