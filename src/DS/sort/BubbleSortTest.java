package DS.sort;

class BubbleSort{

    boolean isSwapped;

    public void sort(int a[]){
        sort(a, a.length);
    }
    public void sort(int a[], int length){
        //round는 배열의 크기 -1만큼 진행됨
        for(int i = 1; i<length ; i++){

            isSwapped = false;

            //round별 비교횟수는 배열 크기의 현재 라운드를 뺀 만큼 비교
            for(int j=0;j<length-i;j++){
                /**
                 * 현재 원소가 다음 원소보다 클 경우
                 * 서로 원소의 위치를 swap
                 * */
                if(a[j]>a[j+1]){
                    swap(a,j,j+1);
                    isSwapped = true;
                }
            }
            
            //스왑된적이 없다면 반복문 종료
            if(!isSwapped){
                break; 
            }
        }
    }
    public void swap(int a[],int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}

public class BubbleSortTest {

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] arr = new int[] {1,2,3,4,5};

        bubbleSort.sort(arr);

        for (int a:
             arr) {
            System.out.print(a + " ");
        }
    }


}
