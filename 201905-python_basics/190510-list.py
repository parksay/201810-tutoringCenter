#리스트 사용
nlist = [1, 2, 3, 4, 5]
print( nlist ) #리스트는 변수명만으로 그 원소 전체를 출력할 수 있다
print ( nlist[0] ) #리스트 안의 값들 중에서 특정 자리의 원소를 빼온다
print( len(nlist) ) #길이, 문자열 크기
print( 3 in nlist ) #True / False 로 나옴. nlist 안에 3이라는 값이 있느냐 없느냐.

slist = ['aaaa', 'bbbb', 'cccc']
print( slist ) #변수명만으로 전체 출력 가능
print ( slist[0] ) #특정
print( len(slist) ) #리스트에 객체가 몇 개가 저장돼 있느냐
print( len(slist[2]) ) #리스트 중 특정 객체의 결과값의 문자열 길이
print( 'aaaa' in slist ) #slist라는 배열 안에 'aaaa' 라는 값의 원소가 있느냐
print( 'dddd' not in slist ) #slist 라는 배열 안에 'dddd' 라는 값의 원소가 없느냐
print( 'bb' in slist[1] ) #slist 라는 배열 안에 1번 자리 원소를 꺼내서, 그 문자열 안에 'bb'라는 말이 포함돼 있느냐
print( 'dd' not in slist[2] ) #slist 라는 배열 안에 2번 자리 원소를 꺼내서, 그 문자열 안에 'dd'라는 말이 포함 안 돼 있느냐

nlist = [1, 2, 3, 4, 5, 'hi'] #두 가지 이상의 자료형을 혼용하여 넣는 것이 가능. 어차피 다 그냥 객체니까. 역시 자료형에 대해서 유연해


sublist = nlist[2:4] #2번부터 4번 자리 원소만을 뽑아서 다시 배열 만듦
print( sublist ) #시작값은 포함, 끝값은 포함하지 않음
sublist = nlist[0:5:2]
print( sublist )
nlist[0] = 10 #배열에서 특정 자리의 원소 값만을 지정해서 다른 값으로 변경
nlist[0:2] = [100, 200, 300 ,400]
print( nlist )
nlist.append(500) #맨 끝에 새로운 원소를 추가 - 배열 길이가 하나 늘어남
nlist.insert(0, 99) #특정 자리에 새로운 원소를 끼워 넣기, 따라서 끼워 넣을 자리의 값과, 넣을 값, 두 개가 필요.
#해당 자리의 값을 포함한 그 뒤의 모든 값들은 한 칸씩 뒤로 밀림
del nlist[0] #특정 자리에 있는 기존의 원소를 지워버리기. 그 뒤의 원소들은 한 칸씩 앞으로 땡김. 배열 길이가 하나 줄어들겠지
nlist = nlist + [5, 6, 7]  #기존의 배열 뒤에 새로운 배열의 값들을 이어서 붙여넣기
nlist = nlist * 2 #기존의 배열 뒤에, 기존의 배열과 똑같은 배열을 그대로 반복해서 이어 붙임


print( nlist )
print( nlist.index(3) ) #배열 안에서 3이라는 값을 갖는 원소의 자리값을 가져옴(앞에서 뒤로 찾으면서 처음 만나는 녀석만 리턴)
print( nlist.count(3) ) #배열 안에서 3이 몇번 나오는지 세서 출력
print( max(nlist) ) #nlist라는 배열 안에서 최대값을 찾아서 출력
print( min(nlist) ) #nlist라는 배열 안에서 최소값을 찾아서 출력
print( nlist.sort() ) #배열 안의 값들을 정렬
print( nlist.reverse() ) #역순으로 정렬
print( sorted(nlist) ) #기존의 리스트를 정렬하는 게 아니라, 기존의 리스트는 그대로 두고, 정렬된 리스트를 새로 만들어서 리턴해 줌
