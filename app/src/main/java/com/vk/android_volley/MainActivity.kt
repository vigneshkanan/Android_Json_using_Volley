package com.vk.android_volley

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import org.json.JSONObject


class MainActivity : AppCompatActivity() {
    private var txtShowTextResult: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtShowTextResult = findViewById<TextView>(R.id.get_text)

        val requestQueue = Volley.newRequestQueue(this)
        val url = "https://testapi.free.beeceptor.com/api";

        val jsonObjectRequest = StringRequest(
            Request.Method.GET, url,
            Response.Listener<String>() {response ->

                val json = JSONObject(response)
                val jsonArray = json.getJSONArray("Product")
                //Use ForLoop for More Responces
                //for(i in 0..jsonArray.length()) {
                    val jsonObject1 = jsonArray.getJSONObject(0)
                    val res = jsonObject1.getString("description")
                    /*val res = jsonObject1.getString("id")
                    val res = jsonObject1.getString("name")
                    val res = jsonObject1.getString("price")
                    val res = jsonObject1.getString("filename")*/
                    txtShowTextResult!!.text = "response : $res "
             //   }
            },
            Response.ErrorListener { txtShowTextResult!!.text = "That didn't work!" })
        requestQueue.add(jsonObjectRequest);
    }
}
