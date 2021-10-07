# Blood-Donation-Status
# summary
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
I created a dataset for the values ​​received from the user in the TekTest method.
I assigned the values. And I performed the normalization with this dataset and called the result function in the return section. 
If the output is 0, it does not give blood, if it is 1, it sends as blood.
