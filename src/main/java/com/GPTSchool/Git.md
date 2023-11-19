# Introduction to Git

## What is Git?

Git is a distributed version control system that enables developers to track and manage changes to their codebase. It is designed to handle projects of all sizes with speed and efficiency. Git allows multiple developers to work together on a project and enables them to track their progress over time.

## Key Concepts of Git

1. **Repository (Repo)**: A digital directory or storage space where your projects can live. It can be local to a machine or hosted on a platform like GitHub.

2. **Commit**: A commit is a record of what files you have changed since the last time you made a commit. Essentially, it's a snapshot of your project at a specific point in time.

3. **Branch**: A branch in Git is simply a lightweight movable pointer to a commit. Branching allows you to diverge from the main line of development and continue to work independently without affecting the main line.

4. **Merge**: Merging is the act of integrating a different branch into your current working branch.

5. **Pull Request (PR)**: This is a method of submitting contributions to a project. It's a request to the maintainer of the repository to pull your changes and merge them into their branch.

6. **Clone**: This command makes a copy of a repository so you can add to or alter it without affecting the original repository.

7. **Fork**: A fork is a copy of a repository that allows you to freely experiment with changes without affecting the original project.

## Most Used Git Commands

- `git init`: Initialize a local Git repository
- `git clone [url]`: Create a local copy of a remote repository
- `git status`: Check the status of your files in the working directory and staging area
- `git add [file]`: Add a file to the staging area
- `git commit -m "[commit message]"`: Commit changes to head (but not yet to the remote repository)
- `git push [remote] [branch]`: Send changes to the master branch of your remote repository
- `git pull`: Update local repository to the newest commit
- `git branch`: List branches (the asterisk denotes the current branch)
- `git checkout [branch-name]`: Switch from one branch to another
- `git merge [branch]`: Merge a different branch into your active branch
- `git diff`: View changes between commits, commit and working tree, etc

---

This document provides a basic introduction to Git, its key concepts, and the most commonly used commands. For more detailed information, refer to the [official Git documentation](https://git-scm.com/doc).
