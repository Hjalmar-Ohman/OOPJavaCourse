package lab2;

public class Main {
    public static void main(String[] args) {
        Game g = new Game();
        g.run();
        
    }
}

/* 
Game Map:
Shire
|
Rivendell   -  Prancing Pony
|   				
Moria    BALROG  Mordor

0
|
1 - 2
|   |
3 - 4

Game Plan:
Få elven robe av Gandalf i shire.
Få svärd i rivendell
Döda balrog för att komma vidare. Går om man har svärd.
Hitta Frodo död och ta ringen. Går om man har elven robe.
Gå till Mordor och använd ringen. Vinn.
*/