#!/usr/bin/env python
# coding: utf-8

# In[ ]:


import tensorflow as tf
import numpy as np


# In[ ]:


x_data = [[1,2,1,1]
         ,[2,1,3,2]
         ,[3,1,3,4]
         ,[4,1,5,5]
         ,[1,7,5,5]
         ,[1,2,5,6]
         ,[1,6,6,6]
         ,[1,7,7,7]]
y_data = [[0,0,1] # one hot encoding => 한 세트에 하나만 1이고 나머지는 0인 애들.
         ,[0,0,1]
         ,[0,0,1]
         ,[0,1,0]
         ,[0,1,0]
         ,[0,1,0]
         ,[1,0,0]
         ,[1,0,0]]


# In[ ]:


x = tf.placeholder(tf.float32, shape = [None, 4])
y = tf.placeholder(tf.float32, shape = [None, 3])


# In[ ]:


w = tf.Variable(tf.truncated_normal([4,3]), name = 'weight')
b = tf.Variable(tf.truncated_normal([3]), name = 'bias')


# In[ ]:


init = tf.global_variables_initializer()


# In[ ]:


logits = tf.matmul(x, w) + b


# In[ ]:


hypothesis = tf.nn.softmax(logits)


# In[ ]:


#cost = -tf.reduce_mean(y * tf.log(hypothesis) + (1-y)* tf.log(1-hypothesis)) #cross entropy function


# In[ ]:


cost = tf.reduce_mean(-tf.reduce_sum( y * tf.log(hypothesis), axis = 1 )) #cross entropy function


# In[ ]:


optimizer = tf.train.GradientDescentOptimizer(learning_rate = 0.5)


# In[ ]:


train = optimizer.minimize(cost)


# In[ ]:


#세션1 세션 열어서 직접 돌리기sess = tf.Session()


# In[ ]:


sess.run(init)


# In[ ]:


for step in range (2001) :
    _, cost_val = sess.run([train, cost],feed_dict = {x: x_data, y: y_data})
    if step % 200 == 0 :
        print(step, cost_val)


# In[ ]:





# In[ ]:


#세션2 또는 with 쓰기
with tf.Session() as sess :
    sess.run(init)
    for step in range(5000) :
        _, cost_val = sess.run([train, cost], feed_dict = {x: x_data, y: y_data} )
        if step % 200 == 0 :
            print(step, cost_val)


# In[ ]:





# In[ ]:


test1 = [[1, 11, 7, 9]]
test2 = [[1, 3, 4, 3]]
test3 = [[1, 1, 0, 1]]


# In[ ]:


guess1 = sess.run(hypothesis, feed_dict = {x: test1})


# In[ ]:


print( guess1, sess.run(tf.argmax(guess1,1)) ) #세 덩이가 나오는데, 가장 앞에 있는 건


# In[ ]:


guess2 = sess.run(hypothesis, feed_dict = {x: test2})


# In[ ]:


print( guess2, sess.run(tf.argmax(guess2,1)) )


# In[ ]:


guess3 = sess.run(hypothesis, feed_dict = {x: test3})


# In[ ]:


print( guess3, sess.run(tf.argmax(guess3,1)) )


# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:




