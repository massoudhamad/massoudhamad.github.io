# Trello Board Setup Guide

## CS2113 - Software Development Project

This guide explains how to set up a Trello board for managing your software development project using Scrum methodology.

---

## Board Structure

### Recommended Lists (Columns)

Create the following lists from left to right:

| List Name | Purpose |
|-----------|---------|
| **Product Backlog** | All user stories not yet scheduled for a sprint |
| **Sprint Backlog** | Tasks committed for the current sprint |
| **In Progress** | Tasks currently being worked on |
| **Code Review** | Tasks awaiting peer review |
| **Testing** | Tasks being tested |
| **Done** | Completed tasks |

---

## Labels Setup

Create the following labels for categorizing cards:

### Priority Labels
- 🔴 **High Priority** (Red)
- 🟡 **Medium Priority** (Yellow)
- 🟢 **Low Priority** (Green)

### Type Labels
- 🔵 **User Story** (Blue)
- 🟣 **Task** (Purple)
- 🟤 **Bug** (Brown/Orange)
- ⚫ **Documentation** (Black)

### Component Labels
- **Backend** (Sky Blue)
- **Frontend** (Pink)
- **Database** (Orange)
- **Testing** (Lime)

### Sprint Labels
- **Sprint 1** (Light Blue)
- **Sprint 2** (Light Green)
- **Sprint 3** (Light Purple)

---

## Card Templates

### User Story Card Template

**Title:** US-[number]: [Brief title]

**Description:**
```
## User Story
As a [user type], I want [action] so that [benefit].

## Acceptance Criteria
- [ ] Criterion 1
- [ ] Criterion 2
- [ ] Criterion 3

## Story Points: [number]

## Notes
[Any additional notes]
```

**Checklist:** Add checklist with acceptance criteria

---

### Task Card Template

**Title:** [Task description]

**Description:**
```
## Related User Story
US-[number]: [User story title]

## Task Details
[Detailed description of what needs to be done]

## Technical Notes
- [Note 1]
- [Note 2]

## Estimated Hours: [number]
```

---

## Board Setup Checklist

### Initial Setup
- [ ] Create new Trello board
- [ ] Add all team members to the board
- [ ] Create all required lists
- [ ] Set up labels
- [ ] Create card templates

### Sprint 1 Setup
- [ ] Create user story cards in Product Backlog
- [ ] Add labels to all cards
- [ ] Set due dates for sprint deadline
- [ ] Assign team members to tasks
- [ ] Move sprint items to Sprint Backlog

### Daily Maintenance
- [ ] Update card positions as work progresses
- [ ] Add comments for important updates
- [ ] Log time spent on tasks
- [ ] Move completed items to Done

---

## Power-Ups (Recommended)

Consider enabling these Trello Power-Ups:

1. **Calendar** - View cards with due dates on calendar
2. **Card Aging** - See inactive cards
3. **Custom Fields** - Add story points, hours, etc.
4. **GitHub** - Link commits and PRs to cards

---

## Example Board Layout

```
┌─────────────────┬─────────────────┬─────────────────┬─────────────────┬─────────────────┐
│ Product Backlog │ Sprint Backlog  │  In Progress    │  Code Review    │      Done       │
├─────────────────┼─────────────────┼─────────────────┼─────────────────┼─────────────────┤
│                 │                 │                 │                 │                 │
│ ┌─────────────┐ │ ┌─────────────┐ │ ┌─────────────┐ │ ┌─────────────┐ │ ┌─────────────┐ │
│ │ US-5: Add   │ │ │ Create Quiz │ │ │ Quiz entity │ │ │ Quiz form   │ │ │ US-1: Done  │ │
│ │ questions   │ │ │ form UI     │ │ │ @John       │ │ │ validation  │ │ │             │ │
│ │             │ │ │ @Mary       │ │ │             │ │ │ @Jane       │ │ │             │ │
│ └─────────────┘ │ └─────────────┘ │ └─────────────┘ │ └─────────────┘ │ └─────────────┘ │
│                 │                 │                 │                 │                 │
│ ┌─────────────┐ │ ┌─────────────┐ │                 │                 │ ┌─────────────┐ │
│ │ US-6: Add   │ │ │ Quiz REST   │ │                 │                 │ │ US-2: Done  │ │
│ │ answers     │ │ │ controller  │ │                 │                 │ │             │ │
│ │             │ │ │ @John       │ │                 │                 │ │             │ │
│ └─────────────┘ │ └─────────────┘ │                 │                 │ └─────────────┘ │
│                 │                 │                 │                 │                 │
└─────────────────┴─────────────────┴─────────────────┴─────────────────┴─────────────────┘
```

---

## Best Practices

### Card Management
1. **Keep cards small** - Each card should be completable in 1-2 days
2. **Add descriptions** - Include enough detail for anyone to understand
3. **Use checklists** - Break down complex tasks
4. **Attach files** - Link relevant documents, mockups, etc.
5. **Add comments** - Document decisions and progress

### Board Maintenance
1. **Daily updates** - Move cards at least once per day
2. **Weekly cleanup** - Archive completed cards
3. **Sprint transitions** - Move unfinished items properly
4. **Regular reviews** - Discuss board in Daily Scrums

### Team Collaboration
1. **Assign owners** - Each card should have one owner
2. **Watch cards** - Follow cards you're interested in
3. **@mention** - Tag teammates for questions
4. **Due dates** - Set realistic deadlines

---

## Integration with GitHub

### Linking Commits
Include card URLs in commit messages:
```
git commit -m "Add quiz entity class

Trello: https://trello.com/c/xyz123"
```

### Linking Pull Requests
Add Trello card link in PR description:
```markdown
## Related Trello Card
https://trello.com/c/xyz123
```

---

## Sprint Workflow

### Sprint Planning
1. Review Product Backlog
2. Select user stories for sprint
3. Break stories into tasks
4. Move tasks to Sprint Backlog
5. Assign team members

### During Sprint
1. Pick task from Sprint Backlog
2. Move to In Progress
3. Complete work
4. Move to Code Review
5. After review, move to Testing
6. After testing, move to Done

### Sprint End
1. Review Done column
2. Archive completed cards
3. Move unfinished to Product Backlog
4. Conduct retrospective
5. Plan next sprint

---

## Resources

- [Trello Getting Started Guide](https://trello.com/guide)
- [Trello for Scrum](https://blog.trello.com/scrum-trello)
- [Trello Keyboard Shortcuts](https://trello.com/shortcuts)

---

*CS2113 - Software Development Project | School of Computing Communication and Media Studies*
