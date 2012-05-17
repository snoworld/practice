/* works for int array */

public class Heap {
	
	int length;
	
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
		System.out.println(l+" , "+r);
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
			//System.out.println(max);
			maxHeapify(arr,max);
			
		}		
	}
	
	public static void main(String[] args){
		int i=5;
		int[] array = {16,4,10,14,7,9,3,2,8,1};
		Heap h = new Heap(array.length);
		System.out.println("getParent: "+ h.getParent(i));
		System.out.println("getParent: "+ h.getLeft(i));
		System.out.println("getParent: "+ h.getRight(i));
		h.maxHeapify(array,1);
		/*for(i=0;i<h.length;i++){
			System.out.print(array[i]+" ");
		}*/
	}
}
