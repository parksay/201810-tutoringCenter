#!/usr/bin/env python
# coding: utf-8

# In[1]:


import tensorflow as tf


# In[ ]:


#tf 타입은 세 개뿐 => constant, placeholder , variable


# In[24]:


x = tf.constant( [1,2] ) #이렇게 바로 정의해줄 수도 있고, 아래처럼 일단 만들어 놓고, 나중에 연산할 때 즉석에서 바로 넣어줘도 되고
x = tf.placeholder( tf.float32 )
y = tf.placeholder( tf.placeholder( tf.float32) )
z = tf.multiply(x, y)
sess = tf.Session()
print(sess.run( z, feed_dict = {x:3, y:2} ))  #데이터를 run 하는 순간에 같이 넣어줌.


# In[31]:


sess = tf.Session()

a = tf.placeholder(tf.float32)
b = tf.placeholder(tf.float32)
c = a + b  # c= tf.add(a, b) 결과는 똑같음
print( sess.run(c, feed_dict = { a: [1,2], b: [3,4]}) )


# In[10]:


i = tf.placeholder( dtype = tf.float32 ) #이렇게 뒤에다가 dtype 이라고 따로 해줘도 되고
j = tf.placeholder( dtype = tf.float32 )
k = tf.placeholder( dtype = tf.float32 )
h = i * j + k


# In[12]:


feed_val = { i: 5., j: 6., k: 7.} #feed 값을 따로 만들어 놓고 나중에 넣어줘도 되고


# In[13]:


sess.run(h, feed_dict = feed_val)


# In[ ]:


#두 텐서 [[1,2],[3,4]] / [5,6] 를 더해 봐라. placeholder 써가지고


# In[32]:


p = tf.placeholder(dtype = tf.int32)
q = tf.placeholder(dtype = tf.int32)
r = tf.matmul(a, tf.reshape( b, (2,1) ))
sess.run(r, feed_dict = {p: [[1,2],[3,4]], q: [5,6]})


# In[ ]:


# Variable 의 활용      => 얘는 쓸려면 반드시 초기화를 시켜야 한다는 점.


# In[ ]:





# In[ ]:





# In[55]:


x = tf.Variable( [2], dtype = tf.float64 )  #그냥 tf.float32 하면 암것도 안 뜨지만, dtype = tf.float32 하면 워닝 뜸.
x = tf.Variable(2.)
y = tf.Variable(5.)
z = x * y


# In[57]:


init = tf.global_variables_initializer() ##global은 혹시 같은 이름의 다른 애들이 있으면 다 통합해서 한번에 초기화 한다고


# In[59]:


sess.run(init)
print( z )


# In[ ]:





# In[ ]:




