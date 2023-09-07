package the.lonely.wolf.horoscoapp.ui.luck

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.hilt.android.AndroidEntryPoint
import the.lonely.wolf.horoscoapp.R
import the.lonely.wolf.horoscoapp.databinding.FragmentLuckBinding

@AndroidEntryPoint

class LuckFragment : Fragment() {


    private var _binding: FragmentLuckBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLuckBinding.inflate(layoutInflater,container,false)
        return binding.root
    }


}