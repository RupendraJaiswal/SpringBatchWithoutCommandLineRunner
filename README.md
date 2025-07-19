
# SpringBatchWithoutCommandLineRunner

This is a simple Spring Boot project demonstrating how to run a **Spring Batch job without using `CommandLineRunner` or `ApplicationRunner`**. Instead, the batch job is triggered manually via a REST API or automatically using a scheduled task.

---

## 🚀 Features

- Spring Batch job configuration
- Job triggered via REST endpoint
- Job triggered via `@Scheduled` (optional)
- Disabled auto-start job (`spring.batch.job.enabled=false`)
- Clean separation of concerns (JobConfig, JobLauncherController, etc.)

---

## 📦 Tech Stack

- Java 17
- Spring Boot
- Spring Batch
- Spring Web
- Spring Scheduling

---

## ⚙️ Project Configuration

### application.properties

```properties
spring.application.name=SpringBatchWithoutCommandLineRunner
spring.batch.job.enabled=false
server.port=8080
```

---

## 📁 Project Structure

```
src/
└── main/
    ├── java/com/example/springbatch/
    │   ├── config/BatchConfig.java
    │   ├── controller/JobLauncherController.java
    │   ├── scheduler/ScheduledJobRunner.java
    │   └── SpringBatchApplication.java
    └── resources/
        └── application.properties
```

---

## 🔄 Running the Project

### 1. Clone the Repository

```bash
git clone https://github.com/RupendraJaiswal/SpringBatchWithoutCommandLineRunner.git
cd SpringBatchWithoutCommandLineRunner
```

### 2. Build and Run the Application

```bash
./mvnw spring-boot:run
```

---

## ✅ Triggering the Batch Job

### Via REST API

**Endpoint:**

```http
GET http://localhost:8080/job/start
```

### Via Scheduled Task

Uncomment or configure the `@Scheduled` annotation in `ScheduledJobRunner.java` to enable periodic execution.

```java
@Scheduled(cron = "0 */1 * * * *") // Runs every 1 minute
```

---

## 📄 License

This project is licensed under the MIT License.

---

## 🙋 Author

**Rupendra Jaiswal**  
GitHub: [@RupendraJaiswal](https://github.com/RupendraJaiswal)
