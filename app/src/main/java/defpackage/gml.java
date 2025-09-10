package defpackage;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gml {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;

    public gml(moo mooVar, Uri uri, TextView textView, String str) {
        this.a = mooVar;
        this.b = uri;
        this.c = textView;
        this.d = str;
    }

    public gml(Drawable.Callback callback) {
        this.c = new eid();
        this.d = new HashMap();
        this.a = new HashMap();
        this.e = ".ttf";
        if (callback instanceof View) {
            this.b = ((View) callback).getContext().getAssets();
        } else {
            elg.a("LottieDrawable must be inside of a view for images to work.");
            this.b = null;
        }
    }
}
