class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();//To keep track of string representation

        for(int r=0;r<board.length; r++){
            for(int c=0;c<board[r].length;c++){
                if(board[r][c]=='.') continue;//when we find a '.' skip it, only consider digit
                
                if(!seen.add(stringify("row", r, board[r][c])) ||
                   !seen.add(stringify("col", c, board[r][c])) ||
                    !seen.add(stringify("box", r / 3, c / 3, board[r][c]))){//If any of the representations are already in the set
                        return false;                                       //we can return false
                 }

            }
        }
        return true;
    }

    private String stringify(String d, int num, char value){
        String s = new StringBuilder(d)
        .append("-")
        .append(num)
        .append("#")
        .append(value)
        .toString();
        System.out.println(s);
        return s;
    }

    private String stringify(String box, int r, int c, char value){
        String s = new StringBuilder(box)
        .append("-")
        .append(r)
        .append("-")
        .append(c)
        .append("#")
        .append(value)
        .toString();
         System.out.println(s);
        return s;
    }
}
