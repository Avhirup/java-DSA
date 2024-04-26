class remove_duplicates {

    public int removeDuplicates(int[] arr) {
        String r = "";

        for (int i = 0; i < arr.length; i++) {
            String currElem = String.valueOf(arr[i]);
            if (r.indexOf(currElem) == -1)
                r = r + currElem;
        }

        for (int i = 0; i < r.length(); i++) {
            // arr[i] = Integer.valueOf(r.charAt(i)) - 48;
            String s = "";
            if (r.charAt(i) == '-') {
                s += r.charAt(i);
                s += r.charAt(i + 1);
                arr[i] = Integer.valueOf(s);
                i++;
            } else {
                // arr[i] = r.charAt(i) - '0';
                arr[i] = Integer.valueOf(r.charAt(i)) - '0';
            }
        }

        return r.length();
    }

    public static void main(String[] args) {

    }
}