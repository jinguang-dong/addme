package defpackage;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.camera.ui.preference.KeyListenerPreference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class nbh implements DialogInterface.OnKeyListener {
    final /* synthetic */ TextView a;
    final /* synthetic */ Button b;
    final /* synthetic */ Button c;
    final /* synthetic */ KeyListenerPreference d;

    public nbh(KeyListenerPreference keyListenerPreference, TextView textView, Button button, Button button2) {
        this.a = textView;
        this.b = button;
        this.c = button2;
        this.d = keyListenerPreference;
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        String strA = KeyListenerPreference.a(keyEvent);
        if (strA.isEmpty() || i == 4 || i == 22 || i == 24 || i == 25) {
            this.a.setText("Error: Key is not supported by Pixel Camera");
            this.b.setEnabled(false);
        } else {
            this.a.setText("New Key Bind: " + strA + " (Key Code: " + i + ")");
            KeyListenerPreference keyListenerPreference = this.d;
            if (Integer.parseInt(keyListenerPreference.a) != i) {
                keyListenerPreference.a = Integer.toString(i);
                keyListenerPreference.b = strA;
            }
            this.b.setEnabled(true);
        }
        this.c.setVisibility(0);
        this.a.sendAccessibilityEvent(32768);
        return true;
    }
}
