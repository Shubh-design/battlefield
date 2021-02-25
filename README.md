# battlefield is a solution for a problem statement-Battlefield game : In this game, there are "n^2" pedestals(depicted as '0') arranged in an "n x n"
matrix arrangement, there are "n" soldiers playing this game. Each soldier can attack other
soldier(s) in a straight line vertically(front/back), horizontally(sideways), or diagonally.
Write an algorithm to print a solution (positions of soldiers in the field, depicted as '1'), such
that all the soldiers are safe i.e. no soldier can be attacked by another soldier. If the solution is
not possible for a given 'n', then print "not possible".
Example:
Input :
4
Output :
0 0 1 0
1 0 0 0
0 0 0 1
0 1 0 0
1 : pedestal occupied by a soldier
0: pedestal unoccupied
