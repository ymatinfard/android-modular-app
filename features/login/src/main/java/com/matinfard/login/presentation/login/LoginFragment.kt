package com.matinfard.login.presentation.login

import android.os.Bundle
import android.view.View
import androidx.lifecycle.observe
import com.google.android.material.snackbar.Snackbar
import com.matinfard.login.R
import com.matinfard.librarybase.exception.Failure
import com.matinfard.librarybase.presentation.BaseFragment
import kotlinx.android.synthetic.main.fragment_login.*
import kotlinx.android.synthetic.main.fragment_login.view.*
import org.koin.android.ext.android.inject

/**
 * Login page. User needs to enter a valid username and password to log in. Username should be in an email format, otherwise log-in would fail.
 */
class LoginFragment : BaseFragment() {

    private val viewModel: LoginViewModel by inject()

    override fun layoutId(): Int = R.layout.fragment_login

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setOnClickListener()
        setObservers()
    }

    private fun setOnClickListener() {
        mView.btn_login.setOnClickListener {
            viewModel.validateUser(et_username.text.toString(), et_password.text.toString())
        }
    }

    private fun setObservers() {
        with(viewModel) {
            success.observe(viewLifecycleOwner, ::handleNavigation)
            failure.observe(viewLifecycleOwner, ::handleFailure)
            loading.observe(viewLifecycleOwner, ::handleProgressbar)
        }

    }

    private fun handleNavigation(event: Boolean) {
      //  findNavController().navigate(R.id.action_viewListFragment_to_dashboardFragment)
    }

    private fun handleProgressbar(isLoading: Boolean) {
        progressbarVisibilityStatus(mView, isLoading)
    }

    private fun handleFailure(failure: Failure) {
        when (failure) {
            Failure.InvalidData -> notify("username must an email address!")
            Failure.NetworkConnection -> notify("please check your internet connection!")
            Failure.ServerError -> notify("username or password is wrong!")
        }
    }

    private fun notify(message: String) =
        Snackbar.make(mView.login_root_view, message, Snackbar.LENGTH_SHORT).show()
}

