package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ehv {
    private static final Object d = new Object();
    public final Context a;
    public final String b;
    public final Map c;

    public ehv(Drawable.Callback callback, String str, Map map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.b = str;
        } else {
            this.b = String.valueOf(str).concat("/");
        }
        this.c = map;
        if (callback instanceof View) {
            this.a = ((View) callback).getContext().getApplicationContext();
        } else {
            this.a = null;
        }
    }

    public final void a(String str, Bitmap bitmap) {
        synchronized (d) {
            ((eft) this.c.get(str)).e = bitmap;
        }
    }
}
