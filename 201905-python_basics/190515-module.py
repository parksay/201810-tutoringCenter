# 나올 수 있는 오류, 숫자 갯수, 중간 메뉴, 등등, 생일, 나이, 성별, 등 출력하기
import time
def regest() :
    re_id = input('주민등록번호를 입력해 주세요("-"는 생략)')
    if re_id.isdecimal() and len(re_id) == 13 :
        sex_int = int(re_id[6:7]) # 성별
        year = int('19' + re_id[0:2]) # 생년
        month = int(re_id[2:4]) # 생월
        day = int(re_id[4:6]) # 생일
        if sex_int == 1 :
            sex_str = '남자'
        elif sex_int == 2 :
            sex_str = '여자'
        else :
            print('다시 입력해주세요')
            return

        print('나이: %d' % ( int(time.localtime().tm_year) - int(year) )  )
        print('성별: ' + sex_str )
        print('생년: %d' % year )

        if month in (1,2,3,4,5,6,7,8,9,10,11,12) :
            print('생월: %d' % month )
        else :
            print('다시 입력해주세요')
            return
        days = []
        for i in range(1,32) :
            days.append(i)
        if day in  days :
            print('생일: %d' % day )
        else :
            print('다시 입력해주세요')
            return
    else :
        print('다시 입력해주세요')
        return
regest()
    #'return' outside function => return 이라는 말은, function 을 정의하고 나서라야
    #그 안에서 실행할 수 있는 명령이라고. 뭔, 함수가 일단은 있어야, 그걸 return을 하든 말든 하지
