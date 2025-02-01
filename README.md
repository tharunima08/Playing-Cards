# Playing Cards in Java

This project is a Java implementation of a standard deck of playing cards. It provides functionality for creating a deck, shuffling, drawing cards, and sorting based on color, suit, and rank.

## Features

- **Enums for Suit, Rank, and Color:** Defines `Suit`, `Rank`, and `Color` using enums for clean and structured code.
- **Deck Class:** Contains a full deck of cards and provides functionalities like shuffling, drawing, and sorting.
- **Card Class:** Represents individual playing cards with attributes for suit, rank, and color.
- **Sorting Mechanism:** Sorts cards by color, suit, and rank using a custom comparator.
- **Shuffle and Draw:** Shuffles the deck and allows cards to be drawn until the deck is empty.

## How to Use

1. Clone the repository:
   ```bash
   git clone https://github.com/tharunima08/playing-cards-java.git
Navigate to the project directory:
bash


cd playing-cards-java
Compile the Java file:
bash


javac playing_cards_in_java.java
Run the program:
bash


java PalyingCards
Classes and Enums
1. Suit
Defines the four suits: Spade, Club, Heart, and Diamond.

2. Rank
Defines the ranks from Ace (A) to 10, Jack (J), Queen (Q), and King (K).

3. Color
Defines the colors Red and Black.

4. Card
Represents an individual playing card with the following methods:

getSuit(): Returns the suit of the card.
getRank(): Returns the rank of the card.
getColor(): Returns the color of the card based on the suit.
toString(): Returns a string representation of the card.
5. Deck
Represents a deck of cards with the following methods:

Shuffle(): Shuffles the deck.
DrawCard(): Draws the top card from the deck.
Sort(): Sorts the deck by color, suit, and rank.
Size(): Returns the size of the remaining deck.
Example Output
Below is an example of how the program works:

csharp
Deck{ c= [A of Spade, J of Spade, ..., ten of Diamond] }
Size is 52
Size is 51
Deck{ c= [Random shuffled cards] }
Size is 51
Card drawn is Q of Diamond
Requirements
Java Development Kit (JDK) version 8 or above.
