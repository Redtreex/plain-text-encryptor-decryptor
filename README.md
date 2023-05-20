**Abstract**----This paper presents an evaluation of Network Block Device (NBD) utilization in Android devices, focusing on its performance when paired with an x86 Linux server and Raspberry Pi 4B client. As the Raspberry Pi 4B shares a similar processor architecture with Android devices, it serves as a suitable alternative for assessing NBD performance. However, it is important to note that NBD is not currently enabled by default on the Android kernel, necessitating the use of Raspberry Pi. By conducting a comprehensive performance analysis against alternative storage solutions, including SFTP, NFS, Samba, and Google Drive, to assess their respective performance in Android devices while considering performance metrics such as bandwidth, abilities, and access level to gauge the effectiveness of NBD and its superiority over other options, we aim to showcase the potential benefits of enabling NBD as a default feature in Android devices, particularly for addressing the persistent challenge of limited storage capacity.

The findings demonstrate the feasibility and advantages of incorporating NBD into Android, showcasing its superior performance utilizablity when compared to alternative storage solutions. This highlights the potential of NBD to serve as a reliable network-attached storage (NAS) client and alleviates the low storage issue in Android devices. We propose that enabling NBD by default in the Android kernel could enhance its capabilities in this regard. The results also emphasize the need for further research and optimization to seamlessly integrate NBD into the Android ecosystem to use other block devices other than storage medium and realize its full potential as a cloud based solution.

# Introduction

The Network Block Device (NBD) is a protocol and technology that allows block devices, such as disk drives or partitions, to be shared over a network. NBD provides a flexible and efficient method of remote storage access and facilitates a range of use cases, including virtualization, distributed computing, and remote disk imaging. With the key features being,

### Key Features of NBD

1. Block-level Sharing: NBD operates at the block level, enabling remote clients to access individual blocks of data on the shared block device. This granularity allows for efficient data transfer and minimizes network overhead.

2. Network Transparency: NBD provides a transparent layer between the client and the shared block device, making it appear as if the device is locally attached to the client system. This abstraction simplifies the integration of remote storage and allows for easy integration into existing systems.

3. Flexibility: NBD supports a variety of network environments, including LANs, WANs, and the Internet. It operates over TCP/IP and supports features like encryption and compression, enhancing security and optimizing performance based on specific network conditions.

4. Client-Server Architecture: NBD follows a client-server model, where the server hosts the shared block device and the clients connect to it over the network. Multiple clients can concurrently access and share the same block device, enabling collaborative and distributed scenarios.

### Use Cases:

1. Virtualization: NBD is widely used in virtualization environments, allowing virtual machines to access remote disk images efficiently. This enables centralized storage management, dynamic resource allocation, and migration of virtual machines across physical hosts.

2. Disk Imaging and Cloning: NBD facilitates disk imaging and cloning operations, where a remote client can access and create copies of block devices for backup, replication, or recovery purposes. This allows for efficient data replication and disaster recovery strategies.

3. Distributed Computing: NBD enables distributed computing systems to access shared block devices over the network, enabling efficient data sharing and coordination among distributed nodes. This is valuable in scenarios such as distributed file systems or high-performance computing clusters.

Network Block Device (NBD) offers a powerful solution for sharing block devices over the network, providing flexibility, efficiency, and network transparency. Its versatile applications span virtualization, distributed computing, and remote disk imaging, making it a valuable technology in modern computing environments. By enabling seamless integration of remote storage resources, NBD empowers efficient data management and collaboration across diverse systems and network environments.

By utilizing NBD, devices such as Android devices can leverage network-attached storage (NAS) systems, cloud storage, or other remote storage solutions. This offers benefits such as expanded storage capacity, data centralization and sharing, scalability, and redundancy. NBD serves as a bridge between the client device and remote storage, enabling efficient and flexible storage access and utilization.

## Network Assisted Storage (NAS)

Network-Attached Storage (NAS) plays a crucial role in modern computing environments, offering a range of benefits and applications in various scenarios. Here are some key reasons highlighting the importance of NAS:

1. Data Centralization and Sharing: NAS provides a centralized storage repository that allows multiple users and devices to access and share data seamlessly. It facilitates collaboration among team members by providing a common storage location, enabling efficient file sharing, version control, and data synchronization.

2. Enhanced Data Security: NAS systems often include robust security features such as access controls, encryption, and backup mechanisms. Storing data on a NAS device enhances data security and reduces the risk of data loss or unauthorized access. It provides a secure and controlled environment for critical data storage.

3. Scalability and Flexibility: NAS solutions offer scalability to accommodate growing storage needs. With the ability to add additional storage devices or upgrade existing ones, NAS systems can scale storage capacity without disrupting operations. This flexibility makes NAS suitable for both small-scale setups and large enterprises.

4. Data Backup and Disaster Recovery: NAS devices typically provide built-in backup and disaster recovery features. By automatically creating backup copies of data stored on the NAS, businesses can quickly restore data in case of hardware failures, human errors, or natural disasters. This ensures data integrity and minimizes downtime.

5. Multimedia Streaming and Home Entertainment: NAS devices can serve as media servers, enabling seamless streaming of multimedia content to various devices within a network. This allows users to enjoy movies, music, and photos on smart TVs, gaming consoles, or mobile devices without relying on local storage or internet connectivity.

6. Virtualization and Cloud Integration: NAS systems often support virtualization technologies, allowing businesses to host virtual machines and run applications directly from the NAS. Additionally, NAS devices can integrate with cloud storage services, providing a hybrid approach that combines local and remote storage resources.

7. Cost-Effectiveness: NAS solutions offer a cost-effective alternative to traditional storage setups. They eliminate the need for individual storage devices for each user or department, reducing hardware costs and simplifying management.

The importance of NAS extends to various sectors, including small and medium-sized businesses, home offices, educational institutions, creative professionals, and even personal users. NAS provides a reliable and versatile storage solution that enhances data management, accessibility, and security, making it an essential component in today's interconnected and data-driven world.

## Network Block Device (NBD) in Android

The motivation behind using Network Block Device (NBD) in Android devices stems from the need to address the persistent challenge of limited storage capacity. While modern Android devices have made significant advancements in terms of processing power and features, storage space remains a critical constraint for many users. This limitation becomes particularly evident when dealing with large files, multimedia content, or applications that demand substantial storage resources.

NBD offers a promising solution by allowing Android devices to leverage network-attached storage (NAS) resources. By connecting to an external server or storage device over a network, NBD enables Android devices to access and utilize remote storage as if it were local. This approach offers several potential benefits:

1. Expanded Storage Capacity: NBD enables Android devices to tap into abundant storage resources available on remote servers, effectively extending their storage capacity without physical hardware upgrades. This opens up possibilities for storing large files, media libraries, and other data-intensive content. This is particularly beneficial for devices with limited onboard storage.

2. Flexibility and Accessibility: With NBD, Android devices gain flexibility in accessing storage resources from anywhere within the network. Users can seamlessly access their files, documents, or media content across multiple devices, enhancing convenience and productivity.

3. Data Centralization and Sharing: NBD allows for centralizing data on a remote server, enabling efficient data management and sharing. Multiple Android devices can access and collaborate on the same set of files, ensuring data consistency and eliminating the need for manual synchronization. This simplifies data backup, recovery, and device synchronization processes, as well.

4. Scalability and Future-Proofing: NBD enables Android devices to scale storage resources based on their needs. As storage requirements grow, additional NAS resources can be added to the network without physically modifying the device, providing a scalable and adaptable solution.

5. Redundancy and Data Backup: By utilizing NBD, Android devices can benefit from the inherent redundancy and backup mechanisms offered by NAS systems. Data stored on remote servers can be mirrored or backed up, reducing the risk of data loss due to device failures or other unforeseen events.

Incorporating NBD as a default feature in Android devices could empower users with increased storage capabilities, seamless access to remote resources, and enhanced data management. By enabling Android devices to effectively utilize network-attached storage, NBD has the potential to address the low storage issue and provide a more versatile and efficient storage solution for Android users.

## Aims and Objectives

The primary objective of this paper is to comprehensively evaluate the performance of Network Block Device (NBD) in Android devices when connected to a server. We specifically focus on utilizing Raspberry Pi 4B as the client device, as it shares a similar processor architecture with Android devices.

In order to address the persistent issue of limited storage capacity in Android devices, we propose the inclusion of NBD as a default feature, supplemented by a translation layer that facilitates communication between NBD and various storage protocols. For our evaluation, we compare NBD with several prominent storage solutions, including HTTP translation layer, SFTP, NFS, SMB, Google Drive, Dropbox, OneDrive, GCP, and local storage.

To assess the performance of these storage solutions, we consider a comprehensive set of performance metrics. These metrics include read sector, write sector, read file system, write file system, create file system, alter position table, mount ability, and random access level. By analyzing these metrics, we aim to gain insights into the efficiency, reliability, and speed of each storage solution in different scenarios.

Through our evaluation, we aim to demonstrate the feasibility and potential benefits of incorporating NBD into Android devices. We compare NBD with the aforementioned storage solutions, highlighting its advantages in terms of read and write speeds, file system operations, data management capabilities, and overall performance. This analysis will enable us to present a compelling case for enabling NBD as a default feature in the Android kernel, addressing the low storage issue and enhancing the capabilities of Android devices as network-attached storage (NAS) clients.

By leveraging the Raspberry Pi 4B as a client device, we create a practical and relevant evaluation environment. The findings of this research will contribute to the advancement of Android as a powerful NAS client, enabling seamless integration with various storage solutions. Ultimately, our objective is to provide insights that will drive improvements in storage capabilities, user experiences, and overall performance in Android devices.

# Background and Related works

Android devices offer a range of storage solutions to cater to different user needs. Let's discuss the existing storage options available in Android devices:

1. Internal Storage:
   Android devices typically come with built-in internal storage, which is non-removable and used to store the operating system, system apps, user data, and installed applications. Internal storage provides fast access to data and is usually available in different capacities, ranging from a few gigabytes to several hundred gigabytes.

2. External SD Card:
   Many Android devices support expandable storage through external SD (Secure Digital) cards. Users can insert an SD card into a designated slot on the device to increase storage capacity. SD cards come in various sizes and speeds and can be used to store media files, documents, and other user data. However, not all Android devices support external SD card storage, as some newer models may omit this feature.

3. USB On-The-Go (OTG):
   Android devices with USB OTG support can connect to external USB storage devices such as USB flash drives, external hard drives, or SD card readers using a USB OTG cable. This allows users to access and transfer data between the Android device and the connected external storage.

4. Cloud Storage Services:
   Android devices provide seamless integration with various cloud storage services such as Google Drive, Dropbox, OneDrive, and others. Users can upload their files and data to the cloud, which allows for convenient access from multiple devices and provides an additional backup solution. Cloud storage often comes with a limited amount of free storage, with options to purchase additional storage capacity if needed.

5. Network Attached Storage (NAS):
   Android devices can access network-attached storage devices on the local network. By connecting to a NAS, users can access shared folders and files stored on the network, enabling centralized storage and file sharing capabilities.

6. Adoptable Storage:
   Introduced in Android 6.0 Marshmallow, the adoptable storage feature allows users to merge the internal storage of the device with external storage (like an SD card) to create a single unified storage pool. This feature treats the external storage as an extension of the internal storage, increasing the overall available space.

It's important to note that the availability and specific features of storage options can vary across different Android device models and manufacturers. Additionally, the Android version and device specifications may also impact the supported storage options.

...
...
...

The related papers provide valuable insights into the design, performance, and applications of NBD in various contexts, including virtualization, cloud computing, and diskless systems. They shed light on the benefits and considerations when utilizing NBD for remote storage access, distributed computing, and optimizing resource utilization.

# Methodology

The experimental setup consists of a server, a network device, and a client. Here are the hardware components used in each part:

1. Server:
   - Processor: Intel Core i3-8130U. This is a dual-core, four-thread processor commonly found in laptops. It has a base clock speed of 2.2 GHz and supports hyper-threading.
   - RAM: 12GB. The server is equipped with 12 gigabytes of random-access memory (RAM), which provides temporary storage for data and program instructions.
   - Storage: 128GB M.2 SATA III SSD. The server utilizes a solid-state drive (SSD) with a capacity of 128 gigabytes. The M.2 form factor and SATA III interface ensure fast data transfer rates and efficient storage performance.
   - Network Connectivity: The server is connected to the network using a local area network (LAN) connection. The exact details of the network interface (e.g., Ethernet adapter) are not specified.

2. Network Device: Archer C20 Router
   - The Archer C20 Router is used as the network device in the experimental setup. It is a consumer-grade wireless router commonly used in home or small office environments. The specific features and capabilities of the router are not provided in the information given.

3. Client:
   - Raspberry Pi 4B: The client in the setup is a Raspberry Pi 4 Model B. It is a small, single-board computer popular for its compact size and low power consumption.
   - Network Connectivity: The Raspberry Pi 4B is connected to the network using Wi-Fi. The exact Wi-Fi specifications (e.g., 2.4 GHz or 5 GHz band) and the wireless network adapter used are not specified.

Overall, this experimental setup involves a server with an Intel Core i3 processor, 12GB of RAM, and a 128GB SSD connected to the network via LAN. A consumer-grade Archer C20 Router is used as the network device. The client is a Raspberry Pi 4B connected to the network via Wi-Fi.

## Configuring Server

... 

## Configuring Client

... 

## Configuring Network devices

...

# Results and Analysis

...

## Performance Metrics Evaluation

...

## Comprehensive Analysis

...

### Implication off the findings

...

### More Sub Headings

...

# Discussion

...

# Conclusion 
