package com.google.android.apps.camera.ui.preference;

import android.R;
import android.app.AlertDialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.preference.DialogPreference;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.ar.core.ImageFormat;
import com.google.ar.core.ImageMetadata;
import defpackage.nbh;
import defpackage.rnt;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class KeyListenerPreference extends DialogPreference {
    public String a;
    public String b;

    public KeyListenerPreference(Context context) {
        super(context);
        c();
    }

    public static String a(KeyEvent keyEvent) {
        int unicodeChar = keyEvent.getUnicodeChar();
        if (unicodeChar != 0 && unicodeChar != 10 && unicodeChar != 32) {
            char c = (char) unicodeChar;
            StringBuilder sb = new StringBuilder();
            sb.append(c);
            return sb.toString();
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 59 || keyCode == 60) {
            return "Shift";
        }
        if (keyCode == 62) {
            return "Space";
        }
        if (keyCode == 66) {
            return "Enter";
        }
        switch (keyCode) {
            case 19:
                return "Up Arrow";
            case 20:
                return "Down Arrow";
            case 21:
                return "Left Arrow";
            case ImageFormat.RGBA_FP16 /* 22 */:
                return "Right Arrow";
            default:
                return "";
        }
    }

    private final void c() {
        b("-1");
    }

    public final void b(String str) {
        this.a = str;
        if (str.equals("-1")) {
            this.b = "None";
        } else {
            this.b = a(new KeyEvent(0, Integer.parseInt(str)));
        }
        setSummary(this.b);
        persistString(str);
        notifyDependencyChange(shouldDisableDependents());
        notifyChanged();
    }

    @Override // android.preference.Preference
    public final /* bridge */ /* synthetic */ CharSequence getSummary() {
        String str = this.b;
        return rnt.V(str) ? "None" : str;
    }

    @Override // android.preference.DialogPreference, android.preference.Preference
    protected final void onClick() {
        setDialogTitle("Bind Key to ".concat(String.valueOf(String.valueOf(getTitle()))));
        setDialogMessage("Current Key Bind: " + this.b + " (Key Code: " + this.a + ")\nPress key to rebind");
        setNegativeButtonText("Reset");
        super.onClick();
        AlertDialog alertDialog = (AlertDialog) getDialog();
        ViewGroup viewGroup = (ViewGroup) alertDialog.findViewById(R.id.content);
        final TextView textView = (TextView) alertDialog.findViewById(R.id.message);
        final Button button = alertDialog.getButton(-1);
        final Button button2 = alertDialog.getButton(-2);
        viewGroup.setDescendantFocusability(ImageMetadata.HOT_PIXEL_MODE);
        textView.setTextColor(-16777216);
        textView.setTextSize(18.0f);
        button.setEnabled(false);
        if (this.a.equals("-1")) {
            textView.setText("Current Key Bind: None\nPress key to bind");
            button2.setVisibility(4);
        }
        alertDialog.getButton(-2).setOnClickListener(new View.OnClickListener() { // from class: nbg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.b("-1");
                TextView textView2 = textView;
                textView2.setText("Current Key Bind: None\nPress key to bind");
                textView2.sendAccessibilityEvent(4);
                button2.setVisibility(4);
                button.setEnabled(true);
            }
        });
        alertDialog.setOnKeyListener(new nbh(this, textView, button, button2));
    }

    @Override // android.preference.DialogPreference
    protected final void onDialogClosed(boolean z) {
        super.onDialogClosed(z);
        if (z) {
            String str = this.a;
            if (callChangeListener(str)) {
                b(str);
            }
            setSummary(this.b);
        }
    }

    @Override // android.preference.Preference
    protected final Object onGetDefaultValue(TypedArray typedArray, int i) {
        String string = typedArray.getString(i);
        return string == null ? "-1" : string;
    }

    @Override // android.preference.Preference
    protected final void onSetInitialValue(boolean z, Object obj) {
        b(z ? getPersistedString("-1") : (String) obj);
    }

    public KeyListenerPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        c();
    }

    public KeyListenerPreference(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        c();
    }

    public KeyListenerPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        c();
    }
}
