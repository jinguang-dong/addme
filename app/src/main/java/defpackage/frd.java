package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class frd {
    public final Executor a;
    public pbn b = new pbl();
    public pbc c = new pbf();
    public pfl d;
    private final szh e;
    private syu f;

    public frd(Executor executor) {
        this.a = executor;
        szh szhVar = new szh();
        this.e = szhVar;
        this.f = szhVar;
    }

    public final syu a() {
        szh szhVar = this.e;
        boolean z = false;
        if (!szhVar.isDone() && !szhVar.isCancelled()) {
            z = true;
        }
        rnt.L(z);
        if (this.d != null || this.c != null) {
            ske.W(this.f, new frc(this), sxo.a);
        }
        szhVar.e(true);
        return this.f;
    }

    public final void b(final uem uemVar, final String str) {
        this.c.b("Futures.transform: ".concat(str));
        syu syuVarJ = swz.j(this.f, new sxi() { // from class: frb
            @Override // defpackage.sxi
            public final syu a(Object obj) {
                if (!((Boolean) obj).booleanValue()) {
                    return ske.M(false);
                }
                uem uemVar2 = uemVar;
                String str2 = str;
                frd frdVar = this.a;
                frdVar.b.f(str2);
                frdVar.b.f("get");
                fre freVar = (fre) uemVar2.a();
                frdVar.b.h("start");
                syu syuVarB = freVar.b();
                frdVar.b.g();
                frdVar.b.g();
                return syuVarB;
            }
        }, this.a);
        this.f = syuVarJ;
        pbc pbcVar = this.c;
        if (pbcVar != null) {
            hcs.a(pbcVar, syuVarJ, str.concat(" complete."), str.concat(" failed!"));
        }
    }

    public final void c(uem uemVar, String str) {
        ske.W(this.f, new jba(this, str, uemVar, 1), this.a);
    }
}
