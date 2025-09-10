package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jjm implements syf {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public jjm(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [sgt, shi] */
    /* JADX WARN: Type inference failed for: r2v9, types: [sgt, shi] */
    @Override // defpackage.syf
    public final void a(Throwable th) {
        int i = this.b;
        if (i == 0) {
            ((sgt) jjn.a.b().M(2794)).s("View was not inflated.");
        } else if (i != 1) {
            ((sgt) ((sgt) hfx.a.c().i(th)).M((char) 1242)).s("Unable to retrieve camera devices.");
        } else {
            ((sgt) ((sgt) hbw.a.c().i(th)).M((char) 1109)).s("CameraFilmstripDataAdapter task failed.");
        }
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, java.lang.Runnable] */
    @Override // defpackage.syf
    public final /* synthetic */ void b(Object obj) {
        int i = this.b;
        if (i == 0) {
            Boolean bool = (Boolean) obj;
            if (bool == null || !bool.booleanValue()) {
                ((sgt) jjn.a.b().M(2795)).s("View was not inflated.");
                return;
            } else {
                this.a.run();
                return;
            }
        }
        if (i == 1) {
            hbw hbwVar = (hbw) this.a;
            hbwVar.k.e(null);
            hbwVar.b.a();
            return;
        }
        List list = (List) obj;
        list.getClass();
        if (!((hfv) list.get(1)).a) {
            ((sgt) hfx.a.c().M(1243)).s("Unable to retrieve camera devices.");
            return;
        }
        Object obj2 = this.a;
        ((hfx) ((rnu) obj2).a).b.e(fsq.a);
    }
}
