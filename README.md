# GradientViews π¨
### μμμ΄ μμν λ³νλ TextView μ Button (RelativeLayout) μ ν¬ν¨ν λΌμ΄λΈλ¬λ¦¬μλλ€. 

---
κ°μΈμ μΌλ‘ κ΅μ₯ν μ’μνλ λͺ¨μ΅μ View μλλ€. μμν μμμ΄ λ³νλ View κ° λ¨μμΌλ‘ μ΄λ£¨μ΄μ§ κ²μ λΉν΄ λͺ¨λνκ³  μΈλ ¨λ λλμ μ€λλ€.

## It looks like π·
![0](https://user-images.githubusercontent.com/82919343/160193872-f14923ec-c9da-468c-817e-62dc990292c3.png)

---
## Let's do this. π
- 1. Download release file. (only aar flie.)
- 2. Drag and drop into [your_project/app/libs]
- 3. In app-level-gradle, type like below and sync.
```
dependencies {
    implementation files('libs/gradientviewslib-release.aar')
    ...
}
```
---
## How to use π¨βπ¨π©βπ¨

### GradientTextView

``` 
<com.jangjh123.gradientviewslib.GradientTextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_margin="10dp"
        app:text="Example"
        app:textEndColor="#ff0000"
        app:textIsBold="0"
        app:textSize="50"
        app:textStartColor="#00ff00" />
```

### GradientButton
```
    <androidx.cardview.widget.CardView
        android:layout_width="match_parent"
        android:layout_height="100dp"
        android:layout_margin="10dp">

        <com.jangjh123.gradientviewslib.GradientButton
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            app:buttonEndColor="@color/purple_200"
            app:buttonStartColor="@color/black"
            app:buttonText="Example"
            app:buttonTextColor="@color/white"
            app:buttonTextIsBold="1"
            app:buttonTextSize="50" />
    </androidx.cardview.widget.CardView>
```

**μμμ λν΄μλ ν₯μ¬ μ»¬λ¬ μ½λλ₯Ό κ³§λ°λ‘ μλ ₯νκ±°λ res/colors μ μ μ₯λ reference λ₯Ό κ°μ Έμμ** μ¬μ©ν  μ μμ΅λλ€.

μ μμμ λͺ¨λ  μμ±μ΄ λ€ ν¬ν¨λμ΄ μμ΄μ. **app: μΌλ‘ μμνλ λͺ¨λ  μμ±**μ΄ ν΄λΉ λΌμ΄λΈλ¬λ¦¬ μμ±μ μ λΆλλλ€.

## Review

μ»€μ€ν λ·°μ λν λ§μ°ν λλ €μμ΄ μμμ΅λλ€.

μ»€μ€ν λ·°λ₯Ό λ§λλ λ°©λ²μ λν΄ μκ³ λ μΆμ§λ§ μλ € μ€λ§ν μ¬λλ μμ΄μ, κ·Έλ₯ μ§μ  λΆλͺνλ³΄μμ΅λλ€.

μ΄λ₯Ό ν΅ν΄ μ»€μ€ν λ·°μ λν λλ €μμ λ¨μ³ λΌ μ μμκ³ , λ λ§μ μ»€μ€ν λ·° λΌμ΄λΈλ¬λ¦¬λ₯Ό λ§λ€μ΄μ μ§μ  λ°°ν¬νκ³  μΆλ€λ μκ°μ΄ λ€μμ΄μ.

MavenCentral μ λ±μ¬μμΌ λμ± μμ½κ² λ€κ°κ° μ μλ λΌμ΄λΈλ¬λ¦¬λ₯Ό λ§λ€κ³  μΆμ΄μ.

κ·Έλ¦¬κ³  μ‘°κΈ λ λμκ°μ, λ¨μν λ§λ€μ΄μ§ View μ μμ±μ λνλ κ²μ΄ μλλΌ,

View κ·Έ μμ²΄λ₯Ό μμλ°μ μ§μ  κ·Έλ¦¬λ μ»€μ€ν λ·°λ λ§λ€μ΄λ³΄κ³  μΆμ΄μ.
