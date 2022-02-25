#if 구문
n = int( input('점수: ') ) # int(n) = input( '점수: ') 이건 안 되네
if n >= 80 :
    print( "80점 이상")
        print("이렇게 더 들여서 쓰면 에러")
#파이썬은 들여쓰기로 코드의 구조를 파악하기 때문에 파이썬은 들여쓰기에 매우 엄격하다.
#자바에서 ; 세미콜론, 괄호 등으로 구조를 파악하는 것처럼 파이썬에서는 들여쓰기 자체가 하나의 틀, 포맷이다.
#그 정해진 틀 안에서 코딩을 짜야 한다. 더 들여써도 안 되고 덜 들여써도 안 된다
#오류 메세지도 java 에서 괄호나 세미콜론 빼먹었을 때 unexpected syntax 나오는 거처럼 unexpected ~~이런 거 나옴

if 0 <= n <= 100 :
    if n > 90 :
        print( '90점 이상')
    elif n > 80 :
        print( '80점 이상')
    elif n > 70 :
        print( '70점 이상')
    else :
        print( '70점 이하')
else :
    print( '값을 확인해 주세요')


#4의 배수이면서 100의 배수는 윤년이 아니다, 400의 배수는 윤년이다
year = int( input( '윤년인지 확인할 연도: ') )
if year % 400 == 0 :
    print( '윤년입니다' )
elif year % 100 == 0 :
    print( '평년입니다' )
elif year % 4 == 0 :
    print( '윤년입니다' )
else :
    print( '평년입니다')

#진법 변환 계산기
입력할 진법 (2/8/10/16) : 16
입력값 : ff
변환활 진법 (2/8/10/16) : 2
결과: ff(16) -> 0b11111111(2) 요런 식으로 결과값 고대로 나오기

x = input( '입력할 진법: ')
m = input( '변환할 값: ')
m = int(m, int(x) )

y = int( input( '변환할 진법: ') )
if y == 2 :
    z = bin( m )
elif y == 8 :
    z = oct( m )
elif y == 10 :
    z = int( m )
elif y == 16 :
    z = hex( m )
print(str(m) + "(" + x + ")" + "->" + str(z) + "(" + str(y) + ")")
