#텍스트 파일에 쓰기

#파일 열기
f = open('a.txt', 'wt') #a.txt 라는 파일을 write 쓰기 모드로 text 편집 모드로 연다
#출력
f.write('aaaaa\n')
f.write('가나다라\n')
f.write('1234\n')
#닫기
f.close()

#내가 열고 싶다고 하는 파일이 없을 수도 있음. 예외 잡아 주기.

try :
    f = open("a.txt", "rt")
    text = f.read()
    print(text)
except FileNotFoundError :
    print("파일이 없습니다.")
finally :
    f.close()


# 그 파일 안의 내용을 한번에 다 읽어 오기 => 편하지만, 용량에 따라 문제가 있을 수도
# 읽고 싶은 부분만 읽어올 수 있어야 함. 아래가 그거.

try :
    f = open("a.txt", "rt")
    while True :
        text = f.read(10) #10개를 읽어 오겠다
        if len(text) == 0 :
            break
        print(text, end = '') #읽을 때마다 계속 줄바꾸니까 end바꿔줌
    f.close()
except FileNotFoundError :
    print('해당 파일이 없습니다.')

if 다음의 조건문  ===>     1 or 나머지 / none or 나머지  / 문자열 있음 or 나머지 등등을 True or False 로 취급해줌 (앞에 ! 붙이는 것도 모두 가능)


#예제
*내용을 입력하세요. (종료는 새로운 행에서 엔터키)
aaaa
bbbb
1111
* 저장하시겠습니까? (y/n) y (대소문자 구분 없도록)
* 파일명 : a.txt
이미 존재하는 파일입니다. 다시 입력해주세요.
*파일명 : b.txt
b.txt 파일이 저장되었습니다.

#일단 입력하는 정보들 메모리에 저장하다가, 저장하겠다고 하면 그때서야 파일에 쓰기 or
#일단 파일 하나 만들어놓고, 입력하는 정보들 다 파일어 넣어 놓기. 저장 안 한다고 하면 지우고, 저장 한다고 하면 이름만 바꿔주면 되도록.

import shutil
import os
import time
fname = "temp" + str( time.time() ) + ".txt"  #중복되지 않는 파일 이름 만들기 위해 에폭 시간으로 파일 이름 임시 설정. 뒤에서 또 이 파일명을 사용해야 하기 때문에 따로 변수에 저장해 놓음
f = open(fname, "wt") #write 쓰기 모드를 text 편집 모드로 켜기 + write 모드는 해당 파일이 없으면 새로 만들고 이미 있으면 덮어 쓰고 새로 만들고
while True :
    in_val = input('내용을 입력해주세요 : ') #일단 입력 받기 - 반복할 거니까
    if len(in_val) < 2 : #입력 받은 게 1글자 이하이면 끝내기
        break
    f.write( in_val ) #입력 받은 내용이 2글자 이상이면 그 내용을 그대로 파일에 더 써넣기
choice = input('입력이 완료되었습니다. 파일을 저장하시겠습니까?(y/n) : ')
if choice.lower() == 'y' :  #대소문자 구분 없이 하도록, 소문자로 변환해주는 함수 실행
    f.close()   #일단 닫고 나서
    msg = ''
    while True :
        uname = input('파일 이름을 입력해주세요 :') #사용자가 원하는 파일 이름 입력 받기.
        if os.path.exists(uname) : #만약 이미 그 파일이 존재한다고 하면 다시 받기
            msg = '이미 존재하는 파일입니다. 다시 입력해주세요.' #다시 받을 때 메세지 추가하고 싶었는데, 위의 print 구문에 들어가질 않네
            continue
        else :
            break
    os.rename(fname, uname) #임시로 만들어 놓은 파일 이름을 사용자로부터 입력 받은 이름으로 바꾸는 함수
    print(uname, ' 파일이 저장되었습니다.')
elif choice.lower() == 'n' : #저장 안 한다고 하면
    f.close() #파일 닫고 그 파일 그냥 지워버리기
    os.remove(fname)
    print('취소되었습니다.')
