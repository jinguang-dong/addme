package defpackage;

import android.graphics.Typeface;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ij extends cmd {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ WeakReference c;
    final /* synthetic */ in d;

    public ij(in inVar, int i, int i2, WeakReference weakReference) {
        this.d = inVar;
        this.a = i;
        this.b = i2;
        this.c = weakReference;
    }

    @Override // defpackage.cmd
    public final void a(Typeface typeface) {
        int i = this.a;
        if (i != -1) {
            typeface = Typeface.create(typeface, i, (this.b & 2) != 0);
        }
        in inVar = this.d;
        WeakReference weakReference = this.c;
        if (inVar.c) {
            inVar.b = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new ng(textView, typeface, inVar.a, 1));
                } else {
                    in.b(textView, typeface, inVar.a);
                }
            }
        }
    }

    @Override // defpackage.cmd
    public final void b() {
    }
}
