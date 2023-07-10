package com.example.sneakerstoreapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.sneakerstoreapp.R

class fragmentWecome1 : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Gắn layout XML cho Fragment
        return inflater.inflate(R.layout.welcome_to_shop1, container, false)
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)


        // Thực hiện các tác vụ khác sau khi Activity đã được tạo
    }

}