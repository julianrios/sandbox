Databases power business decisions and data analysis. 
Structured Query Language
Querying reading data from a database.
Databases that use a different form of reading data are no as NoSQL databases.
Two important components to each data base. The information stored in it called data and how the data is organized called schema. 
The schema established how the data should be stored and divided into different sections.
The schema also determines how each of the sections relates to other sections.

### Organizing Data with Databases
Think of a database as a spreadsheet. 
The sections of a database are called tables. Think of a table as its own spreadsheet full of rows and columns. Typically each table contains data for a specific type of thing. For example owning a t shirt store. You could store inventory in on spreadsheet or table and the orders in another spreadsheet or table. 

SQL lets you arrange the data you want and filter out only data you want to view. No data is being deleted from the table you are just selecting the information you want to bring back. The same data can be shown in different ways for multiple users.

Databases allow users to store data in well defined sections. This keeps the data uniform. However, the SQL you write can show the data in different ways which is handy for reporting subsets of data.

### Types of Data
Table columns are defined in the schema to have certain data types. A data type describes the value to be stored.

### Common data types
text - store names and descriptions 
numberic - store prices, ages, and quantities of things
date - store temporal information (anything time related)
Text Type Examples
TEXT
VARCHAR
Numeric Type Examples
INT
INTEGER
Date Type Examples
DATETIME
DATE
TIMESTAMP


Think of a schema as a coin sorter the coin sorter ensures that the correct coin goes in the correct coin column. Like a coin sorter the database schema prescribes what data should go into each column of the table. 
Userstanding that column data types can affect how data is retrieved helps people design the schema for the database.

SQL is a specialized language to get information or data out of a database. Lines of SQL code are known as a statement or query. Most queries are issued one at a time.

### Definitions
Syntax The vocabulary and grammatical rules surrounding the structure of your code.

Keywords The vocabulary words of a programming language used to issue commands to a computer.

SQL Used
SELECT * FROM <table name>;
The asterisk or star symbol (*) means all columns.

The area between the SELECT and FROM keywords is the columns you want to get the information from. 

SELECT <column names> FROM <table name>;

You can retrieve only the information you want from the columns you want and filter out the rest.

ID is a unique identifier for the database entry. It gurantees that every row is not a duplicate of another and can be isolated from all other rows if needed.

You can change the name of any column using the AS keyword. For multiple wrap words in double quotes "Alias Name" There is a shorthand without the AS keyword but it is confusing and less readable.

SELECT <column> AS <alias> FROM <table>;

When checking for a conditional that is a text value or date value use ""
For example:
SELECT title, first_published FROM books WHERE author = "J.K. Rowling";

Remeber you can use =, =>, <=, != with the WHERE keyword. 

People who design databases often use the ID in other tables, these are known as foreign keys. 

Instead of duplicating information from another table using the ID saves on duplication and disc space because the data is tightly coupled. Often referred tp as relational databases, because the data has relationships with other data. 

SELECT <columns> FROM <table> WHERE <condition>;

Equality Operator
Find all rows that a given value matches a column's value.
SELECT <columns> FROM <table> WHERE <column name> = <value>;

Inequality Operator
Find all rows that a given value doesn't match a column's value
SELECT <columns> FROM <table> WHERE <column name> != <value>;

You can compare multiple values in a WHERE condition. If you want to test that both conditions are true use the AND keyword, or either conditions are true use the OR keyword.
SELECT <columns> FROM <table> WHERE <condition 1> AND <condition 2>;
SELECT <columns> FROM <table> WHERE <condition 1> OR <condition 2>;

Useful for checking if a value in the column matches the values we specify
SELECT <columns> FROM <table> WHERE <column> IN (<value 1>, <value 2>, <value 3>);

To find all rows that are not in the set of values you can use NOT IN.
SELECT <columns> FROM <table> WHERE <column> NOT IN (<value 1>, <value 2>, <value 3>);


The BETWEEN keyword Simplifies queries when dealing with ranges of values .
SELECT <columns> FROM <table> WHERE <column> BETWEEN <lesser value> AND <greater value>;

A wildcard is a substitute character used when you don't know the rest of the text.

Placing the percent symbol (%) any where in a string in conjunction with the LIKE keyword will operate as a wildcard. Meaning it can be substituted by any number of characters, including zero!


We can use two wildcards, and your search pattern is case insensitive,meaning you don't need to include the correct upper casing or lower casing.

To return a query with a NULL value it must be used with the IS keyword
SELECT <columns> FROM <table> WHERE <column> IS NULL;

To return a query with no NULL values it must be used with the IS NOT keyword
SELECT <columns> FROM <table> WHERE <column> IS NOT NULL;

You can query from two tables and return data from both

### Handling Data
Ordering
Limiting
Manipulating Text
Aggregation
Date

### Retrieving Results in a Particular Order
Ordering by a single column criteria:
SELECT <columns> FROM <table> ORDER BY <column> 
[ASC|DESC];

Ordering by multiple column criteria:
SELECT * FROM <table name> ORDER BY <column> [ASC|DESC], <column 2> [ASC|DESC], <column n> [ASC|DESC];

To limit the number of results returned, use the LIMIT keyword.
SELECT <columns> FROM <table> LIMIT <# of rows>;


### Paging Through Results
To page through results you can either use the OFFSET keyword in conjunction with the LIMIT keyword or just with LIMIT alone.
SELECT <columns> FROM <table> LIMIT <# of rows> OFFSET <skipped rows>;

Functions can manipulate the results of a query in different ways. They aren't restricted to being used in just one part of a query. 

Syntax definitions
Keywords: Commands issued to a database. The data presented in queries is unaltered.

Operators: Performs comparisons and simple manipulation

Functions: Presents data differently through more complex manipulation

<function name>(<value or column>)

Example:
UPPER("Andrew Chalkley") 

You can join columns together so they're more human readable as one.
SELECT CONCAT(<value or column>, <value or column>, <value or column>) FROM <table>;

### Single vs Double Quotes
In SQL there's a difference between using single quotes (') and double quotes ("). Single quotes should be used for String literals (e.g. 'lbs'), and double quotes should be used for identifiers like column aliases (e.g. "Max Weight")

SELECT maximum_weight || 'lbs' AS "Max Weight" FROM ELEVATOR_DATA;

Some versions of SQL will let you get away with that. So while you may be able to use them interchangeably here, just know that's not always the case.

To obtain the length of a value or column use the LENGTH() function it can be used after WHERE clause as well.
SELECT LENGTH(<value or column>) FROM <tables>;

Use the UPPER() function to uppercase text.
SELECT UPPER(<value or column>) FROM <table>;

Use the LOWER() function to lowercase text.
SELECT LOWER(<value or column>) FROM <table>;

To create smaller strings from larger piece of text you can use the SUBSTR() funciton or the substring function.'
SELECT SUBSTR(<value or column>, <start>, <length>) FROM <table>;

To replace piece of strings of text in a larger body of text you can use the REPLACE() function.
SELECT REPLACE(<original value or column>, <target string>, <replacement string>) FROM <table>;

Functions can be joined together. They are applied from inside out.
Example:
SELECT UPPER(LOWER("AWESOME"));

To count rows you can use the COUNT() function.
SELECT COUNT(*) FROM <table>;

To count unique entries use the DISTINCT keyword too:
SELECT COUNT(DISTINCT <column>) FROM <table>;

To count aggregated rows with common values use the GROUP BY keywords:
SELECT COUNT(<column>) FROM <table> GROUP BY <column with common value>;

COUNT(*) counts all rows
COUNT(column) counts non-NULLs only
COUNT(1) is the same as COUNT(*) because 1 is a non-null expressions
Your use of COUNT(*) or COUNT(column) should be based on the desired output only.

To total up numeric columns use the SUM() function.
SELECT SUM(<numeric column) FROM <table>;

SELECT SUM(<numeric column) AS <alias> FROM <table>
GROUP BY <another column>
HAVING <alias> <operator> <value>;

HAVING is used on the <aggregated condition>

To get the average value of a numeric column use the AVG() function.
SELECT AVG(<numeric column>) FROM <table>;

SELECT AVG(<numeric column>) FROM <table> GROUP BY <other column>;

To get the maximum value of a numeric column use the MAX() function.
SELECT MAX(<numeric column>) FROM <table>;
SELECT MAX(<numeric column>) FROM <table> GROUP BY <other column>;

To get the minimum value of a numeric column use the MIN() function.
SELECT MIN(<numeric column>) FROM <table>;
SELECT MIN(<numeric column>) FROM <table> GROUP BY <other column>;

Operators aren't only for comparing values or concatenating strings. They can be used to perform mathematical operations.
Mathematical Operators
* Multiply
/ Divide
+ Add
- Subtract
SELECT <numeric column> <mathematical operator> <numeric value> FROM <table>;

Number of decimal places to round to -> second argument
ROUND(<value>, <decimal places>)

