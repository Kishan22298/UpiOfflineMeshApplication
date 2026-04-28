# UPI Offline Mesh Application 🚀

A Spring Boot backend that demonstrates **offline UPI payments using a Bluetooth-style mesh network**. This project simulates how transactions can travel across nearby devices without internet and get settled once connectivity is available.

---

## 🌐 Live Deployment

The application is successfully deployed on **Render**:

🔗 **Live URL:**
https://upiofflinemeshapplication.onrender.com

⚠️ Note:
Since this is deployed on Render’s free tier, the server may take **30–50 seconds** to respond on the first request after inactivity (cold start).

---

## 🧠 Project Overview

This system simulates a real-world scenario:

* 📤 A user sends money without internet
* 📡 The payment is encrypted and passed between nearby devices
* 🔄 The packet hops across a mesh network
* 🌐 A device with internet uploads it to the backend
* 💰 Backend processes and settles the transaction

---

## ⚙️ Features

* 🔐 **Hybrid Encryption (RSA + AES-GCM)**
* 🔁 **Idempotency Handling (Duplicate Prevention)**
* 📡 **Mesh Network Simulation**
* 💾 **Transaction Ledger**
* 🧪 **Concurrency-safe processing**
* 🌐 **Cloud Deployment using Docker + Render**

---

## 🏗️ Tech Stack

* Java 17
* Spring Boot
* Spring Data JPA
* H2 Database (in-memory)
* Docker
* Render (Deployment)

---

## 📡 API Endpoints

| Endpoint             | Description              |
| -------------------- | ------------------------ |
| `/`                  | Dashboard UI             |
| `/api/accounts`      | View all accounts        |
| `/api/transactions`  | View transactions        |
| `/api/mesh/state`    | Mesh network state       |
| `/api/demo/send`     | Inject payment into mesh |
| `/api/mesh/gossip`   | Run gossip simulation    |
| `/api/mesh/flush`    | Upload via bridge        |
| `/api/bridge/ingest` | Backend processing       |

---

## 🧪 How to Test (Live)

1. Open the live URL
2. Click **"Inject into Mesh"**
3. Run **Gossip Round (2–3 times)**
4. Click **"Flush Bridges"**
5. Observe:

   * Account balance updates
   * Transaction recorded

---

## ⚠️ Limitations

* Uses **H2 in-memory database** → data resets on restart
* No real Bluetooth (simulated mesh)
* No real banking integration
* Free hosting → cold start delay

---

## 🚀 Deployment Details

This project is deployed using:

* **Docker containerization**
* Hosted on **Render**
* Configured with dynamic port:

```properties
server.port=${PORT:8080}
```

---

## 📁 Project Structure

```
src/
 ├── model/
 ├── service/
 ├── controller/
 ├── crypto/
 ├── config/
```

---

## 🙌 Author

**Kishan Kumar**

---

## ⭐ Final Note

This project demonstrates:

* Distributed systems thinking
* Secure communication
* Real-world fintech problem solving

Perfect for:

* Hackathons
* Resume projects
* System design discussions

---

If you found this useful, feel free to ⭐ the repo!
