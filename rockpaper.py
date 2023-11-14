
import random
options=['rock','paper','scissor']

while True:
    

    uc=int(input('''
<<<--------GAME START ------->>>

        1 || PLAY
        2 || EXIT

<<<-------------------------->>>
        '''))
    ccout=0
    ucount=0
    if uc==1:
        for a in range(1,6):
            userinput=int(input('''
<<<-------------------------->>>
            1  .   ROCK
            2  .   PAPER
            3  .   SCISSOr  
<<<-------------------------->>>
            '''))
            if userinput==1:
                uchoice="rock"
            elif userinput==2:
                uchoice="paper"
            elif userinput==3:
                uchoice="scissor"
            Cchoice = random.choice(options)
            if Cchoice==uchoice:
                print("User Choice ",uchoice)
                print("Computer Choice ",Cchoice)
                print('Game Draw')
                ucount=1+ucount
                ccout=1+ccout
            elif (uchoice=='rock' and Cchoice=='scissor') or (uchoice=='paper' and Cchoice=='rock') or (uchoice=='scissor' and Cchoice=='paper'):
                print("User Choice ",uchoice)
                print("Computer Choice ",Cchoice)
                print('USER WIN')
                ucount=1+ucount
            else:
                print("User Choice ",uchoice)
                print("Computer Choice ",Cchoice)
                print('COMPUTER WINS')
                ccout=1+ccout
        if ucount>ccout:
            print('USER WINS THE GAME')
            print('User score is ',ucount)
            print('Computer score is ',ccout)
        elif ucount==ccout:
            print('GAME DRAW')
            print('User score is ',ucount)
            print('Computer score is ',ccout)
        else: 
            print('COMPUTER WINS THE GAME')
            print('User score is ',ucount)
            print('Computer score is ',ccout)

    else:
        break