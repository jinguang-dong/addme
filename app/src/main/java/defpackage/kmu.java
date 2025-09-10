package defpackage;

import com.google.android.play.core.install.rwb.GAQqzWiWWcYOgy;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kmu implements kmz {
    public final Object a;
    private final kmz b;
    private final pbn c;
    private final /* synthetic */ int d;

    public kmu(kmz kmzVar, Object obj, pbn pbnVar, int i) {
        this.d = i;
        this.b = kmzVar;
        this.a = obj;
        this.c = pbnVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, pau] */
    private final void d(kfe kfeVar) {
        this.a.a(kfeVar);
    }

    @Override // defpackage.kmz
    public final owf a() {
        int i = this.d;
        kmz kmzVar = this.b;
        return i != 0 ? kmzVar.a() : kmzVar.a();
    }

    @Override // defpackage.kmz
    public final owf b() {
        int i = this.d;
        kmz kmzVar = this.b;
        return i != 0 ? kmzVar.b() : kmzVar.b();
    }

    public final String toString() {
        if (this.d != 0) {
            kmz kmzVar = this.b;
            rwb rwbVarW = rnt.W(this);
            rwbVarW.b("delegate", kmzVar);
            return rwbVarW.toString();
        }
        kmz kmzVar2 = this.b;
        rwb rwbVarW2 = rnt.W(this);
        rwbVarW2.b("delegate", kmzVar2);
        return rwbVarW2.toString();
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, lss] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, pbn] */
    @Override // defpackage.kmz
    public final void c(kmy kmyVar, gga ggaVar) throws pco {
        if (this.d == 0) {
            pbn pbnVar = this.c;
            pbnVar.f(ezh.ai("StateTrackingImageCaptureCommand#captureImage"));
            try {
                d(kfe.RUNNING);
                pbnVar.g();
                this.b.c(kmyVar, ggaVar);
                return;
            } finally {
                d(kfe.IDLE);
            }
        }
        pbn pbnVar2 = this.c;
        pbnVar2.f(ezh.ai("ShotTrackingImageCaptureCommand#captureImage"));
        ?? r1 = ggaVar.b;
        try {
            Object obj = this.a;
            synchronized (obj) {
                if (((owd) obj).a) {
                    throw new IllegalStateException(GAQqzWiWWcYOgy.FIbVCvnd);
                }
                Object obj2 = ((owd) obj).b;
                if (((HashSet) obj2).isEmpty()) {
                    ?? r4 = ((owd) obj).d;
                    r4.f("#notifyPipelineResumed");
                    Iterator it = ((owd) obj).c().iterator();
                    while (it.hasNext()) {
                        ((lsz) it.next()).c();
                    }
                    r4.g();
                }
                ((HashSet) obj2).add(r1);
            }
            r1.s().c(new kee(this, (Object) r1, 5), sxo.a);
            pbnVar2.g();
            this.b.c(kmyVar, ggaVar);
        } catch (IllegalStateException e) {
            throw new pco("ShotPipeline not available", e);
        }
    }
}
