package com.example.images_feeding

import android.content.Context
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import java.io.File
c
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

}
//    class PhotoAdapter(private val photos: List<String>, private val onClick: (String) -> Unit) : RecyclerView.Adapter<PhotoAdapter.PhotoViewHolder>() {
//
//        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoViewHolder {
//            val view = LayoutInflater.from(parent.context).inflate(R.layout.photo_item, parent, false)
//            return PhotoViewHolder(view, onClick)
//        }
//
//        override fun onBindViewHolder(holder: PhotoViewHolder, position: Int) {
//            holder.bind(photos[position])
//        }
//
//        override fun getItemCount(): Int = photos.size
//
//        class PhotoViewHolder(private val view: View, private val onClick: (String) -> Unit) : RecyclerView.ViewHolder(view) {
//            private val imageView: ImageView = view.findViewById(R.id.imageView)
//
//            fun bind(photoUri: String) {
//                Glide.with(view.context).load(photoUri).into(imageView)
//                view.setOnClickListener { onClick(photoUri) }
//            }
//        }
//    }
//
//
//    // この部分は疑似コードです。実際のAPI呼び出しにはGoogle Cloud Vision APIのセットアップが必要です。
//    fun classifyImage(imagePath: String) {
//        // Google Cloud Vision APIを呼び出して画像を分類する処理
//        // 結果に基づいてUIを更新するか、キャラクター育成のロジックを呼び出す
//
//    }
//
//
//    // キャラクター育成
//    class Character {
//        var experience: Int = 0
//
//        fun gainExperience(category: String) {
//            when (category) {
//                "adventurer" -> experience += 10
//                "social" -> experience += 5
//                // 他のカテゴリに基づく経験値の加算
//            }
//        }
//    }
//
//
//    fun deletePhoto(context: Context, photoUri: String) {
//        val file = File(photoUri)
//        if (file.exists()) {
//            file.delete()
//            // 必要に応じてUIの更新や、キャラクターへの通知を行う
//        }
//    }

//}