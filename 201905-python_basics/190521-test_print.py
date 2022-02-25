#!/usr/bin/env python
# coding: utf-8

# In[4]:


import tensorflow as tf


# In[6]:


print(tf.__version__) #버전 조회하는 법


# In[15]:


hello = tf.constant("Hello Big World!") 


# In[10]:


print(hello) #이러면 데이터 값이 출력되는 게 아니라, 이 객체의 정보, 이 배열의 정보. 


# In[13]:


sess = tf.Session() #데이터 값을 출력하려는 거라면 session 통해서만 가능.


# In[16]:


sess.run(hello) #한글은 깨짐. 바로 출력하는 건 안 된다는 거지.

