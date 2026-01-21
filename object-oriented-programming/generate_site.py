#!/usr/bin/env python3
"""
PT821 Course Website Generator
Run this script after adding new materials to automatically update the website.

Usage: python generate_site.py
"""

import os
import glob
import re
from datetime import datetime

# Configuration
COURSE_CODE = "PT821"
COURSE_NAME = "Object-Oriented Programming"
INSTITUTION = "State University of Zanzibar (SUZA) - Chwaka Campus"
PROGRAM = "Bachelor of Information Technology and Applications (BITA)"

def get_files(folder, extension):
    """Get sorted list of files with given extension in folder."""
    pattern = os.path.join(folder, f"*{extension}")
    files = glob.glob(pattern)
    return sorted(files)

def extract_lecture_number(filename):
    """Extract lecture number from filename like oop_lecture1.pdf"""
    match = re.search(r'lecture(\d+)', filename, re.IGNORECASE)
    return int(match.group(1)) if match else 0

def extract_exercise_number(filename):
    """Extract exercise number from filename like Exercise1_MobilePhone.java"""
    match = re.search(r'Exercise(\d+)', filename)
    return int(match.group(1)) if match else 0

def get_class_name(filename):
    """Extract class name from Java filename."""
    basename = os.path.basename(filename)
    return basename.replace('.java', '')

def format_name(filename):
    """Format filename into readable name."""
    basename = os.path.basename(filename)
    name = basename.replace('.java', '').replace('.pdf', '')
    # Add spaces before capital letters
    name = re.sub(r'([a-z])([A-Z])', r'\1 \2', name)
    # Replace underscores with spaces
    name = name.replace('_', ' - ')
    return name

def generate_code_html(java_file, output_folder):
    """Generate HTML page for a Java file."""
    basename = os.path.basename(java_file)
    class_name = basename.replace('.java', '')

    with open(java_file, 'r') as f:
        code_content = f.read()

    # Escape HTML characters
    code_content = (code_content
        .replace('&', '&amp;')
        .replace('<', '&lt;')
        .replace('>', '&gt;'))

    html_content = f'''<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>{class_name} - {COURSE_CODE}</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/highlight.js/11.9.0/styles/github.min.css">
    <style>
        * {{ margin: 0; padding: 0; box-sizing: border-box; }}
        body {{
            font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, sans-serif;
            line-height: 1.6;
            color: #333;
            background: #f5f5f5;
        }}
        .header {{
            background: linear-gradient(135deg, #155799, #159957);
            color: white;
            padding: 1.5rem 2rem;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }}
        .header h1 {{ font-size: 1.5rem; }}
        .header a {{
            color: white;
            text-decoration: none;
            background: rgba(255,255,255,0.2);
            padding: 0.5rem 1rem;
            border-radius: 5px;
            transition: background 0.3s;
        }}
        .header a:hover {{ background: rgba(255,255,255,0.3); }}
        .content {{
            max-width: 1000px;
            margin: 2rem auto;
            background: white;
            border-radius: 8px;
            box-shadow: 0 2px 10px rgba(0,0,0,0.1);
            overflow: hidden;
        }}
        .file-info {{
            background: #f8f9fa;
            padding: 1rem 1.5rem;
            border-bottom: 1px solid #e9ecef;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }}
        .file-info span {{ color: #666; }}
        .download-btn {{
            background: #155799;
            color: white;
            padding: 0.5rem 1rem;
            border-radius: 5px;
            text-decoration: none;
            font-size: 0.9rem;
        }}
        .download-btn:hover {{ background: #0d3d6e; }}
        pre {{
            margin: 0;
            padding: 1.5rem;
            overflow-x: auto;
            font-size: 0.9rem;
        }}
        code {{ font-family: 'Fira Code', 'Monaco', 'Consolas', monospace; }}
    </style>
</head>
<body>
    <div class="header">
        <h1>{basename}</h1>
        <a href="../index.html">&larr; Back to Course</a>
    </div>
    <div class="content">
        <div class="file-info">
            <span>Java Source File</span>
            <a href="{basename}" download class="download-btn">Download</a>
        </div>
        <pre><code class="language-java">{code_content}</code></pre>
    </div>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/highlight.js/11.9.0/highlight.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/highlight.js/11.9.0/languages/java.min.js"></script>
    <script>hljs.highlightAll();</script>
</body>
</html>'''

    output_file = os.path.join(output_folder, f"{class_name}.html")
    with open(output_file, 'w') as f:
        f.write(html_content)

    return output_file

def generate_pdf_viewer_html(pdf_file, output_folder):
    """Generate HTML page with embedded PDF viewer."""
    basename = os.path.basename(pdf_file)
    name = format_name(basename)

    html_content = f'''<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>{name} - {COURSE_CODE}</title>
    <style>
        * {{ margin: 0; padding: 0; box-sizing: border-box; }}
        body {{
            font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, sans-serif;
            background: #f5f5f5;
        }}
        .header {{
            background: linear-gradient(135deg, #155799, #159957);
            color: white;
            padding: 1.5rem 2rem;
            display: flex;
            justify-content: space-between;
            align-items: center;
        }}
        .header h1 {{ font-size: 1.5rem; }}
        .header-links {{ display: flex; gap: 1rem; }}
        .header a {{
            color: white;
            text-decoration: none;
            background: rgba(255,255,255,0.2);
            padding: 0.5rem 1rem;
            border-radius: 5px;
            transition: background 0.3s;
        }}
        .header a:hover {{ background: rgba(255,255,255,0.3); }}
        .pdf-container {{
            height: calc(100vh - 80px);
            width: 100%;
        }}
        iframe {{
            width: 100%;
            height: 100%;
            border: none;
        }}
    </style>
</head>
<body>
    <div class="header">
        <h1>{name}</h1>
        <div class="header-links">
            <a href="{basename}" download>Download PDF</a>
            <a href="../index.html">&larr; Back to Course</a>
        </div>
    </div>
    <div class="pdf-container">
        <iframe src="{basename}" type="application/pdf"></iframe>
    </div>
</body>
</html>'''

    html_name = basename.replace('.pdf', '.html')
    output_file = os.path.join(output_folder, html_name)
    with open(output_file, 'w') as f:
        f.write(html_content)

    return output_file

def generate_index():
    """Generate the main index.html page."""

    # Collect materials
    lectures = get_files('lectures', '.pdf')
    examples = get_files('examples', '.java')
    exercises = get_files('exercises', '.java')
    assignments = get_files('assignments', '.pdf') + get_files('assignments', '.java')
    homeworks = get_files('homeworks', '.pdf') + get_files('homeworks', '.java')

    # Sort by number
    lectures.sort(key=extract_lecture_number)
    exercises.sort(key=extract_exercise_number)

    # Generate HTML pages for code files
    for java_file in examples + exercises:
        if java_file.startswith('examples/'):
            generate_code_html(java_file, 'examples')
        elif java_file.startswith('exercises/'):
            generate_code_html(java_file, 'exercises')

    # Generate HTML pages for PDF lectures
    for pdf_file in lectures:
        generate_pdf_viewer_html(pdf_file, 'lectures')

    # Generate HTML pages for homeworks
    for hw_file in homeworks:
        if hw_file.endswith('.java'):
            generate_code_html(hw_file, 'homeworks')
        elif hw_file.endswith('.pdf'):
            generate_pdf_viewer_html(hw_file, 'homeworks')

    # Generate HTML pages for assignments
    for assignment_file in assignments:
        if assignment_file.endswith('.java'):
            generate_code_html(assignment_file, 'assignments')
        elif assignment_file.endswith('.pdf'):
            generate_pdf_viewer_html(assignment_file, 'assignments')

    # Generate sections HTML
    lectures_html = generate_lectures_section(lectures)
    examples_html = generate_examples_section(examples)
    exercises_html = generate_exercises_section(exercises)
    assignments_html = generate_assignments_section(assignments)
    homeworks_html = generate_homeworks_section(homeworks)

    # Main HTML template
    html_content = f'''<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>{COURSE_CODE}: {COURSE_NAME}</title>
    <style>
        * {{ margin: 0; padding: 0; box-sizing: border-box; }}
        body {{
            font-family: -apple-system, BlinkMacSystemFont, 'Segoe UI', Roboto, Oxygen, Ubuntu, sans-serif;
            line-height: 1.6;
            color: #333;
            background: #f5f5f5;
        }}
        .hero {{
            background: linear-gradient(135deg, #155799, #159957);
            color: white;
            padding: 3rem 2rem;
            text-align: center;
        }}
        .hero h1 {{ font-size: 2.5rem; margin-bottom: 0.5rem; }}
        .hero h2 {{ font-size: 1.2rem; font-weight: normal; opacity: 0.9; }}
        .hero p {{ margin-top: 1rem; opacity: 0.8; }}
        .container {{
            max-width: 1200px;
            margin: 0 auto;
            padding: 2rem;
        }}
        .section {{
            background: white;
            border-radius: 8px;
            box-shadow: 0 2px 10px rgba(0,0,0,0.1);
            margin-bottom: 2rem;
            overflow: hidden;
        }}
        .section-header {{
            background: #f8f9fa;
            padding: 1rem 1.5rem;
            border-bottom: 1px solid #e9ecef;
            display: flex;
            align-items: center;
            gap: 0.75rem;
        }}
        .section-header h3 {{
            font-size: 1.25rem;
            color: #155799;
        }}
        .section-icon {{
            font-size: 1.5rem;
        }}
        .section-content {{
            padding: 1.5rem;
        }}
        .empty-message {{
            color: #666;
            font-style: italic;
            text-align: center;
            padding: 2rem;
        }}
        table {{
            width: 100%;
            border-collapse: collapse;
        }}
        th, td {{
            padding: 0.75rem 1rem;
            text-align: left;
            border-bottom: 1px solid #e9ecef;
        }}
        th {{
            background: #f8f9fa;
            font-weight: 600;
            color: #555;
        }}
        tr:last-child td {{ border-bottom: none; }}
        tr:hover {{ background: #f8f9fa; }}
        a {{
            color: #155799;
            text-decoration: none;
        }}
        a:hover {{
            text-decoration: underline;
        }}
        .badge {{
            display: inline-block;
            padding: 0.25rem 0.5rem;
            border-radius: 4px;
            font-size: 0.75rem;
            font-weight: 600;
        }}
        .badge-pdf {{ background: #dc3545; color: white; }}
        .badge-java {{ background: #f89820; color: white; }}
        .footer {{
            text-align: center;
            padding: 2rem;
            color: #666;
            font-size: 0.9rem;
        }}
        .card-grid {{
            display: grid;
            grid-template-columns: repeat(auto-fill, minmax(280px, 1fr));
            gap: 1rem;
        }}
        .card {{
            border: 1px solid #e9ecef;
            border-radius: 8px;
            padding: 1rem;
            transition: box-shadow 0.3s, transform 0.3s;
        }}
        .card:hover {{
            box-shadow: 0 4px 12px rgba(0,0,0,0.15);
            transform: translateY(-2px);
        }}
        .card h4 {{ margin-bottom: 0.5rem; }}
        .card p {{ font-size: 0.9rem; color: #666; }}
        .updated {{
            font-size: 0.85rem;
            color: #666;
            margin-top: 1rem;
            text-align: center;
        }}
    </style>
</head>
<body>
    <div class="hero">
        <h1>{COURSE_CODE}: {COURSE_NAME}</h1>
        <h2>{INSTITUTION}</h2>
        <p>{PROGRAM}</p>
    </div>

    <div class="container">
        {lectures_html}
        {examples_html}
        {exercises_html}
        {homeworks_html}
        {assignments_html}

        <div class="section">
            <div class="section-header">
                <span class="section-icon">💻</span>
                <h3>Getting Started</h3>
            </div>
            <div class="section-content">
                <h4>Clone this Repository</h4>
                <pre style="background:#f8f9fa; padding:1rem; border-radius:4px; overflow-x:auto; margin:1rem 0;"><code>git clone https://github.com/massoudhamad/pt821.git
cd pt821</code></pre>

                <h4>Compile and Run Java Programs</h4>
                <pre style="background:#f8f9fa; padding:1rem; border-radius:4px; overflow-x:auto; margin:1rem 0;"><code>javac examples/HelloWorld.java
java -cp examples HelloWorld</code></pre>
            </div>
        </div>
    </div>

    <div class="footer">
        <p>{INSTITUTION}</p>
        <p class="updated">Last updated: {datetime.now().strftime('%B %d, %Y')}</p>
    </div>
</body>
</html>'''

    with open('index.html', 'w') as f:
        f.write(html_content)

    print(f"✅ Generated index.html")
    print(f"   - {len(lectures)} lecture(s)")
    print(f"   - {len(examples)} example(s)")
    print(f"   - {len(exercises)} exercise(s)")
    print(f"   - {len(homeworks)} homework(s)")
    print(f"   - {len(assignments)} assignment(s)")

def generate_lectures_section(lectures):
    if not lectures:
        return '''
        <div class="section">
            <div class="section-header">
                <span class="section-icon">📚</span>
                <h3>Lectures</h3>
            </div>
            <div class="empty-message">No lectures available yet.</div>
        </div>'''

    rows = ""
    for i, lecture in enumerate(lectures, 1):
        basename = os.path.basename(lecture)
        html_link = lecture.replace('.pdf', '.html')
        rows += f'''
            <tr>
                <td>Module {i}</td>
                <td><a href="{html_link}">{format_name(basename)}</a></td>
                <td><span class="badge badge-pdf">PDF</span></td>
            </tr>'''

    return f'''
        <div class="section">
            <div class="section-header">
                <span class="section-icon">📚</span>
                <h3>Lectures</h3>
            </div>
            <div class="section-content">
                <table>
                    <thead>
                        <tr><th>Module</th><th>Topic</th><th>Format</th></tr>
                    </thead>
                    <tbody>{rows}</tbody>
                </table>
            </div>
        </div>'''

def generate_examples_section(examples):
    if not examples:
        return '''
        <div class="section">
            <div class="section-header">
                <span class="section-icon">💡</span>
                <h3>Code Examples</h3>
            </div>
            <div class="empty-message">No examples available yet.</div>
        </div>'''

    cards = ""
    for example in examples:
        basename = os.path.basename(example)
        class_name = get_class_name(example)
        html_link = example.replace('.java', '.html')
        cards += f'''
            <a href="{html_link}" class="card">
                <h4>{class_name}</h4>
                <p><span class="badge badge-java">Java</span> {basename}</p>
            </a>'''

    return f'''
        <div class="section">
            <div class="section-header">
                <span class="section-icon">💡</span>
                <h3>Code Examples</h3>
            </div>
            <div class="section-content">
                <div class="card-grid">{cards}</div>
            </div>
        </div>'''

def generate_exercises_section(exercises):
    if not exercises:
        return '''
        <div class="section">
            <div class="section-header">
                <span class="section-icon">✏️</span>
                <h3>Exercises</h3>
            </div>
            <div class="empty-message">No exercises available yet.</div>
        </div>'''

    rows = ""
    for exercise in exercises:
        basename = os.path.basename(exercise)
        num = extract_exercise_number(basename)
        name = format_name(basename).replace(f'Exercise{num} - ', '')
        html_link = exercise.replace('.java', '.html')
        rows += f'''
            <tr>
                <td>Exercise {num}</td>
                <td><a href="{html_link}">{name}</a></td>
                <td><span class="badge badge-java">Java</span></td>
            </tr>'''

    return f'''
        <div class="section">
            <div class="section-header">
                <span class="section-icon">✏️</span>
                <h3>Exercises</h3>
            </div>
            <div class="section-content">
                <table>
                    <thead>
                        <tr><th>#</th><th>Topic</th><th>Format</th></tr>
                    </thead>
                    <tbody>{rows}</tbody>
                </table>
            </div>
        </div>'''

def generate_homeworks_section(homeworks):
    if not homeworks:
        return '''
        <div class="section">
            <div class="section-header">
                <span class="section-icon">📝</span>
                <h3>Homeworks</h3>
            </div>
            <div class="empty-message">No homeworks available yet.</div>
        </div>'''

    rows = ""
    for i, hw in enumerate(homeworks, 1):
        basename = os.path.basename(hw)
        ext = 'PDF' if hw.endswith('.pdf') else 'Java'
        badge = 'badge-pdf' if hw.endswith('.pdf') else 'badge-java'
        html_link = hw.replace('.pdf', '.html').replace('.java', '.html')
        rows += f'''
            <tr>
                <td>Homework {i}</td>
                <td><a href="{html_link}">{format_name(basename)}</a></td>
                <td><span class="badge {badge}">{ext}</span></td>
            </tr>'''

    return f'''
        <div class="section">
            <div class="section-header">
                <span class="section-icon">📝</span>
                <h3>Homeworks</h3>
            </div>
            <div class="section-content">
                <table>
                    <thead>
                        <tr><th>#</th><th>Description</th><th>Format</th></tr>
                    </thead>
                    <tbody>{rows}</tbody>
                </table>
            </div>
        </div>'''

def generate_assignments_section(assignments):
    if not assignments:
        return '''
        <div class="section">
            <div class="section-header">
                <span class="section-icon">📋</span>
                <h3>Assignments</h3>
            </div>
            <div class="empty-message">No assignments available yet.</div>
        </div>'''

    rows = ""
    for i, assignment in enumerate(assignments, 1):
        basename = os.path.basename(assignment)
        ext = 'PDF' if assignment.endswith('.pdf') else 'Java'
        badge = 'badge-pdf' if assignment.endswith('.pdf') else 'badge-java'
        html_link = assignment.replace('.pdf', '.html').replace('.java', '.html')
        rows += f'''
            <tr>
                <td>Assignment {i}</td>
                <td><a href="{html_link}">{format_name(basename)}</a></td>
                <td><span class="badge {badge}">{ext}</span></td>
            </tr>'''

    return f'''
        <div class="section">
            <div class="section-header">
                <span class="section-icon">📋</span>
                <h3>Assignments</h3>
            </div>
            <div class="section-content">
                <table>
                    <thead>
                        <tr><th>#</th><th>Description</th><th>Format</th></tr>
                    </thead>
                    <tbody>{rows}</tbody>
                </table>
            </div>
        </div>'''

if __name__ == '__main__':
    print(f"\n🎓 {COURSE_CODE} Course Website Generator\n")

    # Create folders if they don't exist
    for folder in ['lectures', 'examples', 'exercises', 'assignments', 'homeworks']:
        os.makedirs(folder, exist_ok=True)

    generate_index()
    print(f"\n🌐 Website generated! Open index.html to preview.")
    print(f"   Run 'git add . && git commit -m \"Update course materials\" && git push' to publish.\n")
