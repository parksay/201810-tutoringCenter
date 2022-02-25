#!/usr/bin/env python
# coding: utf-8

# In[11]:


import tensorflow as tf
import numpy as np


# In[12]:


#numpy - zeros , ones 생성


# In[26]:


a = np.zeros((2,2))


# In[76]:


b = np.ones((2,2))


# In[28]:


#tensorflow - zeros , ones 생성


# In[29]:


x = tf.zeros((2,2))


# In[30]:


y = tf.ones((2,2))


# In[31]:


#numpy - shape 확인


# In[32]:


a.shape


# In[33]:


#tensorflow - shape 확인


# In[34]:


x.get_shape()


# In[35]:


#numpy - reshape 조정


# In[36]:


np.reshape( a, (1,4) )


# In[37]:


#tensorflow - reshape 조정


# In[38]:


tf.reshape( x, (1,4) )


# In[39]:


#numpy - 행렬간의 곱셈


# In[40]:


np.dot(a, b)


# In[41]:


#tensorflow - 행렬간의 곱셈


# In[42]:


tf.matmul(x, y)


# In[45]:


#numpy - 슬라이싱, 인덱싱


# In[46]:


a[0, 0] , a[ : , 0], a[0, : ]


# In[47]:


#tensorflow - 슬라이싱, 인덱싱


# In[48]:


x[0, 0], x[ : , 0], x[ 0, : ]


# In[49]:


#numpy - 차원, 쉐이프 출력


# In[50]:


c = np.array([1,2,3,4,5])
print(np.ndim(c))


# In[51]:


print(np.shape(c))


# In[52]:


#tensorflow - 차원, 쉐이프 출력


# In[53]:


z = tf.constant([1,2,3,4,5])
sess = tf.Session()
print(sess.run( tf.rank(z) ))


# In[54]:


print(sess.run( tf.shape(z) ))


# In[55]:


#numpy 실행


# In[56]:


a = np.zeros([2,2])
print(a)


# In[57]:


t = tf.zeros([2,2])
sess = tf.Session()
print(sess.run(t))
sess.close()


# In[62]:


#tensorflow 실행


# In[63]:


p = tf.constant( [[1,2,3], [4,5,6]] )
sess = tf.Session()
sess.run( tf.global_variables_initializer() )
print(sess.run( tf.zeros_like(p) ))
sess.close()


# In[64]:


#numpy - 배열 zeros, reshape []로 정의


# In[65]:


d = np.zeros([2,2])
print(d)


# In[66]:


print( d.reshape([1,4]) )


# In[67]:


#tensorflow - 배열 zeros, reshape []로 정의


# In[74]:


q = tf.zeros([2,2])
sess = tf.Session()
print( sess.run(q) )


# In[75]:


print( sess.run(tf.reshape(q, [1,4])) )
sess.close()

