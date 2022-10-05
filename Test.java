public class Test {
    static void printNGE(int arr[], int n) {
        int i = 0;
        stack s = new stack();
        s.top = -1;
        int element, next;
        s.push(arr[0]);
       
        for (i = 1; i < n; i++) {
          next = arr[i];
       
          if (s.isEmpty() == false) {
            element = s.pop();
       
            while (element < next) {
              System.out.println(element + " --> " +
                next);
              if (s.isEmpty() == true)
                break;
              element = s.pop();
            }
       
            if (element > next)
              s.push(element);
          }
       
          s.push(next);
        }
        while (s.isEmpty() == false) {
          element = s.pop();
          next = -1;
          System.out.println(element + " -- " + next);
        }
      }
}
