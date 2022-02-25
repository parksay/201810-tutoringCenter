# 예외 처리 경우 어디어디 지나가는지 어떤 순서로 가는지, 체크하기 위해 서로 다른 메세지 출력.
n = 0
try :
    n = 3 / 2
    print('n= ', n)
except :
    print('예외 발생')
else :
    print('예외 발생하지 않음', n)
finally :
    print('예외 상관 없이 무조건 실행')
print('try구문과 상관 없는 부분', n) #
# 문자열과 숫자를 이어붙이겠다고 그대로 ' + ' 연산을 하면  타입 에러 뜨는데, ' , ' 찍고 서로 다른 애들인데 이어 붙이겠다고 하면 가능
# ' + ' 는 print 자체의 기능이 아니라, 문자열의 기능임.
#  print 안에 ' + '쓰면, 문자열과 문자열을 이어 붙여서 새로운 문자열을 만들고 난 후에, 그 새로운 문자열을 출력하겠다고.
# 그러니까 타입 에러가 뜨는데, print 의 자체 기능 중에서, 서로 다른 객체로 인정하면서도, 그것들을 따로따로, 순서대로 출력해주는 기능이 ' , '


# 여러 개의 문장을 실행할 건데, 예외 처리 다루는 법? 1. 하나하나 세세하게 붙여주기 2. 전체를 try로 묶어서 각각에 대해 따로 지정해주기

try:
    a = input('정수입력: ')
    b = input('정수입력: ')
    c = int(a) / int(b)
    print(a, '/' , b , "= ", c)
    print(d)
    li = [1,2,3]
    print( li[5] )
    print('aaa' / 'bbb')
    print( 5 / 0 )
except NameError :
    print('갖다 쓰고자 하는 변수가 없을 때. 변수명 오타거나, 정의해준 적도 없는 애 데려다가 쓰거나')
except IndexError :
    print('리스트나 튜플 등에서 뭐 꺼내다 쓰려고 하는데, 그 첨자에 해당하는 값이 없을 경우. 첨자가 그 리스트 등의 범위를 벗어남')
except TypeError :
    print('자료형이 뭔가 잘못 됨. 그 자료형으로는 수행할 수 없는 연산들. 문자열이랑 숫자랑 더한다든지, 문자열을 나눈다든지,')
    #문자열 더하기나 곱하기는 됨.
except: ZeroDivisionError :
    print('0으로 나누기. 이건 뭐. 그냥 0으로 나누지 말라고.')
except BaseException :

n = int( input('1~10까지의 정수를 입력해 주세요') ) => 여기서 문자열 쓰면 ValueError
if n % 2 == 0 :
    print('짝수입니다.')


#원하는 결과 얻을 때까지 계속 반복하게 만들기
msg = ""
while True :   #여기서는 true 없고 True
    try :
        n = int( input(msg + '1~10까지의 정수를 입력해 주세요') ) #처음엔 안 뜨던 메세지가 나중에는 뜨도록 하고 싶은데, 잘 안 되네
        if n < 1 or n > 10  :
            raise ValueError
        elif n % 2 == 0 :
            print('짝수입니다.')
            break
        else :
            continue
    except :
        msg = '다시 입력해 주세요.'
        #python 에서는 예외를 발생시키는 명령어가 raise, 자바에서는 아래와 같음
        #throw : 일부러 예외 만들기
        #throws : 선언할 때


#키보드로부터 정수를 입력받아 중복되지 않은 정수 5개의 리스트 생성
#검색할 정수 입력받음 -> 몇 번째에 있는지 그 첨자를 출력( index함수 활용 )

inlist = []
while True :
    try :
        inval = int( input('입력할 정수 입력(현재 저장된 갯수=' + str( len(inlist) ) + '): ') )
        if inlist.index(inval) :
            raise IndexError
    except ValueError :
        inlist.append(inval)
        if len(inlist) == 5 :
            break
    except IndexError :
        continue
#검색할 값 있는지
while True :
    try :
        choice = int( input('탐색할 번호( 0입력시 탈출 ): ') )
        if choice == 0 :
            break
        print( '탐색한 값의 첨자: ', inlist.index(choice) ) #list 객체에서 index() 내장함수는 찾는 첨자의 요소가 없으면 ValueError 발생시킴
    except ValueError :
        print('찾는 값이 없습니다')
    except BaseException :
        print('예상치 못한 오류 발생')



#쌤꺼 코드
while True :
    try :
        choice = int( input('탐색할 번호( 0입력시 탈출 ): ')
        break
    except :
        print('다시 입력해주세요.')

        #검색할 정수가 리스트의 몇 번째에 있는지 출력, 또는 없을 경우
try :
    indx = inlist.index(choice)
    print( '%d -> [%d]번 첨자에 있습니다.' % (choice, indx) )
except:
    print('%d -> 리스트에 없습니다.' % choice)
