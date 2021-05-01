//progama que cria um número aleatório simulando a idade e verificar se pode doar sangue

//idade mínima e máxima
const val MAX_AGE = 68
const val MIN_AGE = 16 

fun main() {
   val idade = (1..100).random()
   println(idade.toString()+" anos")
   if(idade in MIN_AGE..MAX_AGE){
       println("Pode doar sangue")
   }else{
       println("não pode doar sangue")
   }
}