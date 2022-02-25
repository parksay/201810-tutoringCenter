#출력문
print(1)
print('문자열') #작은 따옴표도 문자열 의미
print("abc") #큰 따옴표도 가능
print() #print 함수에 줄바꿈이 자동으로 들어가 있음. 아무 것도 안 쓰면 그냥 줄만 바꾸게 됨

a = 1 #선언은 따로 필요 없음. 넣어 주는 자료 형에 따라 지가 알아서 바뀜
b = 2 #앞에서 숫자로 정의한 변수에 뒤에서 문자열 넣어주면 숫자 변수에서 갑자기 문자열 변수로 바뀜
print(a + b)
print(a,b)
print(a, b, sep = '----->')#끝에 있는 sep = 에서는, 각 값들 사이에 들어갈 구분 문자를 설정 가능 (sep = seperator)
print(a, b, sep = '----->', end = '끝') #end는 가장 끝 값으로 줄바꿈이 기본으로 들어가 있었는데 변경 가능
print ("이렇게","반복되는","말이 있을 때는","한번 설정으로 끝내버리기도 가능", sep = " 좀 ")

print('이렇게 말하다가 중간 말 바꾸고 싶으면 그냥 "\n" 넣어주면 바로 됨')

#input의 리턴값은 무조건 input의

#input에서는 그냥 숫자만 입력하면 기본적으로 string 으로 보네
c = input('문자열 입력: ')
print('c= ', "문자열")
print( type(c) )

d = input('실수 입력: ')
print( type(d) )
print(d)

print('d= ', d)
print( float(d) + 1 )
print( type( float(d) ) )

e = int( input( '정수 입력: ') )
print('e = ', e)

f = '이것은 테스트' + input('실수 입력: ')
print( type(f) )
print(f)


#자료형 확인 - input 으로 받을 변수라도 아직 입력 안 했으면 not defined 뜨고
#한번 위에서 다른 거 input 받았으면 뒤에서도 계속 그거 가지고 있는 듯
print( type(b) )
print( type(c) )
print( type(a) )
print( type(d) )
print( type(e) )
print( type(f) )

#파이썬에서는 모든 게 다 객체. 기본 자료형이 없음. int, ,double, float, 등이 다 객체
#예전에 java는 기본 자료형을 객체처럼 쓰려면 wrapper로 싸고 해서 객체로 만들어 줘야 하는데
#파이썬에서는 모든 값이 다 객체

#width 와 height 받아서 면적 구하기
width = input()
height = input()
print('넓이는 ' + str( ( int(width) * int(height) ) ) )

#파이썬에서는 정수형은 별도의 길이 제한 없이 메모리가 허용하는 한 얼마든지 큰 수를 담을 수 있음
#자바에서 제한이 있던 이유는 기본 자료형이라고 해서 4byte, 이런 식으로 크기를 지정해 놓아서 그랬지만
#파이썬의 경우는 어차피 다 객체라서 모두 가능

#거듭제곱의 연산은 **
print( str(3 ** 2) + '= 9')

#진법 표현
hx = 0xf #16진수 - hexadecimal
print(hx)
print( hex(hx) )

ot = 0o7 #8진수 - octal
print( oct(ot) )

bn = 0b100101010 #2진수 - binary
print( bin(b) )

#기존에 입력해 놓은 dc가 5진수였다고 가정하고 해석해서 그 값을 10진수로 바꾸면 뭐가 되는지 출력해달라
dc = '100' #int() 함수가, 10진법 정수 자료형인듯
print( int(dc, 5) )

#소수점 아래 값이 존재하는 dp 라는 변수.
dp = 1234.56789
#그냥 정수 부분만 취해 오기, 소수점 아래 반올림 그런 거 생각 안 함
print( int(dp), dp, sep = "원래는")
#소수점 아래 몇째 자리까지만 나타내고, 그 뒤는 반올림해버리기 => round
print( round(dp, 3), dp, sep = "원래는" )


#메모리는 하나임. b라는 변수를 위에서 2라고 저장해 놨으면, 내가 아래에서
#b=88 라는 문장을 써 놔도, 그 문장을 실행하지 않으면 b는 그대로 2를 가지고 있음
#print해봐도 2라고 나옴. b=88 해당 문장을 실행하고 나서야 b가 88이 들어가 있음

#실수형 자료형
wealth_Int = 103200000000
print( type(wealth_Int) )
wealth_Float = 1.032e8
print( type(wealth_Float) )

#복소수형 자료형
complex_number_a = 1 + 4j
complex_number_b = 5 + 7j
print( complex_number_a + complex_number_b )

#작은따옴표 안에 큰따옴표나, 큰따옴표 안에 작은따옴표는 문자열로 인정
#통일성이 없되 짧은 단어는 작은따옴표로, 긴 문장은 큰따옴표로 쓰는 경향
str_test = "I can 'test'"
print(str_test)
str_test = 'I "also" can test'
print(str_test)

#\를 문자열에 포함시켜서 쓰고 싶으면 앞에 하나를 더 붙이기, 즉 \\라고 써야 함
slash_test = "old\new"
print( slash_test )
slash_test = "old\\new"
print( slash_test )
slash_test = "yes\no"
print( slash_test )
slash_test = "yes\\no"
print( slash_test )

#원래 한 줄에 문자열 하나씩밖에 정의 못함.
line_test = "이거를 내가 이렇게 한 줄 넘도록 길게 써버리면 중간에 줄이 바뀌어 버린다고
그럼 오류가 나겠지"
print( line_test )
line_test = """그럴 때는 그냥 큰따옴표 세 개를 연속해서 붙여서 문자열을 열어버리면
줄을 넘어가더라도 그걸 그대로 문자열로 인식해 준다고. 게다가 중간에 등장하는
특수 문자들 예를 들어 \ 이나 \n 이나 \\ 이나 \r 등이 다 문자열로 그대로 인식된다고
아 특수문자는 아니네. ㅈㅅ. 줄바꿈만 그대로 가져가는구나"""
print( line_test )

#문자형과 문자 코드 간의 변환 = 문자 -> 코드 : ord 함수 / 코드 -> 문자 : chr 함수
print( ord('a') )
print( chr(97) )

boolean_test1 = a > 3
boolean_test2 = a == 5
boolean_test3 = 3 < 7
boolean_test4 = True
boolean_test5 = False
if a == 5:
    print("a는 5입니다")

#그냥 ' / ' 연산은 정수끼리의 값을 나누더라도 소수점 아래 값이 발생하면 그 값들을 그대로 가져옴
#자바는 int끼리 '/' 연산을 수행했으면 그 결과값도 int가 나오는데, 아무래도 자료형이 고정돼 있기 때문이 아닐까
#아무래도 파이썬은 자료형 자체가 유연하고 유동적이다 보니, int끼리 연산하더라도 그 결과값은 그때그때 자료형이 바뀔 수 있는 게 아닐까
print( 10 / 3 )
#' // ' 연산은 소수점 아래 값이 발생하면 버리고 정수 값만 가져옴.
print( 10 // 3 )
print( 2 * 3)
print( 2 ** 3 )

#복합 대입 연산자 / 파이썬은 a++ 이런 것 없음.
a = 10
print( a )
a = a + 1
print( a )
a += 1
print( a )

#문자열 연산
a = "aaa"
print( a )
b = 'bbb'
print( b )
#문자열 간의 ' + ' 연산은 그대로 이어 붙여주기
c = a + b
print( c )
#문자열과 숫자 간의 ' * ' 연산은 해당 문자열을 해당 숫자만큼 반복하기 / print('test') * 3 이거는 안 되네 ㅋㅋ
c = c * 3
print( c )
#반복 구간 사이마다 내가 원하는 구분 문자를 넣을 수는 없나? 그 구문 문자 자체도 결국 문자열, 이어붙이면 됨
c = (a + "반복하고 싶은 말은 여기에 넣으면 되나\n") * 5
print( c )
#문자열과 숫자간의 ' + '연산은, 그냥 에러. 문자열에 숫자가 들으면 int로 바꿔주든가,
#반대로 문자열로서 이어붙이고 싶으면 숫자를 문자열로 바꿔주든가
c = a + str(5) # or c = int(a) + 5 =>return 값은 int
print(c) #literal 문자열이라는 뜻인듯. 'aaa'를 int() 함수에 넣으려니까 유효한 타입이 아니래


#비트연산자
a = 3
print( a >> 1 ) # shift bit to right
print( a << 2 ) # shift bit to left
print( a & 5 ) # and
print( a | 5 ) # or
print( a ^ 5 ) # exclusive or - xor
print( ~a ) # 1의 보수로 만들어 주기( 부호값도 같이 바뀌는 듯 )

#비교, 논리 비트연산자
a = 1
b = 2
print( a == b )  # a랑 b랑 같냐
print( a > 0 and b > 0 ) # a랑 b랑 모두 각각 양수냐
print( a > 0 or b > 0 ) # a랑 b랑 한 쪽이라도 양수이냐
print( a > 0 and a < 10 ) # a가 1 ~ 10 사이냐
print( 1 <= a <= 10 ) # a 가 1 ~ 10 사이냐
print( a == b )
