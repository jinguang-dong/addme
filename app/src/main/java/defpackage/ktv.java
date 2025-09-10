package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ktv implements owf {
    public final pnk a;
    private final out b = new out();

    public ktv(pnk pnkVar) {
        this.a = pnkVar;
    }

    @Override // defpackage.owf
    public final paq dK(final pau pauVar, final Executor executor) {
        png pngVar = new png() { // from class: ktt
            @Override // defpackage.png
            public final void a(pao paoVar) {
                executor.execute(new kee(pauVar, paoVar, 7, null));
            }
        };
        this.a.b(pngVar);
        this.b.execute(new gts(this, executor, pauVar, 7));
        return new ktu(this, pngVar, 0);
    }

    @Override // defpackage.owf
    public final /* bridge */ /* synthetic */ Object dL() {
        return this.a.a();
    }
}
