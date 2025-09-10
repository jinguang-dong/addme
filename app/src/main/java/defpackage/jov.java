package defpackage;

import androidx.coordinatorlayout.widget.pcp.OPuAVreQM;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class jov implements qez {
    public static final sgv a = sgv.g("jov");
    public final String b;
    public final hbj c;
    private final qez d;
    private final AtomicInteger e = new AtomicInteger(0);

    public jov(String str, hbj hbjVar, qez qezVar) {
        this.b = str;
        this.d = qezVar;
        this.c = hbjVar;
        syu syuVarB = qezVar.b();
        syuVarB.c(new jnw(syuVarB, str, 4, null), sxo.a);
    }

    @Override // defpackage.qez
    public final qfc a() {
        return new jou(this, this.d.a(), this.e.getAndIncrement());
    }

    @Override // defpackage.qez
    public final syu b() {
        return this.d.b();
    }

    @Override // defpackage.qez
    public final void d() {
        ((sgt) a.c().M(2990)).v("%s: starting.", this.b);
        this.d.d();
    }

    @Override // defpackage.qez
    public final void c() {
        ((sgt) a.c().M(2986)).v(OPuAVreQM.FUNnhGk, this.b);
        this.d.c();
    }
}
