class Solution {
    public String reorderSpaces(String text) {
        String[] words = text.trim().split("\\s+");
        int size = words.length,
            spaces = (int)text.chars().filter(c -> c == ' ').count(),
            gap = (size > 1)? spaces/(size-1): 0,
            tailingSpace = spaces - gap*(size-1);
        return String.join(" ".repeat(gap), words) + " ".repeat(tailingSpace);
    }
}