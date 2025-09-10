package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import com.google.ar.core.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class grr implements grx {
    private final Context a;
    private final String b;
    private final iso c;

    public grr(Context context, iso isoVar, String str) {
        this.c = isoVar;
        this.a = context;
        this.b = str;
    }

    @Override // defpackage.grx
    public final void b() {
        Context context = this.a;
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
        String strConcat = this.b;
        clipboardManager.setPrimaryClip(ClipData.newPlainText("simple text", strConcat));
        if (strConcat.length() > 50) {
            strConcat = String.valueOf(strConcat.substring(0, 50)).concat("...");
        }
        this.c.t(context.getString(R.string.text_copied_to_clipboard) + ": " + strConcat);
    }
}
