#!/usr/bin/env python
# coding: utf-8

# In[ ]:


import tensorflow as tf
import numpy as np
import matplotlib.pyplot as plt
import random
from tensorflow.examples.tutorials.mnist import input_data


# In[ ]:


mnist = input_data.read_data_sets('mnist_data/', one_hot=True)


# In[ ]:


sess = tf.Session()


# In[ ]:


classes = 10   # output(답)이 10임을 의미


# In[ ]:


X = tf.placeholder(tf.float32, shape=[None, 784])
Y = tf.placeholder(tf.float32, shape=[None, classes])


# In[ ]:


W = tf.Variable(tf.truncated_normal([784, classes]))
b = tf.Variable(tf.truncated_normal([classes]))


# In[ ]:


logit = tf.matmul(X, W) + b
hypothesis = tf.nn.softmax(logit)


# In[ ]:


cost  = tf.reduce_mean(-tf.reduce_sum(Y * tf.log(hypothesis), axis = 1))
train = tf.train.GradientDescentOptimizer(0.8).minimize(cost)


# In[ ]:


is_correct = tf.equal(tf.argmax(hypothesis, 1), tf.argmax(Y, 1))
accuracy = tf.reduce_mean(tf.cast(is_correct, tf.float32))


# In[ ]:


nums_epoch = 50
batch_size = 100
num_iter = int(mnist.train.num_examples / batch_size)
num_iter


# In[ ]:


sess.run(tf.global_variables_initializer())


# In[ ]:


for epoch in range(nums_epoch) :
    avg = 0
    for i in range(num_iter) :
        x_batch, y_batch = mnist.train.next_batch(batch_size)
        _, cost_val = sess.run([train, cost], feed_dict={X : x_batch, Y:y_batch})
        
        avg = cost_val / num_iter
    print('Epoch : ', epoch, 'Cost : ', cost_val, 'Avg : ', avg)

print('End!')


# In[ ]:


acc = sess.run(accuracy, feed_dict={X:mnist.train.images, Y: mnist.train.labels})


# In[ ]:


print('Accuracy : ', acc)


# In[ ]:


# train data : 55000
# test data  : 10000
r = random.randint(0, mnist.test.num_examples-1)
print("Label : ", sess.run(tf.argmax(mnist.test.labels[r : r+1], 1)))


# ## color map : https://matplotlib.org/tutorials/colors/colormaps.html

# In[ ]:


prediction = sess.run(tf.argmax(hypothesis, 1), feed_dict={X:mnist.test.images[r : r+1]})
print(prediction)


# In[ ]:


plt.imshow(mnist.test.images[r: r+1].reshape(28, 28),
           cmap="Greys",
           interpolation="nearest" )


# In[ ]:




