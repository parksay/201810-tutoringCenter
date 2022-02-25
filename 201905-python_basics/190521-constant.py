#!/usr/bin/env python
# coding: utf-8

# In[1]:


import tensorflow as tf


# In[2]:


print(2+3)


# In[56]:


a = tf.constant(2.)
b = tf.constant(3.)
x = tf.add(a,b)


# In[50]:


print(a) #파이썬 자체는 자료형에 관대하지만, tensorflow는 속도가 느려지기 때문에 자료형을 처음부터 명확히 하고자 함.


# In[33]:


sess = tf.Session()


# In[51]:


sess.run(x)


# In[53]:


print( sess.run(x) ) #차원과 요소수.


# In[57]:


print( sess.run(tf,rank(a)) ) #a의 차원 수


# In[58]:


print(x.shape) #0차원이라 아무 것도 안 나옴. 나오는 자료형은 튜플

