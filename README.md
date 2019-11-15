# CustomInputPIN
Simple library to randomize number in pinpad.

![alt tag](https://raw.githubusercontent.com/siscofran999/CustomInputPIN/master/image/image.jpg)

## Usage
To make a CustomInputPIN add in your layout XML and add CustomInputPIN library in your project or you can also grab it via Gradle:

Add it in your root build.gradle at the end of repositories:

```gradle
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

Add the dependency :
```build.gradle(:app)
dependencies {
	implementation 'com.github.siscofran999:CustomInputPIN:1.2'
}
```

## Implement
```xml 
<Button
        android:id="@+id/btn_next"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Next"/>

<FrameLayout
        android:id="@+id/frame"
        android:layout_width="match_parent"
        android:layout_height="match_parent"/>
```

### JAVA
```Java
final FragmentRandomPin mRandomPin = new FragmentRandomPin();

Button btn_next = findViewById(R.id.btn_next);

btn_next.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
	getSupportFragmentManager().beginTransaction().add(R.id.frame,mRandomPin).commit();

	mRandomPin.limitMsg("Xory, limit 7").limitMax(7);
	mRandomPin.setOnResultListener(new ResultListener() {
	    @Override
	    public void onButtonOK(String data) {
		Toast.makeText(MainActivity.this, ""+data, Toast.LENGTH_SHORT).show();
	    }

	    @Override
	    public void onButtonCancel() {
		Toast.makeText(MainActivity.this, "Cancel", Toast.LENGTH_SHORT).show();
	    }
	});
    }
});
```
LICENCE
-----

CustomInputPIN by [SiscoFran](https://github.com/siscofran999) is licensed under a [Apache License 2.0](http://www.apache.org/licenses/LICENSE-2.0).

![Image description](https://static.swimlanes.io/c3838c0485837c7d3fe0b70e6667e976.png)
