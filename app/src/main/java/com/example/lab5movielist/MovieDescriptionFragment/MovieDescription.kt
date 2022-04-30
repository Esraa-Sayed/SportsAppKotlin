
package com.example.lab5movielist.MovieDescriptionFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.lab5movielist.R
import com.example.lab5movielist.model.DTOMovie
import com.example.lab5movielist.model.MovieDataClass


class MovieDescription : Fragment() {
    lateinit var textView:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movie_description, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textView = view.findViewById(R.id.movieDescTextView)
        val movies = DTOMovie.movieList
        textView.text = movies[0].description
    }
    fun getDatalandscap(movieDataClass: MovieDataClass)
    {
        textView.text = movieDataClass.description
    }

}