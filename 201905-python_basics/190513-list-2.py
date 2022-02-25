list1 = [ n for n in range(1, 11) ]  #n을 1부터 10까지 돌리면서 배열 생성
print(list1)

#위에꺼 풀어서 쓰면
list3 = [];
for i in range(1, 10) :
    list3.append(i)
    print(list3)



#리스트 요소를 1~100 중에서 3과 5의 배수들로 채우기
list2 = [n for n in range (1,100) if n % 3 == 0 or n % 5 == 0]
print(list2)
#리스트에 n을 넣을 건데, 그 n은 1부터 100까지 반복하면서, 만약 n이 5의 배수이거나 5의 배수일 때만

list4 = []; #위에꺼 풀어서 쓰면
for i in  range(1,100) :
    if i % 3 == 0 or i % 5 == 0 :
        list4.append(i)
print(list4)


#이중리스트 -바둑판처럼 생각하는 건 아니지만. 1행, 2행, 등으로 생각할 수 있음
list5 = [ [1,2,3,4], [5,6,7,8], [9,10] ]
print(list5)
print(list5[0])
print(list5[1][2])
print( len(list5) )
print( len(list5[0]) )
print( type(list5) )
print( type(list5[1]) )
print( type(list5[1][2]) )


#  이중 리스트는 이중 포문과 거의 한 세트겠지.
for row in list5 :          #row가 list5 안의 원소 개수만큼 돌면서
    for col in row :        #col은 row 안의 원소 개수만큼 돌면서
        print(col, end = '/') #각 col을 출력
print(list5)


#돌아가는 범위를 잘 봐봐
for row in range(5) :
    for col in range(row) :
        print(row,col)

#어디부터 어디까지 돌릴지 봐봐. range 안에 어떤 값을 넣으면 어디부터 어디까지 돌아가는지, 그 안에 뭘 넣어줘야 할지.
for row in range( len(list5) ) :
    for col in range( len(list5[row]) ) :
        print_ele = 'list5[' + str(row) + ']'
        print_ele = print_ele + '[' + str(col) + '] = ' + str( list5[row][col] )
        print(print_ele)

for i in range(1, 101, 5) #i가 1부터 100까지 5씩 증가하기
for i in range(1, 101) #뒤에 숫자 생략하면, 증가 기본값, 1씩 증가하기
for i in range(100) #앞에 숫자 생략하면 시작 기본값, 0부터 시작
for i in range(0, len(list5) ) :
    for j in range( len(list5[i]) ) : #for 문에서 range 의 값이, 끝값을 포함하지 않는 이유가 바로 여기 있네
                                    #그냥 list의 길이만 썼을 때, 자동으로 0부터 그 길이 -1 까지 돌게 됨, 즉 list의 모든 요소를 한번씩 돌게 됨
        print('list5[%d][%d] = %d' % (i, j, list5[i][j])) #자바에서 printf 같은 느낌, 형식 지정해서 출력

#정수 10개를 입력 받아 리스트에 저장 - 그 값들의 평균과 10이상 차이나는 정수들을 출력
#결과 예시: / 입력한 정수 : [3,7,12,-7,32,73,4,83,-34] / 평균 : 28.1 / 결과 : 483, 32, -34
input_list = [];
sum = 0
for x in range( 10 ) :
    in_val =  int( input('입력할 값: ') )
    input_list.append( in_val )
    sum = sum + in_val
print('입력한 값: ' + str(input_list) )
avg = sum / len(input_list)
print('평균값: ' + str( avg ) )
print('평균과 10이상 차이 나는 값', end = ': ')
for x in range( len(input_list) ) :
    if abs(avg - input_list[x]) >= 10 :
        print(input_list[x], end = ', ')




#사전 자료형
dic_test = { 'boy' : '소년', 'school' :  '학교', 'book' : '책'} #사전 자료형, map 또는 연관 배열이라고도 함
print(dic_test) #객체 그대로 나오네
dic_test['boy'] = '남자 아이' #요소 하나 꺼내서 값을 바꾸는 것도 가능
dic_test['girl'] = '소녀' #기존에 없는 값이면 새로 추가해 줌
del dic_test['book'] #삭제도 그냥 index몰라도 손쉽게.
print(dic_test) #다시 출력해 보면 변경 사항 반영

print( dic_test.keys() )    #dic_test가 키 값으로 갖는 값들의 집합
print( dic_test.values() )  #dic_test가 내용 값으로 갖는 값들의 집합
print( dic_test.items() ) #요소들 하나하나들 튜플 형태로 출력
