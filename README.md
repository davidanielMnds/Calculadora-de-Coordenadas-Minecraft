# 🧭 Calculadora de Coordenadas Minecraft

Ferramenta desktop para conversão de coordenadas entre **Overworld** e **Nether** no Minecraft Java Edition.

<img width="482" height="549" alt="{EA1FE91B-FD92-405D-A1A0-250952873126}" src="https://github.com/user-attachments/assets/aad1f28c-5a01-49bf-a481-c652e44908c0" />


---

## ✨ Funcionalidades

- Conversão **Overworld → Nether**
- Conversão **Nether → Overworld**
- Campo de **blocos a pular** para ajuste de offset
- Botões desativados automaticamente enquanto os campos estiverem vazios
- Botão **Copiar** para copiar o resultado direto pro clipboard

---

## 🚀 Como usar

1. Baixe o `.exe` na aba [Releases](https://github.com/davidanielMnds/Calculadora-de-Coordenadas-Minecraft/releases)
2. Execute o arquivo — **requer Java 21 instalado**
3. Insira as coordenadas X e Z
4. Clique no método de conversão desejado
5. Copie o resultado

---

## 🧮 Como funciona

O Nether tem escala 1:8 em relação ao Overworld:

| Conversão | Fórmula |
|---|---|
| Overworld → Nether | `(X + offset) / 8` |
| Nether → Overworld | `(X + offset) * 8` |

---

## 🛠️ Tecnologias

- Java 8+
- Swing (GUI)
- Padrão Singleton

---

## 📋 Requisitos

- Java 21 

---

## 📁 Estrutura do projeto

```
src/
├── model/
│   └── Coordenada.java
├── ui/
│   └── Tela.java
assets/
└── cat.gif
```

---
