package defpackage;

import com.bumptech.glide.qd.MyBPCgKwEjJI;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iyc implements fre {
    private final uem a;
    private final uem b;
    private final uem c;
    private final uem d;
    private final uem e;
    private final uem f;
    private final uem g;
    private final uem h;
    private final Executor i;
    private final AtomicBoolean j = new AtomicBoolean(false);
    private final pbn k;
    private final fdk l;
    private final pbc m;
    private syu n;
    private final pfl o;

    public iyc(uem uemVar, uem uemVar2, uem uemVar3, uem uemVar4, uem uemVar5, uem uemVar6, uem uemVar7, uem uemVar8, Executor executor, pbb pbbVar, pfl pflVar, pbn pbnVar, fdk fdkVar) {
        this.a = uemVar;
        this.b = uemVar2;
        this.c = uemVar3;
        this.e = uemVar5;
        this.d = uemVar4;
        this.f = uemVar6;
        this.g = uemVar7;
        this.h = uemVar8;
        this.i = executor;
        this.o = pflVar;
        this.k = pbnVar;
        this.m = pbbVar.a("ActivityStartup");
        this.l = fdkVar;
    }

    @Override // defpackage.fre
    public final /* synthetic */ int a() {
        return 0;
    }

    @Override // defpackage.fre
    public final /* synthetic */ String c() {
        return gsn.Z(this);
    }

    @Override // defpackage.fre
    public final syu b() {
        if (this.j.getAndSet(true)) {
            return this.n;
        }
        pbn pbnVar = this.k;
        pbnVar.f("ActivityStartup");
        uem uemVar = this.d;
        uemVar.a();
        ((ixs) this.f.a()).run();
        this.l.a();
        frd frdVar = new frd(this.i);
        frdVar.d = this.o;
        frdVar.b = pbnVar;
        frdVar.c = this.m;
        frdVar.b(this.a, "ErrorHandlerStartup");
        frdVar.b(this.b, "WaitForHalUpdate");
        frdVar.b(uemVar, "PermissionsStartup");
        frdVar.b(this.c, "WaitForCameraDevices");
        frdVar.b(this.e, MyBPCgKwEjJI.oMKdtk);
        frdVar.b(this.g, "CriticalPath");
        frdVar.c(new iyd(this.h, 2), "ActivityBehaviors");
        this.n = frdVar.a();
        pbnVar.g();
        return this.n;
    }
}
