class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        //FROM SOLUTION SECTION
        int targetIndex = 0;
        int count = 0;

        switch (ruleKey) {
            case "type":
            targetIndex = 0;
            break;
            case "color":
            targetIndex = 1;
            break;
            case "name":
            targetIndex = 2;
            break;
        }

        for(List<String> item : items) {
            count += item.get(targetIndex).equals(ruleValue) ? 1 : 0;
        }

        return count;
    }
}