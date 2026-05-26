import 'dart:ffi';
import 'dart:io';

//Atividade 01
// void main() {
//     List <String> produtos = ['Arroz','Feijão', 'Macarrão', 'Leite', 'Café']; 
//     produtos.add('Carne');
//     produtos.add('Verdura');
    // print(produtos);

    // produtos.forEach((produtos) {
    //     print(produtos);
    // });

    // for (int i = 0; i < produtos.length; i++) {
    //     print('Indice $i ${produtos[i]}');
    // }      

    // produtos.remove('Arroz');
    // print(produtos);

    // produtos.removeAt(1);
    // print(produtos);

    // print('Quantidade de elementos:  ${produtos.length}');

    // if (produtos.length == 0) {
    //     print('A lista está vazia!');
    // } else {
    //     print('A lista não está vazia!');
    // }
// }

//Atividade 02
// void main() {
//     List <String> presentes = [];
//     presentes.add('Bruno');
//     presentes.add('Eduardo');
//     presentes.add('Diogenes');
//     presentes.add('Davi');
//     presentes.add('Guilherme');

    // presentes.forEach((presentes){
    //     print(presentes);
    // });

    // for (int i = 0; i < presentes.length; i++) {
    //     print('ID: [$i] ${presentes[i]}');
    // }
    // String nome = 'Bruo';
    // bool listado = false;

    // for (int i = 0; i < presentes.length; i++) {
    //     if (nome == presentes[i]) {
    //         listado = true;
    //         print('Aluno foi encontrado posição $i');
    //     }
    //     if (!listado){
    //         print('Aluno não foi encontrado');
    //     }
    // }

    // presentes.remove('Bruno');
    // print(presentes);
    // print('Alunos presentes = ${presentes.length}');
// }

//Atividade 03
// void main() {
//     List <int> numeros = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18];
//     for (int i = 0; i < numeros.length; i++) {
//         if (numeros[i] % 2 == 0) {
//             print('${numeros[i]} é par');
//         } else {
//             print('${numeros[i]} é impar');
//         }
//     }
// }

//Atividade 04
// void main() {
//     List <String> nomes = ['Matheus', 'João', 'Pedro', 'Kaio', 'Luís'];
//     nomes.forEach((nomes) {
//         print('Seja bem vindo $nomes');
//     });
// }

//Atividade 05
// void main() {
//     List <double> notas = [8.00, 9.00, 10.00, 7.00];
//     double media = (notas[0] + notas[1] + notas[2] + notas[3]) / 4;
//     print('A média da turma é $media');
// }

//Atividade 06
// void main() {
//     List <String> produtos = ['Disponível', 'Indisponível', 'Disponível', 'Disponível', 'Indisponível'];
//     for (int i = 0; i < produtos.length; i++) {
//         if (produtos[i] == 'Indisponível') {
//             produtos.removeAt(i);
//         }
//     }
//     print(produtos);
// }