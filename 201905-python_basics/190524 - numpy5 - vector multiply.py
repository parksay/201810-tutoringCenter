#!/usr/bin/env python
# coding: utf-8

# In[1]:


import numpy as np


# In[3]:


array1 = np.array([[11,22,33],[21,22,23],[31,32,33],[41,42,43]])


# In[ ]:


#벡터의 내전, 백터와 행렬의 곱, 행렬곱


# In[10]:


x = np.array([[1,2],[3,4]])
y = np.array([[5,6],[7,8]])


# In[9]:


v = np.array([9,10])
w = np.array([11,12])


# In[6]:


#벡터의 내적 : 결과 동일
print(v.dot(w)) #원래 앞 배열의 행과 뒤 배열 열이 같아야 하는데, 안 맞으면 그냥 알아서 키워줌
print(np.dot(v,w))


# In[11]:


print(x.dot(v))  #행렬과 벡터의 곱 : dimension이 1인 배열
print(np.dot(x,v))


# In[17]:


import tensorflow as tf
a = tf.constant([[1,2],[3,4]])
b = tf.constant([[5,6],[7,8]])
c = tf.constant([9,10])
d = tf.constant([13,14])


# In[62]:


e = tf.reshape(c,[2,1])


# In[63]:


sess = tf.Session()


# In[64]:


sess.run(e)


# In[65]:


tf.matmul(a,e)


# In[92]:


sess = tf.Session()
e = tf.reshape(c, [2,1])
result = tf.matmul(a,e)   #np.dot() 이랑 기능을 똑같은데, 차원을 관리하는 게 다름
sess.run(result)


# In[81]:


print(x.dot(y))
print(np.dot(x,y))


# In[ ]:





# In[83]:


array_d1 = np.array( [1, 0, 1])


# In[84]:


array_d2 = np.array( [[11,12,13],[21,22,23],[31,32,33],[41,42,43]])


# In[86]:


array_d2


# In[78]:


array_broad = array_d1 + array_d2 #차원이 다르고 shape이 같으면 브로드캐스팅 해줌


# In[79]:


array_broad


# In[80]:


np.arange(3).reshape(3,1) + np.arange(3) #하면 행으로도, 열로도, 브로드캐스팅이 일어남. 


# In[89]:


array_tf1 = tf.constant( [1,0,1] )


# In[90]:


array_tf2 = tf.constant([[11,12,13],[21,22,23],[31,32,33],[41,42,43]])


# In[94]:


array_tf3 = array_tf1 + array_tf2


# In[95]:


sess.run(array_tf3)

