## Intro AWS

The cloud is just renting other peoples computers to run computer programs for you. AWS is the most popular that you can rent computers from. People do this to avoid maintenance and flexible costs.

A more powerful computers is capable of holding more stuff and doing more stuff. Anything done on AWS is done by space * time. Think in terms of a hotel renting a room with multiple friends aquiring the minimum amount of space for the maximum benefit.

AWS is a whole constellation of services that can be used together or separately.
S3 - simple storage service put data in and take it back out whenever you want. The more data you store and the longer you store it the more it will cost. 

EC2 - elastic compute cloud its used for processing and computation. Can run whatever you want on that computer its an instance it does not have a hard drive in order to use it you must connect it to a data storage service like S3.

S3 Buckets a bucket in S3 is designed to hold things. S3 buckets help keep your files private and secure.

Every file in S3 must be stored in a bucket, so you need at least one bucket before you can store files in S3.

You must specify a region when you create a bucket. A bucket that is geographically closer to you will be slightly faster than a bucket that is farther away. Different regions have slightly different prices.

Permissions are used to make your linkes publicly accessible and secure also known as Access Control List(ACL)

Permission Levels:
Bucket vs Object — Permissions can apply to your bucket as a whole, or to an individual object (file) in your bucket. Different files in the same bucket can have different permissions.
Read vs Write — Read permissions are about looking, but not touching. Write permissions are about making changes. For example, if you give everyone read permissions on a file in your bucket, then everyone can download it -- but they can’t change the file in your bucket. If you give everyone write permission on your bucket, then they can change the files in your bucket. (Giving write permissions to everyone is usually a bad idea!)
Object access vs Permission access — Object access refers to how the object (or bucket) can be read or written. Permission access refers to who is allowed to change permissions on the object (or bucket). Generally, you only want to modify object access, not permission access.














### Terms

The Cloud — Other computers on the internet that run software and digital services for you, in exchange for payment. Essentially, renting other people’s computers.

Cloud provider — A company that runs software and digital services for others, in exchange for payment.

AWS — Amazon Web Services, the largest cloud provider.

Maintenance costs — Time and money spent on keeping computers running. This can include electricity, cooling, replacing faulty hardware, and so on.
Fixed, upfront costs — Costs that must be paid at start of a project, regardless of whether the project succeeds or fails. For example, buying your own hardware for a project.

Flexible costs — Costs that vary depending on usage, paid over time.

Space — Used in computer science to refer to the capacity or capability of a computer. A large hard drive has a lot of space. A computer that has a fast processor or fast network also has a lot of space.

Time — Used in computer science to refer to the total time required to accomplish a task. Time can be split among many workers that accomplish the task simultaneously, but the total time required won’t be reduced.

S3 — Simple Storage Service. Used to store and retrieve information. Pricing is based on how much data you store, and how long it is stored for.

EC2 — Elastic Compute Cloud. Used to rent virtual computers that can run programs and process information. Pricing is based on the space of the computer(s), and the time that they are running.

EC2 instance — A single virtual computer in EC2. Does not come with storage capacity, but can be used with other storage services like S3.

Free Tier — A promotion that Amazon runs to incentivize people to try AWS. For the first 12 months that you have an AWS account, Amazon will let you try several services in AWS for free, including S3 and EC2.

S3 bucket — A container that holds files in Amazon S3.

Permissions — A way of specifying who has access to your files, and how they can access them.

ACL — An acronym for “Access Control List”. It means essentially the same thing as permissions.
