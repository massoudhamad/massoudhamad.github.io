# CS2113 - Software Development Project

## Course Materials

**School of Computing Communication and Media Studies**
**Instructor:** Masoud Hamad
**Academic Year:** 2025

---

## Course Overview

This course teaches students how to manage the software development process and work as members of a software development team. Students develop a web application using Java Spring Boot (backend) and React (frontend) across three two-week sprints.

---

## Folder Structure

```
course-materials/
├── lectures/                    # LaTeX lecture notes
│   ├── lecture01_introduction.tex
│   ├── lecture02_git_github.tex
│   ├── lecture03_sprint1.tex
│   ├── lecture04_sprint2.tex
│   └── lecture05_sprint3.tex
│
├── presentations/               # Beamer slides
│   ├── lecture01_slides.tex
│   └── lecture02_slides.tex
│
├── exercises/                   # Exercise files
│
├── templates/                   # Project templates
│   ├── project-design/
│   │   ├── project_charter_template.tex
│   │   ├── user_story_template.tex
│   │   ├── sprint_planning_template.tex
│   │   ├── retrospective_template.tex
│   │   └── README_template.md
│   ├── trello/
│   │   └── trello_board_setup.md
│   └── github-projects/
│       └── github_projects_setup.md
│
└── resources/                   # Additional resources
```

---

## Lecture Schedule

| Week | Lecture | Topic | Materials |
|------|---------|-------|-----------|
| 1 | Lecture 1 | Introduction to Software Development Projects | [Notes](lectures/lecture01_introduction.tex), [Slides](presentations/lecture01_slides.tex) |
| 2 | Lecture 2 | Version Control: Git and GitHub | [Notes](lectures/lecture02_git_github.tex), [Slides](presentations/lecture02_slides.tex) |
| 3-4 | Lecture 3 | Sprint 1: Scrum and Project Setup | [Notes](lectures/lecture03_sprint1.tex) |
| 5-6 | Lecture 4 | Sprint 2: REST APIs and Frontend | [Notes](lectures/lecture04_sprint2.tex) |
| 7-8 | Lecture 5 | Sprint 3: Testing and Final Review | [Notes](lectures/lecture05_sprint3.tex) |

---

## Topics Covered

### Lecture 1: Introduction
- Software Development Projects
- Agile Principles
- Software Development Lifecycle
- Waterfall vs Agile
- Scrum Framework
- User Stories & INVEST Criteria

### Lecture 2: Git & GitHub
- Version Control Fundamentals
- Git Installation & Setup
- Commits, Branches, Merging
- Remote Repositories
- Collaboration Workflows
- Handling Conflicts

### Lecture 3: Sprint 1
- Sprint Planning
- Product & Sprint Backlogs
- GitHub Projects Setup
- Daily Scrum
- REST API Basics
- Developer Documentation

### Lecture 4: Sprint 2
- Sprint Retrospective
- REST API Design
- HTTP Methods & Status Codes
- DTO Pattern
- Swagger Documentation
- Frontend-Backend Communication

### Lecture 5: Sprint 3
- Test Pyramid
- Unit vs Integration Tests
- Testing REST Endpoints
- Arrange-Act-Assert Pattern
- Peer Review
- Final Report

---

## Project: Quizzer

Students build a quiz management application with:

### Teacher Dashboard
- Create, edit, delete quizzes
- Add questions with difficulty levels
- Manage answer options
- Organize quizzes by categories

### Student Dashboard
- Browse published quizzes
- Answer quiz questions
- View results
- Write reviews

---

## Assessment

| Component | Weight |
|-----------|--------|
| Team Project | 60% |
| Individual Contribution | 30% |
| Peer Review & Report | 10% |

---

## Compiling Materials

### LaTeX Notes
```bash
cd lectures
pdflatex lecture01_introduction.tex
```

### Beamer Slides
```bash
cd presentations
pdflatex lecture01_slides.tex
```

---

## Resources

- [Scrum Guide](https://scrumguides.org/)
- [Git Documentation](https://git-scm.com/doc)
- [Spring Boot Guide](https://spring.io/guides)
- [React Documentation](https://react.dev/)

---

## License

This course material is licensed under Creative Commons BY-NC-SA 4.0
