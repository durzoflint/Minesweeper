# Minesweeper
Code for a Minesweeper Problem

Have you ever played Minesweeper? This cute little game comes with a certain operating system whose name we can’t remember. The goal of the game is to ﬁnd where all the mines are located within a M ×N ﬁeld.

The game shows a number in a square which tells you how many mines there are adjacent to that square. Each square has at most eight adjacent squares. The 4×4 ﬁeld on the left contains two mines, each represented by a “*” character. If we represent the same ﬁeld by the hint numbers described above, we end up with the ﬁeld on the right:

                                                      *...    *100
                                                      ....    2210
                                                      .*..    1*10
                                                      ....    1110

Input:
The input will consist of an arbitrary number of ﬁelds. The ﬁrst line of each ﬁeld contains two integers n and m (0 < n,m≤ 100) which stand for the number of lines and columns of the ﬁeld, respectively. Each of the next n lines contains exactly m characters, representing the ﬁeld.
Safe squares are denoted by “.” and mine squares by “*,” both without the quotes. The ﬁrst ﬁeld line where n = m = 0 represents the end of input and should not be processed.

Output:
For each ﬁeld, print the message Field #x: on a line alone, where x stands for the number of the ﬁeld starting from 1. The next n lines should contain the ﬁeld with the “.” characters replaced by the number of mines adjacent to that square. There must be an empty line between ﬁeld outputs.

                                                          Sample Input
                                                          44
                                                          *...
                                                          ....
                                                          .*..
                                                          ....
                                                          35
                                                          **...
                                                          .....
                                                          .*...
                                                          00

                                                          Sample Output
                                                          Field #1:
                                                          *100
                                                          2210
                                                          1*10
                                                          1110
                                                          Field #2:
                                                          **100
                                                          33200
                                                          1*100
