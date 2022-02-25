#!/usr/bin/env python
# coding: utf-8

# In[1]:


import numpy as np


# In[18]:


array = np.array( [[11,12,13], [21,22,23],[31,32,33],[41,42,43]])


# In[5]:


b = array[0,0]  #이렇게 하면 그냥 스칼라 값을 그대로 가져온 것. 참조하고 있는 게 아님.
b 


# In[8]:


c = array[1:3,1:3]


# In[9]:


print(c)


# In[12]:


array[1,1] = 51  #원본 데이터의 특정 값을 바꾸면
array #그걸 출력해보면 바뀌어 있는데


# In[13]:


c[0,0]  #C도 같이 바뀌어 있음.


# In[6]:


#shape


# In[30]:


array


# In[31]:


array.reshape((4,3))
array


# In[28]:


np.flatten(array) # numpy 모듈 함수가 아님. 이거 틀리다고
array.flatten() # numpy 객체의 메소드로만 가능. 이게 맞다고. 주의 기능은, 그냥 1차원으로 쭉 길게 납작하게 만들어 준다고.


# In[41]:


a = np.array([[1,2],[3,4]])
b = np.array([[5,6]])


# In[40]:


np.concatenate((a,b), axis = 0) #concatenate 하려면 차원이 같아야 함. axis = 0 => 열의 크기도 같아야 함.


# In[44]:


array[0:1].T


# In[48]:


a


# In[49]:


b.T


# In[53]:


np.concatenate((a, b.T), axis = 1)  # axis = 1 ==> 행의 크기가 같아야 함. => 그냥 b는 안 되는데 b.T 하면 됨.


# In[ ]:


#tensorflow 에서 matmul 의 기능이 numpy 에서 dot 기능


# In[55]:


np.add(a, b)


# In[54]:


a + b


# In[ ]:




