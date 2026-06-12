# ♟️ Chess

> Abstract: A strategic 8×8 board game for two players built in Java. Played on a board of 64 squares arranged in 8 rows and columns. Each player starts with 16 pieces — 8 pawns, 2 rooks, 2 bishops, 2 knights, 1 queen, and 1 king. Supports both Player vs Player and Player vs Computer modes.

---

## 🛠️ Platform, Libraries and Frameworks

| Technology | Description |
|------------|-------------|
| [Java](https://www.java.com) | Core programming language used to build the entire application |
| Java Swing / AWT | GUI framework for rendering the chessboard and pieces |

---

## 🎮 Features

- ♟️ Full chess rule implementation (legal moves, check, checkmate, stalemate)
- 👤 Player vs Player mode
- 🖥️ Graphical User Interface using Java Swing
- 🔄 Turn-based gameplay with move validation

---

## 🚀 Deployment Steps

Make sure you have **Java JDK 8+** installed on your system.

1. Clone the repository
   ```bash
   git clone https://github.com/RehanKhan1704/Chess.git
   cd Chess
   ```

2. Compile the source files
   ```bash
   javac -d out src/*.java
   ```

3. **Run the application**
   ```bash
   java -cp out Main
   ```

> Alternatively, open the project in **IntelliJ IDEA** or **Eclipse** and run `Main.java` directly.

---

## 📁 Project Structure

Chess/
├── src/
│   └── *.java        # All Java source files
└── README.md

- [Chess Rules — FIDE Official](https://www.fide.com/fide/handbook.html)
- [Java Swing Documentation](https://docs.oracle.com/javase/8/docs/api/javax/swing/package-summary.html)
- [Object Oriented Programming in Java](https://docs.oracle.com/javase/tutorial/java/concepts/)
