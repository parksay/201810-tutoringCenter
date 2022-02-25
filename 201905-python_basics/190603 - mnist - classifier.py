#!/usr/bin/env python
# coding: utf-8

# In[ ]:


import tensorflow as tf
import numpy as np
import matplotlib.pyplot as plt
import random #임의의 이미지를 뽑아오기 위해서 난수 생성
from tensorflow.examples.tutorials.mnist import input_data #data set을 다운 받기 위한


# In[ ]:


mnist = input_data.read_data_sets('mnist_data/', one_hot = True) # 두 번째 인자는 그냥 레이블을 읽오느냐, one_hot 데이터를 읽어오느냐. 


# In[ ]:


sess = tf.Session()


# In[ ]:


print(mnist.test.num_examples) #테스트 데이터가 몇 개나 있는지 확인해 보기


# In[ ]:


plt.imshow(mnist.test.images[r:r+1].reshape(28,28) #1. 출력하려는 데이터 2.출력하려는 색깔 3.안티 앨리언싱 여부
           , cmap = "Greys" #color map 다른 색깔 해보고 싶으면 # matplotlib.org/tutorials/colors/colormaps.html
            , interpolation = "nearest")


# In[ ]:


classes = 10 #output이 10가지 임


# In[ ]:


x = tf.placeholder(tf.float32, shape=[None, 784])
y = tf.placeholder(tf.float32, shape=[None, classes])


# In[ ]:


w = tf.Variable(tf.random_normal([784, classes]))
b = tf.Variable(tf.random_normal([classes]))


# In[ ]:


init = tf.global_variables_initializer()


# In[ ]:


logit = tf.matmul(x, w) + b
hypothesis = tf.nn.softmax(logit)


# In[ ]:


cost = tf.reduce_mean( -tf.reduce_sum(y * tf.log(hypothesis), axis = 1))
train = tf.train.GradientDescentOptimizer(0.1).minimize(cost)


# In[ ]:


is_correct = tf.equal( tf.argmax(hypothesis, 1), tf.argmax(y, 1) )
# equal(a, b) a랑 b랑 같냐. 두 개의 argmax 값이 서로 같냐. 앞은 hypothesis 한 거고(가설 세운 거, 시험 중인거), 하나는 y값(실제 정답 값).


# In[ ]:


accuracy = tf.reduce_mean( tf.cast(is_correct, tf.float32) )


# In[ ]:


#batch 라는 걸 사용. batch는 일관 처리. 쌓아 놨다가 한번에 처리. 예를 들어 1000 * 50  이러면 1000개씩 묶어서 50번 처리하기.
#이렇게 하면 좋은 건, 1000개 학습하는 동안, 다음 1000개의 데이터를 읽어들여 오고 있음. 이 때 한 번 작업의 단위를 '에폭'이라고 부름.


# In[ ]:


num_epoch = 20
batch_size = 100
num_iter = int(mnist.train.num_examples / batch_size)  #총 사이즈 나누기, 한 작업의 단위, batch size


# In[ ]:


sess.run(init)


# In[ ]:


for epoch in range(num_epoch) :
    avg = 0
    for i in range(num_iter) :
        x_batch, y_batch = mnist.train.next_batch(batch_size)
        _, cost_val = sess.run([train, cost], feed_dict={x : x_batch, y:y_batch})
        
        avg = cost_val / num_iter
    
    print('Epoch : ', epoch, 'Cost : ', cost_val, 'Avg :', avg)
print('end')


# In[ ]:


acc = accuracy.eval(session = sess, feed_dict = {x : mnist.train.images, y : mnist.train.labels})


# In[ ]:


print('Accuracy: ',acc)


# In[ ]:





# In[ ]:


#잘 됐나 확인


# In[ ]:


r = random.randint(0, mnist.test.num_examples-1)
print("Label : ", sess.run( tf.argmax(mnist.test.labels[r:r+1],1) ))


# In[ ]:


tmp = tf.argmax(mnist.test.labels[r:r+1,1])
prediction = sess.run(tf.argmax(hypothesis,1), feed_dict= {x: mnist.test.images[r:r+1]})
print(prediction)


# In[ ]:


plt.imshow(mnist.test.images[r:r+1].reshape(28,28)
    , cmap = "Greys"
    , interpolation = "nearest")


# In[ ]:




