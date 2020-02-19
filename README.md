# Android_Json_using_Volley

Parsing Api Json data from web using Volley

[Beeceptor.com](https://beeceptor.com/) - The free Api hosting service

## Steps to Implement Volley in your android-project

### My Json Format

```
{
"Product":[
        {
        "description":"This is test api",
        "id":1,
        "name":"Test Api",
        "price": 150,
        "filename": "https://github.githubassets.com/images/modules/open_graph/github-octocat.png" }
  ]}
```

### Step 1:
  ###### Create a new android Project.
### Step 2:
  ###### Add Dependency in your built.Gradle file
  ```
  // Volley Dependency
    implementation 'com.android.volley:volley:1.1.1'
  ```
  ###### Add Internet Permission in your AndroidManifest.xml file
  ```
 <uses-permission android:name="android.permission.INTERNET"/>
  ```
### Step 3:
  ###### Complete the .xml file.
### Step 4:
  ###### complete the .kt file as given.
### Step 5:
  ###### Run the application.
