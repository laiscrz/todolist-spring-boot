# Projeto de Lista de Tarefas (To-Do List) com Spring Boot
Este é um projeto de lista de tarefas (To-Do List) construído em Spring Boot como parte de um curso gratuito da Rocketseat. Ele permite que os usuários registrem tarefas, atribuam prioridades e gerenciem suas listas de tarefas de forma eficaz.

## Tecnologias Utilizadas

- **Spring Boot:** Framework Java que simplifica a criação de aplicativos.
- **Docker:** Para facilitar o processo de criação de contêineres e execução do projeto.
- **Hibernate:** Framework de mapeamento objeto-relacional para comunicação com o banco de dados.
- **Bcrypt:** Para a criptografia de senhas.
- **Jakarta Persistence (JPA):** Para gerenciamento de persistência.
- **Maven:** Para gerenciamento de dependências e construção do projeto.

# Uso da API Dog
O projeto utiliza a API Dog para preencher dados, como criar um novo usuário e tarefas. Você pode usar a API Dog para enviar solicitações HTTP e testar as funcionalidades da API.

Para criar um usuário, envie uma solicitação POST para /users com um corpo JSON contendo informações do usuário, como nome, nome de usuário e senha. Para criar uma tarefa, envie uma solicitação POST para /tasks com informações da tarefa, incluindo descrição, título, data de início, data de término e prioridade.

***Nota:** Certifique-se de fornecer o cabeçalho de autenticação com um token válido ao acessar os endpoints protegidos.*


