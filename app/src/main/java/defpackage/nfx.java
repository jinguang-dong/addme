package defpackage;

import android.view.WindowManager;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class nfx extends nfq {
    private static final sgv a = sgv.g("nfx");
    private static final pas b = new pas(1024, 768);
    private static final pas c = new pas(1280, 720);
    private final pjp d;

    public nfx(WindowManager windowManager, hbj hbjVar, pjp pjpVar, String str) {
        super(windowManager, hbjVar, str);
        this.d = pjpVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [sgt, shi] */
    @Override // defpackage.nfq
    public final pas b(List list, pae paeVar, pka pkaVar, nkw nkwVar, pjr pjrVar) {
        pas pasVar;
        if (nkwVar == nkw.PHOTO) {
            try {
                pas pasVar2 = kqp.a(this.d.a(pjrVar), a(list, paeVar.a()), 34).b;
                if (pae.b.l(pae.i(pasVar2))) {
                    pasVar = c;
                } else {
                    a.I(pae.a.l(pae.i(pasVar2)));
                    pasVar = b;
                }
                if (list.contains(pasVar)) {
                    return pasVar;
                }
            } catch (kqo e) {
                ((sgt) ((sgt) a.c().i(e)).M((char) 5353)).v("selectViewfinderSize: cameraId=%s", pjrVar);
            }
        }
        return super.b(list, paeVar, pkaVar, nkwVar, pjrVar);
    }
}
