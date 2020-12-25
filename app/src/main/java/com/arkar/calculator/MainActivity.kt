    package com.arkar.calculator

    import androidx.appcompat.app.AppCompatActivity
    import android.os.Bundle
    import android.view.View
    import android.widget.Button
    import android.widget.TextView

    class MainActivity  : AppCompatActivity(){

        private lateinit var btnMinus: Button
        private lateinit var btnPlus: Button
        private lateinit var btnDivide: Button
        private lateinit var btnClear: Button
        private lateinit var btnMulti: Button
        private lateinit var btnOne: Button
        private lateinit var btnTwo: Button
        private lateinit var btnThree: Button
        private lateinit var btnFour: Button
        private lateinit var btnFive: Button
        private lateinit var btnSix: Button
        private lateinit var btnSeven: Button
        private lateinit var btnEight: Button
        private lateinit var btnNine: Button
        private lateinit var btnZero: Button
        private lateinit var btnPercentage: Button
        private lateinit var btnDot: Button
        private lateinit var btnEqual: Button
        private lateinit var txtResult: TextView

        private var zero: String = "0"
        private var one: String = "1"
        private var two: String = "2"
        private var three: String = "3"
        private var four: String = "4"
        private var five: String = "5"
        private var six: String = "6"
        private var seven: String = "7"
        private var eight: String = "8"
        private var nine: String = "9"

        private var mAddition: Boolean = false
        private var mSubtract: Boolean = false
        private var mMultiply: Boolean = false
        private var mDivide: Boolean = false
        private var mPercentage: Boolean = false
        private var mValueOne: Int = 0
        private var mValueTwo: Int = 0


        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            btnMinus = findViewById(R.id.btn_minus)
            btnPlus = findViewById(R.id.btn_plus)
            btnMulti = findViewById(R.id.btn_multi)
            btnMinus = findViewById(R.id.btn_minus)
            btnDivide = findViewById(R.id.btn_divide)
            btnClear = findViewById(R.id.btn_clear)
            btnEqual = findViewById(R.id.btn_equal)
            btnPercentage = findViewById(R.id.btn_percentage)

            btnZero = findViewById(R.id.btn_zero)
            btnOne = findViewById(R.id.btn_one)
            btnTwo = findViewById(R.id.btn_two)
            btnThree = findViewById(R.id.btn_three)
            btnFour = findViewById(R.id.btn_four)
            btnFive = findViewById(R.id.btn_five)
            btnSix = findViewById(R.id.btn_six)
            btnSeven = findViewById(R.id.btn_seven)
            btnEight = findViewById(R.id.btn_eight)
            btnNine = findViewById(R.id.btn_nine)
            btnDot = findViewById(R.id.btn_dot)

            txtResult = findViewById(R.id.txt_result)


            // Event Listener
            btnEqual.setOnClickListener{
                mValueTwo = txtResult.text.toString().toInt()
                when {
                    mAddition -> {
                        txtResult.text = (mValueOne + mValueTwo).toString()
                        mAddition = false
                    }
                    mSubtract -> {
                        txtResult.text = (mValueOne - mValueTwo).toString()
                        mSubtract = false
                    }
                    mMultiply -> {
                        txtResult.text = (mValueOne * mValueTwo).toString()
                        mMultiply = false
                    }
                    mDivide -> {
                        txtResult.text = (mValueOne / mValueTwo).toString()
                        mDivide = false
                    }
                    mPercentage -> {
                        txtResult.text = (mValueOne % mValueTwo).toString()
                        mDivide = false
                    }
                }

            }

            btnPlus.setOnClickListener{
                if (txtResult.text == null) {
                    txtResult.text = ""
                } else {
                    mValueOne = txtResult.text.toString().toInt()
                    mAddition = true
                    txtResult.text = null
                }
            }

            btnMinus.setOnClickListener {
                mValueOne = txtResult.text.toString().toInt()
                mSubtract = true
                txtResult.text = null
            }

            btnMulti.setOnClickListener {
                mValueOne = txtResult.text.toString().toInt()
                mMultiply = true
                txtResult.text = null
            }

            btnDivide.setOnClickListener {
                mValueOne = txtResult.text.toString().toInt()
                mDivide = true
                txtResult.text = null
            }

            btnPercentage.setOnClickListener {
                mValueOne = txtResult.text.toString().toInt()
                mPercentage = true
                txtResult.text = null
            }

        }


         fun calculate(view: View) {

            when (view.id) {
                R.id.btn_zero -> {txtResult.append(zero)}
                R.id.btn_one -> txtResult.append(one)
                R.id.btn_two -> txtResult.append(two)
                R.id.btn_three -> txtResult.append(three)
                R.id.btn_four -> txtResult.append(four)
                R.id.btn_five -> txtResult.append(five)
                R.id.btn_six -> txtResult.append(six)
                R.id.btn_seven -> txtResult.append(seven)
                R.id.btn_eight -> txtResult.append(eight)
                R.id.btn_nine -> txtResult.append(nine)
                R.id.btn_clear -> clearEntry()

            }
        }

        private fun clearEntry() {

            txtResult.text = ""
            mAddition = false
            mSubtract = false
            mDivide = false
            mMultiply = false
            mPercentage = false
        }


    }
