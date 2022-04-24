# Your zodiac sing
The program allows you to calculate your zodiac sing by entering date
## What we will need
To enter data, we will work with the scanner class and with if else conditions
### All data must be entered by digits
1. Year of birth
* The year of birth will be deducted from the current year.
2. Month of birth
* The entered data will be reflected digitally as a string
3. Dey of birth
* Will calculate which half of the month the answer belongs to
# Response table if the conditions are met

| **Zodiac** | **month** |
|:----------:|-----------|
|Capricorn   |January    |
|Aquarius    |February   |
|Pisces      |March      |
|Aries       |April      |
|Taurus      |May        |
|Gemini      |June       | 
|Cancer      |Juli       |
|Leo         |August     |
|Virgo       |September  |
|libra       |October    |
|Scorpio     |November   |
|Sagittarius |December   |

# Quicksort algorithm

## Step-by-step description of the operation of the quick sort algorithm
1. Select a reference element from the array. Usually the reference element is the middle element.
2. Divide the array into two sub arrays: elements smaller than the reference and elements larger than the reference.
3. Recursively apply sorting to two sub arrays.

# File writer

1. Create the "Person" class by filling it with the necessary data (fields) and adding the "set and get" methods to them.
2. Create the "Validation" class to check the correctness of the input data.
3. The "ScannerPerson" class is necessary for us to receive the data entered from the user,
4. The "FileWriter" class assigns a name similar to the user's name to a file,
   creates a file with the extension ".txt" and fills it in line by line.

# Reading and Writing
1. В параметрах блока "try"  считываем файл ""test_data.txt" путем буферизации и проводим запись данных в новый файл "result_data.txt".
2. В теле блока "try" задаем цикл на чтения и разбив на массив данных из файла.
3. В теле цикла "while" задаем условия "if" и передаем параметры для отлова данных по заданным параметрам,  и записываем их в новый фаил
4. в блоке "catch"  обрабатываем исключение проброшенное из блока"try"