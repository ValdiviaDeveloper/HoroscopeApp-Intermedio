package the.lonely.wolf.horoscoapp.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.navigation.NavArgs
import androidx.navigation.navArgs
import dagger.hilt.android.AndroidEntryPoint
import the.lonely.wolf.horoscoapp.R
import the.lonely.wolf.horoscoapp.databinding.ActivityHoroscopeDetailBinding

@AndroidEntryPoint
class HoroscopeDetailActivity : AppCompatActivity() {
    private lateinit var binding:ActivityHoroscopeDetailBinding
    private val horoscopeDetailViewModel:HoroscopeDetailViewModel by viewModels()
    private val args:HoroscopeDetailActivityArgs by navArgs()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHoroscopeDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        args.type
    }
}