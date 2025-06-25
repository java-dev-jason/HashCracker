# 🔓 HashCracker

A brute-force based SHA256 cracker built in Java.

This tool attempts to crack a SHA256 hash using:
- A **wordlist attack** (`Words.txt`)
- A **brute-force attack** using alphabetic and numeric combinations

⚠️ **For educational purposes only.**

---

## ✨ Features

- Tries to match SHA256 hashes using a wordlist
- Falls back to brute-forcing with increasing string lengths (e.g., `a`, `aa`, `ab`, `abc`, ...)
- Dynamic password length handling
- Brute-force supports:
  - Lowercase letters
  - Uppercase letters
  - Numbers

---

## 🧪 Example Output

---

## 🔧 How to Use

1. Clone the repository:
   ```bash
   git clone https://github.com/dein-nutzername/HashCracker.git
