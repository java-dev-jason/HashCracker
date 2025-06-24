# 🔓 HashCracker (WIP)

A brute-force based password cracker written in Java.  
Currently supports SHA256 hashes and character combinations from lowercase, uppercase, and digits.

⚠️ **This project is for educational purposes only.**

---

## ✨ Features

- Brute-force attempts against SHA256 hashes
- Dynamic password length increase (e.g., `a`, `aa`, `aaa`, …)
- Three modes:
  - Lowercase letters
  - Lowercase + Uppercase
  - Letters + Numbers

---

## 🚧 Status

**Work In Progress (WIP)**  
This project is not finished yet. Currently:
- Only test runs are implemented
- Hash class and test Main class exist but may be improved

---

## 🔧 Usage

1. Clone the repository
2. Compile all files
3. Run `Main.java` to test the brute-force methods

---

## 📦 Tech Stack

- Java
- SHA256 hashing

---

## 🧠 Notes

- Brute-force speed depends heavily on the hash and password length
- No optimizations or parallelization yet
- The `alphabet` expands dynamically based on password length

---

## 👨‍💻 Author
Built by Jason Belzek as a personal learning project.
Feel free to fork, play, or contribute!

---

## 🛑 Disclaimer

This project is intended for **learning purposes** only.  
Do not use it against any system or data you do not own or have permission to test.
