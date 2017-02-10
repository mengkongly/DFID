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
