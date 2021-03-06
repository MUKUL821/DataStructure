package designSystems;

import java.util.HashMap;

/**
 * Your task is to design the basic function of Excel and implement the function of sum formula. 
 * Specifically, you need to implement the following functions:
Excel(int H, char W): This is the constructor. The inputs represents the height and width of the Excel form. 
H is a positive integer, range from 1 to 26. It represents the height. 
W is a character range from 'A' to 'Z'. It represents that the width is the number of characters from 'A' to W. 
The Excel form content is represented by a height * width 2D integer array C,
it should be initialized to zero. You should assume that the first row of C starts from 1, 
and the first column of C starts from 'A'.
void Set(int row, char column, int val): Change the value at C(row, column) to be val.
int Get(int row, char column): Return the value at C(row, column).
int Sum(int row, char column, List of Strings : numbers): 
This function calculate and set the value at C(row, column),
 where the value should be the sum of cells represented by numbers.
This function return the sum result at C(row, column). 
This sum formula should exist until this cell is overlapped by another value or another sum formula.
numbers is a list of strings that each string represent a cell or a range of cells.
 If the string represent a single cell, then it has the following format : ColRow. 
 For example, "F7" represents the cell at (7, F).
If the string represent a range of cells, then it has the following format : ColRow1:ColRow2. 
The range will always be a rectangle, and ColRow1 represent the position of the top-left cell,
and ColRow2 represents the position of the bottom-right cell.
 * 
 * ***/
public class Excel {
    Cell[][] table;

    public Excel(int H, char W) {
        table = new Cell[H+1][W-'A'+1];
    }
    
    public void set(int r, char c, int v) {
        if(table[r][c-'A'] == null) table[r][c-'A'] = new Cell (v); 
        else table[r][c-'A'].setValue(v); 
    }
    
    public int get(int r, char c) {
        if( table[r][c-'A'] == null) return 0;
        else return table[r][c-'A'].getValue();  
    }
    
    public int sum(int r, char c, String[] strs) {
        if (table[r][c-'A'] == null) {
            table[r][c-'A'] = new Cell(strs);
        } else {
            table[r][c-'A'].setFormula(strs);
        }
        
        return table[r][c-'A'].getValue();
    }
    
    
    private class Cell{
        int val=0;
        HashMap<Cell, Integer> formula=new HashMap<>();//one cell might appear multiple times
        
        public Cell(int val){
            setValue(val); 
        }
        public Cell(String[] formulaStr){
            setFormula(formulaStr);
        }
        
        public void setValue(int val) {           
            formula.clear(); //will not be treated as a formula cell anymore        
            this.val = val;
        }
        
        public void setFormula(String[] formulaStr){
            formula.clear();            
            for(String str : formulaStr){
                if (str.indexOf(":")<0){
                    int[] pos = getPos(str);
                    addFormulaCell(pos[0], pos[1]);
                } else {
                    String[] pos = str.split(":");
                    int[] startPos = getPos(pos[0]);
                    int[] endPos = getPos(pos[1]);
                    for(int r = startPos[0]; r<=endPos[0]; r++){
                        for(int c = startPos[1]; c<=endPos[1]; c++){
                            addFormulaCell(r, c);
                        }
                    }
                }
            }
        }
        
        private int[] getPos(String str){
            int[] pos = new int[2];
            pos[1]=str.charAt(0)-'A';
            pos[0]=Integer.parseInt(str.substring(1));
            return pos;
        }
        
        private void addFormulaCell(int r, int c){
            if(table[r][c] == null) table[r][c] = new Cell(0);
            Cell rangeCell = table[r][c];                            
            formula.put(rangeCell, (formula.containsKey(rangeCell)? formula.get(rangeCell) : 0)+1);
        }
        
        //recursive method
        private int getValue(){
            if(this.formula.isEmpty()) return this.val;
            int sum = 0;
            for(Cell cell : formula.keySet()){
                sum+=cell.getValue()*formula.get(cell);
            }
            return sum;
        }
    }
}