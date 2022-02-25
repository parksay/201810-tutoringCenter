#


#인수가 있는 함수
a = 20
def test2(a) :
    print('전달된 인수: ', a)

test2(10)
print(a)

#리턴값이 있는 함수 - 자료형이 유연한 파이썬이기 때문에, 애초에 리턴값의 자료형을 알려줄 필요가 없음.
def test3() :
    return 99

n = test3()
print(n)

#인수 또는 리턴 값이 여러 개인 함수 - 리턴이 여러 개일 경우, 다른 자료형에 담아서 보내면 됨 -
    #리스트가 있기는 한데, 읽기 전용이면서, 훨씬 빠르고 효율적인 친구가 있었지 - 튜플

def test4(a, b, c) :
    print(a, b, c)
    return (a, b, c)

n = test4(1, 2, 3)
print( n ) #리턴 받은 튜플 그대로 출력
print( n[0] ) #리턴 받은 튜플 중에 특정 요소만 꺼내서 쓰기
print( type(n) )
