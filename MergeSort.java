public class MergeSort {
	public static void main(String[] args) {
		int[] array = {6, 3, 2, 5, 1, 7, 4};
		int[] array2 = new int[7];
		
		for (int i = 0; i < 7; i++) {
			array2[i] = array[i];
		}
		
		for (int runLength = 1; runLength < array.length; runLength *= 2) {
			for (int i = 0; i < array.length; i += 2 * runLength) {
				for (
					int j = i, k = i + runLength, index = i;
					index < i + 2 * runLength && index < array.length;
					index++
			    ) {
					if (j == i + runLength) {
						array2[index] = array[k++];
					}
					
					else if (k == i + 2 * runLength || k >= array.length) {
						array2[index] = array[j++];
					}
					
					else {
						if (array[j] < array[k]) {
							array2[index] = array[j++];
						}
						
						else {
							array2[index] = array[k++];
						}
					}
				}
			}
			
			int[] tmp = array;
			array = array2;
			array2 = tmp;
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}