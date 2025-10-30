# Observer Pattern - Basquete

Implementação do padrão Observer aplicado ao contexto de testes em basquete.

## Como executar

```bash
cd basquete
mvn clean test
```

## Classes

- **EquipeBasquete**: Observable que notifica quando resultados de testes são registrados
- **Jogador**: Observer que recebe notificações da equipe
- **JogadorTest**: Testes unitários

## Exemplo

```java
EquipeBasquete equipe = new EquipeBasquete("Lakers", "2024/2025", "Profissional", "Teste Físico");
Jogador jogador = new Jogador("LeBron James");

jogador.integrarEquipe(equipe);
equipe.registrarResultadosTestes(); // Jogador é notificado
```