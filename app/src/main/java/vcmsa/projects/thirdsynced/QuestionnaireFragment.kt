package vcmsa.projects.thirdsynced

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import vcmsa.projects.thirdsynced.databinding.FragmentQuestionnaireBinding


class QuestionnaireFragment : Fragment() {

    private var _binding: FragmentQuestionnaireBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentQuestionnaireBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.completeProfileButton.setOnClickListener {
            Toast.makeText(requireContext(), "Profile Completed 🎉", Toast.LENGTH_SHORT).show()
            // Later: Save profile data to Firebase or local storage
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}