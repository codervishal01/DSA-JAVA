
public class bitwiseOperator {
//     | Operator | Name                 | Description                                                    |                                   |
// | -------- | -------------------- | -------------------------------------------------------------- | --------------------------------- |
// | `&`      | Bitwise AND          | Performs AND operation on each bit                             |                                   |
// | \`       | \`                   | Bitwise OR                                                     | Performs OR operation on each bit |
// | `^`      | Bitwise XOR          | Performs exclusive OR on each bit                              |                                   |
// | `~`      | Bitwise Complement   | Inverts all bits                                               |                                   |
// | `<<`     | Left Shift           | Shifts bits to the left (multiplies by 2)                      |                                   |
// | `>>`     | Right Shift          | Shifts bits to the right (divides by 2)                        |                                   |
// | `>>>`    | Unsigned Right Shift | Shifts bits to the right with zero fill (no sign bit involved) |                                   |

    public static void main(String[] args) {
        int a = 5;  // 0101 in binary
        int b = 3;  // 0011 in binary

        // Bitwise AND
        // 0101 & 0011 = 0001 (1)
        System.out.println("a & b = " + (a & b)); // Output: 1

        // Bitwise OR
        // 0101 | 0011 = 0111 (7)
        System.out.println("a | b = " + (a | b)); // Output: 7

        // Bitwise XOR
        // 0101 ^ 0011 = 0110 (6)
        System.out.println("a ^ b = " + (a ^ b)); // Output: 6

        // Bitwise Complement
        // ~a = ~(0101) = 1010 (in 2's complement: -6)
        System.out.println("~a = " + (~a)); // Output: -6

        // Left Shift
        // a << 1 = 0101 << 1 = 1010 (10)
        System.out.println("a << 1 = " + (a << 1)); // Output: 10

        // Right Shift
        // a >> 1 = 0101 >> 1 = 0010 (2)
        System.out.println("a >> 1 = " + (a >> 1)); // Output: 2

        // Unsigned Right Shift
        int c = -8; // 11111111 11111111 11111111 11111000 (in 32-bit)
        // c >>> 2 shifts all bits 2 steps right, fills with 0
        System.out.println("c >>> 2 = " + (c >>> 2)); // Large positive value

        // Binary values print
        System.out.println("Binary of a = " + Integer.toBinaryString(a));
        System.out.println("Binary of b = " + Integer.toBinaryString(b));
    }
}


