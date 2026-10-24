public class LexikographSort {
    public static void main (String[] args) {
        System.out.println (compare('ё','ё'));
        System.out.println (compare('ё','e'));
        System.out.println (compare('ё','ж'));
        System.out.println (compare('е','ё'));
        System.out.println (compare('ж','ё'));
        System.out.println (compare('а','и'));
        System.out.println (compare("самира", "ульяна"));
        String[] a = {"степанова","шариазданова","кабалина"};
        sort(a);
        for(int i = 0;i < a.length; ++i) {
            System.out.println(a[i]);
        }

    }
    public static int compare (char a, char b){
      if(a =='ё' && b =='ё') return 0;
        if(a =='ё'){
            if(b<'ж') return 1;
            else return -1;
        }
        if (b=='ё'){
            if (a<'ж') return -1;
            else return 1;
        }
        return a-b;
    }
    public static int compare(String a, String b) {
        int minLength = a.length() > b.length() ? b.length() : a.length();
        for (int i = 0; i < minLength; ++i) {
            int res = compare(a.charAt(i), b.charAt(i));
            if (res != 0)
                return res;
        }
        return a.length() - b.length();
    }
    public static void sort(String[] a){
        for(int i = 0;i < a.length - 1; ++i) {
            for(int j = 0;j < a.length - 1; ++j) {
                if (compare(a[j],a[j + 1]) > 0){
                    String temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }

            }
        }
    }
}