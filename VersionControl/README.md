<h1>Welcome to git commands</h1>

<h2>First Git Configuration</h2>
<p><code>git config --global user.name "YourFullName"</code></p>
<p><code>git config --global user.email "yourEmailAddress"</code> >> if your email is private then you will need to using your hashed email >>> can be found <a href="https://github.com/settings/emails">settings</a> marked with fade text under the <strong>Keep my email addresses private</strong> checkbox (e.g. "{ID}+{username}@users.noreply.github.com")</p>
<p><code>git config --global color.ui auto</code> >> for coloring the git output</p>
<p><code>git config --global merge.conflictstyle diff3</code> >> displays the original state in a conflict</p>
<p><code>git config --list</code> >> display the configration</p>

<h2>Git & Code Editor</h2>
<p>Atom Editor Setup: <code>git config --global core.editor "atom --wait"</code></p>
<p>Sublime Text Setup: <code>git config --global core.editor "'C:/Program Files/Sublime Text 2/sublime_text.exe' -n -w"</code></p>
<p>VSCode Setup: <code>git config --global core.editor "code --wait"</code></p>


<h2>Most important command</h2>
<p><code>git status</code> >> keep stracking the current status of your Repo after every command</p>

<h2>Navigate</h2>
<p><code>ls</code> >> used to list files and directories</p>
<p><code>cd ..</code> >> go back in directories</p>
<p><code>cd "directoryName"</code> >> move to the request directory</p>
<p><code>pwd</code> >> print working directory path</p>

<h2>Creating</h2>
<p><code>git init</code> >> Initialize a new Repo in the directory</p>
<p><code>mkdir</code> >> used to create a new directory</p>
<p><code>touch "fileName"</code> >> create a new file in that directory</p>

<h2>remove</h2>
<p><code>rm "Name"</code> >> remove files and directories</p>
<p><code>git rm -r --cached .</code> >> remove all files from staging index</p>
<p><code>git rm --cached "fileName"</code> >> remove that file from the staging index</p>



<h2>connect</h2>
<p><code>git clone "URL"</code> >> clone a remote repo to the local repo</p>
<p><code>git remote origin master "URL"</code> >> connect your remote repo with the local repo</p>

<h2>git log</h2>
<p><code>git log</code> >> displays information about the existing commit</p>
<p><code>git log --oneline</code> >> displays information about the existing commit in short format</p>
<p><code>git log --stat</code> >> Display the files that have been changed in the commit, as well as the number of lines that have been added or deleted</p>
<p><code>git log -p / git log --patch</code> >> can be used to display the actual changes made to a file</p>
<p><code>git log -p --stat</code> >> display both the stats info above the patch info</p>
<p><code>git log -p -w</code> >> it ignores whitespace changes</p>
<p><code>git log --oneline --graph --all</code> >> show all branches as a graph</p>
<p><code>git reflog</code> >> track of everything for about 30 days</p>
<p><code>git show</code> >> displays information about the given commit - command will show only one commit</p>
<p><code>git diff</code> >> can be used to see changes that have been made but haven't been committed, yet</p>

<h2>git tag</h2>
<p><code>git tag -a tagName"</code> >> This flag tells Git to create an annotated flag</p>
<p><code>git tag "tagName"</code> >> create what's called a lightweight tag</p>
<p><code>git tag</code> >> display all tags that are in the repository</p>
<p><code>git tag -d "tagName"</code> >> delete tag</p>
<p><code>git tag "tagName" "SHA 7-digits"</code> >> add tag to a certain commit</p>

<h2>git branch</h2>
<p><code>git branch</code> >> display all the currunt branches</p>
<p><code>git branch "newBranch"</code> >> create a new branch</p>
<p><code>git checkout "branchName"</code> >> switch branch to the given name</p>
<p><code>git branch "branchName" "SHA 7-digits"</code> >> will make a new branche with it point to the given commit SHA</p>
<p><code>git branch -d "branchName"</code> >> delete the branch with the given name</p>
<p><code>git checkout -b "branchName"</code> >> create and switch to the new branch with the given name</p>
<p><code>git merge "name-of-branch-to-merge-in"</code> >> marge the current branch with the given branch</p>

<h2>git commit</h2>
<p><code>git add .</code> >> move all files from the working directory to the staging index</p>
<p><code>git add "fileName"</code> >> move file from the working directory to the staging index</p>
<p><code>git commit</code> >> move the files from the staging index to the repo using the code editor</p>
<p><code>git commit -m "yourCommit"</code> >> move the files from the staging index to the repo</p>

<h2>git Undoing changes</h2>
<p><code>git commit --amend</code> >> alter the most-recent commit</p>
<p><code>git revert "SHA-7-Digits"</code> >> revert the changes with the given commit</p>
<p><code>git checkout "fileName"</code> >> remove the uncommitted changes from the working directory</p>
<p><code>git restore --staged "fileName"</code> >> remove the uncommitted changes from the staging index</p>
<p><code>git reset --mixed HEAD^</code> >> take the changes made and move them to the working directory</p>
<p><code>git reset --soft HEAD^</code> >> take the changes made and move them directly to the Staging Index</p>
<p><code>git reset --hard HEAD^</code> >> take the changes made and erases them</p>
