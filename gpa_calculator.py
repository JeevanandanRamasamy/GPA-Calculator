def uGPA(grds, crds):
    totalvalue, totalcredits = 0, 0
    for c in range(len(grds)):
        totalvalue += crds[c] * getValue(c, grds)
        totalcredits += crds[c]
    return totalvalue / totalcredits


def wGPA(grds, lvls, crds):
    totalvalue, totalcredits = 0, 0
    for c in range(len(grds)):
        value = getValue(c, grds)
        if lvls[c] == 'A' and grds[c] != 'D' and 'F':
            value += 1
        if lvls[c] == 'H' and grds[c] != 'D' and 'F':
            value += 2
        totalvalue += crds[c] * value
        totalcredits += crds[c]
    return totalvalue / totalcredits


def getValue(num, grds):
    grade = grds[num].upper()
    if grade == 'A+':
        return 4.33
    elif grade == 'A':
        return 4.00
    elif grade == 'A-':
        return 3.67
    elif grade == 'B+':
        return 3.33
    elif grade == 'B':
        return 3.00
    elif grade == 'B-':
        return 2.67
    elif grade == 'C+':
        return 2.33
    elif grade == 'C':
        return 2.00
    elif grade == 'C-':
        return 1.67
    elif grade == 'D':
        return 1.00
    else:
        return 0.00


try:
    courses = int(input('Welcome to the GPA Calculator!\nHow many courses do you take?\n'))
except:
    quit('The input is not an integer. Please try again.')
if courses <= 0:
    quit('The number of courses must be greater than zero. Please try again.')

grades, levels, creds = [], [], []

for i in range(courses):
    grades.append(input('Please enter the grade for course ' + str(i + 1) + '\n'))
    if grades[-1].upper() not in ['A+', 'A', 'A-', 'B+', 'B', 'B-', 'C+', 'C', 'C-', 'D', 'F']:
        quit('The entered grade is not valid. Please try again.')
    try:
        creds.append(float(input('Please enter the credits for course ' + str(i + 1) + '\n')))
    except:
        quit('The input is not a floating point number. Please try again.')
    if creds[-1] <= 0:
        quit('The number of credits must be greater than zero. Please try again.')
    levels.append(input(
        'Please enter the level (H = Honors/AP, A = Accelerated, R = Regular) for course ' + str(i + 1) + '\n'))
    if levels[-1].upper() not in ['H', 'A', 'R']:
        quit('The entered level is not valid. Please try again.')

print('Your unweighted GPA is:', uGPA(grades, creds), '\nYour weighted GPA is:', wGPA(grades, levels, creds))
