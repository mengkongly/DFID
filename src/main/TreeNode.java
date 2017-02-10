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
