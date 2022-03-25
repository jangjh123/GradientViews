# GradientViews 🎨
### 색상이 서서히 변하는 TextView 와 Button (RelativeLayout) 을 포함한 라이브러리입니다. 

---
개인적으로 굉장히 좋아하는 모습의 View 입니다. 서서히 색상이 변하는 View 가 단색으로 이루어진 것에 비해 모던하고 세련된 느낌을 줍니다.

## It looks like 📷
![0](https://user-images.githubusercontent.com/82919343/160193872-f14923ec-c9da-468c-817e-62dc990292c3.png)

---
## How to use 👨‍🎨👩‍🎨

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

### GradientTextView
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

**색상에 대해서는 헥사 컬러 코드를 곧바로 입력하거나 res/colors 에 저장된 reference 를 가져와서** 사용할 수 있습니다.

위 예시에 모든 속성이 다 포함되어 있어요. **app: 으로 시작하는 모든 속성**이 해당 라이브러리 속성의 전부랍니다.

## Language 🛠

### 100% Java (surely, you can use it in kotlin projects)

## Review

커스텀 뷰에 대한 막연한 두려움이 있었습니다.

커스텀 뷰를 만드는 방법에 대해 알고는 싶지만 알려 줄만한 사람도 없어서, 그냥 직접 부딪혀보았습니다.

이를 통해 커스텀 뷰에 대한 두려움을 떨쳐 낼 수 있었고, 더 많은 커스텀 뷰 라이브러리를 만들어서 직접 배포하고 싶다는 생각이 들었어요.

MavenCentral 에 등재시켜 더욱 손쉽게 다가갈 수 있는 라이브러리를 만들고 싶어요.

그리고 조금 더 나아가서, 단순히 만들어진 View 에 속성을 더하는 것이 아니라,

View 그 자체를 상속받아 직접 그리는 커스텀 뷰도 만들어보고 싶어요.
