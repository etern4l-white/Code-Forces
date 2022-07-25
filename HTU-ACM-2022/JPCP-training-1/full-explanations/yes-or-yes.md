# YES or YES?
There is a string **_S_** of length **3**, consisting of uppercase and lowercase *English* letters. Check if it is equal to "**YES**" (without quotes), where each letter can be in any case. For example, "**yES**", "**Yes**", "**yes**" are all allowable.



## **Input**
The first line of the input contains an integer **t** (1 ≤ **t** ≤ 103) — the number of testcases.
The description of each test consists of one line containing one string **_s_** consisting of three characters. Each character of **_s_** is either an uppercase or lowercase English letter.


## **Output**
For each test case, output "**YES**" (without quotes) if ***s*** satisfies the condition, and "**NO**" (without quotes) otherwise.
You can output "**YES**" and "**NO**" in any case (for example, strings "**yES**", "**yes**" and "**Yes**" will be recognized as a positive response).


#


### My solution
For **t** times, receive a string, convert that string to lowercase. If it's equal to "**yes**", then print **YES**. Else print **NO**.

### My code (**Python**):
```
for i in range(int(input())):
	print("YES" if input().lower() == "yes" else "NO")
```

Note: here, I didn't create any variable (Except for ***i*** that's automatically created in the for loop)

### Another implementation (includes creating variables)

```
n = int(input())
for i in range(n):
    l = input() 
    print("YES" if l.lower() == "yes" else "NO")
```
