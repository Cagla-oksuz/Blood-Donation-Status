# Blood-Donation-Status
# Summary
Using the dataset I chose in the first assignment and your Neuroph library, I reserved 70% of my dataset for training and 30% for testing.
Then I wrote the training and testing methods. I learned separately for each epoch in the training.
Then I added the singleTest part. In this section, I gave the inputs entered for normalization as parameters to normalize.
I created the graphics.

# DEVELOPED SOFTWARE
The data set examines whether people donate blood on the specified date according to certain criteria. When I first downloaded the dataset, it had Recency (months), Frequency (times), Monetary (c.c. blood) and result.
250 c.c. each time blood is drawn. Since the blood was taken, the Monetary field and the Frequency field always affected the result in the same way, so their correlations were equal and I deleted the Monetary field. In this case, three attempts remained, namely recency, frequency and time.
First, I added my dataset as a txt file to the assignment. Then I wrote a constructor method called ANN and gave momentum, lambda, minError, epoch and number of neurons as parameters.
I made the assignments.

With the help of the Neuroph library, I assigned the data in the Blood.txt file to a dataset.
I have done the normalization process.
I allocated 70% of my dataset for training and 30% for testing.
In the Train method, with the help of MultiLayerPerceptron, I created a network according to my own dataset values, whose activation function is sigmoid.
Here I performed the Learn process. I also performed the learning process in each epoch to get additional points. I calculated the error value and finished the method.
In the test method, the network will be tested with 30% of the network.

Mape calls the mape method to calculate the error based on the error calculation. The process is completed by making the return part /100.
Since my outputs should be 0 and 1 and there can be no division by 0, the divided value is accepted as 1 and calculated.
I created a dataset for the values received from the user in the TekTest method.
I assigned the values. And I performed the normalization with this dataset and called the result function in the return section. 
If the output is 0, it does not give blood, if it is 1, it sends as blood.

# 10 Different network designs and results

# 1.YSA
![1_1](https://user-images.githubusercontent.com/61979226/136311812-16282986-7ddb-49b0-aa4f-a27140415072.png)

# 2.YSA
![2_2](https://user-images.githubusercontent.com/61979226/136311889-13b62dca-767b-486f-8d2b-df5046a498e3.png)

# 3.YSA
![3](https://user-images.githubusercontent.com/61979226/136311915-e1409a43-d257-43af-9569-f9f005cd2dd4.png)

# 4.YSA
![4](https://user-images.githubusercontent.com/61979226/136311982-abd7a90d-255c-4158-9218-4a94582b9bb5.png)

# 5.YSA
![5](https://user-images.githubusercontent.com/61979226/136312104-cad6d437-0b21-4002-b68c-974255eb9a71.png)

# 6.YSA
![6](https://user-images.githubusercontent.com/61979226/136312110-2b421c84-7983-4513-bc5b-510e990ec310.png)

# 7.YSA
![7](https://user-images.githubusercontent.com/61979226/136312123-e151cd0e-cddb-40ea-9a52-c2c92e0835c3.png)

# 8.YSA
![8](https://user-images.githubusercontent.com/61979226/136312135-0854c4be-4baf-44a4-930a-6214137896ff.png)

# 9.YSA
![9](https://user-images.githubusercontent.com/61979226/136312151-9302720c-fb48-44d9-b39a-85b1de8c1c55.png)

# 10.YSA
![10](https://user-images.githubusercontent.com/61979226/136312163-d867c0f8-da67-4817-adff-057e5cb9a8ff.png)

# OUTPUTS

![11_1](https://user-images.githubusercontent.com/61979226/136312291-1961a9f6-9ea8-48a6-b0f0-a3fbd7b2e262.png)

![12](https://user-images.githubusercontent.com/61979226/136312297-280ad8c0-8912-40f6-9d84-eeb0b87332a8.png)



