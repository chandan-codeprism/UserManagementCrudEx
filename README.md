<div align="center">

# Heartfulness Backend Application

</div>

## Introduction

Welcome to the Heartfulness Backend Application! This README provides step-by-step instructions to help you set up and run the project successfully.

### Prerequisites

Before getting started, please ensure that the following prerequisites are met:

- **IntelliJ IDE** and **Git** are installed on your machine.
- **Java 11** is installed.
- **MySQL Workbench** is installed.
- **Google Cloud SDK (gcloudsdk)** is installed.

## Installation Steps

Please follow the steps below to set up and run the Heartfulness Backend Application:

1. **Install IntelliJ IDE & Git**
   - Download and install **IntelliJ IDE** from the official website.
   - Download and install **Git** from the official website.

2. **Install Java 11**
   - Download and install **Java 11** from the official website.
   - Set the `JAVA_HOME` environment variable to the Java 11 installation directory.

3. **Install MySQL Workbench**
   - Download and install **MySQL Workbench** from the official website.
   - Follow the installation instructions provided by MySQL Workbench.

4. **Install Google Cloud SDK**
   - For **macOS**:
     - Open a terminal.
     - Execute the following command to download and install Google Cloud SDK (gcloudsdk):
       ```shell
       curl https://sdk.cloud.google.com | bash
       ```
     - Follow the instructions provided during the installation process to complete the installation successfully.
   - For **Windows**:
     - Open a command prompt.
     - Download the Google Cloud SDK installer by executing the following command:
       ```shell
       powershell.exe -Command "iex (new-object net.webclient).downloadstring('https://sdk.cloud.google.com')"
       ```
     - Once the download is complete, a graphical installer will be launched. Follow the instructions in the installer to complete the installation process.

5. **Install Cloud-Proxy Component**
   - Open a command prompt or terminal.
   - Execute the following command to install the Cloud-Proxy component using gcloud commands:
     ```
     gcloud components install cloud-proxy
     ```

6. **Connect using the Cloud SQL Auth proxy**
   - Download and set up the Cloud SQL Auth proxy by following the instructions provided in the official Google Cloud documentation.
   - Once the proxy is set up, execute the following command in a command prompt or terminal to start the proxy:
     ```
     ./cloud_sql_proxy -instances=unifiedplatform-dev:us-central1:up-dev-db=tcp:3309
     ```

   - Keep the proxy running in the background to maintain the database connection while the project is running.

7. **Clone the Project**
   - Open a command prompt or terminal.
   - Change the current directory to the location where you want to clone the project.
   - Execute the following command to clone the project from the repository:
     ```
     git clone --recurse-submodules https://github.com/codeprismtechnologies/heartfulness-backend.git
     ```

8. **Refresh Gradle**
   - Open the project in **IntelliJ IDE**.
   - Gradle will automatically detect the project configuration and start downloading the necessary libraries.
   - Wait for the Gradle refresh process to complete.

9. **Run GenerateProto**
   - Open a command prompt or terminal.
   - Change the current directory to the project's root directory.
   - Execute the following command to run the generateProto task:
     ```
     ./gradlew generateProto
     ```

10. **Run the Project**
    - Open the project in **IntelliJ IDE**.
    - Set up the necessary configurations for running the project.
    - Execute the project by clicking the Run button in **IntelliJ IDE**.

<div align="center">

Congratulations! You have successfully set up and run the Heartfulness Backend Application. Enjoy!

</div>
