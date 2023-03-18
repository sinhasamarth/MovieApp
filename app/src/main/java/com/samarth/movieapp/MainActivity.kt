package com.samarth.movieapp

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.samarth.movieapp.adapters.PeopleAdapter
import com.samarth.movieapp.adapters.RecommendAdapter
import com.samarth.movieapp.adapters.TrailersAdapter
import com.samarth.movieapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var moreDetailFlag = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUI()
        initListeners()
    }

    private fun initListeners() {
        binding.tvReadMore.setOnClickListener {
            moreDetailFlag = !moreDetailFlag

            binding.apply {
                if (moreDetailFlag) {
                    tvReadMore.text = getString(R.string.read_less)
                    lCast.root.visibleIt()
                    lCrew.root.visibleIt()
                } else {
                    tvReadMore.text = getString(R.string.read_more)
                    lCast.root.gone()
                    lCrew.root.gone()
                }

            }
        }
    }

    private fun initUI() {
        setTopBar()
        setUpTrailerRv()
        setUpTags()
        setUpCastRv()
        setUpCrewRv()
        setUpSimilarMovies()
    }

    private fun setUpSimilarMovies() {
        binding.lRecommendedMovies.apply {
            tvHeadline.text = getString(R.string.similar_movies)
            tvHeadline.setTextColor(Color.WHITE)
            rvLogoWithDesc.apply {
                layoutManager =
                    LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
                adapter = RecommendAdapter()
            }
        }
    }


    private fun setUpCrewRv() {
        binding.lCrew.apply {
            tvHeadline.text = getString(R.string.crew)
            rvLogoWithDesc.apply {
                layoutManager =
                    LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
                adapter = PeopleAdapter(Constants.castList.reversed())
            }
        }
    }

    private fun setUpCastRv() {
        binding.lCast.apply {
            tvHeadline.text = getString(R.string.cast)
            rvLogoWithDesc.apply {
                layoutManager =
                    LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
                adapter = PeopleAdapter()

            }
        }
    }

    private fun setUpTags() {
        binding.apply {
            lAction.initData(Constants.tagItems[0])
            lComdey.initData(Constants.tagItems[1])
            lScienceFiction.initData(Constants.tagItems[2])
            lPostProduction.initData(Constants.postProduction)
        }
    }

    private fun setUpTrailerRv() {
        binding.rvTrailersVideo.apply {
            layoutManager =
                LinearLayoutManager(
                    this@MainActivity,
                    LinearLayoutManager.HORIZONTAL,
                    false
                )
            adapter = TrailersAdapter(Constants.trailerList)
        }
    }

    private fun setTopBar() {
        // Setting Top Bar
        WindowCompat.setDecorFitsSystemWindows(window, false)
        window.statusBarColor = Color.TRANSPARENT

        binding.apply {
            // Loading Banner
            imBanner.load(Constants.homeBannerUrl)

        }
    }


}