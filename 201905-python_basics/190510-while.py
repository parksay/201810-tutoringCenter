#while문 연습

#1
n = 1
while n < 5 :
    print('반복할 내용')
    n += 1
print('-' * 10)


#2
n = 1
while True :
     print('반복할 내용')
     n = n + 1
     if n > 5 :
         break
print('-' * 10)
#자바에서는 반복문 끝낼 때 break, 파이썬도 똑같음


#3
n = 1
while n < 5 :
    n += 1
    if n == 2 :
        continue #여기서 조건에 걸리면 그 아래는 손도 대지 않고 바로 while 조건문으로
    print('반복할 내용' + str(n))
print('-' * 10)

#예제1 - 정수를 반복해서 입력 받아, 양의 정수라면 합계를 내고, 나머지는 무시, 만약 0을 입력하면 반복 종료 후 결과 출력
#결과 예시 -  양의 정수 갯수 = 5 합계 = 100 평균 = 20
sum = 0
cnt = 0
while True :
    x = int( input('합계를 구할 양의 정수(현재' + str(cnt) + '개):' ) )
    if x > 0 :
        sum = sum + x
        cnt = cnt + 1
    elif x == 0 :
        break
    elif x < 0 :
        continue
print('양의 정수의 갯수 =', cnt, '합계 = ' , sum , '평균 = ' , round(sum/cnt, 3) )


#예제2 - 문자 1개와 정수 1개릂 입력받은 후, 문자의 Unicode를 출력하는 함수를 해당 문자로부터 입력받은 정수까지 반복
inChar = input('시작할 문자')
reNum = int( input('반복할 횟수') )
start = ord(inChar)
end = start + reNum
x = start
while True :
    if x >= end :
        break
    print( chr(x) )
    x = x + 1
