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

Word: test
Trying wordlist...
Trying: test => 9f86d081884c7d659a2feaa0c55ad015...
Found match: test

---

## 📦 Tech Stack

- Java

- SHA256 (MessageDigest)

- Brute-force algorithm with dynamic length

---

## 📁 File Overview

- Main.java: Entry point

- AlphabetBruteForce.java: Brute-force attack logic

- WordsBruteForce.java: Wordlist-based cracking

- Hash.java: SHA256 hashing

- Words.txt: Wordlist (put your dictionary here)

---

## 🙋‍♂️ About
This tool was developed by Jason Belzek as part of a personal project to deepen his understanding of:
- Hashing algorithms (specifically SHA-256)
- Brute-force logic with dynamic input lengths
- Wordlist-based attack strategies
- Java fundamentals like MessageDigest, StringBuilder, and file handling

It was built from scratch, without libraries or frameworks, as a hands-on learning challenge and a demonstration of algorithmic thinking in Java.

Feel free to fork, explore, and contribute — or just get inspired by the approach.

---

## 🛑 Disclaimer
This tool is intended only for learning, testing, and educational purposes.
Do not use it on systems or data you do not own or have permission to test.

---

## 🔧 How to Use

1. Clone the repository:
   ```bash
   git clone https://github.com/dein-nutzername/HashCracker.git
