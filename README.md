# 💱 Conversor de Moedas

Um programa em Java para conversão de moedas utilizando cotações em tempo real da API [ExchangeRate](https://www.exchangerate-api.com/).

---

## 📋 Funcionalidades Atuais

- Conversão entre moedas principais:
  - USD ↔ BRL (Dólar Americano ↔ Real Brasileiro)
  - USD ↔ EUR (Dólar Americano ↔ Euro)
  - USD ↔ GBP (Dólar Americano ↔ Libra Esterlina)
- Interface simples via terminal
- Atualização automática das taxas de câmbio

---

## 🛠️ Especificações Técnicas

- **Linguagem:** Java 11 ou superior  
- **Dependência:** [Gson](https://github.com/google/gson)  
- **API Externa:** [ExchangeRate API](https://www.exchangerate-api.com/)

---

## ⚙️ Configuração e Uso

### 1. Configure a chave da API

Crie um arquivo `.env` com o conteúdo:

API_KEY=sua_chave_aqui

### 2. Compile e execute

#### No Windows

javac -cp ".;gson-2.8.9.jar" src/**/*.java -d bin
java -cp "bin;gson-2.8.9.jar" app.Main

#### No Linux / macOS

javac -cp ".:gson-2.8.9.jar" src/**/*.java -d bin
java -cp "bin:gson-2.8.9.jar" app.Main

## 🗂️ Estrutura do Projeto

src/
├── app/
│   └── Main.java                # Ponto de entrada da aplicação
├── model/
│   └── Moeda.java               # Record que representa um par de moedas
├── service/
│   └── ConversorMoeda.java      # Lógica de conversão e integração com a API
├── ui/
│   └── Menu.java                # Interface do usuário via terminal
├── util/
│   └── EnvReader.java           # Leitor de variáveis de ambiente (.env)

## 🔮 Melhorias Futuras

- [ ] Desenvolver uma interface gráfica (GUI)
- [ ] Expandir o menu com mais opções de conversão
- [ ] Adicionar histórico de conversões
- [ ] Implementar cache para taxas de câmbio
      
## 📜 Licença

Este projeto está licenciado sob a licença MIT.


