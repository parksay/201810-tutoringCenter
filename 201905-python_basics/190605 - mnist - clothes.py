#!/usr/bin/env python
# coding: utf-8

# In[ ]:


# GradientDescent 는 vanishing 문제가 있는데(vanishing gradient), 굉장히 큰 값을, 작은 그릇에 우겨넣다 보니까 문제가 생김. 기울기가 점점 작아지면서
# (기울기가 0에 수렴한다고 생각해봐) 기울기 찾기가 어려워짐. 그래서 나온 게 Relu - Rectified Linear Unit
# hidden layer를 거치면서 미분을 거듭하고, 점점 기울기가 작아지고 수가 0에 수렴할 텐데, 그럼 backpropagation 하기가 어려워짐.
# 결과값이 너무 희미해서 그 전의 계층으로 역추적 하는 과정이 불분명해짐. 미분을 거듭할 수록, 반대로 적분해서 원래 함수 찾기가 어려워지는 것처럼
# 얘도 단점은 있는데, 음수는 그냥 다 0으로 처리해버림.
# 무조건 Relu가 좋다, sigmoid 가 좋다, tanh가 좋다, 그런 건 없고, 그냥 우리가 다룰 데이터에 따라서 그때그때 다를 뿐


# In[ ]:


import tensorflow as tf
import numpy as np
import random
import matplotlib.pyplot as plt


# In[ ]:


from tensorflow.examples.tutorials.mnist import input_data #기본 제공 되는 예시 자료 갖다 쓰겠다고


# In[ ]:


mnist = input_data.read_data_sets('mnist_data/clothes', one_hot = True, source_url = 'http://fashion-mnist.s3-website.eu-central-1.amazonaws.com/')
# 다운로드 받은 거 어디에 저장할지, one hot encoding 된 상태로 받을 건지, 다운로드 받을 url은 어디인지


# In[ ]:


# 학습할 데이터, 아까 다운 받은 데이터 확인해 보기
print('Train image shape : ', mnist.train.images.shape)
print('Train label shape : ', mnist.train.labels.shape)


# In[ ]:


# 테스트 정보 출력
print('Test image shape : ', mnist.test.images.shape)
print('Test labels shape : ', mnist.test.labels.shape)


# In[ ]:


#학습할 데이터도 잘 있고, 테스트할 데이터도 잘 있는 듯. 이제는 하나 뽑아서 화면에 띄워 보기.
r = random.randint(0, mnist.test.num_examples-1) #랜덤으로 뽑을 번호의 범위를 정해주는 것 뿐. 그 값을 변수가지고 정해주는 것뿐
fig = plt.figure(r)
subplot = fig.add_subplot(3, 5, 1)
subplot.imshow(mnist.test.images[r].reshape(28,28), cmap = plt.cm.gray_r)
# 이미지 나오는 거에서 좌표 보면 시작점이 어딘지 잘 봐. 0행은 맨 위야. 아래로 내려갈수록 y 좌표는 늘어나. 행 번호는 늘어나
subplot.set_xticks([]) # x축 업애기
subplot.set_yticks([]) # y축 없애기
plt.show() # 사진 뽑는 거라고. 알려줘서 다른 불필요한 애들 삭제하기


# In[ ]:


# 신경망 구성하기


# In[ ]:


x = tf.placeholder(tf.float32, shape = [None, 784])
y = tf.placeholder(tf.float32, shape=  [None, 10])


# In[ ]:


w1 = tf.Variable(tf.truncated_normal([784, 512]))
b1 = tf.Variable(tf.truncated_normal([512]))
y1 = tf.nn.relu(tf.add( tf.matmul(x,w1),b1 ))


# In[ ]:


init = tf.global_variables_initializer()


# In[ ]:


#신경망 두 번째 층 hidden layer

w2 = tf.Variable(tf.truncated_normal([512, 128]))
b2 = tf.Variable(tf.truncated_normal([128]))
y2 = tf.nn.relu(tf.add( tf.matmul(y1,w2),b2 ))


# In[ ]:


#신경만 세 번째 층 hidden layer - 마지막 층.

w3 = tf.Variable(tf.truncated_normal([128, 10]))
b3 = tf.Variable(tf.truncated_normal([10]))
logits = tf.matmul(y2, w3) + b3  #다른 층에서 말하자면 이게 결국 출력값 y3 이었을 것


# In[ ]:


hypothesis = tf.nn.relu(logits)


# In[ ]:


cost = tf.reduce_mean(tf.nn.softmax_cross_entropy_with_logits_v2(logits = logits, labels = y))


# In[ ]:


train = tf.train.AdamOptimizer(0.01).minimize(cost)


# In[ ]:


batch_size = 100
total_batch = int(mnist.train.num_examples / batch_size)


# In[ ]:


sess = tf.Session()


# In[ ]:


sess.run(init)


# In[ ]:


for epoch in range(15) :
    total_cost = 0
    for i in range(total_batch) :
        x_batch, y_batch = mnist.train.next_batch(batch_size)
        _, cost_val = sess.run([train, cost], feed_dict = {x: x_batch, y: y_batch})


# In[ ]:





# In[ ]:


is_correct = tf.equal( tf.argmax(logits,1),tf.argmax(y,1) )
accuracy = tf.reduce_mean( tf.cast(is_correct,tf.float32) )
print('Accuracy: ', sess.run(accuracy, feed_dict = {x: mnist.test.images, y: mnist.test.labels} ))


# In[ ]:


label_dict = {
    0: 'T-shirt/top',
    1: 'Trouser',
    2: 'Pullover',
    3: 'Dress',
    4: 'Coat',
    5: 'Sandal',
    6: 'Shirt',
    7: 'Sneaker',
    8: 'Bag',
    9: 'Ankle boot'
}


# In[ ]:


# 학습 잘 됐는지 확인해보자. 아까 위에서 쓴 거랑 거의 비슷. 복붙
#여기서 불러오는 부분만 학습한 방적식을 run에 넣어서 뽑아오면 됨.
for i in range(10) :
    r = random.randint(0, mnist.test.num_examples-1)
    fig = plt.figure(r)
    subplot = fig.add_subplot(2, 5, i+1)
    subplot.imshow(mnist.test.images[r].reshape(28,28), cmap = plt.cm.gray_r)
    subplot.set_xticks([]) # x축 업애기
    subplot.set_yticks([]) # y축 없애기
    subplot.set_title("%s", label_dict[ np.argmax(labels[i]) ]) #위에 label_dict 중에 몇 번에 속하는지, 그 번호를 넣어서 가져오겠다.
    plt.show() 


# In[ ]:




