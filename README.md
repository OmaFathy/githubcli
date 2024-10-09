# 🚀 GitHub CLI Activity Fetcher

![Java](https://img.shields.io/badge/Java-11+-brightgreen) ![Maven](https://img.shields.io/badge/Maven-Build-blue) ![API](https://img.shields.io/badge/API-GitHub-blue) ![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)

## 📚 Overview

The **GitHub CLI Activity Fetcher** is a powerful, command-line application that allows users to easily retrieve and display recent activity for any GitHub user. Built with Java, this tool leverages the GitHub API to provide users with an intuitive way to monitor public events in real-time, all from the terminal!

Check out more about the GitHub User Activity roadmap [here](https://roadmap.sh/projects/github-user-activity).

## 🎯 Key Features

- **Fetch User Activity:** Retrieve recent events of any GitHub user, including pushes, issues, and stars.
- **CLI Interface:** Simple command-line interaction for ease of use.
- **JSON Parsing:** Seamlessly handles data from the GitHub API and displays it in a readable format.
- **Error Handling:** Detects invalid usernames or API failures and informs the user.
  
## 🛠️ Technologies Used

- **Java 11+**
- **Maven** for project build and dependency management
- **GitHub API** to fetch user data
- **Gson** for JSON parsing

## ⚙️ Setup Instructions

### 1. Clone the Repository

```bash
git clone https://github.com/yourusername/github-cli-activity-fetcher.git
cd github-cli-activity-fetcher
```

### 2. Build the Project

To build the project using Maven:

```bash
mvn clean install
```

### 3. Run the Application

Use the following command to run the application and provide the GitHub username as an argument:

```bash
java -cp target/githubcli-1.0-SNAPSHOT.jar org.example.Main <GitHub_Username>
```

Example:

```bash
java -cp target/githubcli-1.0-SNAPSHOT.jar org.example.Main OmaFathy
```

### 4. Output Example

```
Fetching recent activity for GitHub user: OmaFathy
- Pushed 3 commits to OmaFathy/my-repo
- Starred the repository OmaFathy/another-repo
- Opened an issue in OmaFathy/issues-tracker
```

## 🚧 Future Improvements

- **Event Type Filters:** Ability to filter activities based on type (e.g., only show issues or commits).
- **Caching:** Add support for caching user activity to reduce API calls.
- **Pagination Support:** Fetch older events if the user has more activity.

## 📎 Resources

- Learn more about the [GitHub API Documentation](https://docs.github.com/en/rest).
- Explore the [GitHub User Activity Roadmap](https://roadmap.sh/projects/github-user-activity).

## 📝 License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more information.

---

💡 *Inspired by real-world API usage, this project demonstrates how to build a practical CLI tool while applying key programming concepts.*
