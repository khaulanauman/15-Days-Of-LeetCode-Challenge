# GDG COMSATS: 15 Days Of Leetcode Challenge

## Key Takeaways

For questions that ask for:
- **Find the Most or Least Frequent Element**
- **Count Specific Elements**
- **Anagrams**
- **Sort or Arrange Based on Frequency**
- **Find the smallest substring containing all characters of another string**
### **Calculate Frequency First**

```java
int[] freq = new int[26]; // Only English letters (a-z)
for (char c : s.toCharArray()) {
    freq[c - 'a']++; // Count frequency
}
```

---
