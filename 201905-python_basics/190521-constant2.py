#!/usr/bin/env python
# coding: utf-8

# In[1]:


import tensorflow as tf


# In[ ]:


#상수값을 이용한 add


# In[3]:


a = tf.constant(3.0, tf.float32) #32비트 float 자료형으로 만들으라고. float64 이러면 64비트 float 만들라고


# In[ ]:





# In[5]:


b = tf.constant(4.0, tf.float32)


# In[6]:


x = tf.add(a,b)


# In[ ]:


#1차원 배열을 이용한 add


# In[8]:


import tensorflow as tf


# In[9]:


a = tf.constant([5], dtype = tf.float32) #1차원 배열, 요소는 하나, 자료형은 32비트짜리 float


# In[10]:


b = tf.constant([10], dtype = tf.float32)


# In[11]:


c = tf.constant([4], dtype = tf.float32)


# In[12]:


d = a * b + c  #배열을 일반 숫자처럼 연산


# In[13]:


print( d ) #이건 어쩌면 파이썬에서 type  인듯. 자료형을 확인하는 것.


# In[15]:


sess = tf.Session()


# In[21]:


print( sess.run(d) )  #끝에 . 은 지금 자료형이 float이라서. 아까 위에서 넣을 때 데이터를 float으로 넣어 놔서


# In[20]:


print(sess.run( tf.rank(d) ))


# In[22]:


print( d.shape )


# In[ ]:


#2차원 데이터의 연산


# In[ ]:


import tensorflow as tf


# In[44]:


a = tf.constant( [2,3] )  #이렇게만 넣어 놓으면 자료형은 int32, 즉 32비트짜리 int형 - 1차원, 요소 2개


# In[45]:


b = tf.constant( [[0,1]] )   #2차원, 요소 1개


# In[46]:


c = tf.constant( [[0,1], [2,3]] ) #2차원, 요소 2개


# In[34]:


x = tf.add(a,c) #차원이 다른데 연산이 되긴 되네?


# In[33]:


y = tf.multiply( a,c )


# In[30]:


sess = tf.Session()


# In[35]:


sess.run( x )


# In[36]:


sess.run( y )


# In[38]:


t1 = tf.constant( [2,3])


# In[39]:


t2 = tf.constant([ [0,1,2],[3,4,5],[6,7,8] ])


# In[42]:


sess.run( t1 + t2 ) # 이거는 shape 이 안 맞는 거지


# In[48]:


d = tf.constant( [[2,2]] )


# In[49]:


e = tf.constant( [[0,1], [2,3]] )


# In[50]:


f = tf.matmul(d,e) #matrix multiply


# In[51]:


print( sess.run(z) )


# In[80]:


g = tf.constant( [[3],[2],[1]] )


# In[70]:


h = tf.constant( 3 )


# In[71]:


i = tf.multiply(g,h)  #matrix 와 상수의 곱은, matrix 내의 각 요소에 모두 상수만큼 곱해주는 것. 어쩌면 이 때부터 이미 broadcasting 기능이


# In[72]:


print( sess.run(i) )


# In[64]:


j = tf.constant( [[1,2], [3,4], [5,6]])


# In[65]:


k = tf.multiply(j,h)


# In[66]:


print( sess.run( k))


# In[87]:


m = tf.constant( [[6,4,2]] )


# In[85]:


n = tf.constant( [[1],[3],[5]] )


# In[88]:


p = tf.matmul(m,n) #내적


# In[89]:


print( sess.run( p )) 


# In[90]:


q = tf.constant([[1],[3],[5]])


# In[94]:


r = tf.constant([[2,4]])


# In[95]:


s = tf.matmul(q,r) #외적


# In[96]:


print( sess.run(s) ) #matmul은 차원이 같아야 함. multiply는 차원 달라도 가능한데. broadcasting 기능 돼서.


# In[105]:


a = tf.constant([1,2,3])


# In[106]:


b = tf.constant([[1,2,3],[4,5,6],[7,8,9]])


# In[107]:


print(sess.run( tf.multiply(a,b) )) #multiply 는 차원이 달라도 알아서 크기를 맞춰서 들려줌. 대신 shape가 맞아야 함. 한 요소 안에서 크기가 몇인지


# In[ ]:


#차원이 똑같아도 되고 달라도 됨. a = tf.constant([[1,2,3]]) 이래도 됨. 결과도 똑같음.

