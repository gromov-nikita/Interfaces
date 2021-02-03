/*
Exercise 10: (3) Modify Musics.java by adding a Playable interface. Move the play( )
declaration from Instrument to Playable. Add Playable to the derived classes by
including it in the implement s list. Change tune( ) so that it takes a Playable instead of
an Instrument.
 */
public class Music5 {
    // Doesn’t care about type, so new types
    // added to the system still work right:
    static void tune(Playable i) {
        // ...
        i.play(Note.MIDDLE_C);
    }
    static void tuneAll(Playable[] e) {
        for(Playable i : e)
            tune(i);
    }
    public static void main(String[] args) {
        // Upcasting during addition to the array:
        Playable[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        tuneAll(orchestra);
    }
}