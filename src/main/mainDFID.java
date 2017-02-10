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
		
		/*
		 * 	1
		 * 	|-	2
		 * 	|	|-	4
		 * 	|	|	|-	7
		 * 	|	|	
		 * 	|	|-	5
		 * 	|		|-	8
		 * 	|		|-	9
		 * 	|-	3
		 * 		|-	6
		 * 			|-	10
		 * 			|-	11
		 * 
		 */
		
		
		NewDFID dfid	=	new NewDFID();
		List<String> result	=	dfid.dfid(n1, "9");
		
		
		
		System.out.println("Result:"+result);
	}
	
	
	
	
	
	
	
}
