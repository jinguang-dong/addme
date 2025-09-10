package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class djf implements View.OnAttachStateChangeListener {
    final /* synthetic */ ContentResolver a;
    final /* synthetic */ Uri b;
    final /* synthetic */ djg c;

    public djf(ContentResolver contentResolver, Uri uri, djg djgVar) {
        this.a = contentResolver;
        this.b = uri;
        this.c = djgVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.a.registerContentObserver(this.b, false, this.c);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.a.unregisterContentObserver(this.c);
    }
}
