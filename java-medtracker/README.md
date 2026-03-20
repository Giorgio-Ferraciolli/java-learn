# 💊 MedTracker

Um projetinho simples que criei para praticar Java e Spring Boot. A ideia é ser um controle básico de medicamentos: você cadastra o remédio, a dosagem e o horário que precisa tomar. Bem direto ao ponto, inspirado na simplicidade do app nativo de saúde do iPhone.

## 🛠️ O que tem debaixo do capô?

Como o foco aqui é aprendizado, usei o "feijão com arroz" do ecossistema Java moderno:

* **Java 17** + **Spring Boot** (Backend)
* **Thymeleaf** (Para criar a interface HTML renderizada no servidor)
* **H2 Database** (Banco de dados em memória. Os dados resetam quando o app desliga, o que é ótimo para testar rápido)
* **Bootstrap 5** (Pra deixar a tela bonitinha e responsiva sem muito esforço com CSS)
* **Docker** (Pra empacotar tudo e rodar sem dor de cabeça)

## 🚀 Como rodar na sua máquina

A melhor parte: você não precisa instalar o Java nem configurar banco de dados. Só precisa ter o **Docker** rodando no seu computador.

1. Clone este repositório:
   ```bash
   git clone [https://github.com/Giorgio-Ferraciolli/java-learn.git](https://github.com/Giorgio-Ferraciolli/java-learn.git)
   cd java-learn
