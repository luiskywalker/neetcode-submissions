class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        
        // Paso 1: Almacenar en 'answer' el producto de todos los elementos a la izquierda de i
        answer[0] = 1; // No hay elementos a la izquierda del primer índice
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }
        
        // Paso 2: Multiplicar dinámicamente por los elementos a la derecha de i
        int derecha = 1; // Almacena el producto acumulado desde la derecha
        for (int i = n - 1; i >= 0; i--) {
            answer[i] *= derecha; // Combina izquierda con derecha
            derecha *=  nums[i]; // Actualiza el acumulado de la derecha para la siguiente iteración
        }
        
        return answer;
    }
}  
