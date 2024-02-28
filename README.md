# Pattern and Matcher
<sup>Regular Expressions</sup>

---

### Instructions
**Create a Java program that determines if two (2) words rhyme.**

1. Write the import statements to be able to use **Scanner**, **Pattern**, and **Matcher**.
2. Enable user input.
3. Create three (3) String variables.
- `word1` shall store the first word.
- `word2` shall store the second word.
- `sub` shall store the last two (2) letters of word1.
4. Initialize a **Pattern** as defined by the regular expression `"[______]{___}" + sub + " "` For the first blank, allow uppercase and lowercase letters. For the second blank, allow either 1 or 2 letters before sub (contains the last two (2) letters of word1).
5. Initialize a **Matcher** to store a possible match between your pattern and word2.
6. Use the **matches()** method to check if the two (2) words rhyme.

### Sample Output:

```java
Enter the first word: glam

Enter the second word: slam

slam rhymes with glam

//word2 has 2 letters before 'am' 
```
 
```java
Enter the first word: glam

Enter the second word: ham

ham rhymes with glam

//word2 only has 1 letter before 'am' 
```

```java
Enter the first word: beat

Enter the second word: treat

I'm not sure! Sorry!

//word2 has more than 2 letters before 'at'
```

---

🖥️ Pre-final Task Performance for my 1st-year college course "Computer Programming 2."
> SY2122-2T

💙 Instagram: [@izzyluuuuh](https://www.instagram.com/izzyluuuuh/)
