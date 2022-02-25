#!/usr/bin/env python
# coding: utf-8

# In[1]:


import numpy as np


# In[23]:


myarray = np.array(
        [
            [
                [11, 12, 13],
                [21, 22, 23],
                [31, 32, 33],
                [41, 42, 43]
            ],
            [
                [11, 12, 13],
                [21, 22, 23],
                [31, 32, 33],
                [41, 42, 43]
             ]
        ])


# In[24]:


print(myarray.ndim)


# In[25]:


print(myarray.shape)


# In[28]:


print(np.sum(myarray))  


# In[29]:


print( np.sum(myarray, axis = 0) )


# In[30]:


print( np.sum(myarray, axis = 1) )  


# In[31]:


print( np.sum(myarray, axis = 2) )  


# In[34]:


boolArray = np.array([True, False, True, True, False]) #불린형 타입을 넣어 놓은 어레이


# In[35]:


boolArray


# In[36]:


boolArray.dtype


# In[ ]:


intArray = np.array( [[1,2],[3,4],[5,6]] )


# In[37]:


floatArray = np.array( [[1.1, 2.1], [3.3, 4.4]] )


# In[38]:


floatArray


# In[39]:


floatArray.dtype


# In[42]:


floatArray2 = np.array( [[1.1, 2.1], [3.3, 4.4]], dtype='float32' )  #자료형 크기 명시해주기


# In[41]:


floatArray.dtype


# In[43]:


floatArray3 = np.array( [[1,2],[3,4],[5,6]], dtype = 'float64' ) #자료형 명시해서 변환.


# In[46]:


floatArray3 #뒤에 소수점 생김.


# In[44]:


floatArray3.dtype


# In[47]:


floatArray4 = np.array( [[1.,2.],[3.,4.],[5., 6.]] ) #근데 이게 표준. 보통은 소수점 찍어줌으로써 실수로 바꿈


# In[48]:


floatArray4 #역시 소수점 생겨져 있음


# In[ ]:


floatArray4.dtype


# In[49]:


np.empty( (4,3) )  #엔트리를 초기화 하지 않고, 지정된 형태 및 형태의 새로운 배열을 생성
#비워 놓겠다는 게 아니라, 초기화 자체를 하지 않겠다는 것. 그 안에 뭐 가득 차 있기는 한데, 그냥 무의미.
#그 안에 들어있는 무의미한 데이터는, 그냥 우리가 다른 연산이나 프로그램 돌리면서 썼던 데이터인데, 
#(뭐 이미지일 수도 있고 음악일 수도 있고) 그거를 그냥 숫자 데이터로 인식해서 뿌려주는 것 뿐


# In[107]:


array1 = np.array( [[1, 2, 3], [4, 5, 6], [7, 8, 9]] )
array2 = np.zeros_like(array1) # 지정된 배열과 같은 형태의 새로운 배열을 생성해 줌 - 안에 데이터가 모두 0으로 들어가 있는
array2


# In[108]:


np.zeros((2,3))  #2행 3열짜리 np Array를 만드는데, 그 안을 0으로 채워줘라. (주로 float 다루는 라이브러리라 디폴트로 float 들어가 있음)


# In[94]:


np.zeros((2,3)).dtype #float 있는지 확인


# In[109]:


array3 = np.zeros((2,3), dtype = int) #자료형 정의해줄 수도 있음


# In[96]:


array3.dtype #자료형 정의해줬을 때 잘 나오는지 확인


# In[91]:


np.ones((2, 3)) #지정된 형태의 배열을 새로 만들어 줌. -안에 모두 1로 채워줌
np.ones((2,3), dtype = int)
np.ones_like(array1) #지정된 배열과 같은 형태의 배열을 생성해 줌 - 안에 데이터가 모두 1이 들어가 있는


# In[90]:


np.identity(2) #지정된 크기의 단위 행렬을 만들어 줌. 대각선 방향만 1, 그 외는 0을 가짐


# In[89]:


np.eye(3) #크기가 3인 정방행렬의 단위행렬을 만들어라


# In[88]:


np.eye(3,4)  #완성되지 않은 형태라도, 크기가 3,4인 단위행렬을 만들어라


# In[87]:


np.eye(3,4,1)  #1 들을 위로 한 칸


# In[84]:


np.eye(3,4,-1) # 1들을 아래로 한 칸


# In[83]:


np.full( (2,3), 10 ) #full - 가득 채워라. 2,3 크기의 행렬을 만들고 그 안을 모두 10으로 채워 넣어라


# In[82]:


10 * np.ones((2,3), dtype = int) #위에 full도 있긴 있는데, 그냥 ones 만들어서 곱해주는 식으로 해서 더 많이 씀.


# In[81]:


np.arange(10) #0부터 시작해서 10개 (10미만의 수들)을 순서대로 채워서 배열 만듦.


# In[80]:


np.arange(start = 1.0, stop = 5.0, step = 0.5) #1부터 시작해서 5될 때 멈추는데, 간격은 0.5씩 순서대로 해서 채워달라

