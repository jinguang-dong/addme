package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ezx implements faa {
    public final int a;
    public Bitmap b;
    private ezn c;
    private final Handler d;
    private final long e;

    public ezx(Handler handler, int i, long j) {
        if (!fax.l(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        }
        this.d = handler;
        this.a = i;
        this.e = j;
    }

    @Override // defpackage.faa
    public final ezn a() {
        return this.c;
    }

    @Override // defpackage.faa
    public final void b(Drawable drawable) {
        this.b = null;
    }

    @Override // defpackage.faa
    public final void e(ezn eznVar) {
        this.c = eznVar;
    }

    @Override // defpackage.faa
    public final void i(ezt eztVar) {
        eztVar.e(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // defpackage.faa
    public final /* bridge */ /* synthetic */ void l(Object obj) {
        this.b = (Bitmap) obj;
        Handler handler = this.d;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.e);
    }

    public ezx() {
        if (!fax.l(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        }
    }

    @Override // defpackage.eyu
    public final void f() {
    }

    @Override // defpackage.eyu
    public final void g() {
    }

    @Override // defpackage.eyu
    public final void h() {
    }

    @Override // defpackage.faa
    public final void c(Drawable drawable) {
    }

    @Override // defpackage.faa
    public final void d(Drawable drawable) {
    }

    @Override // defpackage.faa
    public final void j(ezt eztVar) {
    }
}
