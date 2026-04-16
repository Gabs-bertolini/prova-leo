# Provaleo

Aplicativo Android simples para cadastro e listagem de produtos em estoque.

## Funcionalidades

- Cadastro de produto com nome, código, preço e quantidade
- Validação de campos obrigatórios
- Validação de preço positivo com até duas casas decimais
- Validação de quantidade como inteiro positivo
- Armazenamento local usando Room Database
- Tela de listagem exibindo nome, código, preço e quantidade
- Navegação entre tela de cadastro e tela de lista

## Tecnologias

- Java
- Android SDK
- Room Database
- RecyclerView
- ViewModel

## Estrutura

- `MainActivity.java`: tela de listagem de produtos
- `AddProductActivity.java`: tela de cadastro de produto
- `Product.java`: entidade Room
- `ProductDao.java`: interface de acesso ao banco
- `ProductDatabase.java`: implementação do banco Room
- `ProductViewModel.java`: ViewModel para dados de produto
- `ProductAdapter.java`: adapter do RecyclerView

## Como usar

1. Abra o projeto no Android Studio.
2. Sincronize o Gradle.
3. Rode o app em um dispositivo ou emulador.
4. Utilize o botão "Adicionar Produto" para cadastrar itens.
5. A lista será atualizada automaticamente com os produtos cadastrados.

## Observações

- O projeto foi desenvolvido para rodar com minSdk 24.
- A navegação entre telas é feita por Activities.
