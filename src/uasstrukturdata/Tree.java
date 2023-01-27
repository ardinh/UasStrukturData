/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uasstrukturdata;

/**
 *
 * @author ardin
 */
public class Tree {
    private TreeNode root;
    private int size;

    public void insert(int value){
        if(root == null){
            root = new TreeNode(value);
        }
        else{
            root.insert(value);
        }
        size++;
    }

    public int min(){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        else{
            return root.min();
        }
    }
    public int max(){
        if(root == null){
            return Integer.MAX_VALUE;
        }
        else{
            return root.max();
        }
    }

    public TreeNode get(int value){
        if(root != null){
            return root.get(value);
        }

        return null;
    }


    public void traverseInOrder(){
        if(root != null){
            root.traverseInOrder();
        }
    }
    
    public int size(){
        return size;
    }
}
