
# 1. 전달된 정수 사이의 합계 리턴
# n = sum(1, 5)  => 15
def sum(a, b) :
    res_sum = 0
    if a > b : # 작은 수, 큰 수, 순서대로 오게끔 바꾸기
        c = b
        b = a
        a = c
    for i in range(a, b + 1) :
        res_sum = res_sum + i
    return res_sum

print( sum(11,12) )



# 2.전달된 정수까지의 팩토리얼
# n = fact(4)  => 24
def fact(n) :
    res_fact = 1
    for i in range(1, n + 1) : #n 전달받은 거 까지 포함하려면 끝값에 n + 1
        res_fact = res_fact * i
    return res_fact

print( fact(4))


# 3. 전달된 정수까지의 짝수의 합계
# n = sum2(10)  => 30
def sum_even(k) :
    res_sum = 0
    for i in range(2, k+1, 2) :  #2씩 증가하도록 증가값을 조절하는 for 구문 기능 이용
        res_sum = res_sum + i
    return res_sum

def sum_even(k) :
    res_sum = 0
    for i in range(1, k+1) : #나머지를 구해서 if 구문으로 짝수인지 판명
        if i%2 == 0 :
            res_sum = res_sum + i
        elif i %2 != 0 :
            continue
    return res_sum

print( sum_even(10) )


# 4. 정수를 5개 전달 받아서 합계와 평균을 리턴
def get_avg() :
    avg = 0
    a = int( input('평균 구할 값1: ') )
    b = int( input('평균 구할 값2: ') )
    return (a + b) / 2

def get_avg() : #위에 거랑 똑같은 데 그냥 짧게 만들어 봄
    return (int( input('평균 구할 값1: ') ) + int( input('평균 구할 값2: ') )) / 2

print( get_avg() )


# 5. 가변 인수 활용 -> 항상 맨 뒤에, 오직 하나만, 왜냐면 다른 모든 변수를 포함하는 게 가능하기 때문에, 어디부터 어디까지인지가 헷갈릴 수 있음
def get_sum( *param_sum ) :
    sum = 0
    for i in param_sum :
        sum = sum + i
    return sum

print( get_sum( 220 * 14) )

# for 구문의 범위를, 기존처럼 range를 쓰지 않고 그냥 SQL 구문처럼, in( 보기 숫자들 ) 하는 식으로 표현하는 게 가능한가보네

list_test = []
list_test.append( (1,2,3,4,5,20) )
sum = 0
for i in list_test[0] : #첫번째 요소(튜플)을 꺼내서, 그 안에 있는 애들 보기로 삼아서, i가 그 보기중에 있는지 없는지 확인
    sum = sum + i
print( sum )
