package com.example.fibonaccisequence
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.math.BigInteger
class MainActivity : AppCompatActivity() {
    lateinit var rvnumbers:RecyclerView
       override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
           rvnumbers=findViewById(R.id.rvnumbers)
           rvnumbers.layoutManager= LinearLayoutManager(baseContext)
           var numsAdapter=NUmbersRecyclerViewAdapter(fibo(100))
           rvnumbers.adapter=numsAdapter
       }
    fun fibo(count:Int):List<BigInteger>{
        var start = BigInteger.ZERO
        var next = BigInteger.ONE
        var nums = MutableList<BigInteger>(count, { BigInteger.ZERO })
        nums[0] = start
        nums[1] = next
        for (i in 1..count) {
            var sum = start + next
            start = next
            next = sum
            nums[i - 1] = start
        }
           return nums
    }




}