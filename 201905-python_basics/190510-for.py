for i in range(1, 10) :  # i라는 제어 변수를, 1 이상 10 미만까지 돌려가면서 종속 구문들을 반복
    print('Hello Big World!')
#for i in range(0, 10) 이러면 왜 시작은 포함하면서 끝은 포함하지 않도록 해서 반복할까?
#내가 추측컨대, 보통 배열은 0부터(즉 처음부터) 시작해서 반복할 텐데, 만약 그렇게 되면(시작값이 0일 경우에는)
#뒤에 오는 값이, 배열 안의 원소 갯수가 됨. 즉, 0부터 시작해서, 10번 반복하게 됨.
#for i in range(0, 23) 이러면 0부터 포함해서 시작해서 23번을 반복하게 됨. 이런 직관성이 있기는 함

for i in range(3, 37, 3) : #3부터 36까지 3씩 증가하면서, 그 수를 출력한다. 단, 5의 배수인 경우는 생략
    if(i%5 != 0) :
        print( i )
    if( i%5 == 0) :
        continue
    print( i )
#위쪽이 더 나음. 아래쪽은 5의 배수인 경우 continue를 수행하고, 5의 배수가 아닌 경우는 print를 수행함
#그러나 위쪽의 경우는, 우선 5의 배수가 아닌 경우는 print를 수행하고, 만약 5의 배수인 경우 아무것도 수행하지 않은 채 for문이 다음으로 진행함.
#즉, 아래쪽은 5의 배수든 아니든 그 무언가를 실행하지만, 위쪽의 경우는 5의 배수가 아닌 경우는 그냥 비어있는 채로 진행함.

#1부터 1000까지의 소수를 모두 출력
number_List = []
for i in range(2, 1001) :
    number_List.append(i) #일단 2부터 1000까지 배열에 다 넣고

for i in range(2,1001) : # i를 2부터 1000까지 돌리면서
    if i in number_List : #i가 배열 안에 있다면(이미 이전의 반복문에 의해서 삭제됐을 수도)
        for j in range(i, 1001, i) : #그 i를 포함해서, i의 모든 배수들을
            if j in number_List : #그 배열 안에 있다면 (공배수의 경우는 이미 이전의 반복문에 의해서 삭제된 상태일 수도)
                del number_List[ number_List.index(j) ] #그 값이 들어있는 자리(indwx)를 찾아서 삭제해라
print( number_List )

#1부터 1000까지 소수 찾아서 출력
prime_List = []
prime_List.append(2); prime_List.append(3)
for i in range(5, 1001) : # i를 2부터 1000까지 돌리면서 하나씩 꺼내온 후에
    flag = True
    for j in range( 2, i//2 ) : # 그 i를 2부터 i/2 까지 움직이는 j로
        if i % j == 0 : # 각각 나눠본 뒤에, 나누어 떨어지면
            flag = False
            break;  #소수가 아닌 거니까 그냥 보내고
    if flag :
        prime_List.append( i ) # j가 다 돌았는데도 나누어 떨어지는 애가 없으면 소수, 여야 하는데 왜 안 되냐
print(prime_List)
