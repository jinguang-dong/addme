package defpackage;

import android.media.MediaFormat;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qfa implements qez {
    private final qlt a;

    public qfa(qlt qltVar) {
        this.a = qltVar;
    }

    @Override // defpackage.qez
    public final qfc a() {
        szh szhVar = new szh();
        new MediaFormat();
        return new qfb(szhVar, this.a.c(new qaq(szhVar)));
    }

    @Override // defpackage.qez
    public final syu b() {
        return new qhc(((qlu) this.a).g, 1);
    }

    @Override // defpackage.qez
    public final void c() {
        ((qlu) this.a).g.cancel(false);
    }

    @Override // defpackage.qez
    public final void d() {
        this.a.b();
    }
}
