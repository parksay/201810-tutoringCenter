#!/usr/bin/env python
# coding: utf-8

# In[2]:


import numpy as np


# In[11]:


import tensorflow as tf


# In[3]:


array1 = np.array([[1,4, 2, 9],[1,3,7,3], [2,8,4,8]])


# In[7]:


np.amin(array1, axis = 0) #axis 를 생략해서 np.amin(A, 0) 해도 되긴 하는데 헷갈릴 수 있으니까 생략은 잘 안 함.


# In[ ]:


np.amin(array1) #그냥 array1이라는 애의 전체 값들 중에 가장 작은 값.


# In[40]:


x = tf.constant( [[1, 2, 1, 8], [2, 5, 1, 5], [7, 3, 5, 2]] )
y = tf.constant( [[3, 5, 8, 2], [9, 3, 7, 9], [2, 6, 9, 6]] )
sess = tf.Session()
sess.run( tf.minimum(x,y) ) #같은 위치의 값들 끼리 비교해서, 최소값들만을 가지고 만든 새로운 배열을 만듦
sess.close() #세션은 사용하고 나면 꼭 닫아 주기


# In[26]:


a = tf.constant( [5, 2, 8] )
b = tf.constant( [16, 31, 4] )
sess = tf.Session()
sess.run( tf.minimum(a, b) )
sess.close()


# In[43]:


np.amax(x, axis = 0)  #np.amax(a, axis = 0)


# In[44]:


np.amax(x, axis = 1)  #np.amax(a, axis = 1)


# In[36]:


np.amax(a, 0).shape


# In[ ]:


np.amax(x, 0).shape


# In[37]:


np.median(x, 0)


# In[39]:


np.mean(x, 0)


# In[41]:


np.mean(x, 1)


# In[ ]:


np.var(x, 0) #분산


# In[ ]:


np.std(x, 0) #표준편차


# In[48]:


array3 = np.array( [[17, 43, 17, 47],[15, 25, 14, 84],[26, 73, 14, 37]])


# In[ ]:


#슬라이싱 - 문자열에서도 몇 번부터 몇 번까지 문자열 잘라서 가져오는 게 슬라이싱이었잖아. 다차원배열에도 이런 기능이 있음


# In[ ]:


array_s = array3[0:2, 0:4] # a라는 배열에서 슬라이스 해서 가져오겠다. 행은 0~1, 열은 0~3만 골라서 가져오겠다.


# In[ ]:


array3[:2, :] #생략하면 기존의 것과 같은 크기.


# In[ ]:


array3[ :2] #행은 생략하고 싶어도 생략할 수 없음


# In[ ]:


array3[0, 0] #선호하는 방식


# In[50]:


array3[0][0]


# In[51]:


array3[[0, 2], ] #인덱싱 = ' , ' 로 특정 좌표 요소만 가져오겠다. ' : ' 는 범위 단위로 가져오겠다, 슬라이싱


# In[52]:


print(array3, array3.shape, array3.ndim)


# In[59]:


sliceRow = array3[0:1, :]
print(sliceRow, sliceRow.shape, sliceRow.ndim)


# In[61]:


indexedRow = array3[0] #얘는 차원이 하나 떨어짐
print(indexedRow,indexedRow.shape, indexedRow.ndim)


# In[66]:


slicedCol = array3[ : , 0:1] #차원을 그대로 유지
print(slicedCol, slicedCol.shape, slicedCol.ndim)


# In[68]:


indexedCol = array3[ : , 0] #차원이 하나 떨어짐
print(indexedCol,indexedCol.shape, indexedCol.ndim)

