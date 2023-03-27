package com.example.viikko9;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class AddUserActivity extends AppCompatActivity {

    private EditText firstName;
    private EditText lastName;
    private EditText emailAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_user);

        firstName = findViewById(R.id.editTextFirstName);
        lastName = findViewById(R.id.editTextLastName);
        emailAddress = findViewById(R.id.editTextEmailAddress);
    }

    public String getFirstName() {
        String nameFirst = firstName.getText().toString();
        return nameFirst;
    }

    public String getLastName() {
        String nameLast = lastName.getText().toString();
        return nameLast;
    }

    public String getEmailAddress() {
        String email = emailAddress.getText().toString();
        return email;
    }

    public void addUser(View view) {
        RadioGroup rgDegreeProgram = findViewById(R.id.radioGroupDegreeProgram);
        RadioGroup rgPicture = findViewById(R.id.radioGroupPicture);

        switch (rgDegreeProgram.getCheckedRadioButtonId()) {
            case R.id.radioButton1:
                switch (rgPicture.getCheckedRadioButtonId()) {
                    case R.id.radioButtonPicture1:
                        UserStorage.getInstance().addUser(new User(getFirstName(), getLastName(), getEmailAddress(), "Tietotekniikka", R.drawable.emoji1));
                        break;
                    case R.id.radioButtonPicture2:
                        UserStorage.getInstance().addUser(new User(getFirstName(), getLastName(), getEmailAddress(), "Tietotekniikka", R.drawable.emoji2));
                        break;
                }
                break;
            case R.id.radioButton2:
                switch (rgPicture.getCheckedRadioButtonId()) {
                    case R.id.radioButtonPicture1:
                        UserStorage.getInstance().addUser(new User(getFirstName(), getLastName(), getEmailAddress(), "Tuotantotalous", R.drawable.emoji1));
                        break;
                    case R.id.radioButtonPicture2:
                        UserStorage.getInstance().addUser(new User(getFirstName(), getLastName(), getEmailAddress(), "Tuotantotalous", R.drawable.emoji2));
                        break;
                }
                break;
            case R.id.radioButton3:
                switch (rgPicture.getCheckedRadioButtonId()) {
                    case R.id.radioButtonPicture1:
                        UserStorage.getInstance().addUser(new User(getFirstName(), getLastName(), getEmailAddress(), "Laskennallinen tekniikka", R.drawable.emoji1));
                        break;
                    case R.id.radioButtonPicture2:
                        UserStorage.getInstance().addUser(new User(getFirstName(), getLastName(), getEmailAddress(), "Laskennallinen tekniikka", R.drawable.emoji2));
                        break;
                }
                break;
            case R.id.radioButton4:
                switch (rgPicture.getCheckedRadioButtonId()) {
                    case R.id.radioButtonPicture1:
                        UserStorage.getInstance().addUser(new User(getFirstName(), getLastName(), getEmailAddress(), "Sähkötekniikka", R.drawable.emoji1));
                        break;
                    case R.id.radioButtonPicture2:
                        UserStorage.getInstance().addUser(new User(getFirstName(), getLastName(), getEmailAddress(), "Sähkötekniikka", R.drawable.emoji2));
                        break;
                }
                break;
        }

        firstName.getText().clear();
        lastName.getText().clear();
        emailAddress.getText().clear();
    }
}
