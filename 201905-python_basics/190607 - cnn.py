#!/usr/bin/env python
# coding: utf-8

# In[ ]:


import tensorflow as tf
import numpy as np
import matplotlib.pyplot as plt


# In[ ]:


sess = tf.InteractiveSession()


# In[ ]:


image = np.array(
               [[[[1],[2],[3]]
                ,[[4],[5],[6]]
                ,[[7],[8],[9]]]]
                , dtype = np.float32)


# In[ ]:


print(image, image.shape, image.ndim)


# In[ ]:


plt.imshow(image.reshape(3,3), cmap = 'Greys')


# In[ ]:


weight = tf.constant([[[[1.]],[[1.]]]
                     ,[[[1.]],[[1.]]]])


# In[ ]:


print(weight, weight.shape)


# In[ ]:


## padding = 'VALID' 의 경우


# In[ ]:


conv2d = tf.nn.conv2d(image, weight, strides=[1, 1, 1, 1], padding = 'VALID') 
# 차원은 1이고, 옆으로 1칸씩, 아래로 1칸씩 움직일 거야. 색깔은 1이야. 그냥 통상 씀


# In[ ]:


conv2d_img = conv2d.eval()


# In[ ]:


print(conv2d_img, conv2d_img.shape)


# In[ ]:


for i, one_img in enumerate(conv2d_img) :
    print(one_img)
    plt.subplot(1, 2, i+1)
    plt.imshow(one_img.reshape(2, 2), cmap = 'Greys')


# In[ ]:





# In[ ]:


## padding = 'SAME' 으로 할 경우


# In[ ]:


conv2d = tf.nn.conv2d(image, weight, strides=[1, 1, 1, 1], padding = 'SAME') 


# In[ ]:


conv2d_img = conv2d.eval()


# In[ ]:


print(conv2d_img, conv2d_img.shape)


# In[ ]:


for i, one_img in enumerate(conv2d_img) :
    print(one_img.reshape(3, 3))
    plt.subplot(1, 3, i+1)
    plt.imshow(one_img.reshape(3, 3), cmap = 'Greys')


# In[ ]:





# In[ ]:


##필터를 세 개 써 보기


# In[ ]:


b = np.arange(24).reshape(2, 3, 4)


# In[ ]:


print(b)


# In[ ]:





# In[ ]:


weight = tf.constant([[[[1., 10., -1]], [[1., 10., -1]]]
                    , [[[1., 10., -1.]], [[1., 10., -1]]]]) #이미지의 차원이랑 맞춰 주면 됨.


# In[ ]:


conv2d = tf.nn.conv2d(image, weight, strides=[1, 1, 1, 1], padding = 'SAME') 


# In[ ]:


conv2nd_img = conv2d.eval()


# In[ ]:


print(conv2d_img, conv2d_img.shape)


# In[ ]:


conv2id_img = np.swapaxes(conv2d_img, 0, 3) #정방 행렬이 아니기 때문에 정방 행렬로 변환
print(conv2d_img.shape)


# In[ ]:


for i, one_img in enumerate(conv2d_img) :
    print(one_img.reshape(3, 3))
    plt.subplot(1, 3, i+1)
    plt.imshow(one_img.reshape(3, 3), cmap = 'Greys')


# In[ ]:





# In[ ]:


## max pooing 


# In[ ]:


image = np.array([[[[4.],[3]]
                   ,[[2], [1]]]]
                 , dtype = np.float32)


# In[ ]:


print(image, image.shape)


# In[ ]:


pool = tf.nn.max_pool(image, ksize = [1, 2, 2, 1], strides = [1, 1, 1, 1], padding = 'VALID')


# In[ ]:


print(pool.shape)


# In[ ]:


print(pool.eval()) #그냥 print(pool) 이렇게만 출력하면 딴 거 나와


# In[ ]:





# In[ ]:


## 이번엔 똑같이 하는데 padding 을 SAME 으로


# In[ ]:


pool = tf.nn.max_pool(image, ksize = [1, 2, 2, 1], strides = [1, 1, 1, 1], padding = 'SAME')


# In[ ]:


print(image.shape) #원래 image


# In[ ]:


print(pool.shape) #pooling 한 결과. 패팅이 오른쪽 열 1개 추가하고 아래에 행 1개 추가해서, 그대로 나옴


# In[ ]:





# In[ ]:


## MNIST 의 데이터를 이용해서 이미지 분석


# In[ ]:


from tensorflow.examples.tutorials.mnist import input_data


# In[ ]:


mnist = input_data.read_data_sets('data/', one_hot = True)


# In[ ]:


img = mnist.train.images[0].reshape(28, 28)
plt.imshow(img, cmap = 'Greys')


# In[ ]:


img = img.reshape(-1, 28, 28, 1)  # grey 색깔 하나 썼기 때문에, 맨 마지막에 있는 컬러 값은 1


# In[ ]:


print(img.shape)


# In[ ]:


w1 = tf.Variable(tf.truncated_normal([3, 3, 1, 5])) #필터의 크기 정하기, 3,3  필터 갯수는 5개


# In[ ]:


init = tf.global_variables_initializer()


# In[ ]:


tf.nn.conv2d(img, w1, strides = [1, 2, 2, 1], padding = 'SAME')  #옆으로 1칸 아래로 2칸 - 이거 패딩 값, 대소문자 구별하네


# In[ ]:





# In[ ]:


sess = tf.Session()


# In[ ]:


sess.run(init)


# In[ ]:





# In[ ]:


for i, one_img in enumerate(conv2d_img) :
    print(one_img.reshape(14, 14))
    plt.subplot(1, 5, i+1)
    plt.imshow(one_img.reshape(14, 14), cmap = 'Greys')


# In[ ]:





# In[ ]:





# In[ ]:




