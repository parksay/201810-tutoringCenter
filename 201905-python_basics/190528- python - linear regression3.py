#!/usr/bin/env python
# coding: utf-8

# In[6]:


import tensorflow as tf
import tplot as plt


# In[7]:


#학습이 끝난 후 테스트 데이터를 통해서, 학습의 결과를 확인해 보기


# In[12]:


x = tf.placeholder(tf.float32, shape = [None]) #여기서 none 은 없다는 게 아니라, 뭐가 들어올지 아직 몰른다. 
y = tf.placeholder(tf.float32, shape = [None]) #우리도 받아 봐야 안다. 그치만 일단 진행은 해야겠다
#x가 입력되는 값, y가 출력되는 값.


# In[10]:


w = tf.Variable( tf.random_normal([1]), name = 'weight' ) #1x1의 행렬 / name은 안 써줘도 상관은 없는데, 그냥 통상 치니까 넣어준 것뿐임.


# In[11]:


b = tf.Variable(tf.random_normal([1]), name = 'bias')


# In[13]:


hypothesis = x * w + b


# In[14]:


cost = tf.reduce_mean( tf.square(hypothesis - y) )


# In[15]:


optimizer = tf.train.GradientDescentOptimizer(learning_rate = 0.01)


# In[16]:


train = optimizer.minimize(cost)


# In[17]:


sess = tf.Session()


# In[18]:


sess.run( tf.global_variables_initializer() )


# In[34]:


for i in range(2000) :
    cost_val, w_val, b_val, _ =sess.run( [cost, w, b, train], feed_dict = {x: [1, 2, 3], y: [1, 2, 3]} )
    if i % 100 == 0 :
        print(cost_val, w_val, b_val) #학습이 종료되면 cost_val이 최소값이 되어 


# In[21]:


#학습이 잘 되었는지 테스트하기


# In[35]:


print(sess.run( hypothesis, feed_dict = {x: [5]} ))


# In[36]:


print(sess.run( hypothesis, feed_dict = {x: [2.5]} ))


# In[37]:


print(sess.run( hypothesis, feed_dict = {x: [1.5, 3.5]} ))


# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:




