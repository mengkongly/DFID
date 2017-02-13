package main;

public class NewDFID {
	boolean maxDepth = false;
	boolean skipRecursivePaths = false;
	
	String results = "Goal not found.";
	int i=1;
	public String dfid(TreeNode t, String goal){
		int depth = 0;
		//check if the first node is a goal
		if(depth==0 && t.getValue().contains(goal)){
			return "Goal "+t.getValue()+" found at the depth "+(depth+1);
		}
		
		while (!maxDepth)
		{
			if(skipRecursivePaths)	return results+(depth+1);
			//System.out.println(results);
			System.out.println("depth:"+(depth+1));
			maxDepth = true;
			depth += 1;
			dls((TreeNode)t, goal, depth);
		}
		if(skipRecursivePaths)return results+(depth+1);
		else return results;
		
	}
	public void dls(TreeNode node, String goal, int depth)
	{
		if(skipRecursivePaths) return;
		//System.out.println(depth);
		
		//System.out.println("value:"+node.getValue());
		if (depth == 0 && node.getValue().contains(goal)){
			//to terminate all recursive
			skipRecursivePaths	=	true;
			
			//set maxDepth to false if the node has children
			if (!node.getChildren().isEmpty()){
				maxDepth = false;
			}
			
			results	=	"Goal "+node.getValue()+" found at the depth ";
			if(skipRecursivePaths) return;			
			
		}else if (depth > 0){
			//System.out.println("\n\nDept "+i+":"+node.getValue());
			i++;
			for(TreeNode child : node.getChildren()){
				dls(child, goal, depth-1);
			}
		}else{
			//System.out.println("=>"+node.getValue());
			maxDepth	=	false;
		}
	}
}
