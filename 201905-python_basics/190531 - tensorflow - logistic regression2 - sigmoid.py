#!/usr/bin/env python
# coding: utf-8

# In[ ]:


import tensorflow as tf
import numpy as np


# In[ ]:


data = np.loadtxt('data-03-diabetes.csv', delimiter = ',', dtype = np.float32)


# In[ ]:


x_data = data[ : , : -1]
y_data = data[ : , [-1]]


# In[ ]:


print(x_data.ndim, x_data.shape )
print(y_data.ndim, y_data.shape )


# In[ ]:


x = tf.placeholder(tf.float32, shape = [None,8])
y = tf.placeholder(tf.float32, shape = [None,1])


# In[ ]:


w = tf.Variable(tf.truncated_normal([8,1]), name = 'weight')
b = tf.Variable(tf.truncated_normal([1]), name = 'bias')


# In[ ]:


init = tf.global_variables_initializer()


# In[ ]:


hypothesis_former = tf.matmul(x, w) + b


# In[ ]:


hypothesis = tf.sigmoid( hypothesis_former )


# In[ ]:


cost = -tf.reduce_mean(y * tf.log(hypothesis) + (1-y)* tf.log(1-hypothesis)) 


# In[ ]:


optimizer = tf.train.GradientDescentOptimizer(learning_rate = 0.01)


# In[ ]:


train = optimizer.minimize(cost)


# In[ ]:


predicted = tf.cast(hypothesis > 0.5, dtype = tf.float32)


# In[ ]:


accuracy = tf.reduce_mean(tf.cast( tf.equal(predicted, -y), dtype = tf.float32 ))


# In[ ]:


with tf.Session() as sess :
    sess.run(init)
    
    for step in range(10000) :
        _,cost_val = sess.run([train,cost], feed_dict = {x: x_data, y: y_data})
        if step % 500 == 0 :
            print(step, cost_val)
    hy_val, pre_val, acc_val = sess.run( [hypothesis, predicted, accuracy], feed_dict = {x : x_data, y : y_data})
    print('\nHypothesis : ', hy_val, '\nPredicted : ', pre_val, 'Accuracy : ', acc_val, sep = '\n')


# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:





# In[ ]:




