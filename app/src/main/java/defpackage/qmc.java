package defpackage;

import android.media.MediaFormat;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qmc implements qmb {
    public final szh b = new szh();
    private final qlv c;

    public qmc(qlv qlvVar) {
        this.c = qlvVar;
    }

    @Override // defpackage.qmb
    public final void a(qlg qlgVar) {
        this.c.b(qlgVar.b, qlgVar.c);
        qlgVar.close();
    }

    @Override // defpackage.qmb
    public final void b(MediaFormat mediaFormat) {
        this.b.e(mediaFormat);
    }
}
