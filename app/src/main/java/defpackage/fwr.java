package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fwr implements fyu {
    private final fyw a;
    private final tzj b;
    private final tzj c;

    public fwr(tzj tzjVar, tzj tzjVar2, fyw fywVar) {
        this.a = fywVar;
        this.b = tzjVar;
        this.c = tzjVar2;
    }

    private final fyu c() {
        return this.a.a() == nkw.VIDEO_INTENT ? (fyu) this.b.a() : (fyu) this.c.a();
    }

    @Override // defpackage.fyu
    public final void a() {
        c().a();
    }

    @Override // defpackage.fyu
    public final void b(Bitmap bitmap) {
        c().b(bitmap);
    }
}
