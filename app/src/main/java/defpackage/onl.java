package defpackage;

import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class onl implements oog {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ onl(onm onmVar, qxx qxxVar, int i) {
        this.c = i;
        this.a = onmVar;
        this.b = qxxVar;
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, rvu] */
    @Override // defpackage.oog
    public final Object a(oor oorVar) {
        if (this.c != 0) {
            AtomicBoolean atomicBoolean = ocw.a;
            if (oorVar.f()) {
                return this.b.apply(this.a);
            }
            Log.e("ClearcutLoggerApiImpl", "Error resolving compliance data.", oorVar.c());
            return oorVar;
        }
        boolean z = oorVar.c() instanceof ofd;
        Object obj = this.b;
        Object obj2 = this.a;
        if (z) {
            return ((onm) obj2).a(((qxx) obj).c);
        }
        if (oorVar.c() instanceof oep) {
            oep oepVar = (oep) oorVar.c();
            oepVar.getClass();
            if (oepVar.a() == 29514) {
                return ((onm) obj2).a(((qxx) obj).c);
            }
        }
        return oorVar;
    }

    public /* synthetic */ onl(rvu rvuVar, oca ocaVar, int i) {
        this.c = i;
        this.b = rvuVar;
        this.a = ocaVar;
    }
}
