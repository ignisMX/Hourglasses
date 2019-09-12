# Hourglasses

Given a **6x6** 2D Array, **arr**:

```bash
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
0 0 0 0 0 0
```
We define an hourglass in **A** to be a subset of values with indices falling in this pattern in **arr**'s graphical representation:

```bash
a b c
  d
e f g
```
There are **16** hourglasses in **arr**, and an hourglass sum is the sum of an hourglass' values. Calculate the hourglass sum for every hourglass in **arr**, then print the maximum hourglass sum.

For example, given the 2D array:

```bash
-9 -9 -9  1 1 1 
 0 -9  0  4 3 2
-9 -9 -9  1 2 3
 0  0  8  6 6 0
 0  0  0 -2 0 0
 0  0  1  2 4 0
```
We calculate the following **16** hourglass values:

```bash
-63, -34, -9, 12, 
-10, 0, 28, 23, 
-27, -11, -2, 10, 
9, 17, 25, 18
```
Our highest hourglass value is **28** from the hourglass:

```bash
0 4 3
  1
8 6 6
```
0 + 4 + 3 + 1 + 8 + 6 + 6 = 28
## Usage

You should have installed java

```bash
cd Hourglassess/
javac Hourglasses.java
java Hourglasses
```

## Solution overview

Only loop over first element of hourglass, every others elements are constants.

## License
[MIT](https://choosealicense.com/licenses/mit/)