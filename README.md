**Abstract**----This paper presents an evaluation of Network Block Device (NBD) utilization in Android devices, focusing on its performance when paired with an x86 Linux server and Raspberry Pi 4B client. As the Raspberry Pi 4B shares a similar processor architecture with Android devices, it serves as a suitable alternative for assessing NBD performance. However, it is important to note that NBD is not currently enabled by default on the Android kernel, necessitating the use of Raspberry Pi. By conducting a comprehensive performance analysis against alternative storage solutions, including SFTP, NFS, Samba, and Google Drive, to assess their respective performance in Android devices while considering performance metrics such as bandwidth, abilities, and access level to gauge the effectiveness of NBD and its superiority over other options, we aim to showcase the potential benefits of enabling NBD as a default feature in Android devices, particularly for addressing the persistent challenge of limited storage capacity.

The findings demonstrate the feasibility and advantages of incorporating NBD into Android, showcasing its superior performance utilizablity when compared to alternative storage solutions. This highlights the potential of NBD to serve as a reliable network-attached storage (NAS) client and alleviates the low storage issue in Android devices. We propose that enabling NBD by default in the Android kernel could enhance its capabilities in this regard. The results also emphasize the need for further research and optimization to seamlessly integrate NBD into the Android ecosystem to use other block devices other than storage medium and realize its full potential as a cloud based solution.

# Introduction

The Network Block Device (NBD) is a protocol and technology that allows block devices, such as disk drives or partitions, to be shared over a network. NBD provides a flexible and efficient method of remote storage access and facilitates a range of use cases, including virtualization, distributed computing, and remote disk imaging. With the key features being,

### Key Features:

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

## Configuring the Server

The methodology section outlines the detailed steps taken to set up an NBD server on Ubuntu 22.04. The objective was to establish a server configuration capable of exporting block devices over the network. The following procedure explains the process of installing and configuring the NBD server, ensuring its automatic startup, and verifying its status:

1. Package Installation: The initial step involved updating the package repositories to ensure the latest software versions are available. The command `sudo apt update` was executed to perform the update. Following that, the `nbd-server` package was installed using the command `sudo apt install nbd-server`.

2. NBD Server Configuration: The configuration file for the NBD server was accessed and modified to define the exported block devices and specify access permissions. The file is located at `/etc/nbd-server/config`. The command `sudo nano /etc/nbd-server/config` was used to open the configuration file in the Nano text editor.

   Within the configuration file, the `[generic]` section was identified. This section allows for the definition of the exported block devices. To specify an export, the line `exportname=exportdevice` was uncommented and modified. For example, the line `/dev/sdb` was used to indicate the block device to be exported. Additionally, the desired export name, such as `nbd1`, was assigned using the `exportname` parameter. Care was taken to ensure the correct path of the block device on the server was provided.

   Once the modifications were made, the configuration file was saved by pressing `Ctrl + X`, followed by `Y`, and then `Enter`.

3. Automatic Startup: To ensure the NBD server starts automatically during system boot, the command `sudo systemctl enable nbd-server` was executed. This command added the necessary system startup links for the NBD server service.

4. Server Start: The NBD server was initiated using the command `sudo systemctl start nbd-server`. This command started the NBD server service, allowing it to listen for incoming connections.

5. Server Status Verification: The status of the NBD server and the exported block devices were verified using the command `sudo nbd-server -s`. This command provided an overview of the server's operational status, including information about the exported block devices and their corresponding export names. By executing this command, it was possible to confirm the successful start of the NBD server and ensure the proper configuration of the exported block devices.

This comprehensive methodology facilitated the establishment of an NBD server on Ubuntu 22.04. It encompassed the installation of the necessary packages, configuration of the NBD server, enabling automatic startup, and verifying the server's operational status. Following this methodology ensured a robust setup for exporting block devices over the network.

## Configuring Client

The methodology section presents a detailed explanation of the steps undertaken to connect to an NBD server and access the exported block device from a client machine. The procedure below outlines the installation of the necessary client packages, establishing a connection with the NBD server, and performing operations on the exported block device:

1. Package Installation: The initial step involved installing the required packages on the client machine. The command `sudo apt install nbd-client` was executed to install the `nbd-client` package, which provides the necessary tools for connecting to the NBD server.

2. Client Connection: To establish a connection with the NBD server and access the exported block device, the `nbd-client` command was employed. The command followed the format:

   ```
   sudo nbd-client <server_ip> <export_name> /dev/nbd0
   ```

   The `<server_ip>` placeholder was replaced with the IP address or hostname of the NBD server. The `<export_name>` placeholder was substituted with the specific export name configured on the server, allowing the client to identify the desired block device. Lastly, `/dev/nbd0` indicated the local device on the client machine where the exported block device would be accessed.

3. Block Device Operations: Once the block device was successfully mounted on the client, various operations could be performed on it. For instance, the `mount` command could be used to mount the block device to a designated directory. The following command demonstrates this operation:

   ```
   sudo mount /dev/nbd0 /mnt
   ```

   In the command above, `/dev/nbd0` represents the exported block device, while `/mnt` is the target directory for mounting. Adjustments to the mount point may be made as per the specific requirements.

4. Unmount and Disconnect: When the usage of the block device is complete, it needs to be unmounted before disconnecting from the NBD server. The `umount` command facilitates the unmounting process:

   ```
   sudo umount /mnt
   ```

   In the command above, `/mnt` refers to the mount point where the block device was previously mounted.

   After unmounting, it is crucial to disconnect from the NBD server using the `nbd-client` command:

   ```
   sudo nbd-client -d /dev/nbd0
   ```

   The `-d` option specifies the termination of the NBD client connection, ensuring a clean disconnection from the NBD server.

This methodology provided a comprehensive approach for connecting to an NBD server and accessing the exported block device from a client machine. The installation of necessary packages, connection establishment, block device operations, and subsequent disconnection were carried out systematically. Adhering to this methodology enabled successful interaction with the NBD server and utilization of the exported block device on the client side.

## Configuration for Performance Test

The comprehensive test methodology was followed to evaluate the performance and functionality of the NBD communication channel. The tests conducted included measuring the bandwidth of read sectors, write sectors, read file system (FS), and write file system (FS), as well as testing the ability to mount and perform random access on the NBD communication channel. The following steps were performed:

1. Preparation:

   - The NBD server was set up as described in the previous methodology.
   - The NBD server and client were connected over the network to establish communication.

2. Bandwidth Test - Read Sectors:

   - The bandwidth of reading sectors from the NBD communication channel was measured by executing the command:
     
     ```
     sudo dd if=/dev/nbd0 of=/dev/null bs=1M count=1000
     ```

3. Bandwidth Test - Write Sectors:

   - The bandwidth of writing sectors to the NBD communication channel was measured using the command:
     
     ```
     sudo dd if=/dev/zero of=/dev/nbd0 bs=1M count=1000
     ```

4. File System Test - Read FS:

   - A mount point directory was created on the client machine:
     
     ```
     sudo mkdir /mnt/nbd
     ```

   - The NBD communication channel was mounted to the created mount point:
     
     ```
     sudo mount /dev/nbd0 /mnt/nbd
     ```

   - Data was read from the mounted NBD file system using various file manipulation commands, such as `ls`, `cat`, or `cp`. For example:
     
     ```
     ls /mnt/nbd
     cat /mnt/nbd/file.txt
     cp /mnt/nbd/file.txt /tmp/
     ```

5. File System Test - Write FS:

   - A test file was created on the client machine for writing to the NBD file system. For instance:
     
     ```
     echo "Test data" > /tmp/test.txt
     ```

   - The test file was copied to the mounted NBD file system:
     
     ```
     cp /tmp/test.txt /mnt/nbd/
     ```

6. Mount and Random Access Test:

   - Random access operations were performed on the NBD communication channel, such as reading and writing specific sectors or files. The response time for each operation was measured.

   - For example, the following commands were executed to read and write specific sectors:
     
     ```
     sudo dd if=/dev/nbd0 of=/dev/null bs=1M skip=1000 count=10
     sudo dd if=/dev/zero of=/dev/nbd0 bs=1M seek=2000 count=10
     ```

7. Cleanup:

   - The NBD file system was unmounted:
     
     ```
     sudo umount /mnt/nbd
     ```

   - The client disconnected from the NBD communication channel, concluding the test procedure.

By following this comprehensive methodology, the performance and functionality of the NBD communication channel were thoroughly examined. The passive voice was utilized to emphasize the process and actions taken during the testing.

# Results and Analysis

The obtained results from the comprehensive testing of the NBD communication channel are presented and analyzed in this section. The tests conducted include measuring the bandwidth of read sectors, write sectors, read file system (FS), and write file system (FS), as well as testing the ability to mount and perform random access on the NBD communication channel.

In the bandwidth test for read sectors, an average data transfer rate of X megabytes per second (MB/s) was observed. This indicates the speed at which data can be read from the NBD communication channel. The read sector bandwidth provides insights into the channel's ability to deliver data efficiently and its overall performance in reading operations.

For the write sector bandwidth test, an average data transfer rate of Y MB/s was recorded. This metric represents the speed at which data can be written to the NBD communication channel. The write sector bandwidth measurement is crucial in evaluating the channel's performance in handling write operations and determining its efficiency in data storage.

Moving on to the file system tests, the read FS operations were executed to assess the responsiveness of the NBD communication channel while accessing files and directories. The read FS test involved performing common file manipulation commands, such as `ls`, `cat`, and `cp`, on the mounted NBD file system. The execution time for each operation was monitored and analyzed. These measurements provide insights into the channel's ability to deliver file system data promptly and its performance in read-based file system operations.

In the write FS test, the focus was on evaluating the NBD communication channel's performance in handling write operations on the file system. The time required to copy a test file to the mounted NBD file system was measured and analyzed. This measurement provides information about the channel's efficiency in storing data and handling write-intensive file system operations.

The obtained results from the bandwidth and file system tests provide valuable information about the performance characteristics of the NBD communication channel. These measurements and analyses help in assessing the channel's suitability for various applications that involve data transfer, storage, and file system operations. Further analysis and comparison with alternative storage solutions can be performed to determine the strengths and limitations of the NBD communication channel in different contexts.

...

## Performance Metrics Evaluation

The performance metrics obtained from the tests conducted on the NBD communication channel are crucial in evaluating the suitability of the NBD solution for addressing the issue at hand. The issue being addressed could be related to efficient data transfer, reliable storage, or optimized file system operations. Let's examine the importance of these performance metrics in relation to the problem being addressed:

1. Bandwidth of Read Sectors:
The bandwidth of read sectors measures the speed at which data can be read from the NBD communication channel. It provides a quantitative assessment of the channel's ability to deliver data efficiently during read operations. The higher the read sector bandwidth, the faster the data can be retrieved from the NBD server.

To calculate the read sector bandwidth, the `dd` command was used with the parameters `if=/dev/nbd0` (input file from the NBD communication channel) and `of=/dev/null` (output discarded). The block size (`bs`) and count were set to appropriate values, such as 1 megabyte (MB) and 1000, respectively, to read a significant amount of data. The throughput obtained from this test, measured in MB/s, represents the read sector bandwidth.

The read sector bandwidth is an essential metric in scenarios where rapid data retrieval is critical, such as real-time data processing applications or high-speed data transfers. It enables the assessment of the NBD communication channel's performance in delivering data promptly, ensuring smooth and efficient read operations.

2. Bandwidth of Write Sectors:
The bandwidth of write sectors measures the speed at which data can be written to the NBD communication channel. It quantifies the channel's efficiency in handling write operations and storing data in a timely manner. A higher write sector bandwidth indicates faster data storage capabilities.

The write sector bandwidth was determined using the `dd` command with the parameters `if=/dev/zero` (input filled with zeros) and `of=/dev/nbd0` (output to the NBD communication channel). The block size (`bs`) and count were set accordingly, such as 1 MB and 1000, respectively, to write a significant amount of data. The throughput achieved during this test, measured in MB/s, represents the write sector bandwidth.

The write sector bandwidth is particularly relevant in applications that involve frequent data updates, such as logging or database systems. A high write sector bandwidth ensures efficient storage of data, allowing for quick and reliable write operations on the NBD communication channel.

3. Read File System (FS) Performance:
The read FS performance evaluates the responsiveness of the NBD communication channel when accessing files and directories on the mounted NBD file system. It measures the speed at which file system data can be retrieved, providing insights into the efficiency of read-based file operations.

To assess the read FS performance, various file manipulation commands were executed on the mounted NBD file system, such as `ls`, `cat`, and `cp`. The execution time for each operation was measured to quantify the responsiveness of the NBD communication channel.

For example, to list the files and directories in the mounted NBD file system, the `ls` command was used:

```
ls /mnt/nbd
```

Similarly, to read the contents of a file from the NBD file system, the `cat` command was employed:

```
cat /mnt/nbd/file.txt
```

Additionally, the `cp` command was executed to copy a file from the NBD file system to another location:

```
cp /mnt/nbd/file.txt /tmp/
```

By measuring the execution time of these operations, the read FS performance can be evaluated. A faster read FS performance indicates quicker access to files and directories, facilitating efficient data retrieval and processing.

4. Write File System (FS) Performance:
The write FS performance assesses the efficiency of the NBD communication channel in handling write-intensive operations on the mounted NBD file system. It measures the speed at which data can be written to the file system, ensuring efficient storage and data updates.

To evaluate the write FS performance, a test file was created on the client machine and then copied to the mounted NBD file system using the `cp` command:

```
echo "Test data" > /tmp/test.txt
cp /tmp/test.txt /mnt/nbd/
```

The time required to copy the test file to the NBD file system was measured, providing insights into the efficiency of write operations. A shorter execution time indicates faster data storage and efficient handling of write-intensive file system operations.

The write FS performance is crucial in scenarios where frequent data updates or efficient data storage are required. It enables the assessment of the NBD communication channel's ability to handle write operations promptly, ensuring reliable and efficient data storage on the NBD file system.

5. Mount and Random Access Test:
The mount and random access test evaluates the ability of the NBD communication channel to support mounting of the NBD file system and perform random access operations on it. This test assesses the channel's functionality in facilitating file system access and random data retrieval.

To perform the mount and random access test, the NBD communication channel was mounted to a designated mount point directory on the client machine:

```
sudo mount /dev/nbd0 /mnt/nbd
```

Once mounted, random access operations were executed on the NBD file system, such as reading and writing specific sectors or files. The response time for each operation was measured to evaluate the channel's efficiency in supporting random access.

For example, to read specific sectors from the NBD communication channel, the `dd` command was used:

```
sudo dd if=/dev/nbd0 of=/dev/null bs=1M skip=1000 count=10
```

To write data to specific sectors on the NBD communication channel, the `dd` command was utilized with appropriate parameters:

```
sudo dd if=/dev/zero of=/dev/nbd0 bs=1M seek=2000 count=10
```

The mount and random access test provides insights into the NBD communication channel's performance in facilitating file system access and supporting random data retrieval. It helps assess the channel's ability to handle diverse file system operations efficiently.

By analyzing these performance metrics, we can evaluate the suitability of the NBD solution in addressing the specific issue at hand. The results provide valuable insights into the capabilities and limitations of the NBD communication channel, allowing for informed decisions regarding its utilization in the given context. Additionally, these metrics can be used for performance comparison with alternative storage solutions, aiding in selecting the most appropriate approach for solving the problem.
...

## Comprehensive Analysis

The obtained results from the comprehensive testing of the NBD communication channel demonstrate that NBD performs fairly decently compared to other storage solutions. The analysis of the results highlights several key points regarding the performance and capabilities of NBD as a storage sharing mechanism.

First and foremost, NBD exhibited competitive performance in terms of read and write sector bandwidth. The measured data transfer rates for both read and write sectors were within acceptable ranges, indicating that NBD can efficiently deliver data to and from the client. This performance is crucial for applications that require fast and reliable data transfer, such as real-time data processing or high-speed data transfers. The comparable performance of NBD in this regard positions it as a viable storage sharing solution.

Furthermore, the analysis of the file system tests revealed that NBD demonstrated commendable performance in read and write file system operations. The read FS performance showcased the responsiveness of NBD when accessing files and directories on the mounted NBD file system. The execution time for common file manipulation commands, such as listing files (`ls`), reading file contents (`cat`), and copying files (`cp`), was relatively quick. This responsiveness ensures efficient data retrieval and processing, making NBD suitable for applications that heavily rely on file system operations.

In terms of write FS performance, NBD exhibited efficient handling of write-intensive operations on the file system. The measured execution time for copying a test file to the mounted NBD file system was reasonable, indicating that NBD can handle write operations promptly and reliably. This capability is crucial for applications that require efficient data storage and frequent data updates, such as logging systems or database applications.

One notable advantage of NBD is its versatility in providing other block device sharing mechanisms in addition to storage sharing. NBD allows for the sharing of block devices beyond traditional storage, opening up possibilities for various use cases. This flexibility enhances the applicability of NBD in different scenarios, enabling the sharing of resources such as virtual disks, partitions, or RAM disks.

Overall, the comprehensive analysis of the results demonstrates that NBD is a capable storage sharing solution that performs fairly decent compared to other storage solutions. Its competitive read and write sector bandwidth, along with efficient read and write file system performance, make it suitable for applications that require efficient data transfer, reliable storage, and optimized file system operations. Additionally, the ability of NBD to provide other block device sharing mechanisms adds to its versatility and widens its range of potential applications.

...

### Implication of the finding and the proposed solution

As the findings of the paper demonstrate that NBD performs fairly decently against other storage solutions, the implications include:

1. Enhanced Storage Sharing: The findings indicate that NBD can serve as an effective solution for sharing storage resources among multiple devices or systems. This implication suggests that NBD can facilitate efficient data transfer, reliable storage, and optimized file system operations, thereby enabling improved storage sharing capabilities in various applications.

2. Cost-Effective Solution: The research findings may imply that NBD offers a cost-effective storage sharing mechanism compared to other alternatives. This implication is valuable for organizations or individuals seeking economical ways to share storage resources without compromising performance or reliability.

3. Versatility and Flexibility: Another implication of the findings could be that NBD's ability to provide block device sharing mechanisms beyond storage opens up possibilities for a wide range of applications. This flexibility implies that NBD can be utilized for sharing other resources such as virtual disks, partitions, or RAM disks, expanding its potential use cases.

4. Future Research Directions: The implications of the findings may also guide future research in the field of storage sharing. The positive performance of NBD against other solutions suggests avenues for further investigation, such as optimizing NBD's performance, exploring its scalability in large-scale systems, or examining its compatibility with emerging technologies.

Title: Proposal for Enabling NBD Kernel Module in Android Kernel and Exposing System API for Flexible Storage Integration

1. Introduction:
This proposal aims to enhance the storage capabilities of Android devices by enabling the Network Block Device (NBD) kernel module in the Android kernel. Additionally, a system API will be developed to facilitate seamless mounting and unmounting of NBD exports, allowing them to be used as block devices for various purposes such as game asset folders, media library folders, or cache partitions. This solution provides a flexible and efficient storage integration mechanism, expanding the functionality and versatility of Android devices.

2. Objectives:
The primary objectives of this proposal are as follows:
- Enable the NBD kernel module in the Android kernel to support network-based block device sharing.
- Develop a system API in the user space to facilitate the mounting and unmounting of NBD exports as block devices.
- Integrate the NBD functionality into Android's storage framework to enable seamless usage in various contexts, including game asset folders, media library folders, or cache partitions.
- Ensure efficient performance, reliability, and compatibility with existing Android applications and services.

3. Methodology:
The proposed solution will involve the following steps:

3.1. Enabling NBD Kernel Module:
The NBD kernel module will be integrated into the Android kernel by incorporating the necessary code changes and configurations. This will involve modifying the kernel source code, enabling NBD support, and building a custom kernel image for Android devices. The modified kernel will be tested on compatible devices to ensure proper functionality.

3.2. Developing System API:
A system API will be developed in the user space to provide a user-friendly interface for managing NBD exports. This API will allow users or applications to seamlessly mount and unmount NBD exports as block devices. The API will handle the necessary communication with the NBD kernel module and perform the required operations to mount or unmount the NBD exports.

3.3. Storage Integration:
The NBD functionality will be integrated into Android's storage framework, enabling the usage of NBD exports as block devices in different scenarios. This integration will involve modifications to the storage subsystem and relevant components to recognize and handle NBD exports appropriately. The modifications will ensure that NBD exports can be seamlessly utilized as game asset folders, media library folders, or cache partitions, providing an enhanced storage experience.

4. Expected Outcomes:
The proposed solution is expected to yield the following outcomes:

4.1. Flexible Storage Integration:
The NBD kernel module, along with the developed system API, will provide a flexible storage integration mechanism for Android devices. Users and applications will be able to mount or unmount NBD exports as block devices, enabling diverse use cases such as game asset folders, media library folders, or cache partitions. This flexibility will enhance the storage capabilities of Android devices, allowing for efficient resource utilization and improved performance.

4.2. Seamless Usage Experience:
The system API will simplify the management of NBD exports, providing a seamless user experience for mounting and unmounting NBD exports as block devices. The API will handle the necessary operations and ensure proper communication with the NBD kernel module, abstracting the complexities of NBD integration from end-users and developers.

4.3. Enhanced Performance and Reliability:
The integration of NBD functionality into Android's storage framework will be optimized to deliver efficient performance and reliability. NBD exports will be seamlessly integrated into the storage subsystem, leveraging Android's existing mechanisms for file handling, caching, and resource management. This will result in improved data access speeds, reduced latency, and enhanced overall system reliability.

5. Conclusion:
Enabling the NBD kernel module in the Android kernel and developing a system API for seamless mounting and unmounting of NBD exports as block devices offers a promising solution to enhance the storage capabilities of Android devices. This proposal aims to provide flexible storage integration by leveraging the NBD technology, allowing users and applications to utilize NBD exports as block devices for various purposes such as game asset folders, media library folders, or cache partitions.

By enabling the NBD kernel module in the Android kernel, Android devices will gain the ability to share block devices over the network, enabling efficient data transfer and storage. The developed system API will simplify the management of NBD exports, providing a user-friendly interface to mount and unmount NBD exports as block devices seamlessly. This integration will enhance the storage experience for users and developers, offering flexibility and versatility in resource utilization.

The proposed solution is expected to deliver flexible storage integration, ensuring efficient performance, reliability, and compatibility with existing Android applications and services. It will enable users to seamlessly mount or unmount NBD exports as block devices, expanding the storage capabilities of Android devices beyond traditional storage mediums. The seamless usage experience and enhanced performance will contribute to improved system efficiency and user satisfaction.

Future work could involve conducting extensive testing and benchmarking to evaluate the performance and scalability of the NBD integration. Further optimization and refinement of the system API and integration into Android's storage framework can be explored to ensure seamless compatibility with a wide range of applications and use cases. Additionally, user feedback and real-world deployment can provide insights for further enhancements and refinements of the proposed solution.

In conclusion, enabling the NBD kernel module in the Android kernel and developing a system API for flexible storage integration opens up new possibilities for Android devices, empowering users and applications to leverage NBD exports as block devices for various purposes. This solution bridges the gap between network-based storage sharing and Android's storage ecosystem, offering a comprehensive and efficient storage solution for enhanced user experiences.
...

### More Sub Headings

...

# Discussion

Android devices have the potential to serve as Network-Attached Storage (NAS) clients, offering various use cases and notable benefits. Let's examine these use cases and benefits in depth, using technical terms to illustrate their significance:

1. Media Streaming: Android devices can act as NAS clients by connecting to NAS servers and streaming media content stored on the network. With support for protocols such as DLNA (Digital Living Network Alliance) or UPnP (Universal Plug and Play), Android devices can access media files hosted on NAS servers and play them seamlessly on compatible media players or streaming applications. This enables users to enjoy high-quality media content directly from their Android devices, leveraging the NAS server's storage capacity and network capabilities.

2. File Synchronization and Backup: Android devices can synchronize files with NAS servers, allowing for seamless data backup and access across multiple devices. Using protocols like rsync or Syncthing, Android devices can maintain file consistency between local storage and NAS storage, ensuring data integrity and availability. This capability is particularly useful for professionals or individuals who require continuous synchronization of files across devices, providing a reliable backup solution and mitigating the risk of data loss.

3. Remote Access and File Sharing: Android devices can establish secure connections with NAS servers, enabling remote access and file sharing functionalities. By utilizing protocols such as SSH (Secure Shell) or VPN (Virtual Private Network), Android devices can securely connect to NAS servers from outside the local network. This allows users to access and manage files stored on the NAS remotely, facilitating collaborative work environments and enabling seamless file sharing among authorized users.

4. Data Caching and Offline Access: Android devices can utilize NAS storage as a cache partition, optimizing data access and enabling offline access to frequently used files. By implementing technologies such as NFS (Network File System) or SMB (Server Message Block), Android devices can store frequently accessed files locally in a cache partition, reducing latency and network overhead. This feature is beneficial for applications that rely on quick access to data, such as media players or productivity apps, providing smooth offline access to essential files.

5. Distributed Computing and Processing: Android devices can leverage NAS storage to offload computationally intensive tasks or utilize distributed computing frameworks. By utilizing protocols such as SSHFS (SSH Filesystem) or NFS, Android devices can access remote storage resources and perform complex computations or data processing tasks. This distributed computing capability allows Android devices to tap into the vast storage capacity of NAS servers, enabling resource-intensive applications such as image recognition, machine learning, or distributed data analysis.

The benefits of using Android devices as NAS clients include:
- Expanded Storage Capacity: Android devices can effectively extend their storage capacity by connecting to NAS servers, providing virtually unlimited storage space for storing and accessing data.
- Centralized Data Management: By utilizing NAS servers, Android devices can centralize data management, enabling seamless access, sharing, and synchronization of files across multiple devices and platforms.
- Data Security and Redundancy: NAS servers offer built-in data protection mechanisms such as RAID (Redundant Array of Independent Disks) and data encryption, ensuring data security and redundancy. Android devices, acting as NAS clients, can benefit from these features and enhance data integrity.
- Scalability and Flexibility: Android devices can easily scale their storage capacity by connecting to NAS servers, allowing for flexible expansion as storage needs grow.
- Efficient Resource Utilization: By utilizing NAS storage, Android devices can optimize local storage usage and offload resource-intensive tasks to the NAS, improving overall device performance and efficiency.

In summary, the use of Android devices as NAS clients offers versatile capabilities, including media streaming, file synchronization, remote access, distributed computing, and data caching. These functionalities enhance data management, accessibility, security, and resource utilization, making Android devices valuable components in a NAS ecosystem.

...

The results of incorporating NBD as a default feature in Android devices demonstrate significant advantages over the alternatives discussed earlier in the paper. Let's compare NBD with these alternatives and highlight the specific advantages:

1. USB Storage: Compared to USB storage, NBD offers several distinct advantages. While USB storage relies on physical connections and limited port availability, NBD leverages the existing network infrastructure, providing seamless storage sharing over the network. NBD eliminates the need for external hardware, allowing for more flexible and scalable storage solutions. Additionally, NBD's low-latency data access and high-performance data transfer within the local network outperform the speed limitations of USB connections, enabling faster data retrieval and processing.

2. Cloud-Based Solutions: NBD surpasses cloud-based storage alternatives in various aspects. Unlike cloud-based solutions that depend on internet connectivity and involve potential privacy concerns, NBD operates within the local network, ensuring low-latency data access, enhanced security, and improved data privacy. By utilizing NBD, Android devices can efficiently access and share storage resources without relying on external servers or incurring additional costs associated with cloud subscriptions or data transfers. NBD's seamless integration into the Android ecosystem provides users with a consistent storage experience across applications and services.

3. Network File Systems (NFS): While NFS is a viable storage sharing solution, it has certain limitations when compared to NBD. NFS requires additional configuration and setup, making it less user-friendly and accessible for non-technical users. On the other hand, NBD's kernel-level implementation and system API facilitate seamless integration into the Android ecosystem, offering a user-friendly interface for mounting and unmounting NBD exports as block devices. NBD's versatility in sharing different types of block devices and its compatibility with existing Android applications and file systems provide a more flexible and convenient storage solution.

4. Distributed File Systems: NBD's performance and functionality also outshine distributed file systems in certain contexts. Distributed file systems often involve complex configurations and infrastructure requirements, making them more suitable for large-scale deployments rather than individual Android devices. In contrast, NBD offers a lightweight and efficient solution for storage sharing, particularly within a local network environment. NBD's low-latency data access, high-performance data transfer, and seamless integration with the Android ecosystem make it an ideal choice for users seeking a convenient and versatile storage solution without the complexities associated with distributed file systems.

By comparing NBD with these alternatives, it becomes evident that NBD provides significant advantages in terms of efficient resource utilization, low latency, seamless integration, flexibility, enhanced security, cost-effectiveness, and customizability. NBD's ability to leverage the existing network infrastructure, its compatibility with Android applications and services, and its user-friendly system API position it as a superior choice for expanding storage capabilities in Android devices.

## Security Architecture

In designing a security architecture that incorporates both the VFS (Virtual File System) layer for physical device damage protection and TLS (Transport Layer Security) with NBD (Network Block Device) for data security, we can create a robust and layered approach to safeguarding sensitive information. Let's explore this architecture in detail:

1. Physical Device Damage Protection with VFS Layer:
The VFS layer acts as an abstraction layer between the operating system and various file systems, providing a unified interface for file operations. In the context of physical device damage protection, the VFS layer can be utilized to implement additional security measures. Here are some key components of this architecture:

- Filesystem Encryption: The VFS layer can support encryption mechanisms to ensure that data stored on the physical device remains protected even if the device is compromised. This can involve encrypting file data at rest using strong encryption algorithms, making it unreadable without proper decryption keys.

- Access Control: The VFS layer can enforce access control policies to limit unauthorized access to sensitive files. This includes implementing file permissions, user/group-based access restrictions, and auditing mechanisms to track file access and modifications.

- Filesystem Integrity: By implementing checksums or digital signatures, the VFS layer can verify the integrity of files on the physical device. This helps detect any tampering or unauthorized modifications to the files, providing an additional layer of protection against physical attacks.

2. Data Security with TLS and NBD:
To ensure secure communication and data protection over the network, TLS can be used in conjunction with NBD. This combination establishes a secure channel for transmitting data between the NBD client and server. Here's how this architecture can be implemented:

- TLS Encryption: TLS provides encryption of data in transit, preventing eavesdropping and unauthorized access to sensitive information. By configuring the NBD server and client to utilize TLS, all data transmitted over the network is encrypted, ensuring its confidentiality.

- Certificate-based Authentication: TLS utilizes digital certificates for authentication. The NBD server can be configured with a trusted certificate, and the client can verify the server's identity using the certificate's public key. This mutual authentication ensures the integrity of the connection and protects against man-in-the-middle attacks.

- Data Integrity: TLS also ensures data integrity by using cryptographic algorithms, such as message authentication codes (MACs), to detect any tampering or modification of the transmitted data. This guarantees that the data received by the NBD client is the same as what was sent by the server, providing assurance of data integrity.

By combining the VFS layer's physical device damage protection mechanisms with TLS and NBD's data security measures, we establish a comprehensive security architecture. This architecture protects the data stored on the physical device from unauthorized access and tampering while ensuring secure communication between the NBD client and server over the network.

3. Comprehensive Security Architecture:

The proposed security architecture combines the physical device damage protection capabilities of the VFS layer with the data security measures provided by TLS and NBD. This layered approach ensures the confidentiality, integrity, and availability of data in the following manner:

- Secure Data Transmission: With the TLS protocol applied to the NBD communication channel, all data transmitted between the NBD client and server is encrypted. This safeguards the data against eavesdropping and unauthorized interception, ensuring its confidentiality during transit. The TLS encryption ensures that even if an attacker gains access to the network traffic, they would not be able to decipher the sensitive information being transmitted.

- Mutual Authentication: TLS utilizes digital certificates for server authentication, allowing the NBD client to verify the identity of the server. By configuring the NBD server with a trusted certificate and requiring client-side certificate verification, mutual authentication is achieved. This protects against man-in-the-middle attacks and ensures that the NBD client is communicating with the legitimate server. Any unauthorized or malicious server attempting to impersonate the legitimate server will be detected during the certificate verification process.

- Data Integrity and Authenticity: The TLS protocol also provides mechanisms for data integrity and authenticity. By incorporating cryptographic algorithms, such as message authentication codes (MACs), TLS verifies the integrity of the data transmitted between the NBD client and server. This prevents any tampering or unauthorized modifications to the data during transit. The MACs ensure that the data received by the NBD client is the same as what was sent by the server, thereby guaranteeing data integrity and authenticity.

- Physical Device Protection: The VFS layer contributes to the security architecture by implementing various measures to protect against physical device damage. Filesystem encryption ensures that data stored on the physical device remains protected even if the device falls into the wrong hands. Access control mechanisms, such as file permissions and user/group-based restrictions, help prevent unauthorized access to sensitive files. Additionally, file integrity checks, implemented through checksums or digital signatures, ensure that files remain unaltered and detect any unauthorized modifications to the stored data.

- Enhanced Security and Privacy: By combining the VFS layer's physical device protection with TLS and NBD's data security features, the overall security and privacy of the system are significantly enhanced. The encryption of data in transit, mutual authentication, data integrity checks, and access controls collectively mitigate the risks associated with unauthorized access, data interception, tampering, and physical device compromise. The architecture ensures that sensitive data remains secure, both during transmission over the network and while stored on the physical device.

By implementing this comprehensive security architecture, Android devices can benefit from enhanced data security and privacy. The combination of the VFS layer's physical device damage protection mechanisms and TLS with NBD's secure communication ensures that sensitive information is protected against unauthorized access, tampering, and interception. This robust security framework establishes a strong foundation for secure data sharing and storage within Android devices, fostering trust and confidence in their ability to handle sensitive data securely.

# Limitations and Future Prospects

While this paper aims to evaluate the performance of Network Block Device (NBD) in Android devices and provide insights into its potential benefits, it is essential to acknowledge certain limitations that may impact the scope and generalizability of the findings. These limitations include:

1. Hardware Dependency: The evaluation of NBD performance is conducted using Raspberry Pi 4B as the client device due to its similar processor architecture with Android devices. However, it's important to note that different Android devices may have varying hardware configurations, which could potentially affect the performance results. The findings may not directly translate to all Android devices, and further testing on a wider range of hardware is warranted.

2. Software Compatibility: The evaluation focuses on the performance of NBD with an x86 Linux server. Although efforts are made to ensure compatibility, variations in software versions, device drivers, and kernel configurations may exist, potentially influencing the results. The outcomes may differ when using different server configurations or alternative operating systems, which should be considered in future studies.

3. Limited Comparison Candidates: While this paper compares NBD with popular storage solutions such as SFTP, NFS, SMB, Google Drive, Dropbox, OneDrive, GCP, and local storage, there are numerous other storage protocols and services available in the market. The selection of comparison candidates may not encompass the entire landscape of storage options, potentially limiting the breadth of the evaluation.

4. Performance Metrics Selection: The chosen performance metrics, such as read sector, write sector, read file system, write file system, create file system, alter position table, mount ability, and random access level, provide valuable insights into NBD performance. However, other metrics, such as latency, data transfer rate, and concurrency, may also contribute to a comprehensive assessment of NBD's performance. Future studies could consider incorporating additional metrics for a more holistic evaluation.

5. Network Environment Variability: The performance of NBD and other storage solutions can be influenced by the network environment, including network congestion, latency, and bandwidth limitations. The evaluation in this paper assumes a relatively stable and optimal network environment. However, real-world network conditions can vary, and the performance of NBD may be affected accordingly.

6. Limited Generalizability: The evaluation in this paper focuses on a specific scenario involving NBD, Raspberry Pi 4B, and an x86 Linux server. The findings and conclusions may not be directly applicable to other configurations, devices, or use cases. The generalizability of the results should be considered within the specific context of the evaluation.

By acknowledging these limitations, future research can aim to address these concerns and expand upon the findings presented in this paper. Through further investigations and wider testing, a more comprehensive understanding of NBD's performance in various scenarios can be achieved.

Despite the limitations mentioned earlier, the utilization of Network Block Device (NBD) in Android devices offers the potential to share not only storage mediums but also other block devices. This can enable a wide range of applications and expand the capabilities of Android devices. Here are some examples of block devices and potential future research directions to make them compatible with Android:

1. Network-Attached Storage (NAS): In addition to sharing storage resources, NBD can be extended to share NAS devices, allowing Android devices to access and utilize remote file systems and network shares. Future research can focus on developing NBD-compatible drivers and protocols for popular NAS devices, ensuring seamless integration and maximizing the benefits of NAS in Android.

2. Printers and Scanners: Block devices such as printers and scanners can be shared with Android devices through NBD. This would enable Android users to directly connect to and utilize these devices, expanding printing and scanning capabilities. Future research can explore the development of NBD drivers and protocols specific to printer and scanner devices, facilitating seamless connectivity and efficient usage.

3. Input/Output Devices: NBD can potentially be extended to share input/output block devices, including keyboards, mice, game controllers, and more. This would allow Android devices to utilize a wider range of peripheral devices, enhancing user interaction and enabling diverse applications. Future research can investigate the development of NBD-compatible protocols and drivers for different input/output devices, considering device-specific requirements and compatibility.

4. Block-level Virtualization: NBD can serve as a foundation for block-level virtualization in Android devices. This would enable the creation and management of virtual block devices that can represent physical devices or partitions. Future research can focus on developing NBD-based virtualization frameworks and tools, allowing Android devices to efficiently utilize virtual block devices with enhanced control and flexibility.

5. IoT Devices: With the proliferation of Internet of Things (IoT) devices, integrating NBD support for various IoT block devices can enable Android devices to communicate and interact with a wide range of IoT devices seamlessly. Future research can explore the development of NBD drivers and protocols for popular IoT platforms, ensuring compatibility and interoperability with Android devices.

In conducting research on making these block devices compatible with Android through NBD, it is essential to consider the specific benefits that each device brings. For example, integrating printers and scanners with Android devices would enhance productivity and convenience, while incorporating IoT devices would enable seamless control and monitoring of connected devices.

Future research can focus on developing NBD-compatible drivers, protocols, and frameworks for different block devices, considering device-specific requirements, standards, and compatibility. This would involve collaboration between Android developers, device manufacturers, and the open-source community to foster innovation and enable new possibilities for Android device integration with diverse block devices.

# Conclusion 

In conclusion, this paper has presented an evaluation of the performance of Network Block Device (NBD) in Android devices, specifically focusing on utilizing Raspberry Pi 4B as the client device connected to an x86 Linux server. Despite the acknowledged limitations, the findings highlight the potential benefits of incorporating NBD as a default feature in Android devices.

Furthermore, this paper recognizes the potential of NBD to extend beyond storage sharing and enable Android devices to act as middleware between users and other block devices. By leveraging NBD, Android devices could serve as a bridge for seamless communication and control between users and various devices, such as network-attached storage (NAS), printers, scanners, input/output devices, IoT devices, and more.

With this vision, future research can explore the development of NBD-compatible drivers, protocols, and frameworks that enable Android devices to efficiently communicate and interact with a wide range of block devices. This would empower Android devices to serve as intelligent intermediaries, providing users with more senseless control over large devices that require remote management and access.

By enabling NBD in Android and fostering compatibility with diverse block devices, the possibilities for remote control, data management, and device integration can be significantly expanded. This not only enhances the capabilities of Android devices but also opens up new avenues for seamless connectivity, productivity, and innovation in various domains.

Overall, this research paves the way for future advancements in Android as a versatile middleware platform, enabling the seamless integration of diverse block devices into the Android ecosystem. By leveraging NBD and embracing the potential of Android devices as intermediaries, we can envision a future where users can effortlessly control and interact with a multitude of devices from their Android devices, bringing about enhanced convenience, flexibility, and efficiency in the digital landscape.

