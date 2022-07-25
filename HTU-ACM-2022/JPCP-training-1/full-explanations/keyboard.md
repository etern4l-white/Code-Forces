# Keyboard

Our good friend Mole is trying to code a big message. He is typing on an unusual keyboard with characters arranged in following way:
<strong><br>qwertyuiop<br>
asdfghjkl;<br>
zxcvbnm,./</strong>

Unfortunately Mole is blind, so sometimes it is problem for him to put his hands accurately. He accidentally moved both his hands with one position to the left or to the right. That means that now he presses not a button he wants, but one neighboring button (left or right, as specified in input).
<br>We have a sequence of characters he has typed and we want to find the original message.

## **Input**

First line of the input contains one letter describing direction of shifting ('L' or 'R' respectively for left or right).

Second line contains a sequence of characters written by Mole. The size of this sequence will be no more than 100. Sequence contains only symbols that appear on Mole's keyboard. It doesn't contain spaces as there is no space on Mole's keyboard.

It is guaranteed that even though Mole hands are moved, he is still pressing buttons on keyboard and not hitting outside it.

## **Output**

Print a line that contains the original message.

#

## Solution:
Make a list of the characters specified in the question. Then based on the shifting direction, find the corresponding character in the opposite direction. For example, if the direction is L (left), then take each character and see its corresponding character from the right.

### Code (Python)

```
f = [x for x in "qwertyuiopasdfghjkl;zxcvbnm,./"] # A list that includes keyboard letters
shift = input() # recieve shift direction
sentence = input()  # recieve the string to apply the shift on
if shift.lower() == "r":
    for i in sentence: # for every character in the string
        print(f[f.index(i) - 1], end="")   # print the one to the left
else:
    for i in sentence: # for every character in the string
        print(f[f.index(i) + 1], end="")   # print the one to the right
```

### Code (Java)

```
import java.util.*;
public class Keyboard {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char direction = in.nextLine().toLowerCase().charAt(0);
        String sentence = in.nextLine(), keyboard = "qwertyuiopasdfghjkl;zxcvbnm,./";

        if(direction == 'r') {
            for(char i : sentence.toCharArray()) {
                System.out.print(keyboard.charAt(keyboard.indexOf(i) - 1));
            }
        } else {
            for(char i : sentence.toCharArray()) {
                System.out.print(keyboard.charAt(keyboard.indexOf(i) + 1));
            }
        }
        

        in.close();
    }

    
    
}
```

Note: It's a bit too complicated in Java. It's either that I'm bad in Java or it's hard to get the thing done with less code using Java.
