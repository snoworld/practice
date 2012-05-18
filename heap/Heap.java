/* works for int array 
 * data index starts from 1
 */

public class Heap {
	
	private int length;
	
	public Heap(int len){
		length = len;
	}
	
	/* return an index */
	public int getParent(int i){
		return i>>1;
	}
	
	public int getLeft(int i){
		return i<<1;
	}
	
	public int getRight(int i){
		return 1+(i<<1);
	}
	
	/* assumes that the binary trees rooted at LEFT(i) and RIGHT(i)
	 * are max-heaps, but A[i] might be smaller than its children, thus 
	 * violating the max-heap property.
	 */
	public void maxHeapify(int[] arr, int i){
		int l = getLeft(i);
		int r = getRight(i);
		int max = i;
		if (l < this.length && arr[l] > arr[max]){
			max = l;
		}
		if (r < this.length && arr[r] > arr[max]){
			max = r;
		}
		if (max != i){
			int temp = arr[i];
			arr[i] = arr[max];
			arr[max]= temp;
			maxHeapify(arr,max);			
		}		
	}
	
	public void buildMaxHeap(int[] arr){
		int i;
		for(i=(arr.length>>1);i>0;i--){
			maxHeapify(arr,i);
		}
	}
	
	private void swap(int[] arr, int a, int b){
		int temp;
		temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}	
	
	public void heapSort(int[] arr){
		int i;
		buildMaxHeap(arr);
		for(i=arr.length-1;i>1;i--){	
			swap(arr,i,1);
			length--;
			maxHeapify(arr,1);
		}		
	}
	
	public void printArray(int[] arr){
		int i;
		for(i=1;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args){
		int i=5;
		int[] arr1 = {0,16,4,10,14,7,9,3,2,8,1};
		Heap h1 = new Heap(arr1.length);
		System.out.println("getParent: "+ h1.getParent(i));
		System.out.println("getLeft: "+ h1.getLeft(i));
		System.out.println("getRight: "+ h1.getRight(i));
		h1.maxHeapify(arr1,2);
		h1.printArray(arr1);
		System.out.println();
		
		int[] arr2 = {0,4,1,3,2,16,9,10,14,8,7};
		Heap h2 = new Heap(arr2.length);
		h2.buildMaxHeap(arr2);
		h2.printArray(arr2);
		System.out.println();
		
		h2.heapSort(arr2);
		h2.printArray(arr2);
		
	}
}
