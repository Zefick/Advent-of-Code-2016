package adventofcode2016;

import java.util.stream.IntStream;

/**
 * https://adventofcode.com/2016/day/23
 */
public class Day23 {

    static String[] commands = {
        "cpy a b    ",
        "dec b      ",
        "cpy a d    ",
        "cpy 0 a    ",
        "cpy b c    ",
        "inc a      ",
        "dec c      ",
        "jnz c -2   ",
        "dec d      ",
        "jnz d -5   ",
        "dec b      ",
        "cpy b c    ",
        "cpy c d    ",
        "dec d      ",
        "inc c      ",
        "jnz d -2   ",
        "tgl c      ",
        "cpy -16 c  ",
        "jnz 1 c    ",
        "cpy 71 c   ",
        "jnz 72 d   ",
        "inc a      ",
        "inc d      ",
        "jnz d -2   ",
        "inc c      ",
        "jnz c -5   "
    };

    public static void main(String[] args) {
        Assembunny asm = new Assembunny();
        asm.setRegisters(7, 0, 0, 0);
        asm.setCommands(commands);
        asm.run();
        System.err.println(asm.getRegisters()[0]);
        
        // Answer is n! + 71 * 72
        // for input 12 it takes too much time
        System.err.println(IntStream.range(1, 13).reduce((a, b) ->  a*b).getAsInt() + 71 * 72);
    }

}
