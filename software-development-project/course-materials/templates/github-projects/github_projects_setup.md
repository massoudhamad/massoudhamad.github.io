# GitHub Projects Setup Guide

## CS2113 - Software Development Project

This guide explains how to set up GitHub Projects for managing your software development project using Scrum methodology.

---

## Why GitHub Projects?

- **Integrated with Repository** - Issues, PRs, and code in one place
- **Free** - No additional cost
- **Industry Standard** - Used by many professional teams
- **Automation** - Auto-move cards based on issue status

---

## Project Setup

### Step 1: Create the Project

1. Go to your GitHub repository
2. Click the **Projects** tab
3. Click **New project**
4. Choose **Board** layout
5. Name it **"Backlog"**
6. Click **Create project**

### Step 2: Configure Columns

Create these columns (views):

| Column | Purpose |
|--------|---------|
| **Product Backlog** | All user stories for the project |
| **Sprint Backlog** | Tasks for current sprint |
| **In Progress** | Currently being worked on |
| **Done** | Completed items |

### Step 3: Make Project Public

1. Go to Project Settings (⚙️)
2. Under "Visibility", select **Public**
3. Save changes

---

## Labels Setup

### Create These Labels in Repository Settings

Navigate to: Repository → Settings → Labels

#### Type Labels
| Label | Color | Description |
|-------|-------|-------------|
| `user story` | `#0052CC` (Blue) | User story issues |
| `task` | `#5319E7` (Purple) | Technical tasks |
| `bug` | `#D73A4A` (Red) | Bug reports |
| `documentation` | `#0075CA` (Light Blue) | Documentation work |

#### Component Labels
| Label | Color | Description |
|-------|-------|-------------|
| `backend` | `#1D76DB` (Blue) | Backend-related |
| `frontend` | `#E99695` (Pink) | Frontend-related |
| `database` | `#F9D0C4` (Peach) | Database-related |

#### Priority Labels
| Label | Color | Description |
|-------|-------|-------------|
| `priority: high` | `#B60205` (Dark Red) | High priority |
| `priority: medium` | `#FBCA04` (Yellow) | Medium priority |
| `priority: low` | `#0E8A16` (Green) | Low priority |

---

## Milestones Setup

### Create Sprint Milestones

Navigate to: Issues → Milestones → New milestone

| Milestone | Due Date | Description |
|-----------|----------|-------------|
| Sprint 1 | [End of Sprint 1] | Basic CRUD operations, backend setup |
| Sprint 2 | [End of Sprint 2] | REST APIs, frontend development |
| Sprint 3 | [End of Sprint 3] | Testing, review feature, final polish |

---

## Creating Issues

### User Story Issue Template

**Title:** `US-[number]: [Brief description]`

**Body:**
```markdown
## User Story

As a **[user type]**, I want **[action]** so that **[benefit]**.

## Acceptance Criteria

- [ ] Criterion 1
- [ ] Criterion 2
- [ ] Criterion 3

## Story Points

[Estimate: 1, 2, 3, 5, 8, 13]

## Related Tasks

- [ ] Task 1 #issue-number
- [ ] Task 2 #issue-number

## Notes

[Any additional information]
```

### Task Issue Template

**Title:** `[Action verb] [what]`

**Body:**
```markdown
## Description

[Detailed description of the task]

## Related User Story

Closes #[user-story-number]

## Technical Details

- [ ] Step 1
- [ ] Step 2
- [ ] Step 3

## Estimated Hours

[Number]

## Notes

[Any technical notes or considerations]
```

---

## Issue Templates (Optional)

Create `.github/ISSUE_TEMPLATE/` folder with templates:

### user_story.md
```markdown
---
name: User Story
about: Create a new user story
title: 'US-: '
labels: user story
assignees: ''
---

## User Story

As a **[user type]**, I want **[action]** so that **[benefit]**.

## Acceptance Criteria

- [ ]
- [ ]
- [ ]

## Story Points

<!-- Estimate: 1, 2, 3, 5, 8, 13 -->

## Notes

```

### task.md
```markdown
---
name: Task
about: Create a technical task
title: ''
labels: task
assignees: ''
---

## Description



## Related User Story

Closes #

## Checklist

- [ ]
- [ ]
- [ ]

## Estimated Hours


```

---

## Project Board Configuration

### Adding Custom Fields

1. Go to your Project
2. Click **+** to add field
3. Add these fields:

| Field Name | Type | Options |
|------------|------|---------|
| Sprint | Single select | Sprint 1, Sprint 2, Sprint 3 |
| Story Points | Number | - |
| Priority | Single select | High, Medium, Low |

### Configuring Views

#### Board View (Default)
- Group by: Status
- Filter: (none for all items)

#### Sprint View
- Group by: Sprint
- Filter: `sprint:Sprint 1` (change per sprint)

#### My Tasks View
- Filter: `assignee:@me`

---

## Workflow

### Sprint Planning

1. **Review Product Backlog**
   - All user stories in "Product Backlog" column
   - Prioritize by dragging

2. **Select for Sprint**
   - Move user stories to "Sprint Backlog"
   - Create task issues for each story
   - Set milestone to current sprint

3. **Assign Work**
   - Assign issues to team members
   - Add estimates

### During Sprint

1. **Start Work**
   - Move issue to "In Progress"
   - Only one issue in progress per person

2. **Complete Work**
   - Move to "Done" when finished
   - Close the issue

3. **Daily Updates**
   - Update issue status
   - Add comments for progress

### Sprint End

1. **Review Done Items**
   - Verify all acceptance criteria met
   - Close milestone

2. **Handle Unfinished**
   - Move incomplete items back to Product Backlog
   - Update milestone if needed

---

## Automation (GitHub Actions)

### Auto-move Cards

Create `.github/workflows/project-automation.yml`:

```yaml
name: Project Automation
on:
  issues:
    types: [opened, closed, reopened]
  pull_request:
    types: [opened, closed, merged]

jobs:
  update-project:
    runs-on: ubuntu-latest
    steps:
      - name: Move to In Progress
        if: github.event.action == 'opened'
        uses: actions/add-to-project@v0.5.0
        with:
          project-url: https://github.com/orgs/YOUR_ORG/projects/PROJECT_NUMBER
          github-token: ${{ secrets.GITHUB_TOKEN }}
```

---

## Best Practices

### Issue Management

1. **One issue, one task** - Keep issues focused
2. **Clear titles** - Use action verbs (Add, Create, Fix, Update)
3. **Link related issues** - Use `#issue-number` syntax
4. **Close with commits** - Use `Closes #issue-number` in commits

### Board Management

1. **Daily updates** - Move cards during Daily Scrum
2. **Limit WIP** - Max 2 items in "In Progress" per person
3. **Archive done items** - Keep board clean
4. **Regular grooming** - Review backlog weekly

### Commit Messages

Reference issues in commits:
```
Add Quiz entity class

- Create Quiz.java with JPA annotations
- Add QuizRepository interface

Relates to #5
```

Close issues with commits:
```
Implement quiz creation form

- Add form component
- Add validation
- Connect to API

Closes #12
```

---

## Example Project Structure

```
Project: Backlog
├── Product Backlog
│   ├── US-5: Add questions to quiz [user story]
│   ├── US-6: Add answer options [user story]
│   └── US-7: View quiz results [user story]
│
├── Sprint Backlog
│   ├── Create Quiz entity [task] → US-1
│   ├── Create QuizRepository [task] → US-1
│   ├── Create quiz form UI [task] → US-1
│   └── Add form validation [task] → US-1
│
├── In Progress
│   └── Create QuizController [task] @john → US-1
│
└── Done
    ├── US-1: Add a quiz [user story] ✓
    ├── US-2: List quizzes [user story] ✓
    └── Set up Spring Boot project [task] ✓
```

---

## Linking to README

Add to your README.md:

```markdown
## Project Management

- [Project Board](https://github.com/your-org/your-repo/projects/1)
- [Current Sprint](https://github.com/your-org/your-repo/milestone/1)
- [All Issues](https://github.com/your-org/your-repo/issues)
```

---

## Resources

- [GitHub Projects Documentation](https://docs.github.com/en/issues/planning-and-tracking-with-projects)
- [GitHub Issues Guide](https://docs.github.com/en/issues)
- [GitHub Milestones](https://docs.github.com/en/issues/using-labels-and-milestones-to-track-work/about-milestones)

---

*CS2113 - Software Development Project | School of Computing Communication and Media Studies*
