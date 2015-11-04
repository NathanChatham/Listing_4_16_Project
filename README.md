# Listing_4_16_Project 
This is the product of my work on 4.16 using Math.random() and the method call.

## Introduction:
I wanted to write a program that would take the number values for "A-Z" and generate a random upper case letter in this range.

## Outline:
``` java
	// Call a method to generate a random number in the range of a character.
	// Display the upper case letter 
	// Start a new method
	// Declare our number range for the upper case letter
	// Return our static method
```

## References:
``` java
Math.random()
```
Page 87 of the text: *Generating Random Numbers*
Page 87 has a good example of how to use the random. The thing to remember is that you must keep the method call inside the parentases with the multiplider such as (Math.random() * 10).
Page 122 of the text: *4.2.5 The random Method*
```java
a + (int)Math.random()*b
```
Returns a random number between *a* and *a+b* excluding *a+b*.
http://stackoverflow.com/questions/7961788/math-random-explained
http://examples.javacodegeeks.com/core-java/math/java-math-random-example/
http://www.tutorialspoint.com/java/lang/math_random.htm

``` java
char
```
Page 125 of the text: *Character Data Type and Operations
Table 4.4 on page 125: ASCII Code for Commonly Used Characters
Characters
``` java
Characters ('A' to 'Z')
Code Value in Decimal (65 to 90)
Unicode Value (\u0041 to \u005A)
```
Page 127 of the text: *Casting between char and Numeric Types*

## Java Code
``` java

public class Listing_4_16_Project {
	public static void main(String[] args) {
		// Call a method to generate a random number in the range of a character.
			int randomUpperCaseNumberLetter = randomUpperCaseLetter();

		// Display the upper case letter 
			System.out.println("Your random upper case letter is: " + (char)randomUpperCaseNumberLetter);}
	
	public static int randomUpperCaseLetter(){
		// Declare our number range for the upper case letter
			int minLimit = 65;
			int maxLimit = 90;
			int Range = maxLimit-minLimit + 1;
			int randomNumberForLetter = minLimit + (int)(Math.random()*Range);
		// Return our static method
			return randomNumberForLetter;
	}
}
```

## Console Output
I tested the program 3 times to ensure that it outputed randomly.

```
Your random upper case letter is: L
Your random upper case letter is: G
Your random upper case letter is: K
```

## CMD History
```
C:\Users\natha_000>cd desktop

C:\Users\natha_000\Desktop>dir
 Volume in drive C is Acer
 Volume Serial Number is 7AC8-FCB5

 Directory of C:\Users\natha_000\Desktop

11/04/2015  08:59 AM    <DIR>          .
11/04/2015  08:59 AM    <DIR>          ..
10/16/2015  12:25 AM    <DIR>          Compostion I
10/16/2015  12:25 AM    <DIR>          Computer Inform Access
10/16/2015  09:15 PM    <DIR>          Computer Science
11/04/2015  09:09 AM    <DIR>          COMSC Workspace
10/16/2015  02:16 PM               219 Counter-Strike Global Offensive.url
09/09/2015  09:47 PM               750 Eclipse.lnk
10/25/2015  07:28 PM             2,332 Kindle.lnk
10/16/2015  09:13 PM               817 League of Legends.lnk
11/04/2015  08:57 AM    <DIR>          Listing_4_16_project
08/24/2015  02:52 PM    <DIR>          Minecraft Server
10/16/2015  09:15 PM               222 Robocraft.url
10/28/2015  01:29 PM               221 The Elder Scrolls V Skyrim.url
10/31/2015  09:37 AM    <DIR>          Utilities
               6 File(s)          4,561 bytes
               9 Dir(s)  268,321,050,624 bytes free

C:\Users\natha_000\Desktop>cd "COMSC Workspace"

C:\Users\natha_000\Desktop\COMSC Workspace>dir
 Volume in drive C is Acer
 Volume Serial Number is 7AC8-FCB5

 Directory of C:\Users\natha_000\Desktop\COMSC Workspace

11/04/2015  09:09 AM    <DIR>          .
11/04/2015  09:09 AM    <DIR>          ..
10/16/2015  12:25 AM    <DIR>          .metadata
10/16/2015  12:26 AM    <DIR>          .recommenders
10/16/2015  12:26 AM    <DIR>          ClassWork_Y1S1
10/16/2015  12:26 AM    <DIR>          DoStuff
10/16/2015  12:26 AM    <DIR>          HelloNathan
10/16/2015  12:26 AM    <DIR>          HelloNathanInClass
10/16/2015  12:26 AM    <DIR>          Homework
10/16/2015  12:26 AM    <DIR>          Homework2
10/16/2015  12:26 AM    <DIR>          Homework3
10/16/2015  12:26 AM    <DIR>          Homework4
11/04/2015  09:09 AM    <DIR>          Listing_4_16_Project
10/16/2015  12:26 AM    <DIR>          LocalGit
10/16/2015  12:26 AM    <DIR>          Nathan_HelloWorld
               0 File(s)              0 bytes
              15 Dir(s)  268,019,654,656 bytes free

C:\Users\natha_000\Desktop\COMSC Workspace>cd Listing_4_16_Project

C:\Users\natha_000\Desktop\COMSC Workspace\Listing_4_16_Project>dir
 Volume in drive C is Acer
 Volume Serial Number is 7AC8-FCB5

 Directory of C:\Users\natha_000\Desktop\COMSC Workspace\Listing_4_16_Project

11/04/2015  09:09 AM    <DIR>          .
11/04/2015  09:09 AM    <DIR>          ..
11/04/2015  09:09 AM               232 .classpath
11/04/2015  09:09 AM               396 .project
11/04/2015  09:11 AM    <DIR>          bin
11/04/2015  09:11 AM    <DIR>          src
               2 File(s)            628 bytes
               4 Dir(s)  267,974,565,888 bytes free

C:\Users\natha_000\Desktop\COMSC Workspace\Listing_4_16_Project>echo # Listing_4_16_Project >> README.md

C:\Users\natha_000\Desktop\COMSC Workspace\Listing_4_16_Project>git init
Initialized empty Git repository in C:/Users/natha_000/Desktop/COMSC Workspace/Listing_4_16_Project/.git/

C:\Users\natha_000\Desktop\COMSC Workspace\Listing_4_16_Project>git add README.md

C:\Users\natha_000\Desktop\COMSC Workspace\Listing_4_16_Project>git commit -m "first commit"
[master (root-commit) 4d83c8c] first commit
 Committer: Nathan Chatham <Nathan Chatham>
Your name and email address were configured automatically based
on your username and hostname. Please check that they are accurate.
You can suppress this message by setting them explicitly. Run the
following command and follow the instructions in your editor to edit
your configuration file:

    git config --global --edit

After doing this, you may fix the identity used for this commit with:

    git commit --amend --reset-author

 1 file changed, 1 insertion(+)
 create mode 100644 README.md

C:\Users\natha_000\Desktop\COMSC Workspace\Listing_4_16_Project>git remote add origin https://github.com/NathanChatham/Listing_4_16_Project.git

C:\Users\natha_000\Desktop\COMSC Workspace\Listing_4_16_Project>git push -u origin master
Username for 'https://github.com': NathanChatham
Password for 'https://NathanChatham@github.com':
Counting objects: 3, done.
Writing objects: 100% (3/3), 228 bytes | 0 bytes/s, done.
Total 3 (delta 0), reused 0 (delta 0)
To https://github.com/NathanChatham/Listing_4_16_Project.git
 * [new branch]      master -> master
Branch master set up to track remote branch master from origin.

C:\Users\natha_000\Desktop\COMSC Workspace\Listing_4_16_Project>git add .

C:\Users\natha_000\Desktop\COMSC Workspace\Listing_4_16_Project>git commit -m "second commit"
[master 76ecda6] second commit
 Committer: Nathan Chatham <Nathan Chatham>
Your name and email address were configured automatically based
on your username and hostname. Please check that they are accurate.
You can suppress this message by setting them explicitly. Run the
following command and follow the instructions in your editor to edit
your configuration file:

    git config --global --edit

After doing this, you may fix the identity used for this commit with:

    git commit --amend --reset-author

 4 files changed, 42 insertions(+)
 create mode 100644 .classpath
 create mode 100644 .project
 create mode 100644 bin/Listing_4_16_Project.class
 create mode 100644 src/Listing_4_16_Project.java

C:\Users\natha_000\Desktop\COMSC Workspace\Listing_4_16_Project>git push
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

Username for 'https://github.com': NathanChatham
Password for 'https://NathanChatham@github.com':
Counting objects: 8, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (8/8), done.
Writing objects: 100% (8/8), 1.76 KiB | 0 bytes/s, done.
Total 8 (delta 0), reused 0 (delta 0)
remote: hooks/pre-receive.rb:55: warning: already initialized constant PRE_RECEIVE_CHECKS
remote: hooks/pre-receive.rb:48: warning: previous definition of PRE_RECEIVE_CHECKS was here
To https://github.com/NathanChatham/Listing_4_16_Project.git
   4d83c8c..76ecda6  master -> master
```

## Summary
This project was the outcome of a java code for generating a random uppercase letter using Math.random() and git in unison.
