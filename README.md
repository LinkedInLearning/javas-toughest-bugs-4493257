# Java's Toughest Bugs
This is the repository for the LinkedIn Learning course `Java's Toughest Bugs`. The full course is available from [LinkedIn Learning][lil-course-url].

_See the readme file in the main branch for updated instructions and information._
## Instructions
For all chapters except for Chapter 4, the code is located on the main branch. To access the code from a given video, you’ll go to the appropriate chapter folder and then the appropriate video folder. For example, the code for Chapter 3 video 1 will be in the chapter 3 folder and the 03_01 folder. From here, we have two folders that have the beginning and end state of the code from the video. 03_01b has the beginning state and 03_01e is the end state. 

Now this is the case for all the code except for Chapter 4. Chapter 4 is slightly different because it uses dependencies and maven so we’ve put the code on different branches to avoid conflicts between files. You can use the branch pop up menu in github to switch to a specific branch and take a look at the course at that stage, or you can add `/tree/BRANCH_NAME` to the URL to go to the branch you want to access.

## Branches
The branches in Chapter 4 are structured to correspond to the videos in the course. The naming convention is `04_MOVIE#`. As an example, the branch named `04_03` corresponds to the fourth chapter and the third video in that chapter. 
Some branches will have a beginning and an end state. These are marked with the letters `b` for "beginning" and `e` for "end". The `b` branch contains the code as it is at the beginning of the movie. The `e` branch contains the code as it is at the end of the movie. The `main` branch holds the final state of the code when in the course.

When switching from one exercise files branch to the next after making changes to the files, you may get a message like this:

    error: Your local changes to the following files would be overwritten by checkout:        [files]
    Please commit your changes or stash them before you switch branches.
    Aborting

To resolve this issue:
	
    Add changes to git using this command: git add .
	Commit changes using this command: git commit -m "some message"

## Installing
1. To use these exercise files, you must have the following installed:
	- [list of requirements for course]
2. Clone this repository into your local machine using the terminal (Mac), CMD (Windows), or a GUI tool like SourceTree.
3. [Course-specific instructions]


[0]: # (Replace these placeholder URLs with actual course URLs)

[lil-course-url]: https://www.linkedin.com/learning/
[lil-thumbnail-url]: http://

